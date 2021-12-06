/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingCenter.StudentUsher;

import Business.AppointmentDetails.AppointmentDetails;
import Business.AppointmentDetails.AppointmentDirectory;
import Business.AppointmentDetails.AppointmentHistory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author swapn
 */
public class StudentUsherDetailsJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private String StudentID;
    private AppointmentHistory ah;
    AppointmentDirectory ad;
    StudentDirectory sd;
    Student student;

    /**
     * Creates new form StudentUsherDetailsJPanel
     */
    public StudentUsherDetailsJPanel(JPanel container, UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil, String PatientID, AppointmentDirectory ad, StudentDirectory sd) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
        this.ah = ah;
        this.ad = ad;
        this.sd = sd;

        System.out.println(PatientID);
        StudentID = PatientID;
        System.out.println(StudentID);

        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            if (this.ecosystem.getStudir().getStudentList().get(student).getStudentID().equalsIgnoreCase(StudentID)) {
                lbl_Details.setText("Details for, " + this.ecosystem.getStudir().getStudentList().get(student).getStudentLastName());
            }
        }

//                +", "+this.ecosystem.getStudir().findStudent(PatientID).getStudentFirstName());
        getAppointmentDetails();
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(0, 0, 0);
        Color color2 = new Color(51, 51, 51);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_Details = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_AppointmentDate = new javax.swing.JLabel();
        lbl_AppointmentDate1 = new javax.swing.JLabel();
        lbl_AppointmentDate2 = new javax.swing.JLabel();
        txt_AppointmentDate = new javax.swing.JTextField();
        txt_AppointmentTime = new javax.swing.JTextField();
        txt_ComplianceStatus = new javax.swing.JTextField();
        btn_CheckIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton1.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(188, 188, 188));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<> with ♡ by Team Coding Pirates ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1200, -1));

        lbl_Details.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lbl_Details.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Details.setText("Details for, ");
        add(lbl_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 59, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lbl_AppointmentDate.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_AppointmentDate.setForeground(new java.awt.Color(204, 204, 204));
        lbl_AppointmentDate.setText("Appointment Date : ");

        lbl_AppointmentDate1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_AppointmentDate1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_AppointmentDate1.setText("Appointment Time : ");

        lbl_AppointmentDate2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_AppointmentDate2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_AppointmentDate2.setText("Compliance Status : ");

        txt_AppointmentDate.setEditable(false);
        txt_AppointmentDate.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N

        txt_AppointmentTime.setEditable(false);
        txt_AppointmentTime.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N

        txt_ComplianceStatus.setEditable(false);
        txt_ComplianceStatus.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N

        btn_CheckIn.setBackground(new java.awt.Color(102, 102, 102));
        btn_CheckIn.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_CheckIn.setText("Check-In");
        btn_CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckInActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Note - If a Patient has tested +ve in past 14 days, ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("do not allow them to test again.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_AppointmentDate2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ComplianceStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_AppointmentDate1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_AppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_AppointmentDate)
                                .addGap(18, 18, 18)
                                .addComponent(txt_AppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btn_CheckIn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AppointmentDate)
                    .addComponent(txt_AppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AppointmentDate1)
                    .addComponent(txt_AppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AppointmentDate2)
                    .addComponent(txt_ComplianceStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn_CheckIn)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 134, -1, -1));

        btn_Back.setBackground(new java.awt.Color(102, 102, 102));
        btn_Back.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp = new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:

        jLabel4.setFont(new Font(jLabel4.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:

        jLabel4.setFont(new Font(jLabel4.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel4MouseExited

    private void btn_CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckInActionPerformed
        // TODO add your handling code here:
        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            if (this.ecosystem.getStudir().getStudentList().get(student).getStudentID().equalsIgnoreCase(StudentID)) {
                ArrayList<AppointmentDetails> AppointmentList = this.ecosystem.getStudir().getStudentList().get(student).getAd().getAppointmentList();
                for (AppointmentDetails ad : AppointmentList) {
                    ad.setAppointmentStatus("Checked-In");
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Student Checked-In for Testing");
    }//GEN-LAST:event_btn_CheckInActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        StudentUsherWorkAreaJPanel su = new StudentUsherWorkAreaJPanel(container, userAccount, ecosystem, dB4OUtil);
        container.add("StudentUsherWorkAreaJPanel", su);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btn_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_CheckIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_AppointmentDate;
    private javax.swing.JLabel lbl_AppointmentDate1;
    private javax.swing.JLabel lbl_AppointmentDate2;
    private javax.swing.JLabel lbl_Details;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextField txt_AppointmentDate;
    private javax.swing.JTextField txt_AppointmentTime;
    private javax.swing.JTextField txt_ComplianceStatus;
    // End of variables declaration//GEN-END:variables

    private void getAppointmentDetails() {

        try {
            for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
                if (this.ecosystem.getStudir().getStudentList().get(student).getStudentID().equalsIgnoreCase(StudentID)) {
                    System.out.println("StudentFound");
                    
//                    ArrayList<AppointmentDetails> AppointmentList = this.ecosystem.getStudir().findStudent(StudentID).getAd().getAppointmentList();
//                    for (AppointmentDetails ad : AppointmentList) {
//                        txt_AppointmentDate.setText(ad.getAppointmentDate());
//                        txt_AppointmentTime.setText(ad.getAppointmentTime());
//                        txt_ComplianceStatus.setText(ad.getComplianceStatus());
//                        break;

                    ArrayList<AppointmentDetails> AppointmentList = this.ecosystem.getStudir().getStudentList().get(student).getAd().getAppointmentList();
                    System.out.println(AppointmentList);

                    for (AppointmentDetails ad : AppointmentList) {
                        System.out.println("Stored Date - " + ad.getAppointmentDate());
                        System.out.println("Stored Time - " + ad.getAppointmentTime());
                        System.out.println("Stored Status - "+ ad.getComplianceStatus());
                        
                        txt_AppointmentDate.setText(ad.getAppointmentDate());
                        txt_AppointmentTime.setText(ad.getAppointmentTime());
                        txt_ComplianceStatus.setText(ad.getComplianceStatus());
                        break;
                    }
                }
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "No Appointment Found for StudentID : " + StudentID);
            container.removeAll();
            StudentUsherWorkAreaJPanel su = new StudentUsherWorkAreaJPanel(container, userAccount, ecosystem, dB4OUtil);
            container.add("StudentUsherWorkAreaJPanel", su);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.next(container);
            dB4OUtil.storeSystem(ecosystem);

        }

    }
}
