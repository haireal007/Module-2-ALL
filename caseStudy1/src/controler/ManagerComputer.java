package controler;

import io.ReaderAndWriteAcc;
import model.Computer;
import model.Service;
import validate.ValidateComputer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerComputer {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Computer> readerAndWritecomputer = new ReaderAndWriteAcc<>();
    ValidateComputer validateComputer = new ValidateComputer();
    ArrayList<Computer> computers;

    {
        if (computers == null) {
            computers = readerAndWritecomputer.reader("D:\\Module2\\caseStudy1\\src\\data\\computer.txt");
            computers.add(new Computer(1, "Máy 1", false, null, new Date(), new Date(), null, 0));
            computers.add(new Computer(2, "Máy 2", false, null, new Date(), new Date(), null, 0));
            computers.add(new Computer(3, "Máy 3", false, null, new Date(), new Date(), null, 0));
            computers.add(new Computer(4, "Máy 4", false, null, new Date(), new Date(), null, 0));
            computers.add(new Computer(5, "Máy 5", false, null, new Date(), new Date(), null, 0));
        }
    }

    public void menuComputer() {
        while (true) {
            System.out.println("");
            System.out.println("=+=+=+=(!Computer!)=+=+=+=+");
            System.out.println("============(!!)================");
            System.out.println("0. Logout");
            System.out.println("1. Thêm máy");
            System.out.println("2. Sửa máy ");
            System.out.println("3. Xoá máy ");
            System.out.println("4. Trạng thái của máy ");
            System.out.println("5. Sửa giá net");
            System.out.println("");
            System.out.println("danh sách computer");
            showComputer();
            System.out.println("");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addComputer();
                        break;
                    case 2:
                        editComputer();
                        break;
                    case 3:
                        deleteComputer();
                        break;
                    case 4:
                        satusComputer();
                        break;
                    case 5:
                        editpricenet();
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap lai ");
            }
        }
    }


    public void showComputer() {
        for (Computer c : computers) {
            System.out.println(c);
        }
    }

    public Computer creatComputer() {
        System.out.println("");
        int idComputer = validateComputer.validateID(computers);
        String nameComputer = "Máy" + idComputer;
        double pricenet1h = validateComputer.validateMoney();
        return new Computer(idComputer, nameComputer, false, null, new Date(), new Date(), null, pricenet1h);
    }

    public void addComputer() {
        computers.add(creatComputer());
        readerAndWritecomputer.write(computers, "D:\\Module2\\caseStudy1\\src\\data\\computer.txt");
    }

    public void editComputer() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateComputer.getIndexId(id, computers);
        if (index != -1) {
            computers.set(index, creatComputer());
        } else {
            System.err.println("id không tồn tại");
        }
    }

    public void deleteComputer() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateComputer.getIndexId(id, computers);
        if (index != -1) {
            computers.remove(index);
        } else {
            System.err.println("id không tồn tại");
        }
        readerAndWritecomputer.write(computers, "D:\\Module2\\caseStudy1\\src\\data\\computer.txt");
    }

    public void satusComputer() {
        System.out.println("Nhập id máy cần bật tắt");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateComputer.getIndexId(id, computers);
        if (index != -1) {
            if (computers.get(index).isStatus() == false) {
                System.out.println("Máy đang tắt");
                System.out.println("Nhấn yes để bật máy");
                System.out.println("No để huỷ");
                String OK = scanner.nextLine();
                if (OK.equals("yes")) {
                    computers.get(index).setStatus(true);
                }
                if (OK.equals("no")) {
                    menuComputer();
                }

            } else {
                System.out.println("Máy đang bật");
                System.out.println("Nhấn yes để tắt máy");
                System.out.println("No để huỷ");
                String OK = scanner.nextLine();
                if (OK.equals("yes")) {
                    computers.get(index).setStatus(false);
                }
                if (OK.equals("no")) {
                    menuComputer();
                }
            }
        } else {
            System.err.println("id không tồn tại");
        }
        readerAndWritecomputer.write(computers, "D:\\Module2\\caseStudy1\\src\\data\\computer.txt");
    }

    public void editpricenet() {
        double pricenet1h = validateComputer.validateMoney();
        for (Computer cc : computers) {
            cc.setPriceNet1h(pricenet1h);
        }
        readerAndWritecomputer.write(computers, "D:\\Module2\\caseStudy1\\src\\data\\computer.txt");
    }
}