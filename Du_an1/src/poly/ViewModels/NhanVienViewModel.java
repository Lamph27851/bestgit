/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.ViewModels;

/**
 *
 * @author ASUS
 */
public class NhanVienViewModel {
    private String id;
    private String ma;
    private String ho;
    private String ten;
    private String email;
    private String gioiTinh;
    private String maQuan;
    private String pass;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String id, String ma, String ho, String ten, String email, String gioiTinh, String maQuan, String pass) {
        this.id = id;
        this.ma = ma;
        this.ho = ho;
        this.ten = ten;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.maQuan = maQuan;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaQuan() {
        return maQuan;
    }

    public void setMaQuan(String maQuan) {
        this.maQuan = maQuan;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
