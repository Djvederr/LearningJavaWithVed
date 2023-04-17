public class Day3{
    
    public static void greetings(String name, int age){
        System.out.println("Greetings "+name+"!");
        if (age>=18){
            System.out.println("You are eligibile to vote!");
        }
        else{
            System.out.println("You are not eligibile to vote!");
        }
    }
    public static void main(String[] args){
        Day3 obj=new Day3();
        obj.greetings("ved",13);
    }
}