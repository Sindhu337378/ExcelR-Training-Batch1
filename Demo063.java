public class Demo063 {
    public static void main(String[] args) {
        
        int[] array = {5, 10, 15, 20, 25};

        
        if (array.length > 0) {
            
            int sum = array[0] + array[array.length - 1];

            
            System.out.println("Sum of the first and last elements: " + sum);
        } else {
            System.out.println("The array is empty.");
        }
    }
}