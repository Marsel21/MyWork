/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Hospital.stackImpl.Stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author userr
 */
public class AddPatient extends javax.swing.JFrame {

    /**
     * Creates new form AddPatient
     */
    
    public AddPatient() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel7Exit1 = new javax.swing.JLabel();
        jLabel8Mini = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        memvalidity = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        procType = new javax.swing.JTextField();
        procDate = new javax.swing.JTextField();
        jbtnSubmit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        fileNo = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        memvalidity1 = new javax.swing.JLabel();
        memvalidity2 = new javax.swing.JLabel();
        memvalidity3 = new javax.swing.JLabel();
        echo = new javax.swing.JTextField();
        extra = new javax.swing.JTextField();
        graft = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hospitalName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 290, 60));

        logout.setBackground(new java.awt.Color(102, 102, 102));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 77, -1));

        jLabel7Exit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7Exit1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7Exit1.setText("X");
        jLabel7Exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7Exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7Exit1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 36));

        jLabel8Mini.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8Mini.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8Mini.setText("-");
        jLabel8Mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MiniMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8Mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, 36));

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

        body.setBackground(new java.awt.Color(231, 229, 229));

        name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name.setText("Full Name:");

        age.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        age.setText("Date of Birth:");

        address.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        address.setText("File Number:");

        gender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gender.setText("Gender:");

        emailid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        emailid.setText("Proc Type:");

        contact.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        contact.setText("Contact No:");

        memvalidity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        memvalidity.setText("Grafts:");

        jbtnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSubmit.setText("Save");
        jbtnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(255, 255, 255));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        memvalidity1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        memvalidity1.setText("Date of proc:");

        memvalidity2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        memvalidity2.setText("Echo:");

        memvalidity3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        memvalidity3.setText("Extra:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Add Patient");

        hospitalName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospitalName.setText("HospitalName");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contact)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bodyLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(memvalidity3)
                                            .addComponent(memvalidity)
                                            .addComponent(memvalidity2))
                                        .addGap(55, 55, 55)
                                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(echo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(graft, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(extra, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(bodyLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bodyLayout.createSequentialGroup()
                                                .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(procType, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(bodyLayout.createSequentialGroup()
                                                .addComponent(memvalidity1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(procDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(fileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)))
                        .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(hospitalName)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailid)
                            .addComponent(procType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(procDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memvalidity1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memvalidity2)
                            .addComponent(echo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender)
                            .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact)
                    .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memvalidity)
                    .addComponent(graft, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memvalidity3)
                    .addComponent(extra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnSubmit))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        String name = this.Name.getText();
        String DOB = this.DOB.getText();
        String gender = this.jComboBoxGender.getSelectedItem().toString();
        String contactNo = this.contactNo.getText();
        String fileNo = this.fileNo.getText();
        String procType = this.procType.getText();
        String procDate = this.procDate.getText();
        String extra = this.extra.getText();
        String echo = this.echo.getText();
        String graft = this.graft.getText();

        if ((name.equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter Patient's Name");

        } else if (DOB.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Patient's Date of birth");

        } else if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Patient's Gender");

        } else if (contactNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Patient's Contact Number");

        } else if (fileNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Patient's File Number");

        } else if ((procType.equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter The Patient Procedure Type");

        } else if ((procDate.equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter The Patient Procedure Date");

        } else if ((echo.equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter Echo Results");

        } else if ((graft.equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter Grafts Results");

        } else if ((extra.equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter Extra");

        } else {

            Stack<String> stack = getNameList();
            if (validateName(stack, name)) {

                JOptionPane.showMessageDialog(null, "This Name is already register.");
            } else {

                try {
                    // 12): we are inserting the data in the file here
                    BufferedWriter bfWriter = new BufferedWriter(new FileWriter(DocPanel.hospital+"hospital.txt",true));
                    bfWriter.write(name + ", ");
                    bfWriter.write(DOB + ", ");
                    bfWriter.write(gender + ", ");
                    bfWriter.write(contactNo + ", ");
                    bfWriter.write(fileNo + ", ");
                    bfWriter.write(procType + ", ");
                    bfWriter.write(procDate + ", ");
                    bfWriter.write(echo + ", ");
                    bfWriter.write(graft + ", ");
                    bfWriter.write(extra + ", ");
                    bfWriter.write(DocPanel.hospital);
                    bfWriter.newLine();
                    bfWriter.close();
                    JOptionPane.showMessageDialog(null, "Patient Saved!");

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        Name.setText(null);
        DOB.setText(null);
        contactNo.setText(null);
        jComboBoxGender.setSelectedIndex(0);
        fileNo.setText(null);
        procType.setText(null);
        procDate.setText(null);
        echo.setText(null);
        graft.setText(null);
        extra.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    
    //3) Searching: we are searching the names from the file
    //4) Parsing the data from the fie: we are parsing the data
    public Stack<String> getNameList() {
        Stack<String> stack = new Stack<String>();
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(DocPanel.hospital+"hospital.txt"));
            String str = bfReader.readLine();
            while (str != null) {
                String strr[] = str.split(", ");
                stack.push(strr[0]);
                str=bfReader.readLine();
            }
            bfReader.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return stack;
    }

    public boolean validateName(Stack<String> stack,String name){
        int size=stack.size();
        for(int i=0;i<size;i++){
            if(stack.pop().equals(name)){
                return true;
            }
        }
        return false; 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JButton back1;
    private javax.swing.JPanel body;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contactNo;
    private javax.swing.JTextField echo;
    private javax.swing.JLabel emailid;
    private javax.swing.JTextField extra;
    private javax.swing.JTextField fileNo;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField graft;
    private javax.swing.JLabel hospitalName;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7Exit1;
    private javax.swing.JLabel jLabel8Mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JButton logout;
    private javax.swing.JLabel memvalidity;
    private javax.swing.JLabel memvalidity1;
    private javax.swing.JLabel memvalidity2;
    private javax.swing.JLabel memvalidity3;
    private javax.swing.JLabel name;
    private javax.swing.JTextField procDate;
    private javax.swing.JTextField procType;
    // End of variables declaration//GEN-END:variables
}