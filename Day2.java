
public class Day2{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int a= 45;
        if ((a%2)==0){
            System.out.println("Even!");
        }
        else{

            System.out.println("Odd!");
        }
        if ((a%2==1) && (a%3==0)){
            System.out.println("Odd multiple of 3!");
        }
            
        int interest;
        int cost=5983;
        if (cost>=10000){
            interest=10;
        }
        else if (cost>=5000){
            interest=5;
        }
        else{
            interest=3;
        }
        double amount=cost+cost*interest/100;
        System.out.println(amount);
    }
}
