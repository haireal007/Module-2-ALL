package controllers;

import hocvienCodeGym.ClassCG;
import hocvienCodeGym.Student;
import ioStudent.InputOutputStream;
import ioStudent.ReaderAndWrite;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<ClassCG> classCGS = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ManagerStudent() {
//        classCGS.add(new ClassCG("C0322G1", new Date("22/2/2022"), "java", 28));
//        classCGS.add(new ClassCG("C0322G2", new Date("1/1/2022"), "PHP", 20));
//        students = ReaderAndWrite.reader(classCGS);
        students = InputOutputStream.reader2(classCGS);
    }

    public void menuStudent() {
        System.out.println("Menu");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Hiển thị học viên");
        System.out.println("3. Hiển thị học viên theo class");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                showAll();
                break;
            case 3:
                findAllByClass();
                break;
        }
    }


    public void addStudent() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhâp tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại:");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String adress = scanner.nextLine();
        System.out.println("Chọn lớp học viên:");
        for (int i = 0; i < classCGS.size(); i++) {
            System.out.println("  " + (i + 1) + ":" + classCGS.get(i).getName() + "-" + classCGS.get(i).getCourse());
       }

        int choice = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name, age, phone, adress, classCGS.get(choice - 1));
        students.add(student);
//        ReaderAndWrite.write(students);
        InputOutputStream.write2(students);
    }

    public void showAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void findAllByClass() {
        System.out.println("Nhập tên lớp muốn hiện thị: ");
        String name = scanner.nextLine();
        for (Student s : students) {
            if (s.getClassCG().getName().equals(name)) {
                System.out.println(s);
            }
        }
    }
}
