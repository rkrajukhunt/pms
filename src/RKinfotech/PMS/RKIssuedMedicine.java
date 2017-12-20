/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RKinfotech.PMS;

import RKinfotech.Class.rkDatabase;
import RKinfotech.Class.rkValidation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rk
 */
public class RKIssuedMedicine extends javax.swing.JInternalFrame {

    /**
     * Creates new form RKIssuedMedicine
     */
    public RKIssuedMedicine() {
        initComponents();
        rkMedicineName = db.DML("SELECT `ID`,`rkStockName` FROM `rkstock`");
        rkMedicineName.entrySet().forEach((e) -> {
            rkNameMedicine.addItem((String) e.getKey());
        });
        db.rkAutoCompleted(new JComboBox[]{rkNameMedicine});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        rkNameMedicine = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rkBatchNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rkExpDate = new javax.swing.JTextField();
        rkAvailableMedicine = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rkIssuedMedicine = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rkPresentMedicine = new javax.swing.JTextField();
        rkSave = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("ISSUED MEDICINE");

        jLabel4.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jLabel4.setText("Name");

        rkNameMedicine.setEditable(true);
        rkNameMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selected Medicine" }));
        rkNameMedicine.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkNameMedicineItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jLabel5.setText("Batch No");

        rkBatchNo.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jLabel6.setText("Exp.Date");

        rkExpDate.setEnabled(false);

        rkAvailableMedicine.setText("00");
        rkAvailableMedicine.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jLabel7.setText("Available Medicine");

        jLabel8.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jLabel8.setText("Issued Medicine");

        rkIssuedMedicine.setText("00");
        rkIssuedMedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rkIssuedMedicineKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rkIssuedMedicineKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 14)); // NOI18N
        jLabel9.setText("Present Medicine");

        rkPresentMedicine.setText("00");
        rkPresentMedicine.setEnabled(false);

        rkSave.setText("Save");
        rkSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rkSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rkAvailableMedicine))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rkExpDate)
                            .addComponent(rkNameMedicine, javax.swing.GroupLayout.Alignment.TRAILING, 0, 186, Short.MAX_VALUE)
                            .addComponent(rkBatchNo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(rkIssuedMedicine))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rkPresentMedicine)
                            .addComponent(rkSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rkNameMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rkBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rkExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rkAvailableMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rkIssuedMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rkPresentMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rkNameMedicineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rkNameMedicineItemStateChanged
        try {
            String itemID = (String) rkMedicineName.get(rkNameMedicine.getSelectedItem());
            ResultSet rs = db.rkSelect_rs("SELECT * FROM `rkstock` where `ID` = " + itemID);
            if (rs.next()) {
                rkBatchNo.setText(rs.getString(4));
                rkExpDate.setText(rs.getString(6));
                rkAvailableMedicine.setText(rs.getString(8));
                rkPresentMedicine.setText(rs.getString(8));

                rkSave.setEnabled(true);
                rkBatchNo.setEnabled(true);
                rkExpDate.setEnabled(true);
                rkIssuedMedicine.setEnabled(true);
                rkSave.setEnabled(true);
            } else {
                rkBatchNo.setEnabled(false);
                rkExpDate.setEnabled(false);
                rkIssuedMedicine.setEnabled(false);
                rkSave.setEnabled(false);

                rkBatchNo.setText("00");
                rkIssuedMedicine.setText("00");
                rkExpDate.setText("00");
                rkAvailableMedicine.setText("00");
                rkPresentMedicine.setText("00");
            }
        } catch (SQLException e) {
               JOptionPane.showMessageDialog(this,val.printError(e.getClass(),e.getMessage(),getClass().getName()),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rkNameMedicineItemStateChanged

    private void rkIssuedMedicineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rkIssuedMedicineKeyPressed
        val.rkIsDigit(evt);
    }//GEN-LAST:event_rkIssuedMedicineKeyPressed

    private void rkIssuedMedicineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rkIssuedMedicineKeyReleased
        try {
            if (!rkIssuedMedicine.getText().isEmpty()) {
                rkPresentMedicine.setText((Integer.parseInt(rkAvailableMedicine.getText())) - Integer.parseInt(rkIssuedMedicine.getText()) + "");
            } else {
                rkPresentMedicine.setText(rkAvailableMedicine.getText());
                rkIssuedMedicine.setText("0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,val.printError(e.getClass(),e.getMessage(),getClass().getName()),"Error",JOptionPane.ERROR_MESSAGE);
            rkIssuedMedicine.setText("0");
        }
    }//GEN-LAST:event_rkIssuedMedicineKeyReleased

    private void rkSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rkSaveActionPerformed
        if(Integer.valueOf(rkPresentMedicine.getText())>0){
            if("00".equals(rkIssuedMedicine.getText())){
                
            }else{
                int count = db.DML("UPDATE `rkstock` SET `rkStockQuntities`= ? WHERE `ID` = "+rkMedicineName.get(rkNameMedicine.getSelectedItem()),new JTextField[]{rkPresentMedicine});
                if(count>0)
                    JOptionPane.showMessageDialog(this,"Medicine Issue Successfullyy..","Medicine Issue",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        }else{
            JOptionPane.showMessageDialog(this,val.printError("Drug Can't Available"),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rkSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rkAvailableMedicine;
    private javax.swing.JTextField rkBatchNo;
    private javax.swing.JTextField rkExpDate;
    private javax.swing.JTextField rkIssuedMedicine;
    private javax.swing.JComboBox<String> rkNameMedicine;
    private javax.swing.JTextField rkPresentMedicine;
    private javax.swing.JButton rkSave;
    // End of variables declaration//GEN-END:variables
    rkDatabase db = new rkDatabase();
    rkValidation val = new rkValidation();
    Map<Object, Object> rkMedicineName = new HashMap<>();

    /*JTextField rkMedicineName = new JTextField();
    JTextField rkMedicineID = new JTextField();
    JTextField rktxtDate = new JTextField();
    JTextField rktxtExpDate = new JTextField();
    JTextField rktxtBillNo = new JTextField();*/
}
