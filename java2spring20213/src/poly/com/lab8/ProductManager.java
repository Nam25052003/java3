/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab8;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author adm1n
 */
public class ProductManager {
    public static void main(String[] args) {
        Product p1 = new Product("abc", 1000.0);
        Product p2= new Product("sam Sung", 3000.0);
        Product p3= new Product("Iphone", 50000.0);
       
        ProductDao dao = new ProductDao();
     
        dao.add(p1);
        dao.add(p2);
        dao.add(p3);
        
   for(Product p: dao.list)
   {
       System.out.println(p.name);
       System.out.println(p.price);
   }
   
   
        dao.luufile("d:\\prod.txt");
        
        ProductDao dao2=new ProductDao();
        
        
        
        
        dao2.mofile("d:\\prod.txt");
             
        
        Product p =dao2.find("abc");
        
       
        System.out.println(">nam" + p.name );
       System.out.println(">Gia" + p.price);

       
       
        // nhanvien
       
        
       System.out.println("Thêm Nhân Viên");
       
        NhanVien nv1 = new NhanVien("nv01","Le anh tu");
         NhanVien nv2 = new NhanVien("nv02","Nguyen Van Tuan");
        NhanVienDao nvdao= new NhanVienDao();
        
        nvdao.add(nv1);
        nvdao.add(nv2);
    
        
        
        for(NhanVien nv : nvdao.list)
        {
       System.out.println(nv.getManv());
       System.out.println(nv.getTennv());
        }    
   nvdao.luufile("d:\\anhtu123.txt");
   nvdao.mofile("d:\\anhtu123.txt");
       
        
    }
 
}
