/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Test_Koneksi;
import java.sql.SQLException;

/**
 *
 * @author rama
 */
public class Utama extends javax.swing.JPanel {

    /**
     * Creates new form Utama
     */
    public Utama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Konek_1 = new javax.swing.JButton();
        Konek_2 = new javax.swing.JButton();

        Konek_1.setText("Konek For.Class");
        Konek_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konek_1ActionPerformed(evt);
            }
        });

        Konek_2.setText("Konek registerDriver");
        Konek_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konek_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Konek_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Konek_2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Konek_1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Konek_2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Konek_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konek_1ActionPerformed
        // TODO add your handling code here:
        try{
        Latihan_01 Konek_1=new Latihan_01();
        
        Latihan_01.db_unidha();
        } catch (ClassNotFoundException | SQLException ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_Konek_1ActionPerformed

    private void Konek_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konek_2ActionPerformed
        // TODO add your handling code here:
       try{
        Latihan_02 Konek_2= new Latihan_02();
       
       Latihan_02.db_unidha();
       } catch (ClassNotFoundException | SQLException ex){
           ex.printStackTrace();
       }
    }//GEN-LAST:event_Konek_2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Konek_1;
    public javax.swing.JButton Konek_2;
    // End of variables declaration//GEN-END:variables
}
