import java.util.Scanner;

public class GameSection {
    GameSection(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Game Zone ");
        System.out.println("Enjoy Gaming");

        boolean flag=true;
        while(flag){
            System.out.println("What Do You Want to Play? \n1.)Number Guessing Game\n2.)Rock Paper Scissor\n3.)Tic Tac Toe\n4.)exit");
            int choice = sc.nextInt();
            if(choice == 1){  // Number Guessing Game
                Game g = new Game();
                boolean b = false;
                while(!b){
                    g.takeUserInput();
                    b = g.isCorrectNumber();
                }
            }else if(choice == 2){   // Rock paper Scissors
                Game3 g = new Game3();
            }else if(choice == 3){   // Tic Tac Toe
                Game2 g = new Game2();
            }else if(choice == 4){
                System.out.println("Thanks For Working with us!");
                flag=false;
            }else{
                System.out.println("Enter A valid Response");
            }
        }
    }
}
