import java.util.Scanner;
public class Day4B
{
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter side 1");
        int n1=reader.nextInt();
        System.out.println("Enter side 2");
        int n2=reader.nextInt();
        System.out.println("Enter side 3");
        int n3=reader.nextInt();
        if ((n1+n2>n3) && (n2+n3>n1) && (n3+n1>n2)){
            System.out.println("Triangle!");
        }
        else{
            System.out.println("Not a triangle!");
        }
    }
    
}
