

public class PS001 {
        
        private String firstName;
        private String lastName;
        private String address;
    private int id;
    
        
        public PS001() {
            this.id = 0;
            this.firstName = "";
            this.lastName = "";
            this.address = "";
        }
    
       
        public PS001(int id, String firstName, String lastName, String address) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }
    
       
        public String getFullName() {
            return firstName + " " + lastName;
        }
    
       
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        // Main method for testing
        public static void main(String[] args) {
            
            PS001 emp1 = new PS001();
            emp1.setFirstName("Sindhu");
            emp1.setLastName("venkanna");
            emp1.setAddress("123 Main St");
            System.out.println("Employee 1 Full Name: " + emp1.getFullName());
    
            
            PS001 emp2 = new PS001(2, "siri", "satyam", "456 Elm St");
            System.out.println("Employee 2 Full Name: " + emp2.getFullName());
        }
    }