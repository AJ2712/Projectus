import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int number;
    private int noOfGuesses;
    private int inputNumber;
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void takeUserInput(){
        System.out.print("Guess The Number : ");
        Scanner sc =  new Scanner(System.in);
        inputNumber = sc.nextInt();
        noOfGuesses++;
    }
    public boolean isCorrectNumber(){
        if(inputNumber==number){
            System.out.printf("You Guessed It right ! The Number Is %d , \nExcellent!You Guessed it in %d Attempts \n\n",number,getNoOfGuesses());
            return true;
        }
        else if(inputNumber > number){
            System.out.println("Enter A smaller number");
        }
        else {
            System.out.println("Enter A Bigger Number ");
        }
        return false;
    }

}