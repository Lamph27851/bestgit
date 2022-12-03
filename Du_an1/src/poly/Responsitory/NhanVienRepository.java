/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Responsitory;

import java.util.ArrayList;
import poly.Utility.DBConnection;
import poly.ViewModels.NhanVienViewModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import poly.Model.NhanVien;

/**
 *
 * @author ASUS
 */
public class NhanVienRepository {

    private DBConnection connection;

    public ArrayList<NhanVienViewModel> getAll() {
        ArrayList<NhanVienViewModel> getList = new ArrayList<>();
        String sql = "select NhanVien.id,ma,Ho,NhanVien.Ten,GioiTinh,Email,quan.MaQuan,pass \n"
                + "from NhanVien join Quan \n"
                + "on NhanVien.MaQuan= Quan.Id";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel();
                nv.setId(rs.getString(1));
                nv.setMa(rs.getString(2));
                nv.setHo(rs.getString(3));
                nv.setTen(rs.getString(4));
                nv.setGioiTinh(rs.getString(5));
                nv.setEmail(rs.getString(6));
                nv.setMaQuan(rs.getString(7));
                nv.setPass(rs.getString(8));

                getList.add(nv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return getList;
    }

    public boolean themNV(NhanVien nv) {
        String sql = "insert into NhanVien(Ma,Ho,Ten,GioiTinh,Email,MaQuan,pass) values(?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getHo());
            ps.setObject(3, nv.getTen());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getMaQuan());
            ps.setObject(7, nv.getPass());
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return check > 0;
    }

    public boolean suaNV(String id, NhanVien nv) {
        String sql = "update NhanVien set Ma= ?,Ho=?,Ten=?,GioiTinh=? ,Email=?,MaQuan=?,pass=? where id='" + id + "'";
        int check = 0;
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getHo());
            ps.setObject(3, nv.getTen());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getMaQuan());
            ps.setObject(7, nv.getPass());
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return check > 0;
    }

    public boolean xoaNV(String id) {
        String sql = "delete from nhanvien where id='" + id + "'";
        int check = 0;
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return check > 0;
    }
}
