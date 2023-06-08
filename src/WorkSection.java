import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WorkSection {
    WorkSection(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Work Zone ");
        boolean flag=true;
        while(flag){
            System.out.println("What Do You Want to do? \n1.)Binary To Decimal Converter\n2.)Decimal To Binary Converter");
            System.out.println("3.)Sort an Array\n4.)exit");
            System.out.print("Choice");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter a Binary Number");
                int n= sc.nextInt();
                BinToDec(n);
            }else if(choice == 2){
                System.out.print("Enter a Decimal Number");
                int n= sc.nextInt();
                DecToBin(n);
            }else if(choice == 3){
                System.out.println("enter the elements ");
                ArrayList<Integer> list  = new ArrayList<>();
                String ch="y";
                while(ch.equalsIgnoreCase("y")){
                    list.add(sc.nextInt());
                    System.out.print("press y to add more elements : ");
                    ch=sc.next();
                }
                sort(list);
            }else if(choice == 4){
                System.out.println("Thanks For Working with us!");
                flag=false;
            }else{
                System.out.println("Enter A valid Response");
            }
        }
    }
    public static void BinToDec(long n){
        long num = n;
        int pow = 0 ;
        int decNo=0;

        while(n>0){
            long lastDigit = n%10;
            decNo += (lastDigit * Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("The Decimal od "+num+ " = "+ decNo);
    }
    public static void DecToBin(int  n) {
        int n1 = n;
        long BinNo = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            BinNo = BinNo + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The Binary Number of " + n1 + " = " + BinNo);
    }
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }
}
