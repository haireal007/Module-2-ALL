package io;

import java.io.*;
import java.util.ArrayList;

public class ReaderAndWriteAcc<E> {
    public void write(ArrayList<E> list, String path) {
        File file = new File(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {

        }

    }

    public ArrayList<E> reader(String path){
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<E>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
//            System.err.println("File chưa tồn tại");
        }
        return new ArrayList<>();
    }
}
