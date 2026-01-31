public class throwexception {
    public static void main(String args[]){
        validateAge(20);
    }
    public static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or above. ");
        }
        else{
            System.out.println("Can Vote ");
        }
    }
}
