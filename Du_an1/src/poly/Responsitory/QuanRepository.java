/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Responsitory;

import java.util.ArrayList;
import poly.Model.Quan;
import poly.Utility.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author ASUS
 */
public class QuanRepository {
    private DBConnection connection;
    
    public ArrayList<Quan> getAll(){
        ArrayList<Quan> getList= new ArrayList<>();
        String sql="select Id,MaQuan,Ten from quan";
        try (Connection con= connection.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Quan quan= new Quan();
                quan.setId(rs.getString(1));
                quan.setMaQuan(rs.getString(2));
                quan.setTenQuan(rs.getString(3));
                getList.add(quan);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return getList;
    }
    public ArrayList<Quan> timTheoTen(String ten){
        ArrayList<Quan> getList= new ArrayList<>();
        String sql="select Id,MaQuan,Ten from quan where ten like '%"+ten+"%'";
        try (Connection con= connection.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Quan quan= new Quan();
                quan.setId(rs.getString(1));
                quan.setMaQuan(rs.getString(2));
                quan.setTenQuan(rs.getString(3));
                getList.add(quan);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return getList;
    }
    public Quan getOne(String ma){
        String sql="select Id,MaQuan,Ten from quan where MaQuan like '"+ma+"'";
        try (Connection con= connection.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Quan quan= new Quan();
                quan.setId(rs.getString(1));
                quan.setMaQuan(rs.getString(2));
                quan.setTenQuan(rs.getString(3));
                return quan;
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
     
    public boolean them(Quan quan){
        String sql="insert into Quan(MaQuan,Ten) values (?,?)";
        int check=0;
        try (Connection con= connection.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)){
            ps.setObject(1, quan.getMaQuan());
            ps.setObject(2, quan.getTenQuan());
            check= ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return check>0;
    }
    
    public boolean sua(String id,Quan quan){
        String sql="update Quan set MaQuan = ?, Ten= ? where id like '"+id+"'";
        int check=0;
        try (Connection con= connection.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)){
            ps.setObject(1, quan.getMaQuan());
            ps.setObject(2, quan.getTenQuan());
            check= ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return check>0;
    }
    
    public boolean xoa(String id){
        String sql="delete from Quan where id = '"+id+"'";
        int check=0;
        try (Connection con= connection.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)){
            check= ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return check>0;
    }
}
