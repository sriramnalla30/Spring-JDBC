package com.nipuna;

import org.springframework.context.ApplicationContext;  

import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Test {  

public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("ac.xml");  
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
   dao.saveEmployee(new Employee(102,"Amit",35000));  
   System.out.println("status");  
//    int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
//    System.out.println(status); 
//    Employee e=new Employee(); 
//    e.setId(102); 
//    int status=dao.deleteEmployee(e); 
//    System.out.println(status);  
}  
}  

