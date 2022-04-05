package com.cognizant.innerbean;


import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainpgm {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("StudentxmlData.xml");
        StudentName studentName=(StudentName) context.getBean("sn");
        studentName.printData();
    }
}