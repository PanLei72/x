package com.panlei.x.framework.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Aspect
@Component
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 定义切入点，切入点为com.panlei.x.framework.controller中的所有函数
     * 通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(* com.panlei.x.framework.controller.*.*(..))")
    public void logPointcut() {

    }

    /**
     * @description 在连接点执行之前执行的通知
     */
    @Before("logPointcut()")
    public void doBefore(JoinPoint joinPoint) {
        String targetClass = joinPoint.getSignature().getDeclaringTypeName();
        String targetMethod = joinPoint.getSignature().getName();


        String argsStr = getArgsByJoinPoint(joinPoint);

        logger.info("Before execution : {}.{}({})", targetClass, targetMethod, argsStr);
    }

    /**
     * @description 在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @After("logPointcut()")
    public void doAfter(JoinPoint joinPoint) {
        String targetClass = joinPoint.getSignature().getDeclaringTypeName();
        String targetMethod = joinPoint.getSignature().getName();

        String argsStr = getArgsByJoinPoint(joinPoint);

        logger.info("After execution {}.{}({})", targetClass, targetMethod, argsStr);
    }

    /**
     * @description 在连接点执行之后执行的通知（返回通知）
     */
    @AfterReturning(value = "logPointcut()", returning = "result")
    public void doAfterReturning(Object result) {
        logger.info("After returning execution : {} ", result);
    }

    /**
     * @description 在连接点执行之后执行的通知（异常通知）
     */
    @AfterThrowing(value = "logPointcut()", throwing = "exception")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        String targetClass = joinPoint.getSignature().getDeclaringTypeName();
        String targetMethod = joinPoint.getSignature().getName();

        String argsStr = getArgsByJoinPoint(joinPoint);

        logger.error("After returning execution : {}.{}({}) , exception : {}", targetClass, targetMethod, argsStr, exception.getLocalizedMessage());

    }

    /**
     * get args string by join point
     *
     * @param joinPoint
     * @return
     */
    private String getArgsByJoinPoint(JoinPoint joinPoint) {
        //获取传入目标方法的参数
        Object[] args = joinPoint.getArgs();
        StringBuffer argsStringBuffer = new StringBuffer();
        for (int i = 0; i < args.length; i++) {
            Object argsObject = args[i];
            String argsStr = "";
            if (argsObject instanceof HttpServletRequest) {
                argsStr = "request";
            } else if (argsObject instanceof HttpServletResponse) {
                argsStr = "response";
            } else {
                argsStr = String.valueOf(argsObject);
            }


            if (i == args.length - 1) {
                argsStringBuffer.append(argsStr);
            } else {
                argsStringBuffer.append(argsStr).append(", ");
            }
        }
        return argsStringBuffer.toString();
    }
}
