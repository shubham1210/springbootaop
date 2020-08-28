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
	
	/*
	What are the different types of Advices?
Different types of Advices in Spring AOP are:

Before: These types of advices execute before the joinpoint methods and are configured using @Before annotation mark.
After returning: These types of advices execute after the joinpoint methods completes executing normally and are configured using @AfterReturning annotation mark.
After throwing:  These types of advices execute only if joinpoint method exits by throwing an exception and are configured using @AfterThrowing annotation mark.
After (finally): These types of advices execute after a joinpoint method, regardless of the method’s exit whether normally or exceptional return and are configured using @After annotation mark.
Around: These types of advices execute before and after a joinpoint and are configured using @Around annotation mark.
	*/
}
