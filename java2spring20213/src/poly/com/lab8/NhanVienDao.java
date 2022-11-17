/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.lab8;

import java.io.Serializable;

/**
 *
 * @author adm1n
 */
public class NhanVienDao extends DAO<NhanVien>{

    @Override
    public void update(NhanVien entity) {
  
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getManv().equalsIgnoreCase(entity.getManv()))
            {
            list.set(i, entity);
            }
        }
    }
    }

    @Override
    public NhanVien find(Serializable id)
    {
        for(NhanVien nv:list)
    {
     if(nv.getTennv().equals(id))
         { return nv;   
    
         }
    } 
    return null;  
    }

    }
    
    

