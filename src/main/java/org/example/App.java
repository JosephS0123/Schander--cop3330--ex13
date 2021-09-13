/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        DecimalFormat DF = new DecimalFormat("##.##");
        Scanner uInput = new Scanner(System.in);
        System.out.println( "Enter the principal" );
        double Principal = uInput.nextDouble();
        System.out.println("Enter the percent rate of interest");
        double ROA = uInput.nextDouble();
        System.out.println("Enter the number of years");
        int Years = uInput.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        int Comp = uInput.nextInt();
        double m = (1+((ROA/100)/Comp));
        double n = Years * Comp;
        System.out.println("After " + Years + " years at "+ ROA +"%, compounded "+ Comp+ " times per year, the investment will be worth $"+ DF.format(Principal*(java.lang.Math.pow(m,n))));
    }
}
