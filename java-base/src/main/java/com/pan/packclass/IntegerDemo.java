package com.pan.packclass;

/** 
 * @Package com.pan.packclass 
 * @ClassName: Demo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月18日 下午2:13:30 
 */
public class IntegerDemo {
	
	public static void main(String[] args) {
		Integer a = 100;
		int b = a;
		System.out.println(a == b);
		Integer c = new Integer(500);
		int d = 500;
		System.out.println(c == d);
		float f1 = 0.01f;
		float f2 = 0.1f * 0.1f;
		System.out.println(f1 == f2);                  // -- false
		System.out.println(Float.floatToIntBits(f1));  // -- 1008981770 
		System.out.println(Float.floatToIntBits(f2));  // -- 1008981771
		System.out.println(123 >>> 16);
		
		int as = 0x12345678;
		System.out.println(Integer.toBinaryString(as));
		int hg = Integer.highestOneBit(as);
		System.out.println(hg);
		System.out.println(Integer.toBinaryString(Integer.highestOneBit(as)));
		System.out.println(Integer.toBinaryString(Integer.lowestOneBit(as)));
		System.out.println(Integer.lowestOneBit(as));
		System.out.println(Integer.highestOneBit(as));
		
		/*
		 * 位翻转
		 */
		as = 0x12345678;
		System.out.println(Integer.toBinaryString(as));
		int ad = Integer.reverse(as);
		System.out.println(ad);
		int av = Integer.reverseBytes(as);
		System.out.println(Integer.toBinaryString(ad));
		System.out.println(Integer.toString(av));
		System.out.println(Integer.toHexString(av));
	}
}
