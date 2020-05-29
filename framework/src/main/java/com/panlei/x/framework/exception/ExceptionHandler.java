package com.panlei.x.framework.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public void exceptionHandler(HttpServletResponse response, Exception exception) throws IOException {

        PrintWriter printWriter = response.getWriter();
        printWriter.write(exception.getLocalizedMessage());
        printWriter.flush();
        printWriter.close();
    }
}
