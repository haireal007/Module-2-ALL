package validateClass;

public class ValidateClassNameTest {
    public static final String[] className = new String[]{"C0318G", "M0318G", "P0323A"};
    public static ValidateClassName classNameExample;

    public static void main(String[] args) {
        classNameExample = new ValidateClassName();
        for (String i : className
        ) {
            boolean isValid = classNameExample.ValidateName(i);
            System.out.println("Class name: " + i + " is valid " + isValid);
        }
    }
}
