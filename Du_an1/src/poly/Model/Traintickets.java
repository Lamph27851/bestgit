/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Traintickets {

    private String id;
    private Date ngaydi;
    private String giokhoihanh, gioden, diemdi, diemden;
    private Double gia, thue;
    private Tau tau;
    private String iduser;
    private NguoiDung nguoidung;

    public NguoiDung getNguoidung() {
        return nguoidung;
    }

    public void setNguoidung(NguoiDung nguoidung) {
        this.nguoidung = nguoidung;
    }

    public Traintickets(String id, Date ngaydi, String giokhoihanh, String gioden, String diemdi, String diemden, Tau tau, NguoiDung nguoidung) {
        this.id = id;
        this.ngaydi = ngaydi;
        this.giokhoihanh = giokhoihanh;
        this.gioden = gioden;
        this.diemdi = diemdi;
        this.diemden = diemden;
        this.tau = tau;
        this.nguoidung = nguoidung;
    }

   

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public Traintickets() {
    }

    public Traintickets(String id, Date ngaydi, String giokhoihanh, String gioden, String diemdi, String diemden, Double gia, Double thue, Tau tau) {
        this.id = id;
        this.ngaydi = ngaydi;
        this.giokhoihanh = giokhoihanh;
        this.gioden = gioden;
        this.diemdi = diemdi;
        this.diemden = diemden;
        this.gia = gia;
        this.thue = thue;
        this.tau = tau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgaydi() {
        return ngaydi;
    }

    public void setNgaydi(Date ngaydi) {
        this.ngaydi = ngaydi;
    }

    public String getGiokhoihanh() {
        return giokhoihanh;
    }

    public void setGiokhoihanh(String giokhoihanh) {
        this.giokhoihanh = giokhoihanh;
    }

    public String getGioden() {
        return gioden;
    }

    public void setGioden(String gioden) {
        this.gioden = gioden;
    }

    public String getDiemdi() {
        return diemdi;
    }

    public void setDiemdi(String diemdi) {
        this.diemdi = diemdi;
    }

    public String getDiemden() {
        return diemden;
    }

    public void setDiemden(String diemden) {
        this.diemden = diemden;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(Double thue) {
        this.thue = thue;
    }

    public Tau getTau() {
        return tau;
    }

    public void setTau(Tau tau) {
        this.tau = tau;
    }

}
