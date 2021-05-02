package war;
import java.util.Scanner;

public class War {
    static Scanner scanS = new Scanner(System.in);     
    static Scanner scanN = new Scanner(System.in);
    static Dice obj1 = new Dice();
    static Dice obj2 = new Dice();
    static Dice obj3 = new Dice();
    static Dice obj4 = new Dice();
        
    public static void main(String[] args) {
               
        System.out.println("Welcome to Dice Games Inc.");
        System.out.println("Please enter your name:");
        String name = scanS.nextLine();
        
        System.out.println("What game would you like to play?"
                + "(1. war, 2. Mulligan)");
        int game = scanN.nextInt();      
        if (game==1) {
            war ( );
        } else if (game==2) {
            mulligan ( );
        }
    } 
    
    public static void war ( ) {
        System.out.println("Would you like to roll? (y/n)");
        String roll = scanS.nextLine();
        if (roll.equalsIgnoreCase("y")){
            System.out.println("You have rolled a " + obj1.rollDie1());
            System.out.println("The computer has rolled a " + obj2.rollDie1());
            if (obj1.getDie1()>obj2.getDie1()){
                System.out.println("You have won!!!");
            } else {
                System.out.println("Sory, you have lost!");
            }
        }
    }
    
    public static void mulligan ( ){
        int penalty = 0;
        String mulligan;
        System.out.println("You have chosen to play Mulligan!");
        System.out.println("Would you like to roll? (y/n)");
        String roll = scanS.nextLine();
        if (roll.equalsIgnoreCase("y")){
            System.out.println("You have rolled " + obj1.rollDie1());
            do {
                System.out.println("Would you like to mulligan? (y/n)");
                mulligan = scanS.nextLine();
                penalty = penalty + 1;
                if (mulligan.equalsIgnoreCase("n"))            
                    System.out.println("You have rolled " + obj1.rollDie1());    
            } while (mulligan.equalsIgnoreCase("y"));
            System.out.println("you have rolled "+ obj1.getDie1() + " with a "
                    + "penalty of "+ (penalty-1));    
            System.out.println("your score is: "+(obj1.getDie1()-(penalty)-1));
        }
    }
}