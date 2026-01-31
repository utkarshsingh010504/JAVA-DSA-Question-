import java.util.LinkedList;
public class byforeach{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("PRASH");
        list.add("DEEP");
        for(String ls:list){
            System.out.println(ls);
        }
    }
}