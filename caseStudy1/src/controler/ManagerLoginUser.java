package controler;

import io.ReaderAndWriteAcc;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerLoginUser {
    ReaderAndWriteAcc<Account> readerAndWriteAcc = new ReaderAndWriteAcc<>();
    Scanner scanner = new Scanner(System.in);
    public Account account;
    ArrayList<Account> accounts;
    ArrayList<Account> users;

    {
        users = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\accuontUser.txt");
        accounts = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

    public Account loginUser(ArrayList<Account> accounts) {
        while (true) {
            System.out.println("");
            System.out.println("=+=+=+=(!Software management net shop!)=+=+=+=+");
            System.out.println("============(!LOGIN-USER!)================");
            System.out.println("");
            System.out.println("");
            System.out.println("Nhập userName :");
            String user = scanner.nextLine();
            System.out.println("Nhập passWord");
            String pass = scanner.nextLine();
            for (Account acc : accounts) {
                if (acc.getUserName().equals(user) && acc.getPass().equals(pass) && acc.getRole().equals("user")) {
                    ManagerAcc.account = acc;
                    users.add(acc);
                    readerAndWriteAcc.write(users, "D:\\Module2\\caseStudy1\\src\\data\\accuontUser.txt");
                    return acc;
                }
            }
            System.err.println("Nhập sai userName - passWord ");
            return null;
        }
    }

}

