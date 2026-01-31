public class differentcatchblock {
    public static void main(String args[]) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Arithematic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Some other exception occured.");
        }
    }
}