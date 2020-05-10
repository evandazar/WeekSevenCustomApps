package edu.whccd.evaldez;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

/*
    The purpose of this application is to show the advantages of using arrays
    Author: Evander Valdez
*/

public class Main {

    public static void main(String[] args) {
	double[] grades = new double[5];
	double totalGrades = 0;
	double average = 0;
	System.out.println("insert grades");
	Scanner sc = new Scanner(System.in);
	for ( int i = 0; i <= grades.length-1; i++)
        {
            System.out.print("insert a grade between 0 and 100: ");
            grades[i] = sc.nextDouble();

        }
    for ( int j = 0; j <= grades.length-1; j++)
        {
            System.out.println(grades[j]);
        }

    for (int k = 0; k <= grades.length-1; k++)
    {
        totalGrades += grades[k];
    }
    average = totalGrades/grades.length;
    System.out.println("grades length: " + grades.length);
    System.out.println("grades total: " + totalGrades);
    System.out.println("average: " + average);

    ArrayList<String> cities = new ArrayList<>();
    String continueFlag = "n";
    do
    {
        System.out.print("Enter a city:");
        cities.add(sc.next());
        System.out.print("More cities to add? (y/n): ");
        continueFlag = sc.next();
    }
    while (continueFlag.equalsIgnoreCase("y"));
    Collections.sort(cities);
    for (String city : cities)
    {
        System.out.println(city);
    }
    System.out.print(cities.size());
    }
}
