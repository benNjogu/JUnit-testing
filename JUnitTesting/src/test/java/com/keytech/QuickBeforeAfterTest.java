package com.keytech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("before class");
	}
	
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

	@After
	public void TearDown() {
		System.out.println("After test");
	}

}
