package controler;

import io.ReaderAndWriteAcc;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerAcc {
    ReaderAndWriteAcc<Account> readerAndWriteAcc = new ReaderAndWriteAcc<>();
    Scanner scanner = new Scanner(System.in);
    static public Account account;
    ArrayList<Account> accounts = new ArrayList<>();

    {
        accounts = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\account.txt");
        if (accounts.size() == 0) {
            accounts.add(new Account("admin", "admin", "admin",123456789));
        }
        readerAndWriteAcc.write(accounts, "D:\\Module2\\caseStudy1\\src\\data\\account.txt");
    }

    public boolean login() {
        System.out.println("");
        System.out.println("=+=+=+=(!Software management net shop!)=+=+=+=+");
        System.out.println("============(!LOGIN!)================");
        System.out.println("");
        System.out.println("");
        System.out.println("Nhập userName :");
        String user = scanner.nextLine();
        System.out.println("Nhập passWord");
        String pass = scanner.nextLine();
        for (Account acc : accounts) {
            if (acc.getUserName().equals(user) && acc.getPass().equals(pass)) {
                ManagerAcc.account = acc;
                return true;
            }
        }
        System.err.println("Nhập sai userName - passWord ");
        return false;
    }

}
