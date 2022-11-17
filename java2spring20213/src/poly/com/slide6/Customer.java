/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide6;

/**
 *
 * @author adm1n
 */
public class Customer {
  int amount=20000;
public synchronized  void withdraw (int m)
{
    System.out.println("Bạn đang rút tiền..." + m); 
    if (amount<m)
    {
        System.out.println("Bạn Không đủ tiền để rút");
    
    try
    {
        wait();
  
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
  
    }
    else
          amount=amount -m;
        System.out.println("Ban da rut tien thanh cong voi so tien la" + m);
    
    
    
    
}

synchronized void deposit(int m)
{
    System.out.println("Ban dang nap tien...");
    amount=amount+m;
    System.out.println("Nạp tiền thành công !!!");
    notify();

    
}


}
