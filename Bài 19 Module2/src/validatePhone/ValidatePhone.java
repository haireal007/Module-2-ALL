package validatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
    private static Pattern pattern;
    public Matcher matcher;

    public ValidatePhone() {
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean ValidatePhone(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
