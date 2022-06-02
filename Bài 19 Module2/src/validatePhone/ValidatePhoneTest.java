package validatePhone;

import validateClass.ValidateClassName;

public class ValidatePhoneTest {

    public static final String[] className = new String[]{"C0318G", "M0318G", "P0323A"};
    public static ValidatePhone classNameExample;

    public static void main(String[] args) {
        classNameExample = new ValidatePhone();
        for (String i : className
        ) {
            boolean isValid = classNameExample.ValidatePhone(i);
            System.out.println("Class name: " + i + " is valid " + isValid);
        }
    }
}
