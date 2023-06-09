package edu.ramdhoni.aplikasi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer; 
import javax.servlet.ServletOutputStream;
/**
 *
 * @author USER
 */
public class MainView extends javax.swing.JFrame  {
        
    public Statement st;
    public ResultSet rs;
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmodel;
    public String a;

   
  

    private static class main {

    }

    protected void non_aktif() {
        txtnis.setEnabled(false);
        txtnama.setEnabled(false);
        txtusia.setEnabled(false);
        rblaki.setEnabled(false);
        rbperempuan.setEnabled(false);
        txtkelas.setEnabled(false);
        cbjurusan.setEnabled(false);
        cbagama.setEnabled(false);
        cbekskul.setEnabled(false);
        txtusia.setEnabled(false);
        txtalamat.setEnabled(false);
        txtjmlekskul.setEnabled(false);
    }

    protected void aktif() {
        txtnis.setEnabled(true);
        txtnama.setEnabled(true);
        txtusia.setEnabled(true);
        rblaki.setEnabled(true);
        rbperempuan.setEnabled(true);
        txtkelas.setEnabled(true);
        cbjurusan.setEnabled(true);
        cbagama.setEnabled(true);
        cbekskul.setEnabled(true);
        txtusia.setEnabled(true);
        txtalamat.setEnabled(true);
        txtjmlekskul.setEnabled(true);
    }

