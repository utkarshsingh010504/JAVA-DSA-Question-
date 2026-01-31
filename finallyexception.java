public class finallyexception {
    public static void main(String args[]){
        try{
            int[] numbers ={1,2,3};
            System.out.println(numbers[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index access");
        }
        finally{
            System.out.println("Execution completed");
        }
    }
}
