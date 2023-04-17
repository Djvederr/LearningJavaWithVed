import java.util.Scanner;

public class Day4
{
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner reader= new Scanner(System.in);
        String name= reader.nextLine();
        System.out.println("Enter your age");
        int age=reader.nextInt();
        Day3.greetings(name,age);
    }
}