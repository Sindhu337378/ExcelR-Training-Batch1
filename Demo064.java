public class Demo064 {
    public static void main(String[] args) {
        
        int[] array = {5, 10, 15, 20, 25};

        
        if (array.length > 1) {
            
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            
            System.out.print("Array after swapping first and last elements: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Array must have more than one element to swap.");
        }
    }
}