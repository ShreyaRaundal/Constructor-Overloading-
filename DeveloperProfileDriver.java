public class DeveloperProfileDriver {
    public static void main(String[] args){
        DeveloperProfile dev1 = new DeveloperProfile("Shreya", "shreya@mail.com");
        DeveloperProfile dev2 = new DeveloperProfile("Ravi", "ravi@mail.com", "Java", 2);
        DeveloperProfile dev3 = new DeveloperProfile("Anjali", "anjali@mail.com", "Python", 3, "linkedin.com/in/anjali", "github.com/anjali");
        dev1.displayProfile();
        dev2.displayProfile();
        dev3.displayProfile();

    }
}
