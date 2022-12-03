/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.Services;

import java.util.ArrayList;
import poly.Model.NhanVien;
import poly.ViewModels.NhanVienViewModel;

/**
 *
 * @author ASUS
 */
public interface INhanVienService {
    
    public ArrayList<NhanVienViewModel> getAll();
    
    public boolean themNV(NhanVien nv);
    
    public boolean suaNV(String id,NhanVien nv);
    
    public boolean xoaNV(String id);
    
    
}
