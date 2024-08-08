package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.library.service.*.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect.logBefore: Method execution started");
    }

    @After("execution(* com.library.service.*.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect.logAfter: Method execution finished");
    }
}
