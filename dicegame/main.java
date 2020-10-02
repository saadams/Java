import java.util.Scanner;
import java.util.Random;


class Main {
  static int guess;
  // declares guess as a global variable in the class

  static void userInfo(){
    Scanner userGuess = new Scanner(System.in);  
    System.out.println("\nEnter a number from 1-6");
    // sets variable guees to what the user inputs
    guess = userGuess.nextInt(); 
    // if number is not between 1 and 6 print...
     if(guess >6 || guess <0){
      System.out.println("please enter a number between 1-6 \n");
      System.out.print("-----------------------------\n");
      userInfo(); //restarts program
      
    } else {
      System.out.println("you guessed " + guess);
      //calls the method checkDice
      checkDice();
    }
    userGuess.close(); // close scanner to avoid compiling error
    
    
  }
  static void checkDice(){
    int min = 1;
    int max = 6;
    int diceRoll = (int)(Math.random() * (max - min + 1) + min);
    System.out.println("--------------------------");
    System.out.println("The computer rolled " + diceRoll);
    System.out.println("-------------------------- \n");
  
      if( diceRoll == guess){
        System.out.println("You guessed right");
        System.out.println("play again?\n");
        System.out.println("-----------------------------");
        playAgain();

      }else {
        System.out.println("You guessed wrong");
        System.out.println("play again?\n");
        System.out.println("-----------------------------");
        playAgain();
      }

    }
  static void playAgain(){
      Scanner playAgain = new Scanner(System.in);
      System.out.println("Enter 1(yes) 2(no)");
      int userPlayAgain = playAgain.nextInt();
        if(userPlayAgain == 1){
          userInfo();//restart
        }else{
          System.out.println("thanks for playing");
          //end
        }
      playAgain.close(); // close scanner to avoid compiling error
  }

  public static void main(String[] args) {
    //calls userInfo from line 8
    userInfo();
  }
  
}
