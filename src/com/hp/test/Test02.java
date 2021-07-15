package com.hp.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 * 使用迭代器遍历集合，并在过程中删除所有的"$"，
 * 最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 *
 * @author Xiloer
 */
public class Test02 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("1");
        c1.add("$");
        c1.add("2");
        c1.add("$");
        c1.add("3");
        c1.add("$");
        c1.add("4");
        //3.获取迭代器对象
        Iterator<String> iterator = c1.iterator();
        //4.通过迭代器进行询问是否集合中有下一个元素
        while (iterator.hasNext()) {
            //5.取出集合中的元素内容
            String str = (String) iterator.next();
            System.out.println(str);
            //删除集合中"$"
            if ("$".equals(str)) {
                iterator.remove();
            }
    }
        System.out.println("集合对象：" + c1);
}

}
