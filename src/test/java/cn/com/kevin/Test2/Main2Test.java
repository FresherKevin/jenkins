package cn.com.kevin.Test2;

import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class Main2Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAMath() {
	    String str1 = "23241";
	    String str2 = "123BBBBBB";
	    String str3 = "ABCDEFG";
	    String str4 = "123ABCD";
	    String str5 = "1saf.'ABCD";
	    String str6 = "ABCD2EF34";
	    String []test = {str1,str2,str3,str4,str5,str6};
	    
	    MainEx StrTest = new MainEx();
	    StrTest.exstr=test;
	    
	    //只需要验证传入的数组是否正确
	    
	    assertEquals(3, StrTest.Amath(test));
	    
	    assertEquals(true, StrTest.CallAmath(test));
	}

}
