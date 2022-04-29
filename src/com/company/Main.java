package com.company;

//Program to Compute the Position of an object falling under gravity influence
//
//

public class Main {


       public static void main(String[] args) {
              double gravity = -9.81; // Earth's acceleration due to gravity in m/s^2
              double initialVelocity = 0.0; //Starting velocity of an object in m/s
              double fallingTime = 10.0; //Time the object falls in seconds
              double initialPosition = 0.0; // Starting position of an object in meters
              double finalPosition; //Final Position of an object in meters

              finalPosition= (0.5 * gravity* (fallingTime*fallingTime) + initialPosition );

              System.out.println("The object's position after falling for  " + fallingTime +
                " seconds is " + finalPosition + " meters.");
    }
}
