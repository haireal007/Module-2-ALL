package validateClass;

public class ValidateClassNameTest {
    public static final String[] className = new String[]{"0359809495", "01864728537"};
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