    protected void kosong() {
        txtnis.setText("");
        txtnama.setText("");
        buttonGroup1.clearSelection();
        txtkelas.setText("");
        cbjurusan.setSelectedItem("---PILIH JURUSAN---");
        cbagama.setSelectedItem("--PILIH AGAMA--");
        cbekskul.setSelectedItem("--PILIH EKSKUL YANG DIPILIH--");
        txtusia.setText("");
        txtalamat.setText("");
        txtjmlekskul.setText("");
    }
        protected void datatabel() {
        Object[] Baris = {"NIS", "NAMA", "JURUSAN"};
        tabmodel = new DefaultTableModel(null, Baris);
        tbdata.setModel(tabmodel);
        String sql;
        sql = "SELECT * FROM tb_pendaftaran";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String nis = hasil.getString("nis");
                String nama_lengkap = hasil.getString("nama_lengkap");
                String jurusan = hasil.getString("jurusan");
                String[] data = {nis, nama_lengkap, jurusan};
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
        }
    
   
    }protected void ekskul(){
    Object[] Baris = {"EKSKUL", "NAMA_PELATIH", "STATUS", "ID_ADMIN"};
        tabmodel = new DefaultTableModel(null, Baris);
        tbekskul.setModel(tabmodel);
        String sql;
        sql = "SELECT * FROM tb_ekskul";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String ekskul = hasil.getString("ekskul");
                String nama_pelatih = hasil.getString("nama_pelatih");
                String status = hasil.getString("status");
                String id_admin = hasil.getString("id_admin");
                String[] data = {ekskul, nama_pelatih, status, id_admin};
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
    
        }
    }


        
    

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
         lbnamadepan.setText(loginsession.USERNAME);
         lb_UID.setText(String.valueOf(loginsession.UID));
        lbhakakses.setText(loginsession.HAK_AKSES);
        txtnis_laporan.setText(String.valueOf(loginsession.NIS));
        txtnis.setText(String.valueOf(loginsession.NIS));
        txtnama_laporan.setText(loginsession.NAMA_DEPAN);
        
    waktu();
   ekskul();
   datatabel();

        
        btdaftar.setEnabled(false);
        txtnis.setEnabled(false);
        txtnama_laporan.setEnabled(false);
    }

        
    
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Bodypanel = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        btnregister = new javax.swing.JButton();
        btnekskul = new javax.swing.JButton();
        btndata = new javax.swing.JButton();
        btnews = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnlapor = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        lbhakakses = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbnamadepan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_UID = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        homepanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        panelgerak = new javax.swing.JPanel();
        textbergerak = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btmore = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        regispanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        rblaki = new javax.swing.JRadioButton();
        rbperempuan = new javax.swing.JRadioButton();
        cbjurusan = new javax.swing.JComboBox<>();
        cbagama = new javax.swing.JComboBox<>();
        txtusia = new javax.swing.JTextField();
        cbekskul = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        btdaftar = new javax.swing.JButton();
        btreset = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtjmlekskul = new javax.swing.JTextField();
        btkonfirmasi = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtkelas = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        lbjam = new javax.swing.JLabel();
        lbtanggal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panellaporan = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtnis_laporan = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtnama_laporan = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtlaporan = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        btkirim = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        datapanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btcetak = new javax.swing.JButton();
        txtcetak = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        editprofil = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtnamadepan = new javax.swing.JTextField();
        txtnamabelakang = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txtnisedit = new javax.swing.JTextField();
        cbhakakses = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtalamatedit = new javax.swing.JTextArea();
        txtuid = new javax.swing.JTextField();
        btedit = new javax.swing.JButton();
        panelekskul = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbekskul = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI PENDAFTARAN EKSKUL SMK ADI SANGGORO");

        Bodypanel.setBackground(new java.awt.Color(26, 188, 156));
        Bodypanel.setToolTipText("");
        Bodypanel.setPreferredSize(new java.awt.Dimension(1024, 862));

        menupanel.setBackground(new java.awt.Color(26, 188, 156));
        menupanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btnregister.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnregister.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-registration-24.png")); // NOI18N
        btnregister.setText("REGISTER");
        btnregister.setActionCommand("HOME");
        btnregister.setIconTextGap(7);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        btnekskul.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnekskul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/icons8-columns-24.png"))); // NOI18N
        btnekskul.setText("EKSKUL");
        btnekskul.setIconTextGap(20);
        btnekskul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekskulActionPerformed(evt);
            }
        });

        btndata.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btndata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/icons8-home-24.png"))); // NOI18N
        btndata.setText("HOME");
        btndata.setIconTextGap(18);
        btndata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndataActionPerformed(evt);
            }
        });

        btnews.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/news3.png"))); // NOI18N
        btnews.setText("NEWS");
        btnews.setIconTextGap(15);
        btnews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewsActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/EKSKUL10.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        btnlapor.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnlapor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/icons8-system-report-26.png"))); // NOI18N
        btnlapor.setText("LAPORKAN");
        btnlapor.setIconTextGap(8);
        btnlapor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnlapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/logout(1).png"))); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.setIconTextGap(12);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        lbhakakses.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbhakakses.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(29, 209, 161));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hai,");

        lbnamadepan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbnamadepan.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Online");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID User :");

        lb_UID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_UID.setForeground(new java.awt.Color(255, 255, 255));
        lb_UID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lb_UIDKeyPressed(evt);
            }
        });

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/online2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(lbnamadepan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_UID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbnamadepan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addComponent(lb_UID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel63.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("version 2.20.299.2 beta (765)");

        jLabel64.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("version 2.20.299.2 beta (765)");

        btnhome.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/icons8-columns-24.png"))); // NOI18N
        btnhome.setText("DATA");
        btnhome.setIconTextGap(20);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menupanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64)
                            .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndata, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnekskul, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnews, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlapor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbhakakses, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                    .addContainerGap(425, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addContainerGap()))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbhakakses, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnekskul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnews, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlapor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jLabel63)
                .addGap(20, 20, 20))
            .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menupanelLayout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(jLabel11)
                    .addContainerGap(436, Short.MAX_VALUE)))
        );

        mainpanel.setBackground(new java.awt.Color(26, 188, 156));
        mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainpanel.setLayout(new java.awt.CardLayout());

        homepanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/aslogo3.png"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/tuvlogo.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("PENDAFTARAN EKSTRAKURIKULER ");

        jLabel33.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("SMK Adi Sanggoro");

        panelgerak.setBackground(new java.awt.Color(52, 152, 219));

        textbergerak.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        textbergerak.setForeground(new java.awt.Color(255, 255, 255));
        textbergerak.setText("Hai, Selamat Datang, di Aplikasi pendaftaran Ekskul SMK ADI SANGGORO..");

        javax.swing.GroupLayout panelgerakLayout = new javax.swing.GroupLayout(panelgerak);
        panelgerak.setLayout(panelgerakLayout);
        panelgerakLayout.setHorizontalGroup(
            panelgerakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgerakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textbergerak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelgerakLayout.setVerticalGroup(
            panelgerakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbergerak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(58, 58, 58))
            .addComponent(panelgerak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel32)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelgerak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("@ramdhoni_christian © | 2020");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/home11.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/LOGO2.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("SEORANG JUARA");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("JADIKAN DIRI ANDA ");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(26, 188, 156));
        jLabel10.setText("HALAMAN ARAHAN");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/katakata2.png"))); // NOI18N

        btmore.setBackground(new java.awt.Color(0, 51, 153));
        btmore.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btmore.setForeground(new java.awt.Color(255, 255, 255));
        btmore.setText("MORE");
        btmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmoreActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 153));
        jButton2.setText("NO, THANKS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(153, 153, 153));
        jLabel51.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(153, 153, 153));
        jLabel51.setText("@ramdhoni_christian © | 2020");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel16))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel51)))
                .addGap(104, 427, Short.MAX_VALUE))
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homepanelLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addGroup(homepanelLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel10))
                            .addGroup(homepanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btmore, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2))
                            .addComponent(jLabel35))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btmore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addContainerGap())
        );

        mainpanel.add(homepanel, "card4");

        regispanel.setBackground(new java.awt.Color(52, 152, 219));
        regispanel.setPreferredSize(new java.awt.Dimension(1035, 665));
        regispanel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-registration-48 (1).png")); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Pendaftaran Diri");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        regispanel.add(jPanel2);
        jPanel2.setBounds(0, 0, 1032, 48);
        regispanel.add(jLabel15);
        jLabel15.setBounds(0, 512, 0, 0);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NIS :");
        regispanel.add(jLabel17);
        jLabel17.setBounds(100, 165, 41, 21);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nama Lengkap :");
        regispanel.add(jLabel18);
        jLabel18.setBounds(100, 200, 109, 21);

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Jenis Kelamin :");
        regispanel.add(jLabel19);
        jLabel19.setBounds(100, 240, 122, 21);

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Kelas :");
        regispanel.add(jLabel20);
        jLabel20.setBounds(100, 320, 48, 21);

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Jurusan :");
        regispanel.add(jLabel21);
        jLabel21.setBounds(100, 280, 64, 21);

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Usia : ");
        regispanel.add(jLabel23);
        jLabel23.setBounds(562, 205, 47, 21);

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Eksktrakurikuler :");
        regispanel.add(jLabel24);
        jLabel24.setBounds(562, 165, 126, 21);

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Alamat :");
        regispanel.add(jLabel25);
        jLabel25.setBounds(562, 244, 60, 14);

        txtnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnisActionPerformed(evt);
            }
        });
        regispanel.add(txtnis);
        txtnis.setBounds(230, 160, 188, 26);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        regispanel.add(txtnama);
        txtnama.setBounds(230, 200, 188, 26);

        buttonGroup1.add(rblaki);
        rblaki.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        rblaki.setForeground(new java.awt.Color(255, 255, 255));
        rblaki.setText("LAKI-LAKI");
        rblaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblakiActionPerformed(evt);
            }
        });
        regispanel.add(rblaki);
        rblaki.setBounds(230, 240, 93, 27);

        buttonGroup1.add(rbperempuan);
        rbperempuan.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        rbperempuan.setForeground(new java.awt.Color(255, 255, 255));
        rbperempuan.setText("PEREMPUAN");
        rbperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbperempuanActionPerformed(evt);
            }
        });
        regispanel.add(rbperempuan);
        rbperempuan.setBounds(350, 240, 101, 27);

        cbjurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH JURUSAN---", "GEOMATIKA", "RPL", "GEOTA", "TATA BUSANA", "TKJ", "MEKATRONIKA" }));
        cbjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjurusanActionPerformed(evt);
            }
        });
        regispanel.add(cbjurusan);
        cbjurusan.setBounds(230, 280, 185, 26);

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH AGAMA--", "ISLAM", "PROTESTAN", "KATHOLIK", "BUDDHA", "HINDU", "KONGHUCU", "LAINNYA" }));
        cbagama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbagamaActionPerformed(evt);
            }
        });
        regispanel.add(cbagama);
        cbagama.setBounds(230, 360, 185, 26);

        txtusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusiaActionPerformed(evt);
            }
        });
        regispanel.add(txtusia);
        txtusia.setBounds(732, 207, 154, 26);

        cbekskul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH EKSKUL YANG DIPILIH--", "PRAMUKA", "PASKIBRA", "FUTSAL", "PADUAN SUARA", "PERISAI DIRI", "KARATE", "REISAS", "PALADIS", "DANCE TRADISIONAL", "PMR", "BAND" }));
        regispanel.add(cbekskul);
        cbekskul.setBounds(732, 167, 198, 26);

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        regispanel.add(jScrollPane1);
        jScrollPane1.setBounds(732, 244, 180, 96);

        btdaftar.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btdaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/daftar5.png"))); // NOI18N
        btdaftar.setText("DAFTAR");
        btdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdaftarActionPerformed(evt);
            }
        });
        regispanel.add(btdaftar);
        btdaftar.setBounds(385, 512, 117, 33);

        btreset.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/reset4.png"))); // NOI18N
        btreset.setText("RESET");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });
        regispanel.add(btreset);
        btreset.setBounds(535, 512, 108, 33);
        regispanel.add(jLabel27);
        jLabel27.setBounds(53, 77, 0, 0);

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Jml ekskul Yang");
        regispanel.add(jLabel28);
        jLabel28.setBounds(562, 359, 109, 16);

        txtjmlekskul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjmlekskulActionPerformed(evt);
            }
        });
        regispanel.add(txtjmlekskul);
        txtjmlekskul.setBounds(730, 360, 154, 26);

        btkonfirmasi.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btkonfirmasi.setForeground(new java.awt.Color(0, 51, 255));
        btkonfirmasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/icons8-tick-box-16.png"))); // NOI18N
        btkonfirmasi.setText("KONFIRMASI");
        btkonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkonfirmasiActionPerformed(evt);
            }
        });
        regispanel.add(btkonfirmasi);
        btkonfirmasi.setBounds(450, 460, 130, 36);

        jLabel36.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Agama :");
        regispanel.add(jLabel36);
        jLabel36.setBounds(100, 360, 56, 21);

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("@ramdhoni_christian © | 2020");
        regispanel.add(jLabel38);
        jLabel38.setBounds(440, 630, 200, 15);
        regispanel.add(txtkelas);
        txtkelas.setBounds(230, 320, 185, 26);

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("sedang diikuti");
        regispanel.add(jLabel29);
        jLabel29.setBounds(562, 381, 93, 16);

        lbjam.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbjam.setForeground(new java.awt.Color(255, 255, 255));
        lbjam.setText("jLabel12");
        regispanel.add(lbjam);
        lbjam.setBounds(796, 77, 100, 20);

        lbtanggal.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbtanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbtanggal.setText("jLabel12");
        regispanel.add(lbtanggal);
        lbtanggal.setBounds(795, 100, 100, 21);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/background2.png"))); // NOI18N
        regispanel.add(jLabel12);
        jLabel12.setBounds(110, 60, 800, 560);

        mainpanel.add(regispanel, "card3");

        panellaporan.setBackground(new java.awt.Color(44, 62, 80));

        jPanel4.setBackground(new java.awt.Color(149, 165, 166));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/laporan2.png"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Lapor Masalah");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addContainerGap(836, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtnis_laporan.setBackground(new java.awt.Color(108, 122, 137));
        txtnis_laporan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnis_laporan.setForeground(new java.awt.Color(228, 241, 254));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Gunakan Halaman ini sebagai bentuk Laporan kesalahan dan kekurangan terhadap data yang ditampilkan maupun pada halaman web");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("*");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("NIS :");

        txtnama_laporan.setBackground(new java.awt.Color(108, 122, 137));
        txtnama_laporan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama_laporan.setForeground(new java.awt.Color(228, 241, 254));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("NAMA :");

        txtlaporan.setBackground(new java.awt.Color(108, 122, 137));
        txtlaporan.setColumns(20);
        txtlaporan.setForeground(new java.awt.Color(228, 241, 254));
        txtlaporan.setRows(5);
        jScrollPane2.setViewportView(txtlaporan);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("LAPORAN :");

        btkirim.setBackground(new java.awt.Color(34, 167, 240));
        btkirim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkirim.setForeground(new java.awt.Color(255, 255, 255));
        btkirim.setText("Kirim");
        btkirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkirimActionPerformed(evt);
            }
        });

        btbatal.setBackground(new java.awt.Color(242, 38, 19));
        btbatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btbatal.setForeground(new java.awt.Color(255, 255, 255));
        btbatal.setText("Batal");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Jelaskan secara rinci dan detail Laporan yang anda berikan karena admin dapat membantu menyelsaikan masalah tersebut dengan jelas, dan");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("gunakan perkataan yang santun.");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("*");

        jLabel50.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("@ramdhoni_christian © | 2020");

        javax.swing.GroupLayout panellaporanLayout = new javax.swing.GroupLayout(panellaporan);
        panellaporan.setLayout(panellaporanLayout);
        panellaporanLayout.setHorizontalGroup(
            panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panellaporanLayout.createSequentialGroup()
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellaporanLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellaporanLayout.createSequentialGroup()
                                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel40))
                                .addGap(58, 58, 58)
                                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnis_laporan)
                                    .addComponent(txtnama_laporan)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)))
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel22)))
                    .addGroup(panellaporanLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btkirim, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellaporanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)
                        .addGap(337, 337, 337)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panellaporanLayout.setVerticalGroup(
            panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellaporanLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnis_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(28, 28, 28)
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addGap(39, 39, 39)
                .addGroup(panellaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btkirim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addContainerGap())
        );

        mainpanel.add(panellaporan, "card5");

        datapanel.setBackground(new java.awt.Color(214, 162, 232));

        jPanel1.setBackground(new java.awt.Color(130, 88, 159));
        jPanel1.setPreferredSize(new java.awt.Dimension(241, 48));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/Untitled-4.png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btcetak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/PRINT.png"))); // NOI18N
        btcetak.setText("PRINT");
        btcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcetakActionPerformed(evt);
            }
        });

        txtcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcetakActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("* Masukan NIS anda untuk mencetak data pendaftaran");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("~ DATA PENDAFTAR EKSTRAKURIKULER ~");

        jLabel49.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("@ramdhoni_christian © | 2020");

        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbdata);

        javax.swing.GroupLayout datapanelLayout = new javax.swing.GroupLayout(datapanel);
        datapanel.setLayout(datapanelLayout);
        datapanelLayout.setHorizontalGroup(
            datapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
            .addGroup(datapanelLayout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addGroup(datapanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btcetak)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(405, 405, 405))
        );
        datapanelLayout.setVerticalGroup(
            datapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datapanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcetak))
                .addGap(83, 83, 83)
                .addComponent(jLabel49)
                .addContainerGap())
        );

        mainpanel.add(datapanel, "card5");

        editprofil.setBackground(new java.awt.Color(244, 244, 231));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel26.setText("Nama Depan :");

        jLabel52.setText("Nama Belakang :");

        jLabel53.setText("Hak Akses :");

        jLabel54.setText("Username :");

        jLabel55.setText("Password :");

        jLabel56.setText("Nis :");

        jLabel57.setText("Alamat :");

        jLabel58.setText("UID");

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbhakakses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "SISWA" }));

        txtalamatedit.setColumns(20);
        txtalamatedit.setRows(5);
        jScrollPane3.setViewportView(txtalamatedit);

        btedit.setText("edit");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnamabelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamadepan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnisedit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addGap(74, 74, 74)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtuid, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbhakakses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(422, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(btedit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtnamadepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtnamabelakang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbhakakses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnisedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel58))
                    .addComponent(txtuid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btedit)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editprofilLayout = new javax.swing.GroupLayout(editprofil);
        editprofil.setLayout(editprofilLayout);
        editprofilLayout.setHorizontalGroup(
            editprofilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editprofilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editprofilLayout.setVerticalGroup(
            editprofilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editprofilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(editprofil, "card6");

        panelekskul.setBackground(new java.awt.Color(255, 204, 204));

        tbekskul.setBackground(new java.awt.Color(247, 220, 190));
        tbekskul.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbekskul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbekskul);

        jPanel8.setBackground(new java.awt.Color(130, 88, 159));
        jPanel8.setPreferredSize(new java.awt.Dimension(241, 48));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ramdhoni/aplikasi/gambar/Untitled-4.png"))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Ekskul");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel62.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Ketersediaan Ekskul pada hari ini :");

        javax.swing.GroupLayout panelekskulLayout = new javax.swing.GroupLayout(panelekskul);
        panelekskul.setLayout(panelekskulLayout);
        panelekskulLayout.setHorizontalGroup(
            panelekskulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
            .addGroup(panelekskulLayout.createSequentialGroup()
                .addGroup(panelekskulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelekskulLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel62))
                    .addGroup(panelekskulLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelekskulLayout.setVerticalGroup(
            panelekskulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelekskulLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        mainpanel.add(panelekskul, "card7");

        javax.swing.GroupLayout BodypanelLayout = new javax.swing.GroupLayout(Bodypanel);
        Bodypanel.setLayout(BodypanelLayout);
        BodypanelLayout.setHorizontalGroup(
            BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        BodypanelLayout.setVerticalGroup(
            BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, 657, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnekskulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekskulActionPerformed
        // TODO add your handling code here:

        //remove panel
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        //add panel
        mainpanel.add(panelekskul);
        mainpanel.repaint();
        mainpanel.revalidate();

    }//GEN-LAST:event_btnekskulActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        //add panel
        mainpanel.add(regispanel);
        mainpanel.repaint();
        mainpanel.revalidate();

    }//GEN-LAST:event_btnregisterActionPerformed

    private void btndataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndataActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        //add panel
        mainpanel.add(homepanel);
        mainpanel.repaint();
        mainpanel.revalidate();

    }//GEN-LAST:event_btndataActionPerformed

    private void btnewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewsActionPerformed
        // TODO add your handling code here:
 berita b =new berita();
         b.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_btnewsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_CANCEL_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk Keluar?", "PERINGATAN", dialogBtn);

        if (dialogResult == 0) {
            //true condition
            new LoginForm().show();
                    this.dispose();

        } else {
            //false condition
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btkirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkirimActionPerformed

        String sql = "insert into tb_laporan values(?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnis_laporan.getText());
            stat.setString(2, txtnama_laporan.getText());
            stat.setString(3, txtlaporan.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil dikirim!, Terima Kasih atas Laporannya ");
            kosong();
            txtnis_laporan.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Laporan Gagal dikirim karena adna telah men-submit sebelumnya! "+e);
        }        // TODO add your handling code here:
    
    }//GEN-LAST:event_btkirimActionPerformed

    private void btnlaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporActionPerformed
        // TODO add your handling code here:
         
       txtnis_laporan.setEnabled(false);
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        //add panel
        mainpanel.add(panellaporan);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnlaporActionPerformed

    private void btmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmoreActionPerformed
        // TODO add your handling code here:
        new berita().setVisible(true);
 this.dispose();
    }//GEN-LAST:event_btmoreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        btmore.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Terima kasih atas partisipasinya");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lb_UIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lb_UIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_UIDKeyPressed

    private void txtcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcetakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcetakActionPerformed

    private void btcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcetakActionPerformed
        // TODO add your handling code here:

        java.sql.Connection conn = null;
        try{
            String jdbcDriver = "com.mysql.jdbc.Driver";
            Class.forName( jdbcDriver);

            String url = "jdbc:mysql://localhost:3306/pw2";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);
            Statement stm = conn.createStatement();

            try{
                String report = ("D:\\SEMUA DATA PROJECT WORK\\PROJECT WORK\\PW (ASLI)\\src\\edu\\ramdhoni\\aplikasi\\laporandatasiswa(ASLI).jrxml") ;

                HashMap hash = new HashMap();

                hash.put("nis", txtcetak.getText());
                JasperReport JRpt = JasperCompileManager.compileReport(report);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, conn);
                JasperViewer.viewReport(JPrint, false);

            }catch (Exception rptexcpt){
                System.out.println("Laporan tidak bisa ditampilkan karena"+ rptexcpt);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_btcetakActionPerformed

    private void btkonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkonfirmasiActionPerformed
        // TODO add your handling code here:
        int angka1, hasil;
        if (txtjmlekskul.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan Jumlah ekskul!!");
        }
        angka1 = Integer.parseInt(txtjmlekskul.getText());
        if (angka1 > 2) {
            JOptionPane.showMessageDialog(null, "Anda terlalu banyak mengikuti Ekskul");
        } else {
            JOptionPane.showMessageDialog(null, "Anda Berhak Mendaftar Ekskul");
            btdaftar.setEnabled(true);
        }
    }//GEN-LAST:event_btkonfirmasiActionPerformed

    private void txtjmlekskulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjmlekskulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjmlekskulActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        kosong();
        txtnis.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btresetActionPerformed

    private void btdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdaftarActionPerformed
        // TODO add your handling code here:
        if(txtnis.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(txtnama.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        
        }else if(cbjurusan.getSelectedItem().equals("---PILIH JURUSAN---")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(txtkelas.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(cbagama.getSelectedItem().equals("--PILIH AGAMA--")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(cbekskul.getSelectedItem().equals("--PILIH EKSKUL YANG DIPILIH--")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(txtusia.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(txtalamat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }else if(txtjmlekskul.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masih ada yang Kosong tuh");
        }
        String resa;
        if(rblaki.isSelected()){
            resa = rblaki.getText();
        } else{
            resa = rblaki.getText();
        }
        String sql = "insert into tb_pendaftaran values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, Integer.valueOf(txtnis.getText().toString()));
            stat.setString(2, txtnama.getText().toString());
            stat.setString(3, resa);
            stat.setString(4, txtkelas.getText());
            stat.setString(5, cbjurusan.getSelectedItem().toString());
            stat.setString(6, cbagama.getSelectedItem().toString());
            stat.setString(7, cbekskul.getSelectedItem().toString());
            stat.setString(8, txtusia.getText());
            stat.setString(9, txtalamat.getText());
            stat.setString(10, txtjmlekskul.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

            txtnis.requestFocus();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal DiUpload "+e);
        }        // TODO add your handling code hereandling code here:
        
    }//GEN-LAST:event_btdaftarActionPerformed

    private void txtusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusiaActionPerformed

    private void cbagamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbagamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbagamaActionPerformed

    private void cbjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjurusanActionPerformed

    private void rbperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbperempuanActionPerformed
        // TODO add your handling code here:
        a = rbperempuan.getText();
    }//GEN-LAST:event_rbperempuanActionPerformed

    private void rblakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblakiActionPerformed
        // TODO add your handling code here:
        a = rblaki.getText();
    }//GEN-LAST:event_rblakiActionPerformed

    private void txtnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnisActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
         String sql = "update tb_daftar_login set nama_depan=?, nama_belakang=?, username=?, password=?, nis=?, hak_akses=?, alamat=? where uid='"+txtuid.getText()+"'";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnamadepan.getText());
            stat.setString(2, txtnamabelakang.getText());
            stat.setString(3, txtusername.getText());
            stat.setString(4, txtpassword.getText());
            stat.setInt(5, Integer.valueOf(txtnis.getText().toString()));
            stat.setString(6, cbhakakses.getSelectedItem().toString());
            stat.setString(7, txtalamatedit.getText());
   

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
          
            txtuid.requestFocus();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate "+e);
        }
    }//GEN-LAST:event_bteditActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
           mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        //add panel
        mainpanel.add(datapanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        // TODO add your handling code here:
        int bar = tbdata.getSelectedRow();
        String a = tabmodel.getValueAt(bar, 0).toString();

        txtcetak.setText(a);

        txtnis.setEnabled(false);
        btdaftar.setEnabled(false);
        btreset.setEnabled(true);
    }//GEN-LAST:event_tbdataMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
     public void waktu(){
        Thread p=new Thread(){
            public void run(){
                for(;;){
                  
                    Calendar cal = new GregorianCalendar();
                    int hari = cal.get(Calendar.DAY_OF_MONTH);
                    int bulan = cal.get(Calendar.MONTH);
                    int tahun = cal.get(Calendar.YEAR);
                    lbtanggal.setText(hari+"/"+(bulan+1)+"/"+tahun);
                    
                    int jam =cal.get(Calendar.HOUR);
                    int menit =cal.get(Calendar.MINUTE);
                    int detik = cal.get(Calendar.SECOND);
                    int AM_PM =cal.get(Calendar.AM_PM);
                    
                    String day_night = "";
                    if(AM_PM == 1)
                    {
                        day_night = " PM";  
                    }
                    else
                    {
                        day_night = " AM";
                    }
                    String waktu = jam + ":" + menit + ":" + detik + "" + day_night;
                    lbjam.setText(waktu);
                    try{
                        sleep(1000);
                        
                    }catch (InterruptedException ex){
                        Logger.getLogger(datasiswa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        p.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bodypanel;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btcetak;
    private javax.swing.JButton btdaftar;
    private javax.swing.JButton btedit;
    private javax.swing.JButton btkirim;
    private javax.swing.JButton btkonfirmasi;
    private javax.swing.JButton btmore;
    private javax.swing.JButton btndata;
    private javax.swing.JButton btnekskul;
    private javax.swing.JButton btnews;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlapor;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btreset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JComboBox<String> cbekskul;
    private javax.swing.JComboBox<String> cbhakakses;
    private javax.swing.JComboBox<String> cbjurusan;
    private javax.swing.JPanel datapanel;
    private javax.swing.JPanel editprofil;
    private javax.swing.JPanel homepanel;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lb_UID;
    private javax.swing.JLabel lbhakakses;
    private javax.swing.JLabel lbjam;
    private javax.swing.JLabel lbnamadepan;
    private javax.swing.JLabel lbtanggal;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel panelekskul;
    private javax.swing.JPanel panelgerak;
    private javax.swing.JPanel panellaporan;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbperempuan;
    private javax.swing.JPanel regispanel;
    private javax.swing.JTable tbdata;
    private javax.swing.JTable tbekskul;
    private javax.swing.JLabel textbergerak;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextArea txtalamatedit;
    private javax.swing.JTextField txtcetak;
    private javax.swing.JTextField txtjmlekskul;
    private javax.swing.JTextField txtkelas;
    private javax.swing.JTextArea txtlaporan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnama_laporan;
    private javax.swing.JTextField txtnamabelakang;
    private javax.swing.JTextField txtnamadepan;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtnis_laporan;
    private javax.swing.JTextField txtnisedit;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuid;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtusia;
    // End of variables declaration//GEN-END:variables

    

   

   
}
