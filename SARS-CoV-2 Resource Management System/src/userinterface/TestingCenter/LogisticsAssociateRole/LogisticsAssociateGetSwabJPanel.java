/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingCenter.LogisticsAssociateRole;

import Business.AppointmentDetails.AppointmentDetails;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author swapn
 */
public class LogisticsAssociateGetSwabJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private Integer Time;

    /**
     * Creates new form LogisticsAssociateWorkAreaJPanel
     */
    public LogisticsAssociateGetSwabJPanel(JPanel container, UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        initComponents();
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
//        lblWelcome.setText("Welcome, "+this.ecosystem.getDeliveryManDirectory().findDeliveryManByUserName(this.userAccount.getUsername()).getFirstName());
        Date CurrentTime = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("H");
        System.out.println(ft.format(CurrentTime));
        Time = Integer.parseInt(ft.format(CurrentTime));
        if (Time < 12) {
            lbl_Greetings.setText("Good Morning! ");
        } else if (Time >= 18) {
            lbl_Greetings.setText("Good Evening! ");
        } else {
            lbl_Greetings.setText("Good Afternoon! ");
        }
        populateTable();
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

        lbl_Greetings = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SwabToBeCollected = new javax.swing.JTable();
        btn_MarkAllCollected = new javax.swing.JButton();
        btn_MarkSelectedAsCollected = new javax.swing.JButton();
        btn_MarkSelectedAsNotCollected = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Greetings.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lbl_Greetings.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Greetings.setText("Greetings!");
        add(lbl_Greetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 68, 450, -1));

        lblWelcome.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(204, 204, 204));
        lblWelcome.setText("Welcome <UserName>");
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 11, -1, -1));

        logoutButton1.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 11, -1, -1));

        tbl_SwabToBeCollected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Appointment Date", "Student Name", "Appointment Time", "Appointment Status", "Swab-ID"
            }
        ));
        jScrollPane1.setViewportView(tbl_SwabToBeCollected);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 144, 1060, -1));

        btn_MarkAllCollected.setBackground(new java.awt.Color(102, 102, 102));
        btn_MarkAllCollected.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_MarkAllCollected.setText("Mark All as Collected");
        btn_MarkAllCollected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MarkAllCollectedActionPerformed(evt);
            }
        });
        add(btn_MarkAllCollected, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 589, -1, -1));

        btn_MarkSelectedAsCollected.setBackground(new java.awt.Color(102, 102, 102));
        btn_MarkSelectedAsCollected.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_MarkSelectedAsCollected.setText("Mark Selected As Collected");
        btn_MarkSelectedAsCollected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MarkSelectedAsCollectedActionPerformed(evt);
            }
        });
        add(btn_MarkSelectedAsCollected, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 589, -1, -1));

        btn_MarkSelectedAsNotCollected.setBackground(new java.awt.Color(102, 102, 102));
        btn_MarkSelectedAsNotCollected.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_MarkSelectedAsNotCollected.setText("Mark Selected As Not Collected");
        add(btn_MarkSelectedAsNotCollected, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 589, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(188, 188, 188));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<> with ♡ by Team Coding Pirates ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, -1, -1));
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

    private void btn_MarkAllCollectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MarkAllCollectedActionPerformed
        // TODO add your handling code here:
        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            ArrayList<AppointmentDetails> AppointmentList = this.ecosystem.getStudir().getStudentList().get(student).getAd().getAppointmentList();
            for (AppointmentDetails ad : AppointmentList) {
                if (ad.getAppointmentStatus() == "Swab Collected") {
                    ad.setAppointmentStatus("Swab Picked Up");
                }
            }
        }
        populateTable();
    }//GEN-LAST:event_btn_MarkAllCollectedActionPerformed

    private void btn_MarkSelectedAsCollectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MarkSelectedAsCollectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MarkSelectedAsCollectedActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MarkAllCollected;
    private javax.swing.JButton btn_MarkSelectedAsCollected;
    private javax.swing.JButton btn_MarkSelectedAsNotCollected;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbl_Greetings;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTable tbl_SwabToBeCollected;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_SwabToBeCollected.getModel();
        model.setRowCount(0);
        for (String student : this.ecosystem.getStudir().getStudentList().keySet()) {
            ArrayList<AppointmentDetails> AppointmentList = this.ecosystem.getStudir().getStudentList().get(student).getAd().getAppointmentList();
            for (AppointmentDetails ad : AppointmentList) {
                if (ad.getAppointmentStatus() == "Swab Collected") {
                    Object[] row = new Object[6];
                    row[0] = ad;
                    row[1] = this.ecosystem.getStudir().getStudentList().get(student).getStudentLastName() + this.ecosystem.getStudir().getStudentList().get(student).getStudentFirstName();
                    row[2] = ad.getAppointmentTime();
                    row[3] = ad.getAppointmentStatus();
                    for(String swabdetails : this.ecosystem.getStudir().getStudentList().get(student).getSd().getSwabCollectionList().keySet()){
                        row[4] = this.ecosystem.getStudir().getStudentList().get(student).getSd().getSwabCollectionList().get(swabdetails).getSwabID();
                        break;
                    }
                    model.addRow(row);
                }

            }
        }
    }
}
