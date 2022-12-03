/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Model;

/**
 *
 * @author DELL
 */
public class Tau {
    private String sohieu,tentau,toa;
    private int vitri;
    
    public Tau(String sohieu, String tentau, String toa, int vitri) {
        this.sohieu = sohieu;
        this.tentau = tentau;
        this.toa = toa;
        this.vitri = vitri;
    }

    public Tau() {
    }

    public String getSohieu() {
        return sohieu;
    }

    public void setSohieu(String sohieu) {
        this.sohieu = sohieu;
    }

    public String getTentau() {
        return tentau;
    }

    public void setTentau(String tentau) {
        this.tentau = tentau;
    }

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    public int getVitri() {
        return vitri;
    }

    public void setVitri(int vitri) {
        this.vitri = vitri;
    }
    
    
}
