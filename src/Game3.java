import java.util.Random;
import java.util.Scanner;

public class Game3 {
    Game3(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int CompChoice= rand.nextInt(3);
        System.out.print("Enter Choice (0 for rock, 1 for paper, 2 for scissors) :");
        int PlayerChoice= sc.nextInt(3);
        if(PlayerChoice==0 && CompChoice==2 || PlayerChoice==1 && CompChoice==0 || PlayerChoice==2 && CompChoice==1){
            System.out.println("Player Wins");
        } else if (PlayerChoice==0 && CompChoice==0 || PlayerChoice==1 && CompChoice==1 ||PlayerChoice==2 && CompChoice==2) {
            System.out.println("Match Draw");
        }else{
            System.out.println("Computer Wins");
        }
    }
}
