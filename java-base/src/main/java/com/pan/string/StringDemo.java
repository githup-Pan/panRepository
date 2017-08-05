package com.pan.string;

import java.nio.charset.Charset;
import java.util.Arrays;

/** 
 * @Package com.pan.string 
 * @ClassName: StringDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月20日 上午8:46:06 
 */
public class StringDemo {
	public static void main(String[] args) {
		String string = "  清 晨 我 上 马   ";
		string.trim();
		System.out.println(string);
		System.out.println(string.trim());
		System.out.println(string.codePointAt(2));
		System.out.println(string.codePointBefore(2));
		System.out.println(string.codePointCount(0, 2));
		System.out.println(string.offsetByCodePoints(1, 3));
		System.out.println(Charset.defaultCharset());
		
		
		String laoma = new String(new char[]{'老','马','说','编','程'});
		String name1 = new String(laoma);
		String name2 = new String(laoma);
		System.out.println(name1==name2);
		
		string.substring(3);
		
		int[] arr = {1,2,3,5,6,7,8};
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 4));
		System.out.println(Arrays.toString(arr));
		int[] arr1 = {1,5,3,7,6,2,8};
		System.out.println(Arrays.binarySearch(arr1, 5));
		System.out.println(Arrays.binarySearch(arr1, 4));
		System.out.println(Arrays.toString(arr1));
		
		int[][][] arr2 = {{{1},{2},{3}},{{4},{5},{6}}};
		int[][] arr3 = new int[6][];
		arr3[0] = new int[4];
		
		
		String laoma2 = new String(new char[]{'老','马','说','编','程'});
		String name3 = new String(laoma2);
		String name4 = new String(laoma2);
		String name5 = "老马说编程";
		System.out.println(name3 == name4);
		System.out.println(name5 == laoma2);
	}
	
	
	
}
