package validate;



import model.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidateComputer {
    Scanner scanner = new Scanner(System.in);

    public static int getIndexId(int id, ArrayList<Computer> computers) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int validateID(ArrayList<Computer> computers) {
        while (true) {
            try {
                System.out.println("Nhập ID:");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexId(id, computers) != -1) {
                    throw new Exception();
                }
                return id;
            } catch (Exception e) {
                System.err.println("Nhập sai id rồi");
            }
        }
    }

    public  double validateMoney() {
        while (true) {
            try {
                System.out.println("Nhập giá net:");
                double price = Double.parseDouble(scanner.nextLine());
                return price;
            } catch (Exception e) {
                System.err.println("Nhập sai money rồi");
            }
        }
    }
}
