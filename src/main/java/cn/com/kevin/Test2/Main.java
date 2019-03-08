package cn.com.kevin.Test2;

import java.util.Map;  
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang.ArrayUtils; 

public class Main { 

	public static int Amath(String []test) {  
	    int twonum=0;
	    int Bnum=0;
	    int Btwonum=0;
	    for (int i = 0; i < test.length; i++) {
			String temp = test[i];
			if (StringUtils.length(temp)>3) {
				if (StringUtils.contains(temp, '2')) {
					twonum++;
				}
				if (StringUtils.contains(temp, 'B')) {
					Bnum++;
					Btwonum++;
				}
				if (StringUtils.contains(temp, '2') && StringUtils.contains(temp, 'B')) {
					Btwonum++;
				}
			}	
		}
		return Btwonum; 
	} 
	/*
	 * 判断是否同时含有2和B的字符串
	 */
	public static boolean CallAmath(String []test) {
		boolean re=false;
		if (Main.Amath(test)!=0) {
			re=true;
		}
		return re;	
	}

	public static void main(String[] args) {
		Main Test = new Main();
	    String str1 = "";
	    
	    String str2 = "123";
	    String str3 = "ABCDEFG";
	    String str4 = "123ABCD";
	    String str5 = "1saf.'ABCD";
	    String str6 = "ABCD2EF34";
	    String []test = {str1,str2,str3,str4,str5,str6};
	    //System.out.println("长度大于三，且含有2和B的字符串共有：");
	    boolean num=Test.CallAmath(test);
		//System.out.println(num);

	} 
}

