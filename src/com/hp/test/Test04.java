package com.hp.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        List<Integer> list1 = list.subList(3, 7);
        for (int i = 0; i <list1.size() ; i++) {
            int a=list1.get(i);
            int b=a*10;
            list1.set(i,b);
        }
        System.out.println("list = " + list);
        //先截取789这几个数
        List<Integer> list2 = list.subList(7,10);
        //把截取出来的数放在一个集合中删除
        boolean b = list.removeAll(list2);
        System.out.println(list);
    }

}
