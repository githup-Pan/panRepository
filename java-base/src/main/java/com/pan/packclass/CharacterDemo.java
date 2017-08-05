package com.pan.packclass;

import java.nio.charset.Charset;

/** 
 * @Package com.pan.packclass 
 * @ClassName: CharacterDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月19日 上午8:46:39 
 */
public class CharacterDemo {
	 public static void main(String[] args) {
		Character character = Character.valueOf('e');
		System.out.println(character);
		char[] chs = new char[3];
		chs[0] = '马';
		Character.toChars(0x1FFFF, chs, 1);
		System.out.println(Character.codePointCount(chs, 0, 3));
		String string = "dfgdsf ";
		CharSequence charSequence = new CharSequence() {
			
			@Override
			public CharSequence subSequence(int start, int end) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int length() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public char charAt(int index) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		string.contains(charSequence);
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.name());
	}
}
