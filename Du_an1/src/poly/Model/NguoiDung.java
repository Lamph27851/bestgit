/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Model;

/**
 *
 * @author DELL
 */
public class NguoiDung {

    private String id;
    private String pass;
    private String ho;
    private String ten;
    private String email;
    private String sdt;
    private String cmnd;
    private int gioitinh;
     

    public NguoiDung(String id) {
        this.id = id;
    }

    
    
    public NguoiDung() {
    }

    public NguoiDung(String id, String pass, String ho, String ten, String email, String sdt, String cmnd, int gioitinh) {
        this.id = id;
        this.pass = pass;
        this.ho = ho;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.gioitinh = gioitinh;
    }

    public NguoiDung(String ten, String email, String sdt, String cmnd, int gioitinh) {

        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.gioitinh = gioitinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

}
