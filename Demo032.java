

import java.util.HashSet;
class HashSetDemo032 {

    void HashsetMethod(){
        HashSet <String>hashSet = new HashSet<String>();
		hashSet.add("INDIA");
		hashSet.add("AUSTRALIA");
		hashSet.add("BANGLADESH");
		hashSet.add("CHINA");
		hashSet.add("DUBAI");
		hashSet.add("INDIA");
		System.out.println(hashSet);
    }
	
}

public class Demo032 {
    public static void main(String[] args) {
		HashSetDemo032 obj = new HashSetDemo032();
        obj.HashsetMethod();
	}
}