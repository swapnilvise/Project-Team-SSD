/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author raunak
 */
public class DeliveryManManageOrdersJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem business;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManManageOrdersJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DB4OUtil dB4OUtil) {
        initComponents();

        this.container = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        populateTable();
        populateMyTable();
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) globalWorkRequestJTable.getModel();
        dtm.setRowCount(0);
        for (String s : this.business.getOrderDirectory().getOrderDirectory().keySet()) {
            Object row[] = new Object[5];
            row[0] = this.business.getOrderDirectory().getOrderDirectory().get(s).getOrderId();
            row[1] = this.business.getOrderDirectory().getOrderDirectory().get(s).getCustomerId();
            row[2] = this.business.getOrderDirectory().getOrderDirectory().get(s).getDeliveryManName();
            row[3] = this.business.getOrderDirectory().getOrderDirectory().get(s).getRestaurantName();
            row[4] = this.business.getOrderDirectory().getOrderDirectory().get(s).getStatus();
            if(this.business.getOrderDirectory().getOrderDirectory().get(s).getStatus().equals("Delivered") |
                    this.business.getOrderDirectory().getOrderDirectory().get(s).getStatus().equals("Pending") | 
                        this.business.getOrderDirectory().getOrderDirectory().get(s).getStatus().equals("Assigned")| 
                            this.business.getOrderDirectory().getOrderDirectory().get(s).getStatus().equals("Rejected"))
                continue;
            dtm.addRow(row);
        }
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
        logoutButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        assignJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        globalWorkRequestJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        acceptJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myWorkRequestJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        deliveredJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        logoutButton1.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton1.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        logoutButton1.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delivery Man Orders");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 20, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-activity-history-24.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false
        );
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignJButton.setBackground(new java.awt.Color(0, 0, 0));
        assignJButton.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        refreshJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshJButton.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 7, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Global Orders");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        globalWorkRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        globalWorkRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        globalWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Delivery Man", "Restaurant Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(globalWorkRequestJTable);
        if (globalWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            globalWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            globalWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            globalWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            globalWorkRequestJTable.getColumnModel().getColumn(2).setHeaderValue("Delivery Man");
            globalWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            globalWorkRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 520, 96));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-globe-24.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 30, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 540, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acceptJButton.setBackground(new java.awt.Color(0, 0, 0));
        acceptJButton.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        acceptJButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptJButton.setText("Accept");
        acceptJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(acceptJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        myWorkRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        myWorkRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        myWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Restaurant Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(myWorkRequestJTable);
        if (myWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            myWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 39, 520, 96));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("My Orders");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, -1));

        deliveredJButton.setBackground(new java.awt.Color(0, 0, 0));
        deliveredJButton.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        deliveredJButton.setForeground(new java.awt.Color(255, 255, 255));
        deliveredJButton.setText("Mark as Delivered");
        deliveredJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveredJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deliveredJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-deliver-food-24.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/subscription-boxes-gif.gif"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 240, 280));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(188, 188, 188));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<> with ♡ by Team Coding Pirates ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 770, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(188, 188, 188));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<> with ♡ by Team Coding Pirates ");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 770, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(188, 188, 188));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<> with ♡ by Team Coding Pirates ");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 770, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(188, 188, 188));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<> with ♡ by Team Coding Pirates ");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 770, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)globalWorkRequestJTable.getModel();
        int rowNumber= globalWorkRequestJTable.getSelectedRow();
        if(rowNumber!=-1){
            String status= String.valueOf(dtm.getValueAt(rowNumber, 4));
            if(status.equals("Cancelled") | status.equals("Rejected")){
                JOptionPane.showMessageDialog(null, "Order has already been cancelled or rejected.");
            }
            else{
                DeliveryMan dm = this.business.getDeliveryManDirectory().findDeliveryManByUserName(this.userAccount.getUsername());
                Order o=this.business.getOrderDirectory().getOrderDirectory().get(dtm.getValueAt(rowNumber, 0).toString());
                int result=JOptionPane.showConfirmDialog(null, "Confirm?");
                if(result==JOptionPane.YES_OPTION){
                    o.setStatus("Pending");
                    o.setDeliveryManName(dm.getFirstName()+" "+dm.getLastName());
                    dm.getDeliveryManAccount().getOrders().newOrder(o);
                    JOptionPane.showMessageDialog(null, "Order Assigned.");
                    dtm.removeRow(rowNumber);
                    populateTable();
                    populateMyTable();
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an order to be assigned.");
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, business, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(business);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void deliveredJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveredJButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel)myWorkRequestJTable.getModel();
        int rowNumber= myWorkRequestJTable.getSelectedRow();
        if(rowNumber!=-1){
            String status= String.valueOf(dtm.getValueAt(rowNumber, 3));
            if(status.equals("Delivered")){
                JOptionPane.showMessageDialog(null, "Order has already been delivered.");
            }
            else if(status.equals("Assigned")){
                JOptionPane.showMessageDialog(null, "Accept order first.");
            }
            else{
                DeliveryMan dm = this.business.getDeliveryManDirectory().findDeliveryManByUserName(this.userAccount.getUsername());
                Order o=dm.getDeliveryManAccount().getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 0).toString());
                int result=JOptionPane.showConfirmDialog(null, "Confirm?");
                if(result==JOptionPane.YES_OPTION){
                    o.setStatus("Delivered");
                    JOptionPane.showMessageDialog(null, "Order Delivered.");
                    dtm.removeRow(rowNumber);
                    populateMyTable();
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an order to deliver.");
        }
        
    }//GEN-LAST:event_deliveredJButtonActionPerformed

    private void acceptJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptJButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel)myWorkRequestJTable.getModel();
        int rowNumber= myWorkRequestJTable.getSelectedRow();
        if(rowNumber!=-1){
            String status= String.valueOf(dtm.getValueAt(rowNumber, 3));
            if(status.equals("Delivered")){
                JOptionPane.showMessageDialog(null, "Order has already been delivered.");
            }else if(status.equals("Cancelled") | status.equals("Rejected") ){
                JOptionPane.showMessageDialog(null, "Order has been cancelled or rejected.");
            }
            else{
                DeliveryMan dm = this.business.getDeliveryManDirectory().findDeliveryManByUserName(this.userAccount.getUsername());
                Order o=dm.getDeliveryManAccount().getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 0).toString());
                int result=JOptionPane.showConfirmDialog(null, "Confirm?");
                if(result==JOptionPane.YES_OPTION){
                    o.setStatus("Pending");
                    JOptionPane.showMessageDialog(null, "Order accepted for delivery.");
                    dtm.removeRow(rowNumber);
                    populateTable();
                    populateMyTable();
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an order to accept.");
        }
        
    }//GEN-LAST:event_acceptJButtonActionPerformed

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:

        jLabel3.setFont(new Font(jLabel3.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel14MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptJButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deliveredJButton;
    private javax.swing.JTable globalWorkRequestJTable;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTable myWorkRequestJTable;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables

    private void populateMyTable() {
        DefaultTableModel dtm = (DefaultTableModel) myWorkRequestJTable.getModel();
        dtm.setRowCount(0);
        for (String s : this.userAccount.getOrders().getOrderDirectory().keySet()) {
            Object row[] = new Object[4];
            row[0] = this.userAccount.getOrders().getOrderDirectory().get(s).getOrderId();
            row[1] = this.userAccount.getOrders().getOrderDirectory().get(s).getCustomerId();
            row[2] = this.userAccount.getOrders().getOrderDirectory().get(s).getRestaurantName();
            row[3] = this.userAccount.getOrders().getOrderDirectory().get(s).getStatus();
            dtm.addRow(row);
        }
    }
}
