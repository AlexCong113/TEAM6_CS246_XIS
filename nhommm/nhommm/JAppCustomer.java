/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nhommm;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class JAppCustomer extends javax.swing.JFrame {

    List<AppCustomer> list = new ArrayList<AppCustomer>();
    AppCustomer x;
    private static int pos = 0;
    private static int check = 0;
    JPanel panel;

    public JAppCustomer() {
        initComponents();
        this.jPanel2.setBackground(Color.LIGHT_GRAY);
        list.add(new AppCustomer("01", "Ironman", "Mỹ Tho", "0123456789"));
        list.add(new AppCustomer("02", "Hulk", "Mỹ Tho", "0123567909"));
        list.add(new AppCustomer("03", "Trump", "Mỹ Tho", "0123670889"));
        list.add(new AppCustomer("04", "Obama", "Mỹ Tho", "0123770777"));
        list.add(new AppCustomer("05", "Thor", "Mỹ Tho", "0123853534"));
        list.add(new AppCustomer("06", "Lê Văn A", "Đà Nẵng", "0988901239"));
        list.add(new AppCustomer("07", "Lê Văn B", "Đà Nẵng", "0980655123"));
        list.add(new AppCustomer("08", "Lê Văn C", "Đà Nẵng", "0755558123"));
        list.add(new AppCustomer("09", "Nguyễn Thị A", "Đà Nẵng", "0769746123"));
        list.add(new AppCustomer("10", "Nguyễn Thị B", "Đà Nẵng", "0276866123"));

        View();
        ViewTable();
    }

    public void View() {
        x = list.get(pos);
        this.txtid.setText(x.getID());
        this.txtname.setText(x.getName());
        this.txtaddress.setText(x.getAddress());
        this.txtphone.setText(x.getNumberphone());
        ShowOnOff(true, false);
    }

    public void ViewTable() {
        DefaultTableModel model = (DefaultTableModel) this.txttable.getModel();
        model.setNumRows(0);
        int n = 1;
        for (AppCustomer x : list) {
            model.addRow(new Object[]{n++, x.getID(), x.getName(), x.getAddress(), x.getNumberphone()});
        }
        this.txttable.setRowHeight(24);
    }

    public void FOpen() {
        pos = -1;
        list.clear();
        list.add(new AppCustomer("01", "Ironman", "Mỹ Tho", "0123456789"));
        list.add(new AppCustomer("02", "Hulk", "Mỹ Tho", "0123567909"));
        list.add(new AppCustomer("03", "Trump", "Mỹ Tho", "0123670889"));
        list.add(new AppCustomer("04", "Obama", "Mỹ Tho", "0123770777"));
        list.add(new AppCustomer("05", "Thor", "Mỹ Tho", "0123853534"));
        list.add(new AppCustomer("06", "Lê Văn A", "Đà Nẵng", "0988901239"));
        list.add(new AppCustomer("07", "Lê Văn B", "Đà Nẵng", "0980655123"));
        list.add(new AppCustomer("08", "Lê Văn C", "Đà Nẵng", "0755558123"));
        list.add(new AppCustomer("09", "Nguyễn Thị A", "Đà Nẵng", "0769746123"));
        list.add(new AppCustomer("10", "Nguyễn Thị B", "Đà Nẵng", "0276866123"));

        ViewTable();
    }

    public void ShowOnOff(boolean a, boolean b) {
        this.txtsave.show(b);
        this.txthuy.show(b);
        this.txtadd.show(a);
        this.txtedit.show(a);
        this.txtdele.show(a);
        this.txtexit.show(a);
        this.txtquaylai.show(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtadd = new javax.swing.JButton();
        txtedit = new javax.swing.JButton();
        txtdele = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtsave = new javax.swing.JButton();
        txthuy = new javax.swing.JButton();
        txtquaylai = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttim = new javax.swing.JButton();
        txttim1 = new javax.swing.JButton();
        txtsearch1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Quản lí thông tin khách hàng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Ứng dụng quản lí thông tin khách hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Mã khách hàng:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Họ tên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Số điện thoại:");

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtphone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtadd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtadd.setText("Thêm");
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });

        txtedit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtedit.setText("Sửa");
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });

        txtdele.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtdele.setText("Xóa");
        txtdele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeleActionPerformed(evt);
            }
        });

        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtexit.setText("Thoát");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtsave.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtsave.setText("Lưu");
        txtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaveActionPerformed(evt);
            }
        });

        txthuy.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txthuy.setText("Hủy bỏ");
        txthuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthuyActionPerformed(evt);
            }
        });

        txtquaylai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtquaylai.setText("Quay lại");
        txtquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtadd)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtid)
                        .addComponent(txtname)
                        .addComponent(txtaddress)
                        .addComponent(txtphone, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtedit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtdele, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtexit)
                        .addGap(49, 49, 49)
                        .addComponent(txtquaylai)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(txtsave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(txthuy, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadd)
                    .addComponent(txtedit)
                    .addComponent(txtdele)
                    .addComponent(txtexit)
                    .addComponent(txtquaylai))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsave)
                    .addComponent(txthuy))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        txttable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "ID", "Họ tên", "Địa chỉ", "Số điện thoại"
            }
        ));
        txttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttableMouseClicked(evt);
            }
        });
        txttable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txttable);

        txtsearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Tìm kiếm theo tên:");

        txttim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txttim.setText("Tìm kiếm");
        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });

        txttim1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txttim1.setText("Tìm kiếm");
        txttim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttim1ActionPerformed(evt);
            }
        });

        txtsearch1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Tìm kiếm theo ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtsearch))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttim, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttim1)
                    .addComponent(txtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeleActionPerformed

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 20)));
        int n = JOptionPane.showConfirmDialog(panel, "Bạn muốn xóa ?", "Alert", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            list.remove(pos);
            if (pos > list.size() - 1) {
                pos = pos - 1;
            }
            if (pos < 0) {
                pos = 0;
            }
            View();
            ViewTable();
        }
    }//GEN-LAST:event_txtdeleActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        int n = JOptionPane.showConfirmDialog(panel, "Bạn muốn thoát ?", "Message", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_txtexitActionPerformed

    private void txttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttableMouseClicked
        pos = this.txttable.getSelectedRow();
        View();
    }//GEN-LAST:event_txttableMouseClicked

    private void txttableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttableKeyReleased
        pos = this.txttable.getSelectedRow();
        View();
    }//GEN-LAST:event_txttableKeyReleased

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        this.txtid.setText("");
        this.txtname.setText("");
        this.txtaddress.setText("");
        this.txtphone.setText("");
        ShowOnOff(false, true);
        check = 1;
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaveActionPerformed
        String id = this.txtid.getText();
        String name = this.txtname.getText();
        String dc = this.txtaddress.getText();
        String phone = this.txtphone.getText();
        if (check == 1) {
            list.add(new AppCustomer(id, name, dc, phone));
        }
        if (check == -1) {
            list.set(pos, new AppCustomer(id, name, dc, phone));
        }

        View();
        ViewTable();
    }//GEN-LAST:event_txtsaveActionPerformed

    private void txthuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthuyActionPerformed
        View();
    }//GEN-LAST:event_txthuyActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        int n = JOptionPane.showConfirmDialog(panel, "Bạn muốn sửa ?", "Messages", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_NO_OPTION) {
            
            ShowOnOff(false, true);
            check = -1;
        }
    }//GEN-LAST:event_txteditActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimActionPerformed
        ArrayList<AppCustomer> listFind = new ArrayList<>();
        String ten = txtsearch.getText();
        for (int i = 0; i < list.size(); i++) {
            AppCustomer c = list.get(i);
            if (c.getName().equalsIgnoreCase(ten)) {
                listFind.add(c);
            }
        }
        if (listFind.size() > 0) {
            JOptionPane.showMessageDialog(this, "Tìm thấy");
            DefaultTableModel model = (DefaultTableModel) this.txttable.getModel();
            model.setNumRows(0);
            int n = 1;
            for (AppCustomer x : listFind) {
                model.addRow(new Object[]{n++, x.getID(), x.getName(), x.getAddress(), x.getNumberphone()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy");
        }
    }//GEN-LAST:event_txttimActionPerformed

    private void txtquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquaylaiActionPerformed
        FOpen();
    }//GEN-LAST:event_txtquaylaiActionPerformed

    private void txttim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttim1ActionPerformed
        ArrayList<AppCustomer> listFind = new ArrayList<>();
        String id = txtsearch1.getText();
        for (int i = 0; i < list.size(); i++) {
            AppCustomer c = list.get(i);
            if (c.getID().equalsIgnoreCase(id)) {
                listFind.add(c);
            }
        }
        if (listFind.size() > 0) {
            JOptionPane.showMessageDialog(this, "Tìm thấy");
            DefaultTableModel model = (DefaultTableModel) this.txttable.getModel();
            model.setNumRows(0);
            int n = 1;
            for (AppCustomer x : listFind) {
                model.addRow(new Object[]{n++, x.getID(), x.getName(), x.getAddress(), x.getNumberphone()});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy");
        }
    }//GEN-LAST:event_txttim1ActionPerformed

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
            java.util.logging.Logger.getLogger(JAppCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAppCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAppCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAppCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAppCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtadd;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JButton txtdele;
    private javax.swing.JButton txtedit;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txthuy;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JButton txtquaylai;
    private javax.swing.JButton txtsave;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JTable txttable;
    private javax.swing.JButton txttim;
    private javax.swing.JButton txttim1;
    // End of variables declaration//GEN-END:variables
}
