/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PHAN2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author NAM PC
 */
public class XFile {
    public static Object readObj(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (
            FileInputStream fis = new FileInputStream(path);  
            ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            return ois.readObject();
        }
    }

    public static void writeObj(String path, Object data) throws IOException {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));) 
        {
            oos.writeObject(data);
        }
    }
}
