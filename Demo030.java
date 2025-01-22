

import java.util.ArrayList;
import java.util.Iterator;
class ArrayListCode{ 
    void arrayListMethod(){
         ArrayList<Integer> arraylist = new ArrayList<>(); 
         arraylist.add(100); 
         arraylist.add(200); 
         arraylist.add(100); 
         arraylist.add(0); 
         arraylist.add(900); 
         arraylist.add(600); 
         System.out.println(arraylist);
         System.out.println("Elements of the list: ");
          Iterator<Integer> iterate = arraylist.iterator(); 
          while (iterate.hasNext()) { 
            System.out.println(iterate.next()); }
         }
    }
public class Demo030 {
    public static void main(String[] args) {
        ArrayListCode obj = new ArrayListCode(); 
        obj.arrayListMethod(); 
    }
}