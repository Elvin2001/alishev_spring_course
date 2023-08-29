package ru.education.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean myBean = context.getBean("testBean", TestBean.class);
        System.out.println(myBean.getName());

        context.close();
    }
}
