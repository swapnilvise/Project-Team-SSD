/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingCenter.PatientAssociateRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Student.Student;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import userinterface.LoginPage.LoginPageJPanel;
import userinterface.StudentRole.ViewUpdateStudentJPanel;

/**
 *
 * @author swapn
 */
public class PatientAssociateWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount; 
    private Integer Time;
    Student student;
    private String StudentID;

    /**
     * Creates new form PatientAssociateWorkAreaJPanel
     */
    public PatientAssociateWorkAreaJPanel(JPanel container,UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
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
        if (Time < 12){
           lbl_Greetings.setText("Good Morning! "); 
        } else if (Time >= 18){
           lbl_Greetings.setText("Good Evening! ");
        } else {
           lbl_Greetings.setText("Good Afternoon! ");
        }
    }
    
    protected void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D)g;
        int width=getWidth();
        int height= getHeight();
        
        Color color1= new Color(0, 0, 0);
        Color color2= new Color(51, 51, 51);
        GradientPaint gp = new GradientPaint(0,0,color1,0,height,color2);
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
        lblWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_Greetings = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_StudentID = new javax.swing.JLabel();
        txt_StudentID = new javax.swing.JTextField();
        btn_GetDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        logoutButton1.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(204, 204, 204));
        lblWelcome.setText("Welcome <UserName>");

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

        lbl_Greetings.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lbl_Greetings.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Greetings.setText("Greetings!");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(457, 474));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Enter the Student ID below to get their details");

        lbl_StudentID.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_StudentID.setForeground(new java.awt.Color(204, 204, 204));
        lbl_StudentID.setText("Student ID : ");

        txt_StudentID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btn_GetDetails.setBackground(new java.awt.Color(102, 102, 102));
        btn_GetDetails.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_GetDetails.setText("Get Details");
        btn_GetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GetDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_StudentID)
                        .addGap(18, 18, 18)
                        .addComponent(txt_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_GetDetails)
                        .addGap(173, 173, 173))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StudentID)
                    .addComponent(txt_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btn_GetDetails)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Greetings, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome)
                    .addComponent(logoutButton1))
                .addGap(34, 34, 34)
                .addComponent(lbl_Greetings)
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel3MouseExited

    private void btn_GetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GetDetailsActionPerformed
        // TODO add your handling code here:
        StudentID = txt_StudentID.getText();
        String option = "2";
        container.removeAll();
        ViewUpdateStudentJPanel vus = new ViewUpdateStudentJPanel(container, userAccount, ecosystem, dB4OUtil, student,Boolean.TRUE, StudentID, option);
        container.add("ViewUpdateStudentJPanel", vus);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btn_GetDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GetDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbl_Greetings;
    private javax.swing.JLabel lbl_StudentID;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextField txt_StudentID;
    // End of variables declaration//GEN-END:variables
}
