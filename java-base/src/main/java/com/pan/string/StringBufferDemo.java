package com.pan.string;

import java.util.Arrays;
import java.util.Comparator;

/** 
 * @Package com.pan.string 
 * @ClassName: StringBufferDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月25日 下午9:20:49 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer(10);
		sBuffer.append("sdfd");
		sBuffer.setLength(100);
		System.out.println(sBuffer.toString());
		StringBuilder builder = new StringBuilder();
		
		String[] arr = {"u","t","ā","ò", "asdf","IX"};
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(arr));
	}
}
