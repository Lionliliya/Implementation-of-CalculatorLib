package com.google.liliyaYalovchenko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Bootstrap {

    private CalculatorFactory calculatorFactory;


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Bootstrap bootstrap = context.getBean("bootstrap", Bootstrap.class);
        bootstrap.execute();
    }

    public String execute() {
        Calculator calculator =  calculatorFactory.getCalculator();
        char sign = ' ';
        String result;
        int number = 0;
        int resultOfCalculation;
        int a = 0;
        int b;

        System.out.println("Hello. This is a simple calculator\nEnter, please, expression to calculate " +
                "in the following format:\na+b or a-b");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        for (Character ch : expression.toCharArray()) {
            if (isOperator(ch)) {
                a = number;
                number = 0;
                sign = ch;
            } else if (isDigit(ch)) {
                number = number*10 + (ch - '0');
            } else {

                System.out.println("Please enter expression in the right format!");
                throw new IllegalArgumentException("Wrong input format");
            }
        }
        b = number;
        resultOfCalculation = sign == '+' ? calculator.sumOfNumbers(a, b) : calculator.differenceOfNumbers(a, b);
        result = expression + " = " + resultOfCalculation;
        return  result;
    }

    private boolean isOperator(Character ch) {
        return ch == '+' || ch == '-';
    }

    private boolean isDigit(Character ch) {
        return (ch - '0') <= 9 && 0 <= (ch - '0');
    }

    public void setCalculatorFactory(CalculatorFactory calculatorFactory) {
        this.calculatorFactory = calculatorFactory;
    }

}
