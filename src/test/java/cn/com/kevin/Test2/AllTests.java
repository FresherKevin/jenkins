package cn.com.kevin.Test2;

import org.junit.runner.RunWith; 
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;


@RunWith(Suite.class)
@SuiteClasses({ MainTest.class })
public class AllTests {
	public static TestSuite suite() {
		System.out.println("33333");
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(Main.class));
		System.out.println("33333");
		return suite;		
	}

}
