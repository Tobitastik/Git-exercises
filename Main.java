import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(200) + 1;


        if (randomNumber % 3 == 0 && randomNumber % 5 == 0) {
            System.out.println("Fizz");
        } else if (randomNumber % 3 == 0) {
            System.out.println("Buzz");
        } else if (randomNumber % 5 == 0) {
            System.out.println("BuzzFizz");
        } else {
            System.out.println(randomNumber);
        }
    }

    public static void printNumbers(int start, int end){
        while(start < end){
            System.out.println(start);
            start++;
        }
    }
}
