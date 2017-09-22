package com.pan.test;

/**
 * Created by OneOpiece on 2017/9/21.
 */
public class TestZero {
     public static void main(String[] args) {
        try{
            int i = 100 / 0;
        System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
        throw new RuntimeException(e);
        }finally{
        System.out.print(2);
         }
        System.out.print(3);
    }
}
