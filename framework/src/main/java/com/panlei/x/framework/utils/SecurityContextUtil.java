package com.panlei.x.framework.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class SecurityContextUtil {

    /**
     * 获取用户名称
     *
     * @return username
     */
    public static String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            return null;
        }
        return authentication.getName();
    }

    /**
     * 获取IP地址
     * @return ip
     */
    public static String getIp(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            return null;
        }
        WebAuthenticationDetails details = (WebAuthenticationDetails) authentication.getDetails();
        if(details == null) {
            return null;
        }
        return details.getRemoteAddress();
    }

}
