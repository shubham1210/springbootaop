package com.aop.springaop.aopaspect;

import javax.naming.spi.DirStateFactory.Result;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAopAspect{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@AfterReturning(pointcut = "exection(* *(..))",returning = "result")
    @AfterReturning(pointcut = "execution(* com.aop.springaop.business.*.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        logger.info("{} returned with value {}", joinPoint.getSignature().getName(),result);
    } 

//    @After("exection(* com.aop.springaop.business.*.*(..))")
    @After("execution(* com.aop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint.getSignature().getName());
	}
}