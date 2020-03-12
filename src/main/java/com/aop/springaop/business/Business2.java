package com.aop.springaop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Business2{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String calculate()
    {
        logger.info("in Business - {}",  "Business 2 executed");
        return "Business 2 executed";
    }
}