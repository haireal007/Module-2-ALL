package main;

import controler.ManagerAcc;

public class Main {
    public static void main(String[] args) {
        ManagerAcc managerAcc = new ManagerAcc();

        while (true){
            if(ManagerAcc.account == null){
                managerAcc.login();
            }else {
                System.out.println("a");
                break;
//                managerAcc.menu();
            }
        }
    }
}
