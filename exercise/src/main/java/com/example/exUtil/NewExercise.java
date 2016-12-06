package com.example.exUtil;

import java.util.Scanner;

public class NewExercise {

    String exName;
   /* int sets;
    int reps;
    int weight;
*/
    public NewExercise(){
        exName = "";
       // sets = 0;
       // reps = 0;
       // weight = 0;
    }


    // get input for name
    public String getName(){
        Scanner inputDevice = new Scanner(System.in);
        String exerciseName;

        //Prompt for input
        System.out.println("Please enter the Exerecise Name");
        System.out.print("Your Choice: ");
        // use nextLine so that it doesn't stop at the spaces
        exerciseName = inputDevice.nextLine();
        System.out.println();

        return exerciseName;
    }






























   /* // get the sets
    public int getSets(){

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please Enter the number of Sets:");
        sets = inputDevice.nextInt();
    return sets;
    }

    // get the reps
    public int getReps(){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please Enter the number of Reps Per Set:");
        reps = inputDevice.nextInt();

        return reps;
    }

    //get the weight
    public int getWeight(){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please Enter how much Weight you are using:");
        weight = inputDevice.nextInt();

        return weight;
    }
*/
}
