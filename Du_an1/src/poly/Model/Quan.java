/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Model;

/**
 *
 * @author ASUS
 */
public class Quan {
    private String id;
    private String maQuan;
    private String tenQuan;

    public Quan() {
    }

    public Quan(String id, String maQuan, String tenQuan) {
        this.id = id;
        this.maQuan = maQuan;
        this.tenQuan = tenQuan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaQuan() {
        return maQuan;
    }

    public void setMaQuan(String maQuan) {
        this.maQuan = maQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }
    
}
