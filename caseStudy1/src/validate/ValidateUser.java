package validate;

import io.ReaderAndWriteAcc;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidateUser {
    Scanner scanner = new Scanner(System.in);
//    ReaderAndWriteAcc<Account> readerAndWriteAccUser = new ReaderAndWriteAcc<>();
//    ArrayList<Account> accounts = readerAndWriteAccUser.reader("D:\\Module2\\caseStudy1\\src\\data\\account.txt");

    //
//    public String validateName() {
//        String str = null;
//        while (true) {
//            System.out.println("nhập name");
//            str = scanner.nextLine();
//            if (str.equals("")) {
//                System.out.println("không được để trống");
//                continue;
//            }
//            if (checkUserName(str)) {
//                break;
//            }
//        }
//        return str;
//    }
//
//    public boolean checkUserName(String userName) {
//        for (Account acc : accounts) {
//            if (acc.getUserName().equals(userName)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public String validatePass() {
        while (true) {
            System.out.println("Nhập pass ");
            String str = scanner.nextLine();
            if (str.equals("")) {
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
    public String validateString() {
        while (true) {
            System.out.println("Nhập name ");
            String str = scanner.nextLine();
            if (str.equals("")) {
                System.err.println("không để trống");
                continue;
            } else {
                return str;
            }
        }
    }
    public  double validateMoney() {
        while (true) {
            try {
                System.out.println("Nhập money:");
                double price = Double.parseDouble(scanner.nextLine());
                return price;
            } catch (Exception e) {
                System.err.println("Nhập sai money rồi");
            }
        }
    }
}
