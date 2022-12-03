/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Services;

import java.util.ArrayList;
import poly.Model.NguoiDung;
import poly.Responsitory.NguoiDungResponsitory;
import poly.ViewModels.NguoiDungViewModels;

/**
 *
 * @author DELL
 */
public class NguoiDungServices {
    public final NguoiDungResponsitory ndres;
    public NguoiDungServices(){
        ndres = new NguoiDungResponsitory();
    }
    public ArrayList<NguoiDungViewModels> getThongTin(){
        return ndres.getThongTin();
    }
    public NguoiDung getDuLieu(String id,String pass){
        return ndres.getDuLieu(id, pass);
    }
    public ArrayList<NguoiDung> getThongTinNguoiDung(){
        return ndres.getThongTinNguoiDung();
    }
    public Integer UpdateNguoiDung(NguoiDung ng){
        return ndres.UpdateNguoiDung(ng);
    }
    public NguoiDung getID(String socmnd){
        return ndres.getID(socmnd);
    }
}
