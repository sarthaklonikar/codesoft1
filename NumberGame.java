package Number_GAME;

import java.lang.Math;

import java.util.Scanner;

public class NumberGame {

	
	public static void main(String[] args) 
	{
		int input,trial=5,attempt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println
		("***The Number Game [Specified Range between 1-10]***");
		System.err.println
	("*you have to guess a number \nif it is correct you will win!!!");
		System.out.println("\n------5 Atttempts------");
		int guess=(int)(Math.random()*100)+1;
	System.out.println(guess);
		boolean ans=false;
		System.err.println("\n***All The Best***");
		while(trial>0)
		{
			System.out.println("\nGuess the Number:-");
			input=sc.nextInt();
			
			if(input==guess)
			{
				System.out.println("***Congratulations..!you guessed Right Number***");
				ans=true;
				break;
			}
			else if(input<guess)
			{
				attempt++;
				trial--;
				System.out.println("Your guess is too low:-**" +"attempt:- "+attempt); 
			}
			else if(input>guess)
			{
				attempt++;
				trial--;
				System.out.println("Your guess is too high:-** "+"attempt:- "+attempt);
			}
			if(attempt==5)
			{
				System.err.println("End you have Crossed 5 Attempts...!!! ");
			}
			
			
		}
		
		
		
	}
	
	
	
}