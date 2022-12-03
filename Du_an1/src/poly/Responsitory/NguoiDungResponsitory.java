/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Responsitory;

import java.util.ArrayList;
import poly.ViewModels.NguoiDungViewModels;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.Model.NguoiDung;
import poly.Utility.DBConnection;
import poly.Utility.JDBCHelper;

/**
 *
 * @author DELL
 */
public class NguoiDungResponsitory {

    public ArrayList getThongTin() {
        ArrayList<NguoiDungViewModels> ndres = new ArrayList<>();
        String sql = "select id,pass from nguoidung";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String pass = rs.getString(2);
                ndres.add(new NguoiDungViewModels(id, pass));
            }
        } catch (Exception ex) {
            Logger.getLogger(NguoiDungResponsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ndres;
    }

    public NguoiDung getID(String socmnd) {

        String sql = "select id from NguoiDung where SoCMND like '" + socmnd + "'";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setId(rs.getString(1));
                return nd;

            }
        } catch (Exception ex) {
            Logger.getLogger(NguoiDungResponsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public NguoiDung getDuLieu(String id, String pass) {

        String sql = "select id,Ten,GioiTinh,Email,Sdt,SoCMND,Pass from NguoiDung"
                + " where id like '" + id + "' and Pass like '" + pass + "'";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setId(rs.getString(1));
                nd.setTen(rs.getString(2));
                nd.setGioitinh(rs.getInt(3));
                nd.setEmail(rs.getString(4));
                nd.setSdt(rs.getString(5));
                nd.setCmnd(rs.getString(6));
                nd.setPass(rs.getString(7));
                return nd;
            }
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex);
        }
        return null;
    }

    public ArrayList<NguoiDung> getThongTinNguoiDung() {
        ArrayList<NguoiDung> ndres = new ArrayList<>();
        String sql = "select * from nguoidung";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String ho = rs.getString(2);
                String ten = rs.getString(4);
                String email = rs.getString(5);
                String pass = rs.getString(9);
                String cmnd = rs.getString(8);
                int gioitinh = rs.getInt(7);
                String sdt = rs.getString(6);
                ndres.add(new NguoiDung(id, pass, ho, ten, email, sdt, cmnd, gioitinh));
            }
        } catch (Exception ex) {
            Logger.getLogger(NguoiDungResponsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ndres;
    }

    public Integer UpdateNguoiDung(NguoiDung ng) {
        String sql = "update nguoidung set  ten = ?,email =?,sdt =?  where socmnd = ?";
        int row = JDBCHelper.executeUpdate(sql,
                ng.getTen(),
                ng.getEmail(), ng.getSdt(), //ng.getGioitinh(),
                ng.getCmnd()
        );
        return row;
    }
}
