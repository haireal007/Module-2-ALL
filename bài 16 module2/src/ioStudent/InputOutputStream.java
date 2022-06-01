package ioStudent;

import hocvienCodeGym.ClassCG;
import hocvienCodeGym.Student;

import java.io.*;
import java.util.ArrayList;

public class InputOutputStream {

    public static void write2(ArrayList<Student> students) {
        File file = new File("student.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(students);
            objectOutput.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> reader2(ArrayList<ClassCG> classCGS) {
        File file = new File("student.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           return (ArrayList<Student>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("file không tồn tại");
        }

return new  ArrayList<> ();
    }
}
