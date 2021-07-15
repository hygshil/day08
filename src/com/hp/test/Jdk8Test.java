package com.hp.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
自我学习 JDK8的新特性, 如何新的遍历 只少2个demo
 */
public class Jdk8Test {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.setAge(18);
        emp.setName("张三");
        emp.setGender("5000");

        Emp emp1 = new Emp();
        emp1.setAge(19);
        emp1.setName("李四");
        emp1.setGender("4000");

        Emp emp2 = new Emp();
        emp2.setAge(20);
        emp2.setName("王二");
        emp2.setGender("8000");

        List<Emp> list = new ArrayList();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        List<String> genderLists = list.stream().map(Emp::getGender).collect(Collectors.toList());
        System.out.println("genderLists = " + genderLists);
    }
}
