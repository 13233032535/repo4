package com.itheima.test;

import org.junit.Test;

import java.util.Scanner;

public class MainTest {

    @Test
    public void DuiGui(){
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner (System.in);

        Integer n =  Integer.parseInt(sc.next());

        Integer re = function(1, n);

        System.out.println(re);
    }


    public static Integer function(Integer a, Integer b){
        if(b==1){
            return a * b;
        }else{
            return a*b*function(a,b-1);
        }
    }
}
