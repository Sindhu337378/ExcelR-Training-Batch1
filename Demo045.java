public class Demo045 {
    public static void main(String[] args) {
        // Declare two numbers
        int num1 = 10, num2 = 20;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        
        num1 = num1 + num2; 
        num2 = num1 - num2; 
        num1 = num1 - num2; 

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}