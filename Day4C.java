import java.util.Scanner;

public class Day4C
{
   public static void main(String[] args){
       Scanner reader= new Scanner(System.in);
       System.out.println("Enter a number");
       int num=reader.nextInt();
       for(int i=1;i<=10;i++){
           System.out.println(i+"X"+num+"="+i*num);
           
       }
       for(int i=1;i<=num*10;i++){
            if (i%num==0){
                System.out.println(i);
            }
       }
   }
}
