package com.example.exUtil.Workout;


import java.util.ArrayList;
import java.util.Scanner;

public class Workout {

    Scanner inputDevice = new Scanner(System.in);

    //variables
    int mondayNum;
    int tuesdayNum;
    int wednesdayNum;
    int thursdayNum;
    int fridayNum;
    int saturdayNum;
    int sundayNum;

    // these are the editable array lists for each day of the week
    public ArrayList workoutNames = new ArrayList();
    ArrayList monday = new ArrayList();
    ArrayList tuesday = new ArrayList();
    ArrayList wednesday = new ArrayList();
    ArrayList thursday = new ArrayList();
    ArrayList friday = new ArrayList();
    ArrayList saturday = new ArrayList();
    ArrayList sunday = new ArrayList();

    // these are the arrays for the different exercises
    String daysWeek[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String arms[] = {"Biceps Hammer Curl","Barbell Curl","Dumbbell Curl","Concentration Curl","Preacher Curl","Incline Dumbbell Curl",
            "Dumbbell Lying Triceps Extension","Seated Bent Over Dumbbell Kickback","Dumbbell Triceps Extension","Seated French Press",
            "Skull Crusher","Machine Triceps Extension"};
    String back[] = {"Wide Grip Pulldown","Close Grip Pulldown","Bent Over Dumbbell Row","Seated Rowing"};
    String chest[] = {"Bench Press","Incline Dumbbell Press","Incline Fly's","Incline Barbell Bench Press","Dumbbell Bench Press",
            "Flat Incline Fly's"};
    String legs[] = {"Dumbbell Walking Lunge","Leg Press Machine","Leg Extension","Machine Lying leg Curl","Machine Seated Leg Curl",
            "Seated Calf Raise Machine","Standing Calf Raise Machine","Seated Calf Raise Machine",};
    String shoulders[] = {"Dumbbell Lateral Raises","Dumbbell Front Raises","Dumbbell Shoulder Press","Rear Delt Fly","Dumbbell Shrugs",
            "Smith Machine Shoulder Press","Seated Arnold Press"};


   /*public Workout(){

        workoutNames.add("4 Day Split");
        workoutNames.add("Power,Muscle,Burn");
        workoutNames.add("5 Day Workout");
    }
    */

    //get name for the workout you create
    public void getWorkoutName(){

        String workoutName;

        System.out.println("Please Enter a Name for your Workout: ");
        workoutName = inputDevice.nextLine();

        workoutNames.add(workoutName);
    }


    // this displays the different exercise arrays
    public void displayExercises(int e1){

        if(e1 == 1){
            for(int i = 0; i < arms.length; i++){
                System.out.println((i+1)+": "+arms[i]);
            }
        }
        if(e1 == 2){
            for(int i=0; i < back.length; i++){
                System.out.println((i+1)+": "+back[i]);
            }
        }
        if(e1 == 3){
            for(int i=0; i < chest.length; i++){
                System.out.println((i+1)+": "+chest[i]);
            }
        }
        if(e1 == 4){
            for(int i=0; i < legs.length; i++){
                System.out.println((i+1)+": "+legs[i]);
            }
        }
        if(e1 == 5){
            for(int i=0; i < shoulders.length; i++){
                System.out.println((i+1)+": "+shoulders[i]);
            }
        }

    }


    // sets up mondays exercises in the workout
    public void getMonday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Monday: ");
        mondayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(mondayNum == 0){
            monday.add("rest");
        }
        // this will set up the workouts for monday based on how many you do
        if(mondayNum != 0){

            for(int i = 0; i < mondayNum; i++){

                // change to choose category
                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        monday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        monday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                    monday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        monday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                    monday.add(shoulders[exerciseChoice-1]);
                    break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

// tuesdays exercises
    public void getTuesday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Tuesday: ");
        tuesdayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(tuesdayNum == 0){
            tuesday.add("rest");
        }
        // this will set up the workouts for tuesday based on how many you do
        if(tuesdayNum != 0){

            for(int i = 0; i < tuesdayNum; i++){

                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        tuesday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        tuesday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                        tuesday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        tuesday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                        tuesday.add(shoulders[exerciseChoice-1]);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

    // wednesday exercises
    public void getWednesday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Wednesday: ");
        wednesdayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(wednesdayNum == 0){
            wednesday.add("rest");
        }
        // this will set up the workouts for wednesday based on how many you do
        if(wednesdayNum != 0){

            for(int i = 0; i < wednesdayNum; i++){

                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        wednesday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        wednesday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                        wednesday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        wednesday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                        wednesday.add(shoulders[exerciseChoice-1]);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

    // thursday exercises
    public void getThursday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Thursday: ");
        thursdayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(thursdayNum == 0){
            thursday.add("rest");
        }
        // this will set up the workouts for wednesday based on how many you do
        if(thursdayNum != 0){

            for(int i = 0; i < thursdayNum; i++){

                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        thursday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        thursday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                        thursday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        thursday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                        thursday.add(shoulders[exerciseChoice-1]);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

    // friday exercises
    public void getFriday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Friday: ");
        fridayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(fridayNum == 0){
            friday.add("rest");
        }
        // this will set up the workouts for wednesday based on how many you do
        if(fridayNum != 0){

            for(int i = 0; i < fridayNum; i++){

                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        friday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        friday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                        friday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        friday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                        friday.add(shoulders[exerciseChoice-1]);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

    // saturday exercises
    public void getSaturday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Saturday: ");
        saturdayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(saturdayNum == 0){
            saturday.add("rest");
        }
        // this will set up the workouts for wednesday based on how many you do
        if(saturdayNum != 0){

            for(int i = 0; i < saturdayNum; i++){

                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        saturday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        saturday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                        saturday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        saturday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                        saturday.add(shoulders[exerciseChoice-1]);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

    // sundayNum exercises
    public void getSunday(){
        int exCategory;
        int exerciseChoice;

        System.out.println("How many Exercises will you do on Sunday: ");
        sundayNum = inputDevice.nextInt();

        // if you do not have any workouts that day it is a rest day
        if(sundayNum == 0){
            sunday.add("rest");
        }
        // this will set up the workouts for wednesday based on how many you do
        if(sundayNum != 0){

            for(int i = 0; i < sundayNum; i++){

                System.out.println();
                System.out.println("Choose Exercise "+(i+1));
                System.out.println("1: Arms");
                System.out.println("2: Back");
                System.out.println("3: Chest");
                System.out.println("4: Legs");
                System.out.println("5: Shoulders");
                System.out.println();
                exCategory = inputDevice.nextInt();

                System.out.println("Please choose One: ");
                // this displays the chosen category
                displayExercises(exCategory);

                exerciseChoice = inputDevice.nextInt();

                switch(exCategory){
                    case 1:
                        sunday.add(arms[exerciseChoice-1]);
                        break;
                    case 2:
                        sunday.add(back[exerciseChoice-1]);
                        break;
                    case 3:
                        sunday.add(chest[exerciseChoice-1]);
                        break;
                    case 4:
                        sunday.add(legs[exerciseChoice-1]);
                        break;
                    case 5:
                        sunday.add(shoulders[exerciseChoice-1]);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }

    }

    // test display!
    public void displayDaysofWeek(){

        System.out.println();
        System.out.println("Monday");
        System.out.println();
        for(int i = 0; i < mondayNum; i++){
            System.out.println("    "+monday.get(i));
        }

        System.out.println();
        System.out.println("Tuesday");
        System.out.println();
        for(int i = 0; i < tuesdayNum; i++){
            System.out.println("    "+tuesday.get(i));
        }

        System.out.println();
        System.out.println("Wednesday");
        System.out.println();
        for(int i = 0; i < wednesdayNum; i++){
            System.out.println("    "+wednesday.get(i));
        }

        System.out.println();
        System.out.println("Thursday");
        System.out.println();
        for(int i = 0; i < thursdayNum; i++){
            System.out.println("    "+thursday.get(i));
        }


        System.out.println();
        System.out.println("Friday");
        System.out.println();
        for(int i = 0; i < fridayNum; i++){
            System.out.println("    "+friday.get(i));
        }


        System.out.println();
        System.out.println("Saturday");
        System.out.println();
        for(int i = 0; i < saturdayNum; i++){
            System.out.println("    "+saturday.get(i));
        }


        System.out.println();
        System.out.println("Sunday");
        System.out.println();
        for(int i = 0; i < sundayNum; i++){
            System.out.println("    "+sunday.get(i));
        }

    }


}