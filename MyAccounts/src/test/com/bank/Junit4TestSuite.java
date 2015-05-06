package test.com.bank;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class) 
@SuiteClasses({test.com.bank.AllJUnitTests.class,test.com.bank.AccountTest.class,test.com.bank.HelloWorldTest.class,
	test.com.bank.SkeletonTest.class}) 
public class Junit4TestSuite {

	public static Test suite() {
		System.out.println("Junit4TestSuite.suite running now");
		TestSuite suite = new TestSuite("Test for com.server.test");
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}

}
