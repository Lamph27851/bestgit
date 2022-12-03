/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Services.impl;

import java.util.ArrayList;
import java.util.Date;
import poly.Model.Traintickets;
import poly.Responsitory.TrainticketResponsitory;
import poly.Services.ITrainTicketService;

/**
 *
 * @author ASUS
 */
public class TrainTickServiceImpl implements ITrainTicketService{

    private TrainticketResponsitory trainticketResponsitory= new TrainticketResponsitory();

    @Override
    public ArrayList<Traintickets> timKiem(String diemDi, String diemDen, String ngayDi) {
        return trainticketResponsitory.timKiem(diemDi, diemDen, ngayDi);
    }
    
    
    
}
