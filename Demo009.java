
import java.util.Scanner;


public class Demo009 {
    String Cust_Name = "Prasunamba";
    Double Balance = 10000.00;
    void accept_details(){
        System.out.println("enter ur name, account no");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        sc.nextLong();
        
    }
    void Display_details(){
        System.out.println("Hello "+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
    public static void main(String[] args){
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}