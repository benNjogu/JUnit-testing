package com.keytech;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setup() {
		System.out.println("Before test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 executed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
