package model;

import java.util.Random;

public class modifier 
{
	private String gameChoice;
	private int playerChoiceNum;
	private int computerChoice;
	private String results;
	
	private String initialScale;
	private double initialTemp;
	private String finalScale;
	private String finalTemp;
	
	
	public modifier(String playerChoice)
	{
		super();
		rockPaperScissors(playerChoice);
	}
	public modifier(double temp, String scale)
	{
		super();
		convert(temp, scale);
	}

	private void rockPaperScissors(String playerChoice) 
	{
		gameChoice = playerChoice;
		
		gameChoice = gameChoice.toLowerCase();
		Random rand = new Random();
		
		computerChoice = rand.nextInt(3)+1;
		
		if(gameChoice.equals("rock") || gameChoice.equals("r"))
		{
			playerChoiceNum = 1;
		}
		else if(gameChoice.equals("paper") || gameChoice.equals("p"))
		{
			playerChoiceNum = 2;
		}
		else if(gameChoice.equals("scissors") || gameChoice.equals("s"))
		{
			playerChoiceNum = 3;
		}
		else
		{
			playerChoiceNum = -1;
		}
		
		if(playerChoiceNum == -1)
		{
			winOrLose("Invalid option. Try Again");
		}
		else if(playerChoiceNum == 1 && computerChoice == 3)
		{
			winOrLose("You Win");
		}
		else if(playerChoiceNum == 2 && computerChoice == 1)
		{
			winOrLose("You Win");
		}
		else if(playerChoiceNum == 3 && computerChoice == 2)
		{
			winOrLose("You Win");
		}
		else if(playerChoiceNum == computerChoice)
		{
			winOrLose("Draw");
		}
		else
		{
			winOrLose("I'm sorry. You have lost");
		}
	}
	
	public void winOrLose(String results)
	{
		this.results = results;
	}
	public String getResults()
	{
		return results;
	}
	public String getplayerResult()
	{
		return gameChoice;
	}
	public String getcomputerResult()
	{
		String result = "";
		if(computerChoice == 1)
		{
			result = "rock";
		}
		else if(computerChoice == 2)
		{
			result = "paper";
		}
		else if(computerChoice == 3)
		{
			result = "sicssors";
		}
		return result;
	}

	@Override
	public String toString() {
		return "modifier [gameChoice=" + gameChoice + ", playerChoiceNum=" + playerChoiceNum + ", computerChoice="
				+ computerChoice + ", results=" + results + "]";
	}
	
	
	//start of temperature conversion
	public void convert(double temp, String scale)
	{
		initialScale = scale;
		initialTemp = temp;
		
		
		initialScale = initialScale.toLowerCase();
		
		if(initialScale.equals("f"))
		{
			finalScale = "Converted to celcius is";
			double temporary = ((initialTemp - 32) * 5)/9;
			
			finalTemp = Double.toString(temporary) + " C";
		}
		else if(initialScale.equals("c"))
		{
			finalScale = "Converted to fahrenheit is";
			double temporary = (initialTemp * 1.8) + 32;
			
			finalTemp = Double.toString(temporary) + " F";
		}
		else
		{
			finalScale = "could not be converted. Invalid input";
			finalTemp = "";
		}
			
	}
	
	public String getInitialScale()
	{
		return initialScale;
	}
	public double getInitialTemp()
	{
		return initialTemp;
	}
	public String getFinalScale()
	{
		return finalScale;
	}
	public String getFinalTemp()
	{
		return finalTemp;
	}
	
	public String toStringTwo() 
	{
		return "modifier [initialTemp=" + initialTemp + ", initialScale=" + initialScale + ", FianlScale="
				+ finalScale + ", finalTemp=" + finalTemp + "]";
	}
}