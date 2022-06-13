package controler;

import io.ReaderAndWriteAcc;
import model.Account;
import validate.ValidateUser;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUser {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Account> readerAndWriteAccUser = new ReaderAndWriteAcc<Account>();
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
            System.out.println("4.Nạp tiền");
            try {


                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addUser();
                        break;
                    case 2:
                        editUser();
                        break;
                    case 3:
                        editDlete();
                        break;
                    case 4:
                        inputMonney();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập sai lựa chọn - nhập lại");
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
        String name = null;
        while (true) {
            System.out.println("nhập name");
            name = scanner.nextLine();
            if (name.equals("")) {
                System.out.println("không được để trống");
            }
            if (checkUserName(name)) {
                break;
            }
        }
        String pass = validateUser.validatePass();
        int phone = validateUser.validateNumber();
        return new Account(name, pass, "user", phone, 0);
    }


    public boolean checkUserName(String userName) {
        for (Account acc : accounts) {
            if (acc.getUserName().equals(userName)) {
                System.out.println("tài khoản đã tồn tại");
                return false;
            }
        }
        return true;
    }

    //thêm list
    public void addUser() {
        accounts.add(creatUser());
        readerAndWriteAccUser.write(accounts, "D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

    //sửa UserName
    public void editUser() {
        String name = validateUser.validateString();
        for (Account ac : accounts) {
            if (ac.getUserName().equals(name) && ac.getRole().equals("user")) {
                System.out.println("Nhập lại pass");
                String pass = validateUser.validatePass();
                ac.setPass(pass);
            }
        }
        readerAndWriteAccUser.write(accounts, "D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

    // xoá UserName
    public void editDlete() {
        String name = validateUser.validateString();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(name) && accounts.get(i).getRole().equals("user")) {
                accounts.remove(i);
            }
        }
        readerAndWriteAccUser.write(accounts, "D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

    public void inputMonney() {
        String name = validateUser.validateString();
        for (Account ac : accounts) {
            if (ac.getUserName().equals(name) && ac.getRole().equals("user")) {
                double money = validateUser.validateMoney();
                ac.setMoney(money);
            }
        }
        readerAndWriteAccUser.write(accounts,"D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

}