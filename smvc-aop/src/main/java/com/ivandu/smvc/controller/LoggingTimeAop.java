package com.ivandu.smvc.controller;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.math.BigDecimal;

public class LoggingTimeAop implements MethodBeforeAdvice, AfterReturningAdvice {

    private long startTime;

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        long spentTime = System.nanoTime() - startTime;
        String clazzName = target.getClass().getCanonicalName();
        String methodName = method.getName();
        System.out.println("执行" + clazzName + "的方法" + methodName + "消耗了" + new BigDecimal(spentTime).divide(new BigDecimal(1000000)) + "毫秒");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        startTime = System.nanoTime();
    }
}
