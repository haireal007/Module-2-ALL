package validate;

import io.ReaderAndWriteAcc;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidateUser {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Account> readerAndWriteAccUser = new ReaderAndWriteAcc<>();
    ArrayList<Account> accounts;

    public String validateName() {
        while (true) {
            System.out.println("Nhập name ");
            String str = scanner.nextLine();
            if (checkUserName(str)) {
                System.err.println("không để trống");
            } else {
                return str;
            }
        }
    }

    public boolean checkUserName(String userName) {
        for (Account acc : accounts) {
            if (acc.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public String validatePass() {
        while (true) {
            System.out.println("Nhập pass " );
            String str = scanner.nextLine();
            if (str.equals("") && checkUserName(str)) {
                System.err.println("không để trống");
                continue;
            } else {
                return str;
            }
        }
    }

    public int validateNumber() {
        while (true) {
            try {
                System.out.println("nhập phone");
                int phone = Integer.parseInt(scanner.nextLine());
                return phone;

            } catch (NumberFormatException e) {
                System.err.println("nhập sai số - nhập lại ");
            }
        }
    }
}
