import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random  = new Random();

        int balance = 1000;
        int bet;
        int payout;
        String[] symbols = {"🦀" , "🐍" , "🐳" , "🦄" , "🕊️" };

        while(balance > 0) {

            System.out.println("you current balance :" + balance);
            System.out.print("Enter your bet :");
            bet = scanner.nextInt();

            if(bet > balance){
                System.out.println("Not enough funds bud!");
                System.out.println("Sorry for this bet.");
            }else if(bet < 0){
                System.out.println("The bet cannot be less than zero!");
                System.out.println("Reconsider it.");
            }else{
                balance -= bet;
            };




        }



    }
}
