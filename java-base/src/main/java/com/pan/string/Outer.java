package com.pan.string;

/** 
 * @Package com.pan.string 
 * @ClassName: Outer 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月30日 下午5:40:57 
 */
public class Outer {
    private int a = 100;
    
    public void get() {
    	System.out.println(a);
    }
    public void test( int param){
        final String str = "hello";
        class Inner {
            public void innerMethod(){
            	a = 200;
                System.out.println("outer a " +a);
                System.out.println("param " +param);
                System.out.println("local var " +str);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
        System.out.println(str + "merry");
        
    }
    
    public static void main(String[] args) {
    	Outer outer = new Outer();
    	outer.test(100);
    	outer.get();
	}
}
