package controler;

import java.util.Scanner;

public class ManagerRoom {
    Scanner scanner = new Scanner(System.in);
    ManagerService managerService = new ManagerService();
    ManagerUser managerUser = new ManagerUser();
    ManagerComputer managerComputer = new ManagerComputer();
    ManagerAcc managerAcc = new ManagerAcc();

    public void menuManagerRoom() {
        System.out.println("");
        System.out.println("XIN CHÀO ÔNG CHỦ CỦA TÔI");
        System.out.println("=+=+=+=(!Net room manager!)=+=+=+=+");
        System.out.println("============(!!)================");
        System.out.println("");
        System.out.println("1.Quản Lý Máy");
        System.out.println("2.Quản lý dịch vụ");
        System.out.println("3.Quản lý tài khoản đăng nhập");
        System.out.println("4.Doanh thu");
        System.out.println("5. Exit");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerComputer.menuComputer();
                    break;
                case 2:
                    managerService.menuService();
                    break;
                case 3:
                    managerUser.MenuUser();
                    break;
                case 4:
                    break;
                case 5:
                    managerAcc.login();
                    break;

            }
        } catch (NumberFormatException e) {
            System.err.println("nhập sai lựa chọn - xin nhập lại");
        }

    }

}
