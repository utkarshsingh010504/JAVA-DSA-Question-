import java.util.Hashtable;
public class hashtable {
    public static void main(String[] args) {
        Hashtable<String,Integer>cityPopulation = new Hashtable<>();
        cityPopulation.put("New York",8419600);
        cityPopulation.put("New Delhi",3461485);
        cityPopulation.put("Mumbai", 23164361);
        System.out.println(cityPopulation.get("New Delhi"));
        System.out.println(cityPopulation.remove("Mumbai"));
        System.out.println(cityPopulation.containsKey("New York"));
        System.out.println("cityPopulation"+cityPopulation);
    }
}