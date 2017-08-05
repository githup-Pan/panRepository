package com.pan.random;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/** 
 * @Package com.pan.random 
 * @ClassName: RandomDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月30日 上午10:47:10 
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();
		int b = random.nextInt(26);
		System.out.println(b);
		 char a = (char)(random.nextInt(26) + 'A');
		 System.out.println(a);
			String[] arr = {"hello","world", "Break","abc"};
			Arrays.sort(arr, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					
					 return o2.compareToIgnoreCase(o1);
				}
			});

			System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
	}
}
