/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.Services;

import java.util.ArrayList;
import poly.Model.Quan;

/**
 *
 * @author ASUS
 */
public interface IQuanService {
    
    public ArrayList<Quan> getAll();
    
    public ArrayList<Quan> timKiem(String ten);
    
    public Quan getOne(String ma);
    
    public boolean addQuan(Quan quan);
    
    public boolean updateQuan(String id,Quan quan);
    
    public boolean deleteQuan(String id);
}
