import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Projectus!");
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("What Are You Here For\n1.)Fun Section \n2.)Work Section\n3.)Exit");
            int choice = sc.nextInt();
            if(choice==1){
                GameSection gs = new GameSection();
            }else if(choice==2){
                WorkSection ws = new WorkSection();
            }else if(choice==3){
                System.out.println("Hope You Enjoyed");
                flag=false;
            }else{
                System.out.println("Enter A valid Response");
            }
        }

    }
}