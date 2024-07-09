// import java.util.random.*;
import java.util.*;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt( 100);
    }
    void takeUserInput(){
        System.out.println("Guess the number :-");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean iscorrectNumber(int num){
        noOfGuesses++;
        if(num==number){
            System.out.println("Yes, you guess it right. It was "+number+".\nYou guess it in "+noOfGuesses+" attempts.");
            return true;
        }
        else if(num>number){
            System.out.println("Too High.....");
        }
        else if(num<number){
            System.out.println("Too Low.....");
        }
        return false;
    }
}

public class GussNo_Game{
    public static void main(String arg[]){
        Game g = new Game();
        boolean b=false;
        while(b==false){
            g.takeUserInput();
            b=g.iscorrectNumber(g.inputNumber);
            // System.out.println(b);
        }
    }
}