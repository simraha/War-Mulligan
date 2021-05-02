package war;
import java.util.Random;

public class Dice {
    //fields
    private int die1;
    private int die2;
    
    //mutators    
    public void setDie1(int a){
        die1 = a;
    }
    
    public void setDie2(int b){
        die1 = b;
    }
    
    //accessors
    public int getDie1 (){
        return die1;
    }
    
    public int getDie2() {
        return die2;
    }
    
    /**
     * Method name: rollDie1
     * Description: gets random output if dice is rolled
     * @return: dice output 1-6 
     */
    public int rollDie1() {
        Random randomNumbers = new Random();
        die1 = randomNumbers.nextInt(6)+1;
        return die1;
    } 
    
    //I DONT NEED THIS
    public int rollDie2() {
        Random randomNumbers = new Random();
        die2 = randomNumbers.nextInt(6)+1;
        return die2;
    }   
}