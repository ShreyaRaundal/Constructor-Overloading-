public class Form {
    String name;
    int tel;
    long phone;
    char gen;
    String blood;
    String email;
    String dob;

    // No-arg constructor
    Form() {
        this.name = "Unknown";
        this.phone = 0;
        this.gen = 'U'; // U for Unknown
        this.blood = "Unknown";
        this.email = "Unknown";
        this.dob = "Unknown";
        this.tel = 0;
    }

    // Constructor with 6 arguments
    Form(String name, long phone, char gen, String blood, String email, String dob) {
        this.name = name;
        this.phone = phone;
        this.gen = gen;
        this.blood = blood;
        this.email = email;
        this.dob = dob;
    }

    // Constructor with 7 arguments (including tel)
    Form(String name, long phone, char gen, String blood, String email, String dob, int tel) {
        this.name = name;
        this.phone = phone;
        this.gen = gen;
        this.blood = blood;
        this.email = email;
        this.dob = dob;
        this.tel = tel;
    }

    // Method to display the form details
    public void displayforms() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Gen: " + gen);
        System.out.println("Blood: " + blood);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);
        System.out.println("Tel: " + tel);
    }
}
