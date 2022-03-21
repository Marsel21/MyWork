/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Hospital.stackImpl.Stack;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author userr
 */
public class ViewNote extends javax.swing.JFrame {
      DefaultTableModel model;
    /**
     * Creates new form ViewNote
     */
   
    public ViewNote() {
        initComponents();
        setLocationRelativeTo(null);
        hospitalName.setText(DocPanel.hospital+" Hospital");
        Show_Notes_In_JTable(getNoteStack());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel7Exit1 = new javax.swing.JLabel();
        jLabel8Mini = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        noteTable = new javax.swing.JTable();
        hospitalName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 77, -1));

        jLabel7Exit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7Exit1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7Exit1.setText("X");
        jLabel7Exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7Exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7Exit1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 36));

        jLabel8Mini.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8Mini.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8Mini.setText("-");
        jLabel8Mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MiniMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8Mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, 36));

        back1.setBackground(new java.awt.Color(102, 102, 102));
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setText("<<Back");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel1.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 120));

        jPanel2.setBackground(new java.awt.Color(231, 229, 229));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("View Notes!");

        noteTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        noteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LoginName", "LoginType", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(noteTable);
        if (noteTable.getColumnModel().getColumnCount() > 0) {
            noteTable.getColumnModel().getColumn(0).setResizable(false);
            noteTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            noteTable.getColumnModel().getColumn(1).setResizable(false);
            noteTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            noteTable.getColumnModel().getColumn(2).setResizable(false);
            noteTable.getColumnModel().getColumn(2).setPreferredWidth(430);
        }

        hospitalName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospitalName.setText("HospitalName");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(hospitalName)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 760, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public Stack<String[]> getNoteStack() {
        Stack<String[]> stack = new Stack<String[]>();
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(DocPanel.hospital+"note.txt"));
            
            String str = bfReader.readLine();
            while (str != null) {
                String strr[] = str.split(": ");
                stack.push(strr);
                str = bfReader.readLine();
            }
            bfReader.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return stack;

    }

    //10): hirerachical composite data structure 
    //14): use of array
    
    public void Show_Notes_In_JTable(Stack<String[]> stack) {
        model = (DefaultTableModel) noteTable.getModel();
        Object[] row = new Object[3];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            String ss[] = stack.pop();
            row[0] = ss[0];
            row[1] = ss[1];
            row[2] = ss[2];
            model.addRow(row);
        }
    }
    
    
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
       Menu w=new Menu();
       w.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNote().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JLabel hospitalName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7Exit1;
    private javax.swing.JLabel jLabel8Mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTable noteTable;
    // End of variables declaration//GEN-END:variables
}
