/****************************************
  @author    Marsel Abu Samra
  @date      13 October 2021
  @version   1

A multiple choice quiz game where players roll a dice, 
move around a “board” that contains traps and secret.
They answer triva questions to advance through the “board”.
****************************************/

import java.util.Scanner; // Needed to make Scanner available

class BoardGame {
	
	// Main method of the program
	public static void main (String [] args)
	{
		play();
    System.exit(0);
	} // END main

	// This method creates all the records for the question bank, and calls the method to start the game off
	public static void play()
	{
		Questions q1 = createQuestions("What is the capital of Poland?" + "\n" + "a) Warsaw"
						   											+ "\n" + "b) London" + "\n" + "c) Berlin", "a");

		Questions q2 = createQuestions("Hg is the chemical symbol of which element?" +"\n" + "a) Carbon"
						   										 + "\n" + "b) Aluminium" + "\n" + "c) Mercury", "c");

		Questions q3 = createQuestions("Which country produces the most coffee in the world?" +"\n" + "a) Ethiopia"
						   										 + "\n" + "b) Brazil" + "\n" + "c) Colombia", "b");

		Questions q4 = createQuestions("What is the painting “La Gioconda” more usually known as?" +"\n" + "a) The Mono Lisa"
						   										 + "\n" + "b) The Starry Night" + "\n" + "c) Guernica", "a");

		Questions q5 = createQuestions("What colors are the Norwegian flag?" +"\n" + "a) Red and blue"
						   										 + "\n" + "b) Red, white, and blue" + "\n" + "c) Green, white, and red", "b");

		Questions q6 = createQuestions("Which is the highest waterfall in the world?" +"\n" + "a) Tugela Falls"
						   										 + "\n" + "b) Denmark Strait" + "\n" + "c) Angel Falls", "b");

		Questions q7 = createQuestions("What are the three primary colors?" +"\n" + "a) Green, blue, and red"
																	 + "\n" + "b) Black, red, and white" + "\n" + "c) Red, yellow, and blue", "c");

		Questions q8 = createQuestions("Which country invented tea?" +"\n" + "a) China"
						   										 + "\n" + "b) England" + "\n" + "c) Japan","a");

		Questions q9 = createQuestions("Pure water has a pH level of around?" +"\n" + "a) 7"
						   										 + "\n" + "b) 12" + "\n" + "c) 4", "a");

		Questions q10 = createQuestions("Who starts first in chess?" +"\n" + "a) Black" + "\n" + "b) White" 
																		+ "\n" + "c) Player's choose", "b");

		Questions [] QuestionBank = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10}; // Array of records

		final int numberOfPlayers = inputInt("How many players will be playing 2-4?");

