package com.qa.tests;

import org.testng.annotations.Test;

public class ParallelMethodRunTest {
	
	@Test(threadPoolSize = 2, invocationCount = 6, timeOut = 1000)
    public void testMethod() 
    {
        Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
    }

}
