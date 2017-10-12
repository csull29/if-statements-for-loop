/*
HappyBirthday.java
@ author C Sullivan
18 Feb 2017
*/

import javax.swing.*;
public class HappyBirthday{
	public static void main(String args[]){

	 String name="";


		name=JOptionPane.showInputDialog(null, "What's your name");

		for(int i=0;i<=4;i=i+1){
			System.out.println("Happy Birthday to you,");
			System.out.println("Happy Birthday to you,");
			System.out.println("Happy Birthday dear "+name);
			System.out.println("Happy Birthday to you!");
		}




}


}