package validateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
    private static Pattern pattern;
    public Matcher matcher;

    public ValidateClassName() {
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean ValidateName(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

// Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//        Không chứa các ký tự đặc biệt
//        Theo sau ký tự bắt đầu là 4 ký tự số
//        Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M