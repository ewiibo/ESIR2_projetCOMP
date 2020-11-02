package org.xtext.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	
	private String pathOriginaux;
	private String pathAttendus;
	private String pathResultats;
	
	@Test
	void function1()
	{
		Assert.assertTrue("dans les test", true);
	}
}
