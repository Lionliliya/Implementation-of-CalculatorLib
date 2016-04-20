package com.google.liliyaYalovchenko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Bootstrap {

    private Calculator calculator;


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Bootstrap bootstrap = context.getBean("bootstrap", Bootstrap.class);
        bootstrap.execute();
    }

    public void execute() {
        System.out.println("Hello. This is a simple calculator\nEnter, please, expression to calculate " +
                "in the following format:\na+b or a-b");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        calculator.setExpression(expression);
        try {
            System.out.println(calculator.calculate());
        } catch (Exception ex) {
            System.out.println("Enter expression in the right format!!!");
        }
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
