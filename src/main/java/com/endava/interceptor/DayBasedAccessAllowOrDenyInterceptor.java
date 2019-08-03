package com.endava.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayBasedAccessAllowOrDenyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        simpleDateFormat.format(date);

        if (simpleDateFormat.format(date).equals("Sunday")) {
            response.getWriter().write("Its weekend bro, relax, you dont need this today !!");
            return false;
        } else {
            return true;
        }
    }
}
