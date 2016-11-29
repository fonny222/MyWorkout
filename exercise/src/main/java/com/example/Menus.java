package com.example;

/**
 *
 * This is the main menu system for the app
 */

import java.util.Scanner;
import com.example.exUtil.NewExercise;
import com.example.exUtil.Workout.Workout;

public class Menus {

    //Display exercise created
    public static void displayExercise(String n){

        System.out.println();
        System.out.println();
        System.out.println("Exercise Name: "+n);
        //System.out.println("         Sets: "+s);
        //System.out.println("         Reps: "+r);
       // System.out.println("       Weight: "+w+"lbs");

    }

    //Display top menu
    public static void displayTopMenu(){

        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: Exercise");
        System.out.println("2: Workout");
        System.out.println("3: Calories Burned");
        System.out.println("4: Quit");
        System.out.println();
    }

    //Display Exercise Menu
    public static void displayExerciseMenu(){

        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: Create Exercise");
        System.out.println("2: View Exercise");
        System.out.println("3: Back");
        System.out.println();
    }

    //Display workout menu
    public static void displayWorkoutMenu(){
        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: View Workout");
        System.out.println("2: Create Workout");
        System.out.println("3: Back");
        System.out.println();
    }

    //Display Calories Menu
    public static void displayCaloriesMenu() {
        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: View Workout");
        System.out.println("2: Create Profile");
        System.out.println("3: Back");
        System.out.println();
    }

    //Runs all the exercises
    public void masterDisplay() {
        Scanner inputDevice = new Scanner(System.in);

        // instance of objects
        NewExercise myExercise = new NewExercise();
        Workout newWorkout = new Workout();
        Calories newCalories = new Calories();

        // variables for return from methods
        String name = "";
        int numSet = 0;
        int numRep = 0;
        int numWeight = 0;
        int topMenuChoice = 0;
        int workoutMenuChoice = 0;
        int calChoice = 0;
        //int exerciseMenuChoice = 0;


        // this loops through the menu to take you back to the top until quit is chosen
        while (topMenuChoice != 4) {
            displayTopMenu();
            int exerciseMenuChoice = 0;
            topMenuChoice = inputDevice.nextInt();

            //switch statement for menu system
            switch (topMenuChoice) {
                case 1:
                    // designing an exercise
                    while (exerciseMenuChoice != 3) {
                        displayExerciseMenu();
                        exerciseMenuChoice = inputDevice.nextInt();

                        switch (exerciseMenuChoice) {
                            case 1:
                                name = myExercise.getName();
                                /*numSet = myExercise.getSets();
                                numRep = myExercise.getReps();
                                numWeight = myExercise.getWeight();
                                */
                                break;
                            case 2:
                                displayExercise(name);
                                break;
                            case 3:
                                System.out.println("Back");
                                break;
                            default:
                                System.out.println("Please enter a valid number!");
                                break;
                        }

                    }
                    break;

                // This is for the workout menu
                case 2:
                    while (workoutMenuChoice != 3) {
                        displayWorkoutMenu();
                        workoutMenuChoice = inputDevice.nextInt();
                        // remember to check input

                        switch (workoutMenuChoice) {
                            case 1:
                                // this displays the name of the workout and the exercises

                                try {
                                    System.out.println("Workout Name: " + newWorkout.workoutNames.get(0));
                                    newWorkout.displayDaysofWeek();
                                }
                                catch(IndexOutOfBoundsException e){
                                    System.out.println("There is nothing to Display");
                                }
                                break;

                            case 2:
                                newWorkout.getWorkoutName();
                                newWorkout.getMonday();
                                newWorkout.getTuesday();
                                newWorkout.getWednesday();
                                newWorkout.getThursday();
                                newWorkout.getFriday();
                                newWorkout.getSaturday();
                                newWorkout.getSunday();
                                break;
                            case 3:
                                System.out.println("Back");
                                break;
                            default:
                                System.out.println("Error");
                                break;

                        }
                    }
                    break;

                // this is going to be for the calorie counter
                case 3:
                    double caloriesBurned = 0;
                    while (calChoice != 3) {
                        displayCaloriesMenu();
                        calChoice = inputDevice.nextInt();


                        // switch to determine calorie choice
                        switch (calChoice) {
                            case 1:
                                newCalories.displayCalories(caloriesBurned);
                                break;

                            case 2:
                                newCalories.getGender();
                                newCalories.getAge();
                                newCalories.getWeight();
                                newCalories.getTime();
                                newCalories.getHeartRate();
                                caloriesBurned = newCalories.calculateCals();
                                break;

                            case 3:
                                System.out.println("Back");
                                break;

                            default:
                                System.out.println("Error");
                                break;
                        }
                    }
                    break;

                // exit
                case 4:
                    System.out.println("Good Bye!");
                    break;
                // if a number is input that isn't an option
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }
}
