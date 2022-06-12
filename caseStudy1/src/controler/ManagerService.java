package controler;

import io.ReaderAndWriteAcc;
import model.Service;
import validate.ValidateService;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerService {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Service> service = new ReaderAndWriteAcc<>();
    ArrayList<Service> services = service.reader("D:\\Module2\\caseStudy1\\src\\data\\service.csv");
    ValidateService validateService = new ValidateService();

    public void menuService() {
        while (true) {
            System.out.println(" ");
            System.out.println("=======Dịch vụ=======");
            System.out.println("Menu");
            System.out.println("0. Logout");
            System.out.println("1. Thêm dịch vụ");
            System.out.println("2. Sửa dịch vụ");
            System.out.println("3. Xoá dịch vụ ");
            System.out.println("");
            System.out.println("danh sách dịch vụ");
            showAll();
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addService();
                        break;
                    case 2:
                        editStudent();
                        break;
                    case 3:
                        deleteService();
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap lai ");
            }
        }
    }

    public Service creatService() {
        System.out.println("");
        int idService = validateService.validateID(services);
        String nameService = validateService.validateString("name :");
        double priceService = validateService.validatePriceService();

        return new Service(idService, nameService, priceService);
    }

    public void addService() {
        services.add(creatService());
        service.write(services, "D:\\Module2\\caseStudy1\\src\\data\\service.csv");

    }

    public void showAll() {
        for (Service s : services) {
            System.out.println(s);
        }
    }

    public void editStudent() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateService.getIndexId(id, services);
        if (index != -1) {
            services.set(index, creatService());
        } else {
            System.err.println("id không tồn tại");
        }
    }

    public void deleteService() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateService.getIndexId(id, services);
        if (index != -1) {
            services.remove(index);
        } else {
            System.err.println("id không tồn tại");
        }
        service.write(services, "D:\\Module2\\caseStudy1\\src\\data\\service.csv");
    }

}

