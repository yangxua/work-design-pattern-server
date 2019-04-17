package com.cache.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author allanyang
 * @Auther: allanyang
 * @Date: 2019/4/11 17:18
 * @Description:
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "")
public class Test2 {

    @org.junit.Test
    public void test() throws InterruptedException {
        String s = testMgr.get();
        System.out.println(s);

        String s1 = testMgr.get();
        System.out.println(s1);
    }

    @Autowired
    private TestMgr testMgr;
}