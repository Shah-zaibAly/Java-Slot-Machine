import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    static Random random  = new Random();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int balance = 1000;
        int bet;
        int payout;
        String[] row;


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

            System.out.println("Spinning.......");
            row = spinrow();
            displayRow(row);





        }
    }

    static String[] spinrow(){

        String[] symbols = {"🦀" , "🐍" , "🐳" , "🦄" , "🕊️" };
        String[] row = new String[3];

        for(int i =0 ; i < 3 ; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void displayRow(String[] row){
        System.out.println(" " + String.join(" | " , row));
    }
}
