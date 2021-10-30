package com.qa.tests;

import org.testng.annotations.Test;

public class TestNGGroupTest {
	
	@Test(groups = { "smoke", "regression" })
	public void test1() {
		System.out.println("Inside Test1");
	}
	@Test(groups = {"sanity"})
	public void test2() {
		System.out.println("Inside Test2");
	}

}
