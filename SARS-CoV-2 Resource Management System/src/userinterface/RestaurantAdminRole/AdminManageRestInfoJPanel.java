/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
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
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author swapn
 */
public class AdminManageRestInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageRestInfoJPanel
     */
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private boolean passwordFlag = false;

    public AdminManageRestInfoJPanel(JPanel container, UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
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

        logoutButton1 = new javax.swing.JButton();
        backButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        labelPassword1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        PasswordButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelCnfPassword = new javax.swing.JLabel();
        jTextFieldCnfPassword = new javax.swing.JTextField();
        jTextFieldUserName = new javax.swing.JTextField();
        labelusername1 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRestContact = new javax.swing.JTextField();
        jTextFieldRestName = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        labelusername = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldStreetName = new javax.swing.JTextField();
        jTextFieldZip = new javax.swing.JTextField();
        jTextFieldCountry = new javax.swing.JTextField();
        labelState = new javax.swing.JLabel();
        labelZip = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        jTextFieldState = new javax.swing.JTextField();
        labelCity = new javax.swing.JLabel();
        labelStreetName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        logoutButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        backButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPassword1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword1.setText("Password:");
        jPanel1.add(labelPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 82, 110, 25));

        updateButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 162, 100, -1));

        PasswordButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        PasswordButton.setText("Change Password");
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 162, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel5.setText("Account Details");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, -1, -1));

        labelCnfPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCnfPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCnfPassword.setText("Confirm Password:");
        jPanel1.add(labelCnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 119, 110, 25));

        jTextFieldCnfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCnfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCnfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 119, 154, -1));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 46, 154, -1));

        labelusername1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername1.setText("User Name:");
        jPanel1.add(labelusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 45, 110, 25));

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 82, 154, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-mail-account-24.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 40));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Restaurant Information");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 6, 293, -1));

        jTextFieldRestContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRestContactActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldRestContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 82, 192, -1));

        jTextFieldRestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRestNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldRestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 45, 192, -1));

        labelPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword.setText("Contact Number:");
        jPanel2.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        labelusername.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername.setText("Restaurant Name:");
        jPanel2.add(labelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-food-24.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, 40));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel4.setText("Address Details");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jTextFieldStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStreetNameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 46, 192, -1));

        jTextFieldZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldZipActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 194, 192, -1));

        jTextFieldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCountryActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 157, 192, -1));

        labelState.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelState.setText("State:");
        jPanel3.add(labelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 110, 25));

        labelZip.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelZip.setText("Zip Code:");
        jPanel3.add(labelZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 193, 110, 25));

        labelCountry.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCountry.setText("Country:");
        jPanel3.add(labelCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 156, 110, 25));

        jTextFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCityActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 83, 192, -1));

        jTextFieldState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStateActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldState, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 120, 192, -1));

        labelCity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCity.setText("City:");
        jPanel3.add(labelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 110, 25));

        labelStreetName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelStreetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelStreetName.setText("Street Name:");
        jPanel3.add(labelStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 110, 25));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-address-24.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 0, 30, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit.gif"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel10.setText("Update");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel11.setText("Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton1)
                    .addComponent(backButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel10)
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel11)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButton2ActionPerformed

    private void jTextFieldRestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRestNameActionPerformed

    private void jTextFieldRestContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRestContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRestContactActionPerformed

    private void jTextFieldStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStreetNameActionPerformed

    private void jTextFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCityActionPerformed

    private void jTextFieldStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStateActionPerformed

    private void jTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCountryActionPerformed

    private void jTextFieldZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldZipActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldCnfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCnfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCnfPasswordActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("");
        String password = JOptionPane.showInputDialog(frame, "Please enter old password");
        if (password.equals(this.userAccount.getPassword())) {
            jTextFieldPassword.setEnabled(true);
            jTextFieldCnfPassword.setEnabled(true);
            PasswordButton.setEnabled(false);
            passwordFlag = true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Password.");
        }
    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane message = new JOptionPane();
        int errorCode = validatePersonalDetails();

        switch (errorCode) {
            case 1:
                message.showMessageDialog(this,
                        "Restaurant Name cannot be empty and has to be only alphabets");
                populateFields();
                break;
            case 2:
                message.showMessageDialog(this,
                        "Phone number is invalid");
                populateFields();
                break;
            case 3:
                message.showMessageDialog(this,
                        "Street Name cannot be empty.");
                populateFields();
                break;
            case 4:
                message.showMessageDialog(this,
                        "City cannot be empty and "
                        + "has to be alphabets in home address");
                populateFields();
                break;
            case 5:
                message.showMessageDialog(this,
                        "State cannot be empty and "
                        + "has to be alphabets in home address");
                populateFields();
                break;
            case 6:
                message.showMessageDialog(this,
                        "Country cannot be empty and "
                        + "has to be alphabets in home address");
                populateFields();
                break;
            case 7:
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
                        updateRestaurant();
                        this.userAccount.setPassword(jTextFieldPassword.getText());
                        message.showMessageDialog(this,
                                "Updated Successfully.");
                    }
                } else {
                    updateRestaurant();
                    message.showMessageDialog(this, "Updated Successfully.");
                }

                break;
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PasswordButton;
    private javax.swing.JButton backButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldCnfPassword;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldRestContact;
    private javax.swing.JTextField jTextFieldRestName;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JTextField jTextFieldStreetName;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JTextField jTextFieldZip;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelCnfPassword;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelStreetName;
    private javax.swing.JLabel labelZip;
    private javax.swing.JLabel labelusername;
    private javax.swing.JLabel labelusername1;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void updateRestaurant() {

    }

    private void populateFields() {
        Restaurant nc = this.ecosystem.getRestaurantDirectory().findResttaurantByUserName(this.userAccount.getUsername());
        jTextFieldRestName.setText(nc.getRestName());
        jTextFieldRestContact.setText(nc.getContactNo());
        jTextFieldStreetName.setText(nc.getAddress().getStreetAddress());
        jTextFieldCity.setText(nc.getAddress().getCity());
        jTextFieldState.setText(nc.getAddress().getState());
        jTextFieldCountry.setText(nc.getAddress().getCountry());
        jTextFieldZip.setText(nc.getAddress().getZipCode());
        System.out.println(nc.getAddress().getStreetAddress()+nc.getAddress().getCity());
        jTextFieldUserName.setText(this.userAccount.getUsername());
        jTextFieldUserName.setEnabled(false);
        jTextFieldPassword.setEnabled(false);
        jTextFieldCnfPassword.setEnabled(false);
    }

    private int validatePersonalDetails() {
        int errorCode = 0;

        if (jTextFieldRestName.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldRestName.getText())) {
            errorCode = 1;
        } else if (!jTextFieldRestContact.getText().isEmpty()
                & !Pattern.matches("{10}[0-9]+", jTextFieldRestContact.getText())
                | jTextFieldRestContact.getText().length() != 10) {
            errorCode = 2;
        } else if (jTextFieldStreetName.getText().isEmpty()) {
            errorCode = 3;
        } else if (jTextFieldCity.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldCity.getText())) {
            errorCode = 4;
        } else if (jTextFieldState.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldState.getText())) {
            errorCode = 5;
        } else if (jTextFieldCountry.getText().isEmpty()
                | !Pattern.matches("[a-zA-Z]+", jTextFieldCountry.getText())) {
            errorCode = 6;
        } else if (jTextFieldZip.getText().isEmpty()
                | !Pattern.matches("[0-9]+", jTextFieldZip.getText())) {
            errorCode = 7;
        }

        return errorCode;
    }
}
