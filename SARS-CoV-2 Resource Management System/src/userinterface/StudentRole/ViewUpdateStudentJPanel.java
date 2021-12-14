/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.AppointmentDetails.AppointmentDetails;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Role.Role;
import Business.Student.MyStringVerifier;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.Swab.SwabDetails;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.TestingCenter.PatientAssociateRole.PatientAssociateWorkAreaJPanel;
import userinterface.TestingCenter.StudentUsher.StudentUsherWorkAreaJPanel;

/**
 *
 * @author SHRISHTI
 */
public class ViewUpdateStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudentJPanel
     */
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private boolean isEdit;
    private String StudentID1;
    StudentDirectory sd;
    Student student;
    private String soption;

    public ViewUpdateStudentJPanel(JPanel container, UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil, Student student, Boolean isEdit, String StudentID, String option) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.isEdit = isEdit;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.student = student;
        StudentID1 = StudentID;
        soption = option;

        addVerifiers();
        populateStudentDetails();
        modifyTextFields(this.isEdit);
        txtStudentID.setEnabled(false);
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtDoB.setEnabled(false);
        txtContactNumber.setEnabled(false);
        txtEmail.setEnabled(false);
        txtAddress1.setEnabled(false);
        txtAddress2.setEnabled(false);
        txtCity.setEnabled(false);
        txtState.setEnabled(false);
        txtZip.setEnabled(false);

        if (soption == "1") {
            btn_Checkin.setVisible(false);
        } else if (soption == "2") {
            btn_Checkin.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btn_Checkin = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Student Details");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Student ID :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Student First Name :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Student Last Name :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Student Date of Birth :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Student Contact Number :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Student Email ID :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Address Line 1 :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("City :");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText(" Address Line 2 :");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("State :");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Zip Code :");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtStudentID.setEditable(false);
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoBActionPerformed(evt);
            }
        });

        txtState.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        txtCity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtAddress2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress2ActionPerformed(evt);
            }
        });

        txtAddress1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });

        txtZip.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });

        jLabel13.setText("Address Details");

        jLabel14.setText("General Details");

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 0, 204));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 0, 204));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btn_Checkin.setBackground(new java.awt.Color(102, 102, 102));
        btn_Checkin.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_Checkin.setText("Check-In");
        btn_Checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jLabel14))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnSave)
                            .addComponent(btn_Checkin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(423, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoBActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress2ActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

//        StudentID = this.ecosystem.getStudir().findStudentByUserName(this.userAccount.getUsername()).getStudentID();
        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            if (this.ecosystem.getStudir().getStudentList().get(student).getStudentID().equalsIgnoreCase(StudentID1)) {
                if (checkBlankInput()) {
                    this.ecosystem.getStudir().getStudentList().get(student).setStudentFirstName(txtFirstName.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setStudentLastName(txtLastName.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setDob(txtDoB.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setContactNumber(txtContactNumber.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setStudentEmail(txtEmail.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setStreetName(txtAddress1.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setAptNo(txtAddress2.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setCity(txtCity.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setState(txtState.getText());
                    this.ecosystem.getStudir().getStudentList().get(student).setZipcode(txtZip.getText());
                    JOptionPane.showMessageDialog(this, "Student updated!!", "Update",
                            JOptionPane.INFORMATION_MESSAGE);
                    modifyTextFields(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter correct values",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if (soption == "1") {
            container.removeAll();
            StudentWorkAreaJPanel s = new StudentWorkAreaJPanel(container, userAccount, ecosystem, dB4OUtil);
            container.add("StudentWorkAreaJPanel", s);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.next(container);
            dB4OUtil.storeSystem(ecosystem);
        } else if (soption == "2") {
            container.removeAll();
            PatientAssociateWorkAreaJPanel pa = new PatientAssociateWorkAreaJPanel(container, userAccount, ecosystem, dB4OUtil);
            container.add("PatientAssociateWorkAreaJPanel", pa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.next(container);
            dB4OUtil.storeSystem(ecosystem);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btn_CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckinActionPerformed
        // TODO add your handling code here:
        String AppointmentDate = "";

        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            if (this.ecosystem.getStudir().getStudentList().get(student).getStudentID().equalsIgnoreCase(StudentID1)) {
                ArrayList<AppointmentDetails> AppointmentList = this.ecosystem.getStudir().getStudentList().get(student).getAd().getAppointmentList();
                for (AppointmentDetails ad : AppointmentList) {
                    ad.setAppointmentStatus("In Queue for Testing");
                    AppointmentDate = ad.getAppointmentDate();
                }
                SwabDetails swabdetails = this.ecosystem.getStudir().getStudentList().get(student).getSd().newSwab();
                swabdetails.setSwabCollectionDate(AppointmentDate);
            }
        }
        
        JOptionPane.showMessageDialog(this, "Student Checked-In for Testing, Kindly hand them the Testing kit");
        clearfields();

    }//GEN-LAST:event_btn_CheckinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btn_Checkin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void addVerifiers() {
        InputVerifier stringVerifier = new MyStringVerifier();
        txtFirstName.setInputVerifier(stringVerifier);
        txtLastName.setInputVerifier(stringVerifier);
        txtDoB.setInputVerifier(stringVerifier);
        txtContactNumber.setInputVerifier(stringVerifier);
        txtEmail.setInputVerifier(stringVerifier);
        txtAddress1.setInputVerifier(stringVerifier);
        txtAddress2.setInputVerifier(stringVerifier);
        txtCity.setInputVerifier(stringVerifier);
        txtState.setInputVerifier(stringVerifier);
        txtZip.setInputVerifier(stringVerifier);

    }

    private void populateStudentDetails() {

//        StudentID = this.ecosystem.getStudir().findStudentByUserName(this.userAccount.getUsername()).getStudentID();
        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            if (this.ecosystem.getStudir().getStudentList().get(student).getStudentID().equalsIgnoreCase(StudentID1)) {
                txtStudentID.setText(this.ecosystem.getStudir().getStudentList().get(student).getStudentID());
                txtFirstName.setText(this.ecosystem.getStudir().getStudentList().get(student).getStudentFirstName());
                txtLastName.setText(this.ecosystem.getStudir().getStudentList().get(student).getStudentLastName());
                txtDoB.setText(this.ecosystem.getStudir().getStudentList().get(student).getDob());
                txtContactNumber.setText(this.ecosystem.getStudir().getStudentList().get(student).getContactNumber());
                txtEmail.setText(this.ecosystem.getStudir().getStudentList().get(student).getStudentEmail());
                txtAddress1.setText(this.ecosystem.getStudir().getStudentList().get(student).getStreetName());
                txtAddress2.setText(this.ecosystem.getStudir().getStudentList().get(student).getAptNo());
                txtCity.setText(this.ecosystem.getStudir().getStudentList().get(student).getCity());
                txtState.setText(this.ecosystem.getStudir().getStudentList().get(student).getState());
                txtZip.setText(this.ecosystem.getStudir().getStudentList().get(student).getZipcode());
            }
        }

    }

    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            txtFirstName.setEnabled(true);
            txtLastName.setEnabled(true);
            txtDoB.setEnabled(true);
            txtContactNumber.setEnabled(true);
            txtAddress1.setEnabled(true);
            txtAddress2.setEnabled(true);
            txtCity.setEnabled(true);
            txtState.setEnabled(true);
            txtZip.setEnabled(true);
        } else {
            txtFirstName.setEnabled(false);
            txtLastName.setEnabled(false);
            txtDoB.setEnabled(false);
            txtContactNumber.setEnabled(false);
            txtAddress1.setEnabled(false);
            txtAddress2.setEnabled(false);
            txtCity.setEnabled(false);
            txtState.setEnabled(false);
            txtZip.setEnabled(false);
        }
    }

    private boolean checkBlankInput() {
        if (txtFirstName.getText().length() == 0
                || txtLastName.getText().length() == 0
                || txtDoB.getText().length() == 0
                || txtContactNumber.getText().length() == 0
                || txtEmail.getText().length() == 0
                || txtAddress1.getText().length() == 0
                || txtAddress2.getText().length() == 0
                || txtCity.getText().length() == 0
                || txtState.getText().length() == 0
                || txtZip.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    private void clearfields() {
        txtStudentID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtDoB.setText("");
        txtContactNumber.setText("");
        txtEmail.setText("");
        txtAddress1.setText("");
        txtAddress2.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
    }
}
