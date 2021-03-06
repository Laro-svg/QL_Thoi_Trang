/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LLOST
 */
public class NhaSanXuatFRM extends javax.swing.JPanel {
SanPhamFRM sp;
Color matteGrey = new Color(223,230,233);
Color flatBlue = new Color(14,142,233);
    /**
     * Creates new form NhaSanXuatFRM
     */
    public NhaSanXuatFRM(SanPhamFRM sp) throws Exception {
        initComponents();
        tblScrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        comboBoxMucTimKiem = myComboBox(comboBoxMucTimKiem,flatBlue);
        tblNSX = initHeaderColor(tblNSX,14,142,233); 
        tblNSX.setDefaultEditor(Object.class, null);
        comboBoxQuocGia = myComboBox(comboBoxQuocGia, matteGrey);
        this.sp = sp;
        docDatabase();
        autoGenerateID(txtMaNSX);
    }
    
         public JComboBox myComboBox(JComboBox box, Color color)
    {   
        box.setRenderer(new MyComboBoxRenderer());
        box.setEditor(new MyComboBoxEditor());
        
        box.setUI(new BasicComboBoxUI() 
        {
            @Override
            protected ComboPopup createPopup() 
            {
                Color flatBlue = new Color(14,142,233);
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                basicComboPopup.setBorder(new MatteBorder(4,4,4,4,color));
                return basicComboPopup;
            }
            
            @Override 
            protected JButton createArrowButton() 
            {
                Color matteGrey = new Color(223,230,233);
                Color flatBlue = new Color(14,142,233);
        
                BasicArrowButton custom = new BasicArrowButton(
                BasicArrowButton.SOUTH, null, null, Color.WHITE, null);
                custom.setBorder(new MatteBorder(0,0,0,0,flatBlue));
                return custom;
            }
        }); 

       return box;
    }
         
         public JTable initHeaderColor(JTable List,int r,int b, int g)
    {
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(r, b, g));
        headerRenderer.setForeground(Color.WHITE);
        
            for (int i = 0; i < List.getModel().getColumnCount(); i++) 
            {
                List.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            }
        
         
        return List;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightClickMenu = new javax.swing.JPopupMenu();
        xuatExcelFile = new javax.swing.JMenuItem();
        nhapExcelFile = new javax.swing.JMenuItem();
        pnlMain = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        lblMaNSX = new javax.swing.JLabel();
        lblTenNSX = new javax.swing.JLabel();
        lblQuocGia = new javax.swing.JLabel();
        txtMaNSX = new javax.swing.JTextField();
        txtTenNSX = new javax.swing.JTextField();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHienThiTatCa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        comboBoxMucTimKiem = new javax.swing.JComboBox<>();
        comboBoxQuocGia = new javax.swing.JComboBox<>();
        pnlTable = new javax.swing.JPanel();
        tblScrollPane = new javax.swing.JScrollPane();
        tblNSX = new javax.swing.JTable();

