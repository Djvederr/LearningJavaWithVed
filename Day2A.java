public class Day2A{
    private void greetings(String name, int age){
        System.out.println("Greetings "+name+"!");
        if (age>=18){
            System.out.println("You are eligibile to vote!");
        }
        else{
            System.out.println("You are not eligibile to vote!");
        }
        
    }
    
    public static void main(String[] args){
        Day2A obj=new Day2A();
        obj.greetings("Ved",19);
        
    }
}

