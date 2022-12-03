/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.Services.impl;

import java.util.ArrayList;
import poly.Model.Quan;
import poly.Responsitory.QuanRepository;
import poly.Services.IQuanService;

/**
 *
 * @author ASUS
 */
public class QuanServiceImpl implements IQuanService {

    private QuanRepository quanRepository = new QuanRepository();

    @Override
    public ArrayList<Quan> getAll() {
        return quanRepository.getAll();
    }

    @Override
    public Quan getOne(String ma) {
        return quanRepository.getOne(ma);
    }

    @Override
    public boolean addQuan(Quan quan) {
        return quanRepository.them(quan);
    }

    @Override
    public boolean updateQuan(String id, Quan quan) {
        return quanRepository.sua(id, quan);
    }

    @Override
    public boolean deleteQuan(String id) {
        return quanRepository.xoa(id);
    }

    @Override
    public ArrayList<Quan> timKiem(String ten) {
        return quanRepository.timTheoTen(ten);
    }

}
