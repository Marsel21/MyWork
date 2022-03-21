/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author userr
 */
public class LeaveNote extends javax.swing.JFrame {

    /**
     * Creates new form LeaveNote
     */
    
    public LeaveNote() {
        initComponents();
        hospitalName.setText(DocPanel.hospital+" Hospital");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel7Exit1 = new javax.swing.JLabel();
        jLabel8Mini = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbtnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hospitalName = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Current Patients");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 290, 60));

        logout.setBackground(new java.awt.Color(102, 102, 102));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 77, -1));

        jLabel7Exit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7Exit1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7Exit1.setText("X");
        jLabel7Exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7Exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7Exit1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, 36));

        jLabel8Mini.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8Mini.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8Mini.setText("-");
        jLabel8Mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MiniMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8Mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 20, 36));

        back1.setBackground(new java.awt.Color(102, 102, 102));
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setText("<<Back");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel1.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(231, 229, 229));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jbtnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSubmit.setText("Save");
        jbtnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Leave Note!");

        hospitalName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospitalName.setText("HospitalName");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(hospitalName)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSubmit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        //creating object of login form and set visible
        login w = new login();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jLabel7Exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7Exit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7Exit1MouseClicked

    private void jLabel8MiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MiniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MiniMouseClicked

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        Menu w = new Menu();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        String note = this.jTextArea1.getText();
        if ((note.equals(""))) {
            JOptionPane.showMessageDialog(null, "Please Enter Note");

        }

        try {
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(DocPanel.hospital+"note.txt", true));
            bfWriter.write(login.LoginPersonName + ": ");
            bfWriter.write(login.LoginPersonType + ": ");
            bfWriter.write(note);
            bfWriter.newLine();
            bfWriter.close();
            JOptionPane.showMessageDialog(null, "Inserted!");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jbtnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JLabel hospitalName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7Exit1;
    private javax.swing.JLabel jLabel8Mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}