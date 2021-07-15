package com.hp.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add("tow");
        c1.add("three");
        Collection c2 = new ArrayList();
        c1.add("four");
        c1.add("five");
        c1.add("six");
        c1.addAll(c2);
        Collection c3 = new ArrayList();
        c3.add("one");
        c3.add("five");
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3);
        boolean c = c1.containsAll(c3);//判断是否包含参数指定的所有对象
        System.out.println("c = " + c);
        c1.remove("tow");
        System.out.println("c1 = " + c1);
    }
    
}
