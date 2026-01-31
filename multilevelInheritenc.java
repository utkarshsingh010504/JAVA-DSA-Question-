interface Animal1 {
    void eat();
}
interface Winged {
    void fly();
}
interface Mammal {
    void walk();
}
class Bat implements Animal1, Winged, Mammal {
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("bat can fly.");
    }

    public void walk() {
        System.out.println("bat can walk");
    }
}
public class multilevelInheritenc{
    public static void main(String[] args){
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
        bat.walk();
    }
}