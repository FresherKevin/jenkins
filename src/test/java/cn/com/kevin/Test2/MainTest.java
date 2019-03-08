package cn.com.kevin.Test2;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MainTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContain(){
		 String str1 = "123456789";
		 boolean tempA=false;
		 boolean tempB=false;
		 tempA=str1.contains("2");
		 tempB=StringUtils.contains(str1, '2');
		 assertEquals(tempA, tempB);
	}
	@Test
	public void testAmath(){
	    String str1 = "23241";
	    String str2 = "123BBBBBB";
	    String str3 = "ABCDEFG";
	    String str4 = "123ABCD";
	    String str5 = "1saf.'ABCD";
	    String str6 = "ABCD2EF34";
	    String []test = {str1,str2,str3,str4,str5,str6};
	    assertEquals(3, Main.Amath(test));
	}
	@Test
	public void testLength(){
		String str="123456789";
		assertEquals(9, StringUtils.length(str));
	}
	/*
	@Test
	public void testCallAmath(){
		String str="123456789";
	    String str1 = "23241";
	    String str2 = "123BBBBBB";
	    String str3 = "ABCDEFG";
	    String str4 = "123ABCD";
	    String str5 = "1saf.'ABCD";
	    String str6 = "ABCD2EF34";
	    String []test = {str1,str2,str3,str4,str5,str6};
	    
	    assertEquals(true, Main.CallAmath(test));
	}
	*/

}
