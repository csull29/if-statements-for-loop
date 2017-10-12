/*
Class HappyBirthday.java
@ author C Sullivan
28 Feb 2017
*/

import java.util.Scanner; //Scanner - Black window
public class HappyBirthdays{
	public static void main(String args[]){

		String name="";

		Scanner keyboard;
	    keyboard=new Scanner(System.in);

	    //input
	    System.out.println("What is your name?"); //ask the question
		name=keyboard.next(); //store the answer

		for(int i=1;i<=4;i++){
			if(i==3){ //if counter = 3
				System.out.println("Happy Birthday dear "+name+","); //print out this message with the name
			}
			else if(i==4) { //esle if, when it reaches 4, then print out the following two messages
				System.out.println("Happy Birthday to you.");
			}
			else{
				System.out.println("Happy Birthday to you,");
			}
		}
	}
}