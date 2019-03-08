package cn.com.kevin.Test2;

import org.apache.commons.lang3.StringUtils;

/**
 * 加入了桩模块
 * @author Kevin
 *
 */
public class MainEx extends Main {
	static String []exstr;
	
	public static int Amath(String []test){
		
		String []element=test;
		if (element.equals(exstr)) {
			System.out.println("Amath的目标数组正确");
		} else {
			System.out.println("Amath的目标数组错误");
		}
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
					}
					if (StringUtils.contains(temp, '2') && StringUtils.contains(temp, 'B')) {
						Btwonum++;
					}
				}	
			}
			return Btwonum; 
	}

}

