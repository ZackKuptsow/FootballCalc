/*Zack Kuptsow, zkups@udel.edu 
 * CISC181-32, Quiz 1, Prof. Gibbons, TA Andrew Gross */
package FootballCalc;

import java.util.Scanner;

public class FootballCalc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Scanner provides the ability for user input
		Scanner input = new Scanner(System.in);
		
		//Asks user for stats to calculate variable
		System.out.println("How many attempts has the player made?");
		double Attempts = input.nextDouble();
		System.out.println("How many completions has the player made?");
		double Completions = input.nextDouble();
		System.out.println("How many passing yards does the player have?");
		double PassingYards = input.nextDouble();
		System.out.println("How many touchdown passes does the player have?");
		double TouchdownPasses = input.nextDouble();
		System.out.println("How many interceptions has the player made?");
		double Interceptions = input.nextDouble();
		
		//Calculates all the variables values
		double VariableA = (((Completions / Attempts) - .3) * 5.0);
		double VariableB = ((PassingYards / Attempts) - 3) * .25;
		double VariableC = (TouchdownPasses / Attempts) * 20;
		double VariableD = 2.375 - ((Interceptions / Attempts) * 25);
		
		//Displays the value of each variable
		System.out.println("VariableA =" + VariableA + ".");
		System.out.println("VariableB =" + VariableB + ".");
		System.out.println("VariableC =" + VariableC + ".");
		System.out.println("VariableD =" + VariableD + ".");
		
		//Calculates the final player passer rating
		double PasserRating = ((VariableA + VariableB + VariableC + VariableD) / 6) * 100;
		System.out.print("The player's passer rating is " + PasserRating + ".");

	}

}