        xuatExcelFile.setText("Export to excel file");
        xuatExcelFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatExcelFileActionPerformed(evt);
            }
        });
        rightClickMenu.add(xuatExcelFile);

        nhapExcelFile.setText("Import Excel File\n");
        nhapExcelFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapExcelFileActionPerformed(evt);
            }
        });
        rightClickMenu.add(nhapExcelFile);

        setPreferredSize(new java.awt.Dimension(679, 562));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setForeground(new java.awt.Color(14, 142, 233));
        pnlMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMainMouseClicked(evt);
            }
        });

        lblTieuDe.setBackground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(14, 142, 233));
        lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDe.setText("NHA?? SA??N XU????T");

        lblMaNSX.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lblMaNSX.setForeground(new java.awt.Color(14, 142, 233));
        lblMaNSX.setText("Ma?? nha?? sa??n xu????t:");

        lblTenNSX.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lblTenNSX.setForeground(new java.awt.Color(14, 142, 233));
        lblTenNSX.setText("T??n nha?? sa??n xu????t:");

        lblQuocGia.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lblQuocGia.setForeground(new java.awt.Color(14, 142, 233));
        lblQuocGia.setText("Qu????c gia");

        txtMaNSX.setBackground(new java.awt.Color(223, 230, 233));
        txtMaNSX.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtMaNSX.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(223, 230, 233)));
        txtMaNSX.setPreferredSize(new java.awt.Dimension(7, 24));

        txtTenNSX.setBackground(new java.awt.Color(223, 230, 233));
        txtTenNSX.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtTenNSX.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(223, 230, 233)));
        txtTenNSX.setPreferredSize(new java.awt.Dimension(7, 24));
        txtTenNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNSXActionPerformed(evt);
            }
        });

        pnlChucNang.setBackground(new java.awt.Color(255, 255, 255));

        btnThem.setBackground(new java.awt.Color(14, 142, 233));
        btnThem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus_icon.png"))); // NOI18N
        btnThem.setText("Th??m");
        btnThem.setBorder(null);
        btnThem.setContentAreaFilled(false);
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.setIconTextGap(15);
        btnThem.setOpaque(true);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(14, 142, 233));
        btnXoa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash_icon.png"))); // NOI18N
        btnXoa.setText("Xo??");
        btnXoa.setBorder(null);
        btnXoa.setContentAreaFilled(false);
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.setEnabled(false);
        btnXoa.setIconTextGap(15);
        btnXoa.setOpaque(true);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(14, 142, 233));
        btnSua.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil_icon.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.setBorder(null);
        btnSua.setContentAreaFilled(false);
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.setEnabled(false);
        btnSua.setIconTextGap(15);
        btnSua.setOpaque(true);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChucNangLayout = new javax.swing.GroupLayout(pnlChucNang);
        pnlChucNang.setLayout(pnlChucNangLayout);
        pnlChucNangLayout.setHorizontalGroup(
            pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChucNangLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlChucNangLayout.setVerticalGroup(
            pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnHienThiTatCa.setBackground(new java.awt.Color(14, 142, 233));
        btnHienThiTatCa.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnHienThiTatCa.setForeground(new java.awt.Color(255, 255, 255));
        btnHienThiTatCa.setText("Hi???n th??? t???t c???");
        btnHienThiTatCa.setBorder(null);
        btnHienThiTatCa.setContentAreaFilled(false);
        btnHienThiTatCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHienThiTatCa.setOpaque(true);
        btnHienThiTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiTatCaActionPerformed(evt);
            }
        });

        txtTimKiem.setBackground(new java.awt.Color(223, 230, 233));
        txtTimKiem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(223, 230, 233)));

        btnTimKiem.setBackground(new java.awt.Color(14, 142, 233));
        btnTimKiem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_icon.png"))); // NOI18N
        btnTimKiem.setBorder(null);
        btnTimKiem.setContentAreaFilled(false);
        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setOpaque(true);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        comboBoxMucTimKiem.setBackground(new java.awt.Color(14, 142, 233));
        comboBoxMucTimKiem.setEditable(true);
        comboBoxMucTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        comboBoxMucTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxMucTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ma?? NSX", "T??n NSX", "Qu????c Gia" }));
        comboBoxMucTimKiem.setToolTipText("null");
        comboBoxMucTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxMucTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMucTimKiemActionPerformed(evt);
            }
        });

        comboBoxQuocGia.setBackground(new java.awt.Color(223, 230, 233));
        comboBoxQuocGia.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        comboBoxQuocGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vi????t Nam", "La??o", "Campuchia" }));
        comboBoxQuocGia.setPreferredSize(new java.awt.Dimension(53, 22));

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTenNSX, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(lblQuocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaNSX)
                    .addComponent(btnHienThiTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenNSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxQuocGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106)
                        .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxMucTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHienThiTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxMucTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pnlTable.setBackground(new java.awt.Color(255, 255, 255));

        tblNSX.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNSX.setSelectionBackground(new java.awt.Color(14, 142, 233));
        tblNSX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblNSXFocusLost(evt);
            }
        });
        tblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNSXMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblNSXMouseReleased(evt);
            }
        });
        tblScrollPane.setViewportView(tblNSX);

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tblScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel model = new DefaultTableModel() ;
    DefaultTableModel modelTimKiem;

    boolean flag = true;

    public Vector createHeader(Object[] columnNames) {
        Vector header = new Vector();
        for (Object colName : columnNames) {
            header.add(colName);
        }

        return header;
    }
    
        public void docDatabase() throws Exception {
        NhaSanXuatBUS bus = new NhaSanXuatBUS();
        if (NhaSanXuatBUS.getDsnsx()== null) {
            bus.docDSNSX();
        }

        String[] columnNames = {"Ma?? nha?? sa??n xu????t", "T??n nha?? sa??n xu????t", "Qu????c gia"};
        Vector header = createHeader(columnNames);

        if (model.getRowCount() == 0) {
            model = new DefaultTableModel(header, 0);
        }

        for (NhaSanXuatDTO nsx : NhaSanXuatBUS.getDsnsx()) {
            Vector row = new Vector();
            row.add(nsx.getMaNSX());
            row.add(nsx.getTenNSX());
            row.add(nsx.getQuocGia());

            model.addRow(row);
        }

        tblNSX.setModel(model);
        tblNSX = initHeaderColor(tblNSX, 14, 142, 233);

    }

    public void resetTxt() throws Exception {
        autoGenerateID(txtMaNSX);
        txtTenNSX.setText("");
        comboBoxQuocGia.setSelectedItem("Vi????t Nam");
    }

    public boolean checkEmptyTxt() {
        if (txtMaNSX.getText().equals("") || txtTenNSX.getText().equals("")) {
            return true;
        }
        return false;
    }
    
    void autoGenerateID(JTextField txt) throws Exception
    {
        NhaSanXuatBUS bus = new NhaSanXuatBUS();
        String ID = bus.taoIdTuDong();
        txt.setText(ID);
    }

    public void hienCacNutChucNang() {
        btnThem.setEnabled(true);
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
    }

    public void anCacNutChucNang() {
        btnThem.setEnabled(false);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (checkEmptyTxt() == true)
        return;
        else {
            NhaSanXuatBUS bus = new NhaSanXuatBUS();

            if (bus.kiemTraTrung(txtMaNSX.getText())) {
                JOptionPane.showMessageDialog(this, "Ma?? nha?? sa??n xu????t ??a?? t????n ta??i. M????i nh????p Ma?? nha?? sa??n xu????t kha??c!");
                return;
            }

            NhaSanXuatDTO nsx = new NhaSanXuatDTO();
            nsx.setMaNSX(txtMaNSX.getText());
            nsx.setTenNSX(txtTenNSX.getText());
            nsx.setQuocGia(comboBoxQuocGia.getSelectedItem().toString());

            try {
                bus.them(nsx);
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }

            String[] columnNames = {"Ma?? nha?? sa??n xu????t", "T??n nha?? sa??n xu????t", "Qu????c gia"};
            Vector header = createHeader(columnNames);

            if (model.getRowCount() == 0) {
                model = new DefaultTableModel(header, 0);
            }

            Vector row = new Vector();
            row.add(nsx.getMaNSX());
            row.add(nsx.getTenNSX());
            row.add(nsx.getQuocGia());

            model.addRow(row);
            tblNSX.setModel(model);
            
            String[] arrayMaNSX = new String[NhaSanXuatBUS.getDsnsx().size()];
            try{
                arrayMaNSX = bus.docComboBoxMaNSX();
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                sp.docComboBoxMaNSX(arrayMaNSX);
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "Th??m tha??nh c??ng!");
            try {
                resetTxt();
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tblNSX.getSelectedRow();
        if (i >= 0) {
            int selection = JOptionPane.showConfirmDialog(this, "Ba??n mu????n xo??a do??ng na??y?", "Th??ng ba??o xa??c nh????n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (selection == JOptionPane.YES_OPTION) {
                NhaSanXuatBUS bus = new NhaSanXuatBUS();
                if (flag == true) {
                    String maNSX = model.getValueAt(i, 0).toString();
                    try {
                        bus.xoa(maNSX);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Ba??n kh??ng th???? xo??a do??ng na??y!");
                        return;
                    }

                    model.removeRow(i);
                    tblNSX.setModel(model);
                }
                else
                {
                    String maNSX = modelTimKiem.getValueAt(i, 0).toString();
                    try {
                        bus.xoa(maNSX);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Ba??n kh??ng th???? xo??a do??ng na??y!");
                        return;
                    }

                    int index = bus.timIndex(maNSX);

                    modelTimKiem.removeRow(i);
                    tblNSX.setModel(modelTimKiem);

                    model.removeRow(index);
                }
                
                String[] arrayMaNSX = new String[NhaSanXuatBUS.getDsnsx().size()];
            try{
                arrayMaNSX = bus.docComboBoxMaNSX();
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                sp.docComboBoxMaNSX(arrayMaNSX);
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }

                btnXoa.setEnabled(false);
                btnSua.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Xo??a tha??nh c??ng!");
                try {
                    resetTxt();
                } catch (Exception ex) {
                    Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int temp = -1;
        int i = tblNSX.getSelectedRow();
        if (i >= 0) {
            NhaSanXuatBUS bus = new NhaSanXuatBUS();
            String maNSXCu;
            if (flag == true) {
                maNSXCu = model.getValueAt(i, 0).toString();
            } else {
                temp = i;
                maNSXCu = modelTimKiem.getValueAt(temp, 0).toString();
                i = bus.timIndex(maNSXCu);
            }

            if (bus.kiemTraTrung(txtMaNSX.getText(), maNSXCu)) {
                JOptionPane.showMessageDialog(this, "Ma?? nha?? sa??n xu????t ??a?? t????n ta??i. M????i nh????p Ma?? nha?? sa??n xu????t kha??c!");
                return;
            } else {

                NhaSanXuatDTO nsx = new NhaSanXuatDTO();
                nsx.setMaNSX(txtMaNSX.getText());
                nsx.setTenNSX(txtTenNSX.getText());
                nsx.setQuocGia(comboBoxQuocGia.getSelectedItem().toString());

                NhaSanXuatDTO old = NhaSanXuatBUS.getDsnsx().get(i);

                try {
                    bus.sua(nsx, old);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Ba??n kh??ng th???? thay ??????i Ma?? nha?? sa??n xu????t na??y!");
                    return;
                }

                model.setValueAt(nsx.getMaNSX(), i, 0);
                model.setValueAt(nsx.getTenNSX(), i, 1);
                model.setValueAt(nsx.getQuocGia(), i, 2);

                if (flag == false) {
                    modelTimKiem.setValueAt(nsx.getMaNSX(), temp, 0);
                    modelTimKiem.setValueAt(nsx.getTenNSX(), temp, 1);
                    modelTimKiem.setValueAt(nsx.getQuocGia(), temp, 2);
                }

                String[] arrayMaNSX = new String[NhaSanXuatBUS.getDsnsx().size()];
            try{
                arrayMaNSX = bus.docComboBoxMaNSX();
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                sp.docComboBoxMaNSX(arrayMaNSX);
            } catch (Exception ex) {
                Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                hienCacNutChucNang();

                JOptionPane.showMessageDialog(this, "S????a tha??nh c??ng!");
                try {
                    resetTxt();
                } catch (Exception ex) {
                    Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHienThiTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiTatCaActionPerformed
        flag = true;
        tblNSX.setModel(model);
        btnThem.setEnabled(true);
        tblNSX = initHeaderColor(tblNSX, 14, 142, 233);
    }//GEN-LAST:event_btnHienThiTatCaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String mucTimKiem = comboBoxMucTimKiem.getSelectedItem().toString();
        String duLieu = txtTimKiem.getText();

        String[] columnNames = {"Ma?? nha?? sa??n xu????t", "T??n nha?? sa??n xu????t", "Qu????c gia"};
        Vector header = createHeader(columnNames);

        if (duLieu.equals("") == false) {
            ArrayList<NhaSanXuatDTO> tempArr = new ArrayList<NhaSanXuatDTO>();
            NhaSanXuatBUS bus = new NhaSanXuatBUS();

            tempArr = bus.timKiem(mucTimKiem, duLieu);

            if (tempArr.size() > 0) {
                modelTimKiem = new DefaultTableModel();

                if (modelTimKiem.getRowCount() == 0) {
                    modelTimKiem = new DefaultTableModel(header, 0);
                }

                for (NhaSanXuatDTO nsx : tempArr) {
                    Vector row = new Vector();
                    row.add(nsx.getMaNSX());
                    row.add(nsx.getTenNSX());
                    row.add(nsx.getQuocGia());

                    modelTimKiem.addRow(row);
                }
                tblNSX.setModel(modelTimKiem);
                tblNSX = initHeaderColor(tblNSX, 14, 142, 233);

                flag = false;
                anCacNutChucNang();

            } else {
                JOptionPane.showMessageDialog(this, "R????t ti????c. D???? li????u kh??ng ????????c ti??m th????y!");
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void comboBoxMucTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMucTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMucTimKiemActionPerformed

    private void pnlMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMainMouseClicked
        try {
            resetTxt();
        } catch (Exception ex) {
            Logger.getLogger(LoaiSPFRM.class.getName()).log(Level.SEVERE, null, ex);
        }

        tblNSX.clearSelection();
    }//GEN-LAST:event_pnlMainMouseClicked

    private void tblNSXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblNSXFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNSXFocusLost

    private void tblNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNSXMouseClicked
        int i = tblNSX.getSelectedRow();
        if (i >= 0) {
            NhaSanXuatBUS bus = new NhaSanXuatBUS();
            NhaSanXuatDTO nsx = new NhaSanXuatDTO();

            if (flag == true) {
                nsx = NhaSanXuatBUS.getDsnsx().get(i);
            } else {
                int index = bus.timIndex(modelTimKiem.getValueAt(i, 0).toString());
                nsx = NhaSanXuatBUS.getDsnsx().get(index);
            }

            txtMaNSX.setText(nsx.getMaNSX());
            txtTenNSX.setText(nsx.getTenNSX());
            comboBoxQuocGia.setSelectedItem(nsx.getQuocGia());

            btnXoa.setEnabled(true);
            btnSua.setEnabled(true);
        }
    }//GEN-LAST:event_tblNSXMouseClicked

    private void txtTenNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNSXActionPerformed

    private void xuatExcelFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatExcelFileActionPerformed
        String[] columnNames = {"Ma?? nha?? sa??n xu????t", "T??n nha?? sa??n xu????t", "Qu????c gia"};
        try {
            XuatExcel xuat = new XuatExcel(tblNSX, columnNames, "Nha?? Sa??n Xu????t");
        } catch (IOException ex) {
            Logger.getLogger(NhaSanXuatFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_xuatExcelFileActionPerformed

    private void tblNSXMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNSXMouseReleased
        if(evt.isPopupTrigger())
        {
            rightClickMenu.show(tblNSX, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblNSXMouseReleased

    private void nhapExcelFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapExcelFileActionPerformed
        // TODO add your handling code here:
        nhapExcel nhap = new nhapExcel(tblNSX);
        DefaultTableModel newModel = nhap.importExcel();
        if(newModel.getRowCount() > 0)
        {
            tblNSX.setModel(newModel);
            tblNSX = initHeaderColor(tblNSX, 14, 142, 233);
        }
    }//GEN-LAST:event_nhapExcelFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThiTatCa;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> comboBoxMucTimKiem;
    private javax.swing.JComboBox<String> comboBoxQuocGia;
    private javax.swing.JLabel lblMaNSX;
    private javax.swing.JLabel lblQuocGia;
    private javax.swing.JLabel lblTenNSX;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JMenuItem nhapExcelFile;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPopupMenu rightClickMenu;
    private javax.swing.JTable tblNSX;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JTextField txtMaNSX;
    private javax.swing.JTextField txtTenNSX;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JMenuItem xuatExcelFile;
    // End of variables declaration//GEN-END:variables




}
