package com.aop.springaop.aopaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAccessAspect{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Before("execution(* com.aop.springaop.*.*(..))")
    @Before("execution(* com.aop.springaop.business.*.*(..))")
    public void before(JoinPoint point)
    {
        logger.info(" Check for user access ");
		logger.info(" Allowed execution for {}", point);// {} second argumnet will be placed by {}
    }

}