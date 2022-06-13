package controler;

import io.ReaderAndWriteAcc;
import model.Account;
import model.Computer;
import validate.ValidateComputer;

import java.util.ArrayList;
import java.util.Scanner;

public class MangerInUser {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Account> readerAndWriteAcc = new ReaderAndWriteAcc<>();
    ReaderAndWriteAcc<Computer> readerAndWritecomputer = new ReaderAndWriteAcc<>();
    ValidateComputer validateComputer = new ValidateComputer();
    ArrayList<Computer> computers;
    ArrayList<Account> accouts;
    ManagerLoginUser managerLoginUser = new ManagerLoginUser();
    ManagerComputer managerComputer = new ManagerComputer();
    ArrayList<Account> users;

    {
        users = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\accuontUser.txt");
        accouts = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\account.txt");
        computers = readerAndWritecomputer.reader("D:\\Module2\\caseStudy1\\src\\data\\computer.txt");
    }

    public void MenuInUser() {
        System.out.println("");
        System.out.println("Hello con vợ " + users.get(users.size()).getUserName());
        System.out.println("1.chọn computer");
        System.out.println("2.Go Back");
        System.out.println("3.Exit");
        System.out.println("");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerComputer.showComputer();
                    addComputer();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhap lai ");
        }
    }

    public void addComputer() {
        System.out.println("Nhập ID của Computer");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateComputer.getIndexId(id, computers);
        if (index != -1) {
            computers.get(index).setStatus(true);
            computers.get(index).setAccountUser(users.get(users.size()));
        } else {
            System.err.println("id sai");
        }
    }
}

