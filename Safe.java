import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Safe{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int randomNumber = ThreadLocalRandom.current().nextInt(0, 101); // Generates a number between 0 and 100
    }
}