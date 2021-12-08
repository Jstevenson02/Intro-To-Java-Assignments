package repo;

public class PasswordMaker1 {
    public static void main(String[] args) {
        String firstName = "John";
        String middleName = "Paul";
        String lastName = "Green";
        int age = 20;

        String initials = firstName.substring(0,1) +
        middleName.substring(0,1) + lastName.substring(0,1);

        String password = initials.toLowerCase() + age;
        System.out.println("Your password = " + password);
    }
}