		playTheGame(QuestionBank, numberOfPlayers);
	} // END play

	// This method firstly, prints out the instructions of the game, then it takes the player through the game and fills their positions in the array. 
  // Lastly, it prints out the winner of the game.
	public static void playTheGame(Questions [] questionBank, int numberOfPlayers)
	{
		System.out.println("Game Instructions: " +"\n" + "1. Select the order in which  players will play." +"\n"+
											  "2. The game is played in order of questions." +"\n"+
											  "3. There are a series of 10 questions." +"\n"+
											  "4. Each player takes turn in answering these questions." +"\n"+ 
											  "5. At the start of the turn, a dice is rolled and each player gets their starting position." +"\n"+
											  "6. The players then advance through the board by answering trvia questions" +"\n"+
											  "7. If a player lands on a secret corridor and answer the question correctly, they advance 4 places." +"\n"+
											  "8. If a player lands on a trap and they answer a question incorrectly, they go back 4 places." +"\n"+
											  "9. If a player lands on any other field, they advance 1 place if they answer the question correctly, and go back 1 place if they answer a question incorrectly." +"\n"+
											  "10. The player that gets the furthest on the board wins!" +"\n");

		if (numberOfPlayers == 2)
		{
			int [] playerPosition = createIntArray(2);

			playerPosition [0] = rollDice(0);
			playerPosition [1] = rollDice(0);

		  System.out.println("Player 1 starting position on the board is " + playerPosition[0]);
		  System.out.println("Player 2 starting position on the board is " + playerPosition[1]);
		  System.out.println();

			for (int i = 0; i < questionBank.length; i++)
			{
				for (int j = 0; j < numberOfPlayers; j++)
				{
					boolean userAnswer = checkAnswer(questionBank[i]);
					playerPosition[j] = newPosition(playerPosition[j], userAnswer);
					System.out.println("Player " + (j+1) + " current position on the board is " + playerPosition[j]);
					System.out.println();
	  		}
			}
			System.out.println("Player 1 final position on the board is " + playerPosition[0]);
			System.out.println("Player 2 final position on the board is " + playerPosition[1]);
			System.out.println();

			if (playerPosition[0] > playerPosition[1])
			{
				System.out.println("Player 1 wins!");
			}
			else if (playerPosition[0] == playerPosition[1])
			{
				System.out.println("It's a draw!");
			}
			else
			{
				System.out.println("Player 2 wins!");
			}

		}
		else if (numberOfPlayers == 3)
		{
			int [] playerPosition = createIntArray(3);

			playerPosition [0] = rollDice(0);
			playerPosition [1] = rollDice(0);
			playerPosition [2] = rollDice(0);

		  System.out.println("Player 1 starting position on the board is " + playerPosition[0]);
		  System.out.println("Player 2 starting position on the board is " + playerPosition[1]);
		  System.out.println("Player 3 starting position on the board is " + playerPosition[2]);
		  System.out.println();

			for (int i = 0; i < questionBank.length; i++)
			{
				for (int j = 0; j < numberOfPlayers; j++)
				{
					boolean userAnswer = checkAnswer(questionBank[i]);
					playerPosition[j] = newPosition(playerPosition[j], userAnswer);
					System.out.println("Player " + (j+1) + " current position on the board is " + playerPosition[j]);
					System.out.println();
	  		}
			}

			System.out.println("Player 1 final position on the board is " + playerPosition[0]);
			System.out.println("Player 2 final position on the board is " + playerPosition[1]);
			System.out.println("Player 3 final position on the board is " + playerPosition[2]);
			System.out.println();

			if (playerPosition[0] > playerPosition[1] && playerPosition[0] > playerPosition[2])
			{
				System.out.println("Player 1 wins!");
			}
			else if (playerPosition[1] > playerPosition[0] && playerPosition[1] > playerPosition[2])
			{
				System.out.println("Player 2 wins!");
			}
			else if (playerPosition[2] > playerPosition[0] && playerPosition[2] > playerPosition[1])
			{
				System.out.println("Player 3 wins!");
			}
			else
			{
				System.out.println("It's a draw!");
			}
		}
		else if (numberOfPlayers == 4)
		{
			int [] playerPosition = createIntArray(4);

			playerPosition [0] = rollDice(0);
			playerPosition [1] = rollDice(0);
			playerPosition [2] = rollDice(0);
			playerPosition [3] = rollDice(0);

		  System.out.println("Player 1 starting position on the board is " + playerPosition[0]);
		  System.out.println("Player 2 starting position on the board is " + playerPosition[1]);
		  System.out.println("Player 3 starting position on the board is " + playerPosition[2]);
		  System.out.println("Player 4 starting position on the board is " + playerPosition[3]);
		  System.out.println();

			for (int i = 0; i < questionBank.length; i++)
			{
				for (int j = 0; j < numberOfPlayers; j++)
				{
					boolean userAnswer = checkAnswer(questionBank[i]);
					playerPosition[j] = newPosition(playerPosition[j], userAnswer);
					System.out.println("Player " + (j+1) + " current position on the board is " + playerPosition[j]);
					System.out.println();
	  		}
			}
			System.out.println("Player 1 final position on the board is " + playerPosition[0]);
			System.out.println("Player 2 final position on the board is " + playerPosition[1]);
			System.out.println("Player 3 final position on the board is " + playerPosition[2]);
			System.out.println("Player 4 final position on the board is " + playerPosition[3]);
			System.out.println();

			if (playerPosition[0] > playerPosition[1] && playerPosition[0] > playerPosition[2] && playerPosition[0] > playerPosition[3])
			{
				System.out.println("Player 1 wins!");
			}
			else if (playerPosition[1] > playerPosition[0] && playerPosition[1] > playerPosition[2] && playerPosition[1] > playerPosition[3])
			{
				System.out.println("Player 2 wins!");
			}
			else if (playerPosition[2] > playerPosition[0] && playerPosition[2] > playerPosition[1] && playerPosition[2] > playerPosition[3])
			{
				System.out.println("Player 3 wins!");
			}
			else if (playerPosition[3] > playerPosition[0] && playerPosition[3] > playerPosition[1] && playerPosition[3] > playerPosition[2])
			{
				System.out.println("Player 4 wins!");
			}
			else
			{
				System.out.println("It's a draw!");
			}
		}
		else
		{
			System.out.println("Only 2-4 players are allowed to play this game!");
			System.exit(0);
		}
	}// END playTheGame

	// This method is used to create question record
	public static Questions createQuestions(String question, String answer)
	{
		Questions q = new Questions();
		setQuestion(q, question);
		setAnswer(q, answer);

		return q;
	} // END createQuestions

	// This method is used to ask the player a question and store their answer
	public static String askQuestion(String message)
	{
		Scanner keyboard = new Scanner(System.in);
		String answer;

		System.out.println(message);
		answer = keyboard.nextLine();

		return answer;
	} // END askQuestion

	// This method checks if the answer given is correct
	public static boolean checkAnswer(Questions q)
	{
		String userAnswer = askQuestion(getQuestion(q));

		System.out.println("You answerd " + userAnswer);
		System.out.println("The correct answer is option " + getAnswer(q) + ".");

		if (userAnswer.equals(getAnswer(q)))
		{
			return true;
		}
		else 
		{
			return false;
		}
	} // END checkAnswer

	// This method rolls the dice and added the roll to the player's position, the player's new position is then returned
	public static int rollDice(int position)
	{
		int dice = (int)(Math.random()*6) + 1;
		position = position + dice;

		return position;
	} // END rollDice

	// This method returns the player's new position based on their current position and answer to the question
	public static int newPosition(int position, boolean answerToQuestion)
	{
		int newPosition;
		int special = position % 3;
		int trap = position % 5;

		if (special == 0 && answerToQuestion == true)
		{
			newPosition = position + 4;
		}
		else if (trap == 0 && answerToQuestion == false)
		{
			newPosition = position - 4;
		}
		else if (answerToQuestion == true)
		{
			newPosition = position + 1;
		}
		else
		{
			newPosition = position - 1;
		}

		return newPosition;
	} // END newPosition

	// This method create an int array
	public static int [] createIntArray(int size)
	{
		int [] intArray = new int[size];

		return intArray;
	} // END createIntArray

	// This method is used to get the user's Int input
  public static int inputInt (String message)
  {
    String answer = askQuestion(message);
    return Integer.parseInt(answer);
  } // END inputInt

  // Accessor Methods
  // Given a Questions record, it return the question stored in the record 
  public static String getQuestion(Questions q)
  {
  	return q.question;
  } // END getQuestion

  // Given a Questions record, it return the answer stored in the record
  public static String getAnswer(Questions q)
  {
  	return q.answer;
  } // END getAnswer

  // Given a Questions record and a new question, it stores the question in the record and returns it
  public static Questions setQuestion(Questions q, String ques)
  {
  	q.question = ques;

  	return q;
  } // END setQuestion

  // Given a Questions record and a new answer, it stores the answer in the record and returns it
  public static Questions setAnswer(Questions q, String ques)
  {
  	q.answer = ques;

  	return q;
  } // END setAnswer
} // END class BoardGame

// This class contains field definitions for a universal Questions record to be used when creating records
class Questions
{
	String question;
	String answer;
} // END class Questions