package com.aop.springaop;

import com.aop.springaop.business.Business1;
import com.aop.springaop.business.Business2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAopSpringBootTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
	private Business1 business1;

	@Autowired
    private Business2 business2;
    
    @Test
    public void checkAOPlogic()
    {
        logger.info(business1.calculate()); logger.info(business2.calculate()); 

    }


}