/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Services;

import java.util.ArrayList;
import poly.Model.Tau;
import poly.Model.Traintickets;
import poly.Responsitory.TrainticketResponsitory;

/**
 *
 * @author DELL
 */
public class TrainticketsService {
    public final TrainticketResponsitory veres;
    public TrainticketsService(){
        this.veres = new TrainticketResponsitory();
    }
    public ArrayList<Traintickets> getTTVe(){
        return veres.getTTVe();
    }
    public ArrayList<Traintickets> getTTVeCuaToi(String socmnd){
        return veres.getTTVeCuaToi(socmnd);
    }
    public Integer UpdateVe(Tau t){
        return veres.UpdateVe(t);
    }

    public Integer InsertVe(Traintickets t){
        return veres.InsertVe(t);
    }
     public Integer XoaLichSuVe(Tau t){
        return veres.XoaLichSuVe(t);
    }

    
}
