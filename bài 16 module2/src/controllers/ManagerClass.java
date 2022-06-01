//package controllers;
//
//import hocvienCodeGym.ClassCG;
//import hocvienCodeGym.Student;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Scanner;
//
//public class ManagerClass {
//    ArrayList<ClassCG> classCGS = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//
//    public void menuClass() {
//        System.out.println("Menu");
//        System.out.println("1. Thêm lớp:");
//        System.out.println("2. Hiển thị lớp");
//        System.out.println("3. Sửa lớp:");
//        System.out.println("4. Xoá lớp:");
//        int choice = Integer.parseInt(scanner.nextLine());
//        switch (choice) {
//            case 1:
//                addClass();
//                break;
//            case 2:
//                showAll();
//                break;
//            case 3:
//                findAllByClass();
//                break;
//        }
//    }
//
//    private void showAll() {
//    }
//
//    public void addClass() {
//        System.out.println("Nhập tên:");
//        String name = scanner.nextLine();
//        System.out.println("Nhâp tên khoá học:");
//        String course = scanner.nextLine();
//        System.out.println("Nhập thời gian khai giảng:");
//        System.out.println("nhập ngày:");
//        int day= Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập tháng:");
//        int month =  Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập năm:");
//        int year= Integer.parseInt(scanner.nextLine());
//
//        ClassCG classCG = new ClassCG(name,new Date(day-1900,month-1,year),course,0);
//        classCG.add(classCG);
//    }
//}
