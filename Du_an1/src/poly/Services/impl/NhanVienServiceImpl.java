/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Services.impl;

import java.util.ArrayList;
import poly.Model.NhanVien;
import poly.Responsitory.NhanVienRepository;
import poly.Services.INhanVienService;
import poly.ViewModels.NhanVienViewModel;

/**
 *
 * @author ASUS
 */
public class NhanVienServiceImpl implements INhanVienService{
    
    private NhanVienRepository nhanVienRepository= new NhanVienRepository();

    @Override
    public ArrayList<NhanVienViewModel> getAll() {
        return nhanVienRepository.getAll();
    }

    @Override
    public boolean themNV(NhanVien nv) {
        return nhanVienRepository.themNV(nv);
    }

    @Override
    public boolean suaNV(String id, NhanVien nv) {
        return nhanVienRepository.suaNV(id, nv);
    }

    @Override
    public boolean xoaNV(String id) {
        return nhanVienRepository.xoaNV(id);
    }
    
    
}
