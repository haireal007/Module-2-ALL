package main;

import controler.ManagerAcc;
import controler.ManagerRoom;

public class Main {
    public static void main(String[] args) {
        ManagerAcc managerAcc = new ManagerAcc();
        ManagerRoom managerRoom = new ManagerRoom();

        while (true){
            if(ManagerAcc.account == null){
                managerAcc.login();
            }else {
              managerRoom.menuManagerRoom();
            }
        }
    }
}
