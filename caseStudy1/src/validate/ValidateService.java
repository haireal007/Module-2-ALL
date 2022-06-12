package validate;

import model.Account;
import model.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidateService {
    Scanner scanner = new Scanner(System.in);

    public static int getIndexId(int id, ArrayList<Service> services) {
        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int validateID(ArrayList<Service> services) {
        while (true) {
            try {
                System.out.println("Nhập ID:");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexId(id, services) != -1) {
                    throw new Exception();
                }
                return id;
            } catch (Exception e) {
                System.err.println("Nhập sai id rồi");
            }
        }
    }


    public  String validateString(String name) {
        while (true) {
            System.out.println("Nhập " + name);
            String str = scanner.nextLine();
            if (str.equals("")) {
                System.err.println("không để trống");
                continue;
            } else {
                return str;
            }
        }
    }

    public  double validatePriceService() {
        while (true) {
            try {
                System.out.println("Nhập price:");
                double price = Integer.parseInt(scanner.nextLine());
                return price;
            } catch (Exception e) {
                System.err.println("Nhập sai price rồi");
            }
        }
    }
}
