package com.example;

/**
 * location where I found this formula
 *
 * http://fitnowtraining.com/2012/01/formula-for-calories-burned/
 *
 * Formula:
 * Male: Calories Burned=((Age x 0.2017)-(Weight x 0.09036)+(Heart Rate x 0.6309)—55.0969)xTime/4.184
 * Female: Calories Burned=((Age x 0.074)—(Weight x 0.05741)+(Heart Rate x 0.4472)—20.4022)xTime/4.184
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calories {

    String gender;
    Boolean male;
    double age;
    double weight;
    double heartRate;
    double time;

    public Calories() {
        gender = " ";
        male = true;
        age = 0;
        weight = 0;
        heartRate = 0;
        time = 0;
    }

    public void getGender() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Are You Male or Female?");
        System.out.print("Answer: ");
        gender = inputDevice.next();

        // input checking
        while (gender.compareToIgnoreCase("Male") != 0 && gender.compareToIgnoreCase("Female") != 0) {
            System.out.println("Please Enter a valid Answer!");
            System.out.println("Are you Male or Female?");
            System.out.print("Answer: ");
            gender = inputDevice.next();
        }

        // sets male to true or false
        if (gender.equalsIgnoreCase("Male")) {
            male = true;
        }
        if (gender.equalsIgnoreCase("Female")) {
            male = false;
        }
    }


    public void getAge() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println();
        System.out.println("Please Enter your Age: ");
        System.out.print("Answer: ");
        System.out.println();

        age = inputDevice.nextDouble();
    }

    public void getWeight() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println();
        System.out.println("Please Enter your Weight: ");
        System.out.print("Answer: ");
        System.out.println();

        weight = inputDevice.nextDouble();
    }

    public void getHeartRate() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println();
        System.out.println("Please Enter your Heart Rate: ");
        System.out.println("    (Beats Per-Minute)");
        System.out.print("Answer: ");
        System.out.println();

        heartRate = inputDevice.nextDouble();
    }

    public void getTime() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println();
        System.out.println("Please Enter The Amount of Time you Exercised: ");
        System.out.println("             (in Minutes)");
        System.out.print("Answer: ");
        System.out.println();
        time = inputDevice.nextDouble();

    }

    public double calculateCals() {

        double caloriesBurned = 0;

        // determine gender first and that determines which formula to use
        if (male == true) {

            caloriesBurned = (((age * 0.2017) - (weight * 0.09036) + (heartRate * 0.6309) - 55.0969) * time) / 4.184;
        }
        if (male == false) {

            caloriesBurned = (((age * 0.074) - (weight * 0.05741) + (heartRate * 0.4472) - 20.4022) * time) / 4.184;
        }
        return caloriesBurned;
    }

    public void displayCalories(double cals) {

        DecimalFormat form = new DecimalFormat("#.00");
        DecimalFormat digit = new DecimalFormat("#.##");

        System.out.println();
        System.out.println("         Gender: "+gender);
        System.out.println("            Age: "+digit.format(age));
        System.out.println("         Weight: "+digit.format(weight));
        System.out.println("     Heart Rate: "+digit.format(heartRate));
        System.out.println("   Workout Time: "+digit.format(time));
        System.out.println("Calories Burned: "+form.format(cals));
        System.out.println();

    }

}