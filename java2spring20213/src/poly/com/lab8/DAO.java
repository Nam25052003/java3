/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab8;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author adm1n
 */
abstract public class DAO<Entity1>{
    abstract public void update(Entity1 entity);
    abstract public Entity1 find(Serializable id);
    
    protected ArrayList<Entity1> list = new ArrayList<>();
  
    public void add(Entity1 entity)
    {
        list.add(entity);
    }
    
    public void remove(Entity1 entity)
    {
        list.remove(entity);
    }
   
    public ArrayList<Entity1> getList()
    {
        return list;
        
    }
    public void mofile(String path)
    {
     try
     {
         FileInputStream fis = new FileInputStream(path);
         ObjectInputStream osi = new ObjectInputStream(fis);
         list=(ArrayList<Entity1>) osi.readObject();
         osi.close();
         fis.close();
         System.out.println("mo file thanh cong");
     }
     catch(Exception ex)
     {
         ex.printStackTrace();
         System.out.println("Lỗi");
     }
    }
    
    public void luufile(String path)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            System.out.println("lưu thanh cong");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
