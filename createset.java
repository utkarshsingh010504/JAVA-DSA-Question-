import java.util.HashSet;
public class createset {
    public static void main(String []args){
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");
        set.add(null);
        System.out.print("Set:"+set);
    }
}
