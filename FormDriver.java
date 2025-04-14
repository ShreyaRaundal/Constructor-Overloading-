public class FormDriver {
    public static void main(String[] args) {
        // No-arg constructor
        Form f1 = new Form();
        f1.displayforms();

        System.out.println("-----------------------------");

        // Constructor with 6 arguments
        Form f2 = new Form("Shreya", 98765432101L, 'F', "O+", "shreya@example.com", "12/12/2003");
        f2.displayforms();

        System.out.println("-----------------------------");

        // Constructor with 7 arguments (with tel)
        Form f3 = new Form("Shreya", 98765432101L, 'F', "O+", "shreya@example.com", "12/12/2003", 12345);
        f3.displayforms();
    }
}
