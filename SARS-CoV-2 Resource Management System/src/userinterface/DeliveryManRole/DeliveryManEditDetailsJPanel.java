/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author swapn
 */
public class DeliveryManEditDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManEditDetailsJPanel
     */
    
    private JPanel container;
    private EcoSystem business;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil;
    private boolean passwordFlag = false;
    
    public DeliveryManEditDetailsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        populateFields();
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D)g;
        int width=getWidth();
        int height= getHeight();
        
        Color color1= new Color(0, 105, 146);
        Color color2= new Color(162, 238, 242);
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

        backButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PasswordButton = new javax.swing.JButton();
        jTextFieldUserName = new javax.swing.JTextField();
        SignUpButton = new javax.swing.JButton();
        labelusername = new javax.swing.JLabel();
        labelCnfPassword = new javax.swing.JLabel();
        jTextFieldCnfPassword = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelPhoneNumber = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        labelFirstName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldState = new javax.swing.JTextField();
        labelStreetName = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        labelState = new javax.swing.JLabel();
        jTextFieldCountry = new javax.swing.JTextField();
        labelCountry = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldStreetName = new javax.swing.JTextField();
        labelZip = new javax.swing.JLabel();
        jTextFieldZip = new javax.swing.JTextField();
        labelCity = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 15, 430));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 222, 357, 10));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword.setText("Password:");
        jPanel1.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel4.setText("Account Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 40));

        PasswordButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        PasswordButton.setText("Change Password");
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 162, -1, -1));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 45, 192, -1));

        SignUpButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        SignUpButton.setText("Update");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 162, 100, -1));

        labelusername.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername.setText("User Name:");
        jPanel1.add(labelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        labelCnfPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCnfPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCnfPassword.setText("Confirm Password:");
        jPanel1.add(labelCnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 110, 25));

        jTextFieldCnfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCnfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, 192, -1));

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 82, 192, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-mail-account-24.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jPanel2.setOpaque(false);

        labelPhoneNumber.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPhoneNumber.setText("Phone Number:");

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        labelFirstName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFirstName.setText("First Name:");

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Last Name:");

        jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumberActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("Email ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setText("Personal Details");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-account-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEmail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(labelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldFirstName)
                                .addComponent(jTextFieldLastName)
                                .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStateActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldState, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 120, 192, -1));

        labelStreetName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelStreetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelStreetName.setText("Street Name:");
        jPanel3.add(labelStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        jTextFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCityActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 83, 192, -1));

        labelState.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelState.setText("State:");
        jPanel3.add(labelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 110, 25));

        jTextFieldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCountryActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 157, 192, -1));

        labelCountry.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCountry.setText("Country:");
        jPanel3.add(labelCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 156, 110, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel2.setText("Address Details");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 6, -1, -1));

        jTextFieldStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStreetNameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 46, 192, -1));

        labelZip.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelZip.setText("Zip Code:");
        jPanel3.add(labelZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 193, 110, 25));

        jTextFieldZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldZipActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 194, 192, -1));

        labelCity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCity.setText("City:");
        jPanel3.add(labelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-address-24.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 100, 110));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel10.setText("Update");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel9.setText("Profile");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane message = new JOptionPane();
        int errorCode = validatePersonalDetails();

        switch (errorCode) {
            case 1:
            message.showMessageDialog(this,
                "First Name cannot be empty and has to be only alphabets");
            populateFields();
            break;
            case 2:
            message.showMessageDialog(this,
                "Last Name has to be only alphabets");
            populateFields();
            break;
            case 3:
            message.showMessageDialog(this,
                "Phone number is invalid");
            populateFields();
            break;
            case 4:
            message.showMessageDialog(this,
                "Invalid Email format.");
            populateFields();
            break;
            case 6:
            message.showMessageDialog(this,
                "Street Name cannot be empty.");
            populateFields();
            break;
            case 7:
            message.showMessageDialog(this,
                "City cannot be empty and "
                + "has to be alphabets in home address");
            populateFields();
            break;
            case 8:
            message.showMessageDialog(this,
                "State cannot be empty and "
                + "has to be alphabets in home address");
            populateFields();
            break;
            case 9:
            message.showMessageDialog(this,
                "Country cannot be empty and "
                + "has to be alphabets in home address");
            populateFields();
            break;
            case 10:
            message.showMessageDialog(this,
                "Zip Code cannot be empty"
                + " and has to be numeric in home address");
            populateFields();
            break;

            default:

            if (passwordFlag) {
                if (!jTextFieldCnfPassword.getText().equals(jTextFieldPassword.getText())) {
                    message.showMessageDialog(this, "Passwords do not match");
                    PasswordButton.setEnabled(true);
                    populateFields();
                } else if (jTextFieldPassword.getText().equals(this.userAccount.getPassword())) {
                    message.showMessageDialog(this, "Password cannot be same as previous password.");
                    PasswordButton.setEnabled(true);
                    populateFields();
                } else if (jTextFieldPassword.getText().isEmpty() | jTextFieldCnfPassword.getText().isEmpty()) {
                    message.showMessageDialog(this, "Password fields cannot be empty.");
                    PasswordButton.setEnabled(true);
                    populateFields();
                } else {
                    updateDeliveryMan();
                    this.userAccount.setPassword(jTextFieldPassword.getText());
                    message.showMessageDialog(this,
                        "Updated Successfully.");
                }
            } else {
                updateDeliveryMan();
                message.showMessageDialog(this, "Updated Successfully.");
            }

            break;
        }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void jTextFieldCnfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCnfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCnfPasswordActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldZipActionPerformed

    private void jTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCountryActionPerformed

    private void jTextFieldStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStateActionPerformed

    private void jTextFieldStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStreetNameActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Please enter new quantity");
        String password = JOptionPane.showInputDialog(frame, "Please enter old password");
        if (password.equals(this.userAccount.getPassword())) {
            jTextFieldPassword.setEnabled(true);
            jTextFieldCnfPassword.setEnabled(true);
            PasswordButton.setEnabled(false);
            passwordFlag = true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Password.");
            populateFields();
        }
    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PasswordButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldCnfPassword;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JTextField jTextFieldStreetName;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JTextField jTextFieldZip;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelCnfPassword;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelStreetName;
    private javax.swing.JLabel labelZip;
    private javax.swing.JLabel labelusername;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        DeliveryMan dm = this.business.getDeliveryManDirectory().findDeliveryManByUserName(userAccount.getUsername());
        jTextFieldFirstName.setText(dm.getFirstName());
        jTextFieldLastName.setText(dm.getLastName());
        jTextFieldPhoneNumber.setText(dm.getPhoneNo());
        jTextFieldStreetName.setText(dm.getAddress().getStreetAddress());
        jTextFieldCity.setText(dm.getAddress().getCity());
        jTextFieldState.setText(dm.getAddress().getState());
        jTextFieldCountry.setText(dm.getAddress().getCountry());
        jTextFieldZip.setText(dm.getAddress().getZipCode());
        jTextFieldEmail.setText(dm.getEmailId());

        jTextFieldUserName.setText(this.userAccount.getUsername());
        jTextFieldUserName.setEnabled(false);
        jTextFieldPassword.setEnabled(false);
        jTextFieldCnfPassword.setEnabled(false);
    }

    private int validatePersonalDetails() {
        int errorCode = 0;

        if (jTextFieldFirstName.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldFirstName.getText())) {
            errorCode = 1;
        } else if (!jTextFieldLastName.getText().isEmpty()
                & !Pattern.matches("[a-zA-Z]+", jTextFieldLastName.getText())) {
            errorCode = 2;
        } else if (!jTextFieldPhoneNumber.getText().isEmpty()
                & !Pattern.matches("{10}[0-9]+", jTextFieldPhoneNumber.getText())
                | jTextFieldPhoneNumber.getText().length() != 10) {
            errorCode = 3;
        } else if (jTextFieldEmail.getText().isEmpty()
                | !Pattern.matches(
                        "^(.+)@(.+)$",
                        jTextFieldEmail.getText())) {
            errorCode = 4;
        } else if (jTextFieldStreetName.getText().isEmpty()) {
            errorCode = 6;
        } else if (jTextFieldCity.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldCity.getText())) {
            errorCode = 7;
        } else if (jTextFieldState.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldState.getText())) {
            errorCode = 8;
        } else if (jTextFieldCountry.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldCountry.getText())) {
            errorCode = 9;
        } else if (jTextFieldZip.getText().isEmpty()
                | !Pattern.matches("[0-9]+", jTextFieldZip.getText())) {
            errorCode = 10;
        }

        return errorCode;
    }

    private void updateDeliveryMan() {
        DeliveryMan dm = this.business.getDeliveryManDirectory().findDeliveryManByUserName(userAccount.getUsername());
        dm.setFirstName(jTextFieldFirstName.getText());
        dm.setLastName(jTextFieldLastName.getText());
        dm.setEmailId(jTextFieldEmail.getText());
        dm.setPhoneNo(jTextFieldPhoneNumber.getText());
        dm.getAddress().setStreetAddress(jTextFieldStreetName.getText());
        dm.getAddress().setCity(jTextFieldCity.getText());
        dm.getAddress().setState(jTextFieldState.getText());
        dm.getAddress().setCountry(jTextFieldCountry.getText());
        dm.getAddress().setZipCode(jTextFieldZip.getText());
    }
}
