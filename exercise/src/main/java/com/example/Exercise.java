package com.example;

import com.example.exUtil.NewExercise;
import com.example.exUtil.Workout.Workout;


import java.util.Scanner;

public class Exercise {


    //Display exercise
    public static void displayExercise(String n, int s, int r,int w){

        System.out.println();
        System.out.println();
        System.out.println("Exercise Name: "+n);
        System.out.println("         Sets: "+s);
        System.out.println("         Reps: "+r);
        System.out.println("       Weight: "+w+"lbs");

    }

    public static void displayTopMenu(){

        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: Exercise");
        System.out.println("2: Workout");
        System.out.println("3: Calories Burned");
        System.out.println("4: Quit");
        System.out.println();
    }

    public static void displayExerciseMenu(){

        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: Create Exercise");
        System.out.println("2: View Exercise");
        System.out.println("3: Back");
        System.out.println();
    }

    public static void displayWorkoutMenu(){
        System.out.println();
        System.out.println("Please Choose One of the Following:");
        System.out.println("1: View Workout");
        System.out.println("2: Create Workout");
        System.out.println("3: Back");
        System.out.println();
    }

    public static void main(String[] args){

        Scanner inputDevice = new Scanner(System.in);

        // instance of object
        NewExercise myExercise = new NewExercise();
        Workout newWorkout = new Workout();

       // variables for return from methods
        String name = "";
        int numSet = 0;
        int numRep = 0;
        int numWeight = 0;
        int topMenuChoice = 0;
        int workoutMenuChoice = 0;
        int whichWorkout = 0;
        //int exerciseMenuChoice = 0;


        // this loops through the menu to take you back to the top until quit is chosen
        while(topMenuChoice != 4){
            displayTopMenu();
            int exerciseMenuChoice = 0;
            topMenuChoice = inputDevice.nextInt();

            //switch statement for menu system
            switch(topMenuChoice){
                case 1:
                    // designing an exercise
                    while(exerciseMenuChoice != 3) {
                        displayExerciseMenu();
                        exerciseMenuChoice = inputDevice.nextInt();

                        switch(exerciseMenuChoice){
                            case 1:
                                name = myExercise.getName();
                                numSet = myExercise.getSets();
                                numRep = myExercise.getReps();
                                numWeight = myExercise.getWeight();
                                break;
                            case 2:
                                displayExercise(name,numSet,numRep,numWeight);
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

                // this is for the workout menu when I create that class
                case 2:
                    while(workoutMenuChoice != 3) {
                        displayWorkoutMenu();
                        workoutMenuChoice = inputDevice.nextInt();
                        // remember to check input

                        switch(workoutMenuChoice){
                            case 1:
                                // this displays the name of the workout and the exercises
                                System.out.println("Workout Name: "+newWorkout.workoutNames.get(0));
                                newWorkout.displayDaysofWeek();
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
                    System.out.println("Nothing is here yet....");
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





       /* // call each method
        name = myExercise.getName();
        numSet = myExercise.getSets();
        numRep = myExercise.getReps();
        numWeight = myExercise.getWeight();
        displayExercise(name,numSet,numRep,numWeight);
        */

         /*while(whichWorkout != 6){
                                    System.out.println("Please select a category: ");
                                    System.out.println("1: Arms");
                                    System.out.println("2: Back");
                                    System.out.println("3: Chest");
                                    System.out.println("4: Legs");
                                    System.out.println("5: Shoulders");
                                    System.out.println("6: Back");
                                    System.out.println();
                                    whichWorkout = inputDevice.nextInt();
                                    switch(whichWorkout){
                                        case 1:
                                            newWorkout.displayExercises(whichWorkout);
                                            break;
                                        case 2:
                                            newWorkout.displayExercises(whichWorkout);
                                            break;
                                        case 3:
                                            newWorkout.displayExercises(whichWorkout);
                                            break;
                                        case 4:
                                            newWorkout.displayExercises(whichWorkout);
                                            break;
                                        case 5:
                                            newWorkout.displayExercises(whichWorkout);
                                            break;
                                        case 6:
                                            System.out.println("Back");
                                            break;
                                        default:
                                            System.out.println("Error");
                                            break;
                                    }
                                }*/
    }
}