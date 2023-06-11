import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.print("Number : ");
       Scanner scanner=new Scanner(System.in);
       int inputValue= scanner.nextInt();
       System.out.println((inputValue % 5==0 && inputValue % 3==0)?"FizzBuzz":inputValue % 5==0?"Fizz":inputValue % 3==0?"buzz":inputValue);
    }
}