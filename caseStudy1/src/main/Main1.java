package main;

import controler.*;
import io.ReaderAndWriteAcc;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerLoginUser managerLoginUser = new ManagerLoginUser();
        MangerInUser managerInUser = new MangerInUser();
        ReaderAndWriteAcc<Account> readerAndWriteAcc = new ReaderAndWriteAcc<>();
        ArrayList<Account> accounts;
        accounts = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\account.txt");
        if (managerLoginUser.loginUser(accounts) != null) {
            managerInUser.MenuInUser();
        }

    }
}



