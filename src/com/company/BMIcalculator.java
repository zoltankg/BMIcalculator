package com.company;

import java.util.Scanner;

public class BMIcalculator {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        int age;
        String gender;

        System.out.println("Enter Your age: ");
        age = sc.nextInt();

        System.out.println("Gender: ");
        gender = sc.next();

        System.out.println("Enter weight in kg: ");
        weight = sc.nextDouble();

        System.out.println("Enter height in meter: ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,2);



        if(age > 20) {
            System.out.println("You are an adult. BMI is used for both men and women, age 20 or older.");
            System.out.println("Your BMI is: " + bmi + " kg/m^2");
            if (bmi < 18.5) {
                System.out.println("Attention! You are underweight!");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Very Good! You are normal weight.");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("Attention! You are overweight!");
            } else {
                System.out.println("BE VERY CAREFUL!! You are OBESE!!");
            }
        }
        else if(age >=2 && age <= 20){
            System.out.println("Your child BMI is: " + bmi + " kg/m^2");
            if(gender.equals("male")){
                if (age >= 2 && age <= 12){
                    if(bmi < 14){
                        System.out.println("The boy is underweight! Percentile range is <5%");
                    }
                    else if(bmi >= 14 && bmi < 17){
                        System.out.println("The boy is healthy weight. Percentile range is between 5% - 85%");
                    }
                    else if(bmi >= 17 && bmi < 20){
                        System.out.println("The boy is at risk of overweight! Percentile range is between 85% - 95%");
                    }
                    else {
                        System.out.println("BE VERY CAREFUL!! The boy is OVERWEIGHT!!! Percentile range >95%");
                    }
                }
                if(age > 12 && age <= 20){
                    if(bmi < 15){
                        System.out.println("The boy is underweight! Percentile range is <5%");
                    }
                    else if(bmi >= 15 && bmi < 27){
                        System.out.println("The boy is healthy weight. Percentile range is between 5% - 85%");
                    }
                    else if(bmi >= 27 && bmi < 30){
                        System.out.println("The boy is at risk of overweight! Percentile range is between 85% - 95%");
                    }
                    else {
                        System.out.println("BE VERY CAREFUL!! The boy is OVERWEIGHT!!! Percentile range >95%");
                    }
                }
            }

            if(gender.equals("female")){
                if (age >= 2 && age <= 12){
                    if(bmi < 13){
                        System.out.println("The girl is underweight! Percentile range is <5%");
                    }
                    else if(bmi >= 13 && bmi < 20){
                        System.out.println("The girl is healthy weight. Percentile range is between 5% - 85%");
                    }
                    else if(bmi >= 20 && bmi < 26){
                        System.out.println("The girl is at risk of overweight! Percentile range is between 85% - 95%");
                    }
                    else {
                        System.out.println("BE VERY CAREFUL!! The girl is OVERWEIGHT!!! Percentile range >95%");
                    }
                }
                if(age > 12 && age <= 20){
                    if(bmi < 17){
                        System.out.println("The girl is underweight! Percentile range is <5%");
                    }
                    else if(bmi >= 17 && bmi < 27){
                        System.out.println("The girl is healthy weight. Percentile range is between 5% - 85%");
                    }
                    else if(bmi >= 27 && bmi < 35){
                        System.out.println("The girl is at risk of overweight! Percentile range is between 85% - 95%");
                    }
                    else {
                        System.out.println("BE VERY CAREFUL!! The girl is OVERWEIGHT!!! Percentile range >95%");
                    }
                }
            }

        }
        else {
            System.out.println("For children under the age of 2 years old, consult the WHO standards!");
        }
    }
}
