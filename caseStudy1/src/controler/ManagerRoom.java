package controler;

import java.util.Scanner;

public class ManagerRoom {
    ManagerService managerService = new ManagerService();
    Scanner scanner = new Scanner(System.in);
    public void menuLogin() {
        System.out.println("");
        System.out.println("=+=+=+=(!Net room manager!)=+=+=+=+");
        System.out.println("============(!!)================");
        System.out.println("");
        System.out.println("1.Quản Lý Máy");
        System.out.println("2.Quản lý dịch vụ");
        System.out.println("3.Quản lý tài khoản đăng nhập");
        System.out.println("4.Doanh thu");
        System.out.println("Back");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                managerService.menuService();
                break;
            case 3:
                break;
            case 4:
                break;


        }
    }

}
