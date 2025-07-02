package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().toShortString();
        long start = System.currentTimeMillis();

        System.out.println("[LOG] Starting method: " + methodName);
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("[LOG] Method " + methodName + " executed in " + (end - start) + " ms");

        return result;
    }
}
