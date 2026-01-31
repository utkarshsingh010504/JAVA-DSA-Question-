import java.util.*;
class animals{
    String name;
    String goodIn;
    void display(){
        System.out.println("Name of Animal : "+name+"\nGood in : "+goodIn);
    }
}
class bike{
    String name;
    int speed;
    void print1(){
        System.out.println("Name of bike : "+name+"\nTop Speed : "+speed);
    }
}
public class oop3 {
    public static void main(String[] args) {
        animals animal = new animals();
        bike b = new bike();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of animal : ");
        animal.name = obj.nextLine();
        System.out.println("Animal good in : ");
        animal.goodIn = obj.nextLine();
        System.out.println("Enter the name of a racing bike : ");
        b.name = obj.nextLine();
        System.out.println("Top Speed : ");
        b.speed = obj.nextInt();
        animal.display();
        b.print1();

    }
}