/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.Views;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poly.Model.NguoiDung;
import poly.Model.Tau;
import poly.Model.Traintickets;
import poly.Services.ITrainTicketService;
import poly.Services.NguoiDungServices;
import poly.Services.TrainticketsService;
import poly.Services.impl.TrainTickServiceImpl;
import poly.ViewModels.NguoiDungViewModels;

/**
 *
 * @author DELL
 */
public class Dat_ve extends javax.swing.JFrame {

    private TrainticketsService veser = new TrainticketsService();
    DefaultTableModel dtm = new DefaultTableModel();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private NguoiDungServices ndser = new NguoiDungServices();
    private ITrainTicketService trainTicketService = new TrainTickServiceImpl();

    private Login login;

    public Dat_ve(NguoiDung nguoiDung) {
        initComponents();
        rdonam.setSelected(true);
        setLocationRelativeTo(null);
        lblten.setText(nguoiDung.getTen());
        lblgioitinh.setText(nguoiDung.getGioitinh() == 1 ? "Nam" : "Nữ");
        lblemail.setText(nguoiDung.getEmail());
        lblsdt.setText(nguoiDung.getSdt());
        lblcmnd.setText(nguoiDung.getCmnd());
        txtemail.setText(lblemail.getText());
        txtsdt.setText(lblsdt.getText());
        txtten.setText(lblten.getText());
        loadDatVe();
        loadVeCuaToi();
    }

    public Dat_ve() {
        initComponents();
        rdonam.setSelected(true);
        loadDatVe();

    }

    private NguoiDung getFormNguoiDung() {
        NguoiDung ng = new NguoiDung();
        ng.setTen(txtten.getText());
        ng.setEmail(txtemail.getText());
        ng.setSdt(txtsdt.getText());
//        if(rdonam.isSelected()){
//            ng.setGioitinh(1);
//        }else{
//            ng.setGioitinh(0);
//        }
        return ng;
    }

    private void loadDatVe() {
        ArrayList<Traintickets> ve = veser.getTTVe();
        dtm = (DefaultTableModel) tblDatVe.getModel();
        dtm.setRowCount(0);
        for (Traintickets n : ve) {
            dtm.addRow(new Object[]{
                n.getId(),
                // n.getNgaydi(),
                n.getGiokhoihanh(), n.getGioden(),
                // n.getDiemdi(), n.getDiemden(),
                n.getTau().getTentau(),
                n.getTau().getToa(), n.getTau().getVitri(), n.getGia(), n.getThue()
            });
        }
    }

    private void loadTimKiem(String diemDi, String diemDen, String ngayDi) {
        ArrayList<Traintickets> ve = trainTicketService.timKiem(diemDi, diemDen, ngayDi);
        dtm = (DefaultTableModel) tblDatVe.getModel();
        dtm.setRowCount(0);
        for (Traintickets n : ve) {
            dtm.addRow(new Object[]{
                n.getId(),
                // n.getNgaydi(),
                n.getGiokhoihanh(), n.getGioden(),
                //n.getDiemdi(), n.getDiemden(),
                n.getTau().getTentau(),
                n.getTau().getToa(), n.getTau().getVitri(), n.getGia(), n.getThue()
            });
        }
    }

    private void loadVeCuaToi() {
        String socmnd = lblcmnd.getText();
        ArrayList<Traintickets> ve = veser.getTTVeCuaToi(socmnd);
        dtm = (DefaultTableModel) tblvecuatoi.getModel();
        dtm.setRowCount(0);
        for (Traintickets n : ve) {
            dtm.addRow(new Object[]{
                n.getNguoidung().getTen(),
                n.getNguoidung().getCmnd(),
                n.getId(),
                n.getNgaydi(),
                n.getDiemdi(),
                n.getDiemden(),
                n.getGiokhoihanh(),
                n.getGioden(),
                n.getTau().getTentau(),
                n.getTau().getToa(),
                n.getTau().getVitri()
            });
        }
    }

    private int getSelectedTrangThai() {
        int row = tblDatVe.getSelectedRow();
        int vitri = (int) tblDatVe.getValueAt(row, 8);
        return vitri;
    }

    private Traintickets getInsertVeCuaToi() {
        int row = tblDatVe.getSelectedRow();
        Traintickets t = new Traintickets();
        t.setIduser((String) tblDatVe.getValueAt(row, 0));
        return t;
    }

    private Traintickets getUpdateVe() {
        String socmnd = lblcmnd.getText();
        NguoiDung nd = ndser.getID(socmnd);
        Traintickets t = new Traintickets();
        t.setIduser(nd.getId());
        return t;
    }

