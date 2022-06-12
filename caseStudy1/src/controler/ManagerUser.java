package controler;

import io.ReaderAndWriteAcc;
import model.Account;
import validate.ValidateUser;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUser {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Account> readerAndWriteAccUser = new ReaderAndWriteAcc<>();
    ArrayList<Account> accounts;
    ValidateUser validateUser = new ValidateUser();

    {
        accounts = readerAndWriteAccUser.reader("D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }


    public void MenuUser() {
        while (true) {
            System.out.println("");
            System.out.println("====ManagerUser=====");
            System.out.println("Danh sách thành viên");
            showUser();
            System.out.println("");
            System.out.println("MenuUser");
            System.out.println("1.Thêm User");
            System.out.println("2.Sửa User");
            System.out.println("3.Xoá User");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }

    //hiển thị
    public void showUser() {
        for (Account ac : accounts) {
            if (ac.getRole().equals("user")) System.out.println(ac);
        }
    }


    // thêm user
    public Account creatUser() {
        String user = validateUser.validateName();
        String pass = validateUser.validatePass();
        int phone = validateUser.validateNumber();
        return new Account(user, pass, "user", phone);
    }


    //thêm list
    public void addUser() {
        accounts.add(creatUser());
        readerAndWriteAccUser.write(accounts, "D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

    //sửa UserName
    public void editName() {
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        for (Account ac : accounts) {
            if (ac.getUserName().equals(name) && ac.getRole().equals("user")) {
                System.out.println("Nhập lại pass");

            }
        }
    }

}