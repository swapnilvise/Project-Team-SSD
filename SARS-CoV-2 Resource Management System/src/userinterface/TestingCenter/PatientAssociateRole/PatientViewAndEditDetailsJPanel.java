/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingCenter.PatientAssociateRole;

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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author swapn
 */
public class PatientViewAndEditDetailsJPanel extends javax.swing.JPanel {
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount; 
    private Integer Time;

    /**
     * Creates new form PatientViewAndEditDetailsJPanel
     */
    public PatientViewAndEditDetailsJPanel(JPanel container,UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
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

        lblWelcome = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        lbl_Greetings = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_LastName = new javax.swing.JTextField();
        lbl_Name = new javax.swing.JLabel();
        lbl_FirstName = new javax.swing.JLabel();
        lbl_DOB = new javax.swing.JLabel();
        lbl_Age = new javax.swing.JLabel();
        lbl_Full_Face_Photo = new javax.swing.JLabel();
        txt_Age = new javax.swing.JTextField();
        txt_DOB = new javax.swing.JTextField();
        txt_FirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Street_Name = new javax.swing.JLabel();
        txt_Street_Name = new javax.swing.JTextField();
        lbl_ApartmentNo = new javax.swing.JLabel();
        txt_ApartmentNo = new javax.swing.JTextField();
        lbl_City = new javax.swing.JLabel();
        txt_City = new javax.swing.JTextField();
        lbl_State = new javax.swing.JLabel();
        lbl_Zipcode = new javax.swing.JLabel();
        txt_Zipcode = new javax.swing.JTextField();
        lbl_Country = new javax.swing.JLabel();
        txt_State = new javax.swing.JTextField();
        txt_Country = new javax.swing.JTextField();
        btn_Edit = new javax.swing.JButton();
        btn_Checkin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(204, 204, 204));
        lblWelcome.setText("Welcome <UserName>");
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        logoutButton1.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        lbl_Greetings.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lbl_Greetings.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Greetings.setText("Details for, ");
        add(lbl_Greetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 600));

        txt_LastName.setEditable(false);
        txt_LastName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LastNameActionPerformed(evt);
            }
        });

        lbl_Name.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Name.setText("Last Name : ");

        lbl_FirstName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_FirstName.setForeground(new java.awt.Color(204, 204, 204));
        lbl_FirstName.setText("First Name ( Given Name ) : ");

        lbl_DOB.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_DOB.setForeground(new java.awt.Color(204, 204, 204));
        lbl_DOB.setText("Date of Birth (MM/DD/YYYY) : ");

        lbl_Age.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_Age.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Age.setText("Age : ");

        lbl_Full_Face_Photo.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_Full_Face_Photo.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Full_Face_Photo.setText("Full Face Photo : ");

        txt_Age.setEditable(false);
        txt_Age.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_Age.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_DOB.setEditable(false);
        txt_DOB.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_DOB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DOBActionPerformed(evt);
            }
        });

        txt_FirstName.setEditable(false);
        txt_FirstName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_FirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FirstNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please verify Student details, and click check-in");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_Street_Name.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_Street_Name.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Street_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Street_Name.setText("Street Name :");
        lbl_Street_Name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_Street_Name.setEditable(false);
        txt_Street_Name.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_Street_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_ApartmentNo.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_ApartmentNo.setForeground(new java.awt.Color(204, 204, 204));
        lbl_ApartmentNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ApartmentNo.setText("Apartment Number :");
        lbl_ApartmentNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_ApartmentNo.setEditable(false);
        txt_ApartmentNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_ApartmentNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_City.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_City.setForeground(new java.awt.Color(204, 204, 204));
        lbl_City.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_City.setText("City :");
        lbl_City.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_City.setEditable(false);
        txt_City.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_City.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_State.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_State.setForeground(new java.awt.Color(204, 204, 204));
        lbl_State.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_State.setText("State :");
        lbl_State.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_Zipcode.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_Zipcode.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Zipcode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Zipcode.setText("ZIP Code :");
        lbl_Zipcode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_Zipcode.setEditable(false);
        txt_Zipcode.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_Zipcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_Country.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_Country.setForeground(new java.awt.Color(204, 204, 204));
        lbl_Country.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Country.setText("Country :");
        lbl_Country.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_State.setEditable(false);
        txt_State.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_State.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_Country.setEditable(false);
        txt_Country.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_Country.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_Edit.setBackground(new java.awt.Color(102, 102, 102));
        btn_Edit.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        btn_Edit.setText("Edit Details");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_FirstName)
                                                .addComponent(lbl_DOB))
                                            .addGap(18, 18, 18))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_Full_Face_Photo)
                                                .addComponent(lbl_Age)
                                                .addComponent(lbl_Street_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(21, 21, 21)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_ApartmentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_State)
                                            .addComponent(lbl_City)
                                            .addComponent(lbl_Zipcode)
                                            .addComponent(lbl_Country))
                                        .addGap(37, 37, 37))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_City)
                                .addComponent(txt_ApartmentNo)
                                .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Street_Name)
                                .addComponent(txt_State)
                                .addComponent(txt_Zipcode)
                                .addComponent(txt_Country)
                                .addComponent(txt_LastName)
                                .addComponent(txt_FirstName)
                                .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name)
                    .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FirstName)
                    .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DOB)
                    .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Age)
                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Full_Face_Photo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Street_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Street_Name))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ApartmentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ApartmentNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_City))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_State)
                    .addComponent(txt_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Zipcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Country)
                    .addComponent(txt_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Checkin)
                    .addComponent(btn_Edit))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 108, 460, 640));

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
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1200, -1));

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

    private void txt_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LastNameActionPerformed

    private void txt_DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DOBActionPerformed

    private void txt_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FirstNameActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        // TODO add your handling code here:
        txt_LastName.setEditable(true);
        txt_FirstName.setEditable(true);
        txt_DOB.setEditable(true);
        txt_Age.setEditable(true);
        txt_Street_Name.setEditable(true);
        txt_ApartmentNo.setEditable(true);
        txt_City.setEditable(true);
        txt_State.setEditable(true);
        txt_Zipcode.setEditable(true);
        txt_Country.setEditable(true);
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckinActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Student Checked-In for Testing, Kindly hand them the Testing kit");
    }//GEN-LAST:event_btn_CheckinActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        PatientAssociateWorkAreaJPanel pa = new PatientAssociateWorkAreaJPanel(container, userAccount, ecosystem, dB4OUtil);
        container.add("PatientAssociateWorkAreaJPanel", pa);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btn_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Checkin;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbl_Age;
    private javax.swing.JLabel lbl_ApartmentNo;
    private javax.swing.JLabel lbl_City;
    private javax.swing.JLabel lbl_Country;
    private javax.swing.JLabel lbl_DOB;
    private javax.swing.JLabel lbl_FirstName;
    private javax.swing.JLabel lbl_Full_Face_Photo;
    private javax.swing.JLabel lbl_Greetings;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_State;
    private javax.swing.JLabel lbl_Street_Name;
    private javax.swing.JLabel lbl_Zipcode;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_ApartmentNo;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_Country;
    private javax.swing.JTextField txt_DOB;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JTextField txt_State;
    private javax.swing.JTextField txt_Street_Name;
    private javax.swing.JTextField txt_Zipcode;
    // End of variables declaration//GEN-END:variables
}