    private String getChon() {
        int row = tblDatVe.getSelectedRow();
        String id = tblDatVe.getValueAt(row, 0).toString();
        return id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbDiemDi = new javax.swing.JComboBox<>();
        cbDiemDen = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tbnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatVe = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnchonve = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblvecuatoi = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        lblgioitinh = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblsdt = new javax.swing.JLabel();
        lblcmnd = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tblSanVoucher = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnsuatt = new javax.swing.JButton();
        txtten = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblnoidung = new javax.swing.JLabel();
        lblsotien = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/Views/rsz_pngtree-address-icon-image_2290344.jpg"))); // NOI18N
        jLabel1.setText("Điểm đi");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/Views/rsz_pngtree-address-icon-image_2290344.jpg"))); // NOI18N
        jLabel4.setText("Điểm đến");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, -1));

        cbDiemDi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbDiemDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ha Noi", "Hai Duong", "Hai Phong", "Quang Ninh", "Mong Cai" }));
        jPanel2.add(cbDiemDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 192, 30));

        cbDiemDen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbDiemDen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Hải Dương", "Hải Phòng", "Quảng Ninh", "Móng Cái" }));
        jPanel2.add(cbDiemDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 192, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/Views/rsz_ngay.jpg"))); // NOI18N
        jLabel5.setText("Ngày");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, -1));

        tbnTimKiem.setBackground(new java.awt.Color(255, 204, 204));
        tbnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tbnTimKiem.setForeground(new java.awt.Color(0, 102, 153));
        tbnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        tbnTimKiem.setText("Tìm");
        tbnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(tbnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 110, -1));

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 153));

        tblDatVe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153)));
        tblDatVe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblDatVe.setForeground(new java.awt.Color(51, 51, 51));
        tblDatVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã vé", "Giờ khởi hành", "Giờ đến", "Tên tàu", "Toa", "Vị trí", "Giá", "Thuế"
            }
        ));
        tblDatVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatVeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatVe);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1170, 430));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Rất hân hạnh được phục vụ quý khách!");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fpt.png"))); // NOI18N
        jLabel23.setText("FPT Polytechnic");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 16, -1, -1));

        btnchonve.setBackground(new java.awt.Color(255, 204, 204));
        btnchonve.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnchonve.setForeground(new java.awt.Color(0, 102, 153));
        btnchonve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Accept.png"))); // NOI18N
        btnchonve.setText("Chọn vé");
        btnchonve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchonveActionPerformed(evt);
            }
        });
        jPanel2.add(btnchonve, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 280));

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 280));

        jTabbedPane1.addTab("Main", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblvecuatoi.setBackground(new java.awt.Color(153, 255, 0));
        tblvecuatoi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblvecuatoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblvecuatoi.setForeground(new java.awt.Color(51, 51, 51));
        tblvecuatoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Số CMND", "Mã vé", "Ngày đi", "Điểm đi", "Điểm đến", "Giờ đi", "Giờ đến", "Tàu", "Toa", "Vị trí"
            }
        ));
        jScrollPane2.setViewportView(tblvecuatoi);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 73, 1090, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 51));
        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 543, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fpt.png"))); // NOI18N
        jLabel3.setText("FPT Polytechnic");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 18, -1, -1));

        jLabel26.setBackground(new java.awt.Color(153, 255, 102));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/Views/rsz_bo-suu-tap-hinh-anh-nen-hoa-oai-huong-tuyet-dep-so-4-min.jpg"))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 730));

        jTabbedPane1.addTab("Vé của tôi", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 255));
        jLabel20.setText("Nhân dịp thành lập 60 năm tuyến đường sắt Hà Nội-Móng Cái. Chúng tôi xin tri ân khách hàng 10% vé");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 255));
        jLabel21.setText("khi quý khách đặt vé tại app. Chương trình chỉ áp dụng trong tháng 12. Xin cảm ơn quý khách!");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vit.gif"))); // NOI18N
        jLabel22.setText("FF");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 650, 115, 67));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/Views/anh-nen-may-tinh-dep-nhat-2017.jpg"))); // NOI18N
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -4, 1150, 740));

        jTabbedPane1.addTab("Tri ân khách hàng", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Thông tin cá nhân");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 6, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tên");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 54, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Giới tính");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 98, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 148, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SĐT");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 194, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Số CMND");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 54, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 98, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 148, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 194, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(":");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 250, -1, -1));

        lblten.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblten.setForeground(new java.awt.Color(255, 0, 102));
        lblten.setText("jLabel17");
        jPanel5.add(lblten, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 54, -1, -1));

        lblgioitinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblgioitinh.setForeground(new java.awt.Color(255, 51, 51));
        lblgioitinh.setText("jLabel18");
        jPanel5.add(lblgioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 51, 51));
        lblemail.setText("jLabel19");
        jPanel5.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 148, -1, -1));

        lblsdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsdt.setForeground(new java.awt.Color(255, 51, 51));
        lblsdt.setText("jLabel20");
        jPanel5.add(lblsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 194, -1, -1));

        lblcmnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcmnd.setForeground(new java.awt.Color(255, 51, 51));
        lblcmnd.setText("jLabel21");
        jPanel5.add(lblcmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel17.setText("Hotline: 0386644656");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 702, -1, -1));

        tblSanVoucher.setBackground(new java.awt.Color(51, 255, 255));
        tblSanVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblSanVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Happy.png"))); // NOI18N
        tblSanVoucher.setText("Săn voucher");
        tblSanVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblSanVoucherActionPerformed(evt);
            }
        });
        jPanel5.add(tblSanVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, -1));

        jButton4.setText("Đăng xuất");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 628, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/Views/hinh-anh-chill-dep.jpg"))); // NOI18N
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 1060));

        jTabbedPane1.addTab("Thông tin cá nhân", jPanel5);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(255, 153, 153));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fpt.png"))); // NOI18N
        jLabel27.setText("FPT Polytechnic");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel28.setText("Tên");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel29.setText("Email");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel30.setText("Số điện thoại");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel31.setText("Giới tính");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        btnsuatt.setBackground(new java.awt.Color(204, 204, 255));
        btnsuatt.setForeground(new java.awt.Color(102, 0, 153));
        btnsuatt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnsuatt.setText("Sửa");
        btnsuatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuattActionPerformed(evt);
            }
        });
        jPanel1.add(btnsuatt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));
        jPanel1.add(txtten, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 249, -1));
        jPanel1.add(txtsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 249, -1));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 249, -1));

        buttonGroup1.add(rdonam);
        rdonam.setForeground(new java.awt.Color(0, 102, 255));
        rdonam.setText("Nam");
        jPanel1.add(rdonam, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        buttonGroup1.add(rdonu);
        rdonu.setForeground(new java.awt.Color(0, 0, 255));
        rdonu.setText("Nữ");
        jPanel1.add(rdonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rsz_hinh-nen-3d__hinhnendlcom__.jpg"))); // NOI18N
        jLabel33.setText("jLabel33");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 1180, 730));

        jTabbedPane1.addTab("Sửa thông tin", jPanel1);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setText("Tên ngân hàng :");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 81, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Tên người nhân :");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 51, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fpt.png"))); // NOI18N
        jLabel35.setText("FPT Polytechnic");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 16, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("Số tiền :");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setText("Nội dung chuyển khoản :");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setText("MB Bank");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setText("4296926092003");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        lblnoidung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblnoidung.setText("null");
        jPanel6.add(lblnoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        lblsotien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblsotien.setText("null");
        jPanel6.add(lblsotien, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setText("Số tài khoản :");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setText("Đào Văn Thanh");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Euro.png"))); // NOI18N
        jButton2.setText("Xác nhận đã thanh toán");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 270, -1));

        jTabbedPane1.addTab("Thanh toán", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsuattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuattActionPerformed
        // TODO add your handling code here:
        NguoiDung ng = getFormNguoiDung();
        ng.setCmnd(lblcmnd.getText());
        if (ndser.UpdateNguoiDung(ng) != null) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
            lblten.setText(txtten.getText());
            lblsdt.setText(txtsdt.getText());
            lblemail.setText(txtemail.getText());
            if (rdonam.isSelected()) {
                lblgioitinh.setText("Nam");
            } else {
                lblgioitinh.setText("Nữ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
        txtten.setText(lblten.getText());
        lblsdt.setText(txtsdt.getText());
        lblemail.setText(txtemail.getText());

    }//GEN-LAST:event_btnsuattActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int con = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn đăng xuất không!");
        if (con == JOptionPane.NO_OPTION || con == JOptionPane.CANCEL_OPTION || con == JOptionPane.CLOSED_OPTION) {
            return;
        } else {
            new Login().setVisible(true);
            this.setVisible(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblSanVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSanVoucherActionPerformed
        // TODO add your handling code here:
        //new Voucher().setVisible(true);
        String socmnd = lblcmnd.getText();
        NguoiDung nd = ndser.getID(socmnd);
        System.out.println(nd.getId());
    }//GEN-LAST:event_tblSanVoucherActionPerformed

    private void btnchonveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchonveActionPerformed
        // TODO add your handling code here:
        int row = tblDatVe.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn vé cần đặt");
            return;
        }
        int con = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn chọn vé này chứ?");

        if (con == JOptionPane.NO_OPTION || con == JOptionPane.CANCEL_OPTION || con == JOptionPane.CLOSED_OPTION) {
            return;
        }
        Tau t = new Tau();
        t.setVitri((int) tblDatVe.getValueAt(row, 5));
        t.setToa(tblDatVe.getValueAt(row, 4).toString());
        t.setTentau(tblDatVe.getValueAt(row, 3).toString());
        if (con == JOptionPane.YES_OPTION) {
            if (veser.UpdateVe(t) != null) {
                JOptionPane.showMessageDialog(this, "Quý khách vui lòng qua mục thanh toán để thanh toán!");
                
            }
            
        }

        String socmnd = lblcmnd.getText();
        NguoiDung nd = ndser.getID(socmnd);
        Traintickets c = new Traintickets();
        c.setIduser(nd.getId());
        c.setId(tblDatVe.getValueAt(row, 0).toString());
        if (nd == null) {
            JOptionPane.showMessageDialog(this, "Khong tim thay");
            return;
        } else {
            System.out.println(nd.getId());
            if (veser.InsertVe(c) != null) {

            }

        }
//        Double price = (Double) tblDatVe.getValueAt(row, 9);
//        Double thue = (Double) tblDatVe.getValueAt(row, 10);
//        lblsotien.setText(String.valueOf((price + thue) * 90 / 100));
//        lblnoidung.setText(tblDatVe.getValueAt(row, 0).toString());


    }//GEN-LAST:event_btnchonveActionPerformed

    private void tblDatVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatVeMouseClicked
        // TODO add your handling code here:
        int row = tblDatVe.getSelectedRow();

    }//GEN-LAST:event_tblDatVeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int con = JOptionPane.showConfirmDialog(this, "Bạn xác nhận đã thanh toán hóa đơn rồi chứ?");
        if (con == JOptionPane.NO_OPTION || con == JOptionPane.CANCEL_OPTION || con == JOptionPane.CLOSED_OPTION) {
            return;
        } else {
            loadDatVe();
            loadVeCuaToi();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int row = tblvecuatoi.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xóa");
            return;
        }
        int con = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa vé này không?");
        if (con == JOptionPane.NO_OPTION || con == JOptionPane.CANCEL_OPTION || con == JOptionPane.CLOSED_OPTION) {
            return;
        } else {
            Tau t = new Tau();
            t.setTentau(tblvecuatoi.getValueAt(row, 8).toString());
            t.setToa(tblvecuatoi.getValueAt(row, 9).toString());
            t.setVitri((int) tblvecuatoi.getValueAt(row, 10));
            veser.XoaLichSuVe(t);
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        }
        loadVeCuaToi();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTimKiemActionPerformed
        // TODO add your handling code here:
        String diemDi = cbDiemDi.getSelectedItem().toString();
        String diemDen = cbDiemDen.getSelectedItem().toString();
        Date ngayDi = jDateNgayDi.getDate();
        if(jDateNgayDi.getDate()==null){
            JOptionPane.showMessageDialog(this, "Hãy chọn ngày muốn đi của khách hàng");
            return;
        }
        ArrayList<Traintickets> listTim = trainTicketService.timKiem(diemDi, diemDen, simpleDateFormat.format(ngayDi));
        if (listTim.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy chuyến đi");
        } else {
            loadTimKiem(diemDi, diemDen, simpleDateFormat.format(ngayDi));
        }

    }//GEN-LAST:event_tbnTimKiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dat_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dat_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dat_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dat_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dat_ve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchonve;
    private javax.swing.JButton btnsuatt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbDiemDen;
    private javax.swing.JComboBox<String> cbDiemDi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblcmnd;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgioitinh;
    private javax.swing.JLabel lblnoidung;
    private javax.swing.JLabel lblsdt;
    private javax.swing.JLabel lblsotien;
    private javax.swing.JLabel lblten;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tblDatVe;
    private javax.swing.JButton tblSanVoucher;
    private javax.swing.JTable tblvecuatoi;
    private javax.swing.JButton tbnTimKiem;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
