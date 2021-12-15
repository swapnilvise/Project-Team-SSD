/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Item;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author raunak
 */
public class AdminManageOrderJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
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
    
    public AdminManageOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();

        this.container = userProcessContainer;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        jPanelOrderSummary.setVisible(false);
        jPanelDM.setVisible(false);
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        for (String s : this.userAccount.getOrders().getOrderDirectory().keySet()) {
            Object row[] = new Object[5];
            row[0] = this.userAccount.getOrders().getOrderDirectory().get(s).getOrderDateTime().format(formatter);
            row[1] = this.userAccount.getOrders().getOrderDirectory().get(s).getCustomerId();
            row[2] = this.userAccount.getOrders().getOrderDirectory().get(s).getOrderId();
            row[3] = this.userAccount.getOrders().getOrderDirectory().get(s).getDeliveryManName();
            row[4] = this.userAccount.getOrders().getOrderDirectory().get(s).getStatus();
            dtm.addRow(row);
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

        backButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelOrderSummary = new javax.swing.JPanel();
        jLabelOrderId2 = new javax.swing.JLabel();
        jLabelOrderID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelOrderId = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelOrderId4 = new javax.swing.JLabel();
        jLabelOrderDate = new javax.swing.JLabel();
        jLabelCustId = new javax.swing.JLabel();
        jLabelCustomerID = new javax.swing.JLabel();
        jLabelOrderId3 = new javax.swing.JLabel();
        jLabelNote = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItems = new javax.swing.JTable();
        jLabelOrderId5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        jPanelDM = new javax.swing.JPanel();
        assignButton = new javax.swing.JButton();
        jLabelDM = new javax.swing.JLabel();
        jComboDeliveryMan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        acceptOrderButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        viewOrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        rejectOrderButton = new javax.swing.JButton();
        acceptOrderButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });
        add(backButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 239, 670, 10));

        jPanelOrderSummary.setOpaque(false);
        jPanelOrderSummary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrderId2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId2.setText("Total Price:");
        jPanelOrderSummary.add(jLabelOrderId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 89, 99, -1));

        jLabelOrderID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelOrderID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 67, 181, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel4.setText("Order Summary");
        jPanelOrderSummary.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 30));

        jLabelOrderId.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId.setText("OrderID:");
        jPanelOrderSummary.add(jLabelOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, 99, -1));

        jLabelPrice.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 89, 181, 16));

        jLabelOrderId4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId4.setText("Date and Time:");
        jPanelOrderSummary.add(jLabelOrderId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 10, 99, -1));

        jLabelOrderDate.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelOrderDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 11, 111, 16));

        jLabelCustId.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelCustId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCustId.setText("CustomerID:");
        jPanelOrderSummary.add(jLabelCustId, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, 99, -1));

        jLabelCustomerID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelCustomerID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 45, 180, 16));

        jLabelOrderId3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId3.setText("Order Note:");
        jPanelOrderSummary.add(jLabelOrderId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 111, 99, -1));

        jLabelNote.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelNote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 111, 279, 16));

        jTableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableItems);

        jPanelOrderSummary.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 133, 279, 84));

        jLabelOrderId5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId5.setText("Order Items:");
        jPanelOrderSummary.add(jLabelOrderId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 133, 99, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-activity-history-24.png"))); // NOI18N
        jPanelOrderSummary.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        add(jPanelOrderSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 247, 440, 220));

        logoutButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 6, 94, -1));

        jPanelDM.setOpaque(false);
        jPanelDM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        jPanelDM.add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 98, 113, -1));

        jLabelDM.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabelDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDM.setText("Assign Delivery Man");
        jPanelDM.add(jLabelDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, -3, 148, 30));

        jComboDeliveryMan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDeliveryManActionPerformed(evt);
            }
        });
        jPanelDM.add(jComboDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 58, 113, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-account-24.png"))); // NOI18N
        jPanelDM.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 30, 50));

        add(jPanelDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acceptOrderButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        acceptOrderButton2.setText("Assign Delivery Man");
        acceptOrderButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(acceptOrderButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Order List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 6, 134, -1));

        viewOrderButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        viewOrderButton.setText("View Order");
        viewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Date & Time", "CustomerID", "OrderID", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 602, 109));

        rejectOrderButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        rejectOrderButton.setText("Reject Order");
        rejectOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rejectOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 100, -1));

        acceptOrderButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        acceptOrderButton1.setText("Accept Order");
        acceptOrderButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(acceptOrderButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 106, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-activity-history-24.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 40, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 34, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButton2ActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void rejectOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectOrderButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            String status = dtm.getValueAt(rowNumber, 4).toString();
            if (status.equals("Cancelled") | status.equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already cancelled or rejected");
            } else {
                Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2));
                int result = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (result == JOptionPane.YES_OPTION) {
                    o.setStatus("Rejected");
                    o.setDeliveryManName("-NA-");
                    JOptionPane.showMessageDialog(null, "Order Rejected.");
                    dtm.removeRow(rowNumber);
                    populateRequestTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order to cancel.");
        }

    }//GEN-LAST:event_rejectOrderButtonActionPerformed

    private void viewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            jPanelOrderSummary.setVisible(true);
            Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2).toString());
            jLabelOrderID.setText(o.getOrderId());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
            jLabelOrderDate.setText(o.getOrderDateTime().format(formatter));
            jLabelPrice.setText(String.valueOf(o.getOrderTotal()));
            jLabelCustomerID.setText(o.getCustomerId());
            jLabelNote.setText(o.getCustomerNotes());
            DefaultTableModel dtmItems = (DefaultTableModel) jTableItems.getModel();
            dtmItems.setRowCount(0);
            for (Item i : o.getItemList().keySet()) {
                Object[] row = new Object[2];
                row[0] = i.getItemName();
                row[1] = o.getItemList().get(i);
                dtmItems.addRow(row);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select an order.");
        }

    }//GEN-LAST:event_viewOrderButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void acceptOrderButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            String status = dtm.getValueAt(rowNumber, 4).toString();
            if (status.equals("Cancelled") | status.equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already cancelled or rejected");
            } else if (status.equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Order already accepted");
            } else {
                Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2));
                int result = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (result == JOptionPane.YES_OPTION) {
                    o.setStatus("Accepted");
                    o.setDeliveryManName("To be Assigned");
                    JOptionPane.showMessageDialog(null, "Order Accepted.");
                    dtm.removeRow(rowNumber);
                    populateRequestTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order to cancel.");
        }
    }//GEN-LAST:event_acceptOrderButton1ActionPerformed

    private void acceptOrderButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderButton2ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            String status = dtm.getValueAt(rowNumber, 4).toString();
            if (status.equals("Cancelled") | status.equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already cancelled or rejected");
            } else if (status.equals("Ordered")) {
                JOptionPane.showMessageDialog(null, "Accept order to assign delivery man.");
            } else if (status.equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Delivery man already assigned.");
            } else {
                jPanelDM.setVisible(true);
                displayCombo();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order to cancel.");
        }

    }//GEN-LAST:event_acceptOrderButton2ActionPerformed
    private void displayCombo() {
        jComboDeliveryMan.removeAllItems();
        jComboDeliveryMan.addItem("Select Delivery Man");
        for (String s : this.ecosystem.getDeliveryManDirectory().getDeliveryManList().keySet()) {
            jComboDeliveryMan.addItem(this.ecosystem.getDeliveryManDirectory().findDeliveryMan(s).toString()+
                    " - "+this.ecosystem.getDeliveryManDirectory().findDeliveryMan(s).getDelId());
        }

    }
    private void jComboDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDeliveryManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDeliveryManActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2));
        o.setStatus("Assigned");
        if(jComboDeliveryMan.getSelectedItem().toString().equals("Select Delivery Man"))
            JOptionPane.showMessageDialog(null, "Please select delivery man to be assigned");
        else{
            StringBuilder s= new StringBuilder(jComboDeliveryMan.getSelectedItem().toString());
            String [] split=s.toString().split(" - ");
            DeliveryMan dm= this.ecosystem.getDeliveryManDirectory().findDeliveryMan(split[1]);
            o.setDeliveryManName(dm.getFirstName()+" "+dm.getLastName());
            dm.getDeliveryManAccount().getOrders().newOrder(o);
            JOptionPane.showMessageDialog(null, "Order Assigned.");
            dtm.removeRow(rowNumber);
            populateRequestTable();
            jPanelDM.setVisible(false);
        }
        
        

    }//GEN-LAST:event_assignButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrderButton1;
    private javax.swing.JButton acceptOrderButton2;
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton2;
    private javax.swing.JComboBox<String> jComboDeliveryMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCustId;
    private javax.swing.JLabel jLabelCustomerID;
    private javax.swing.JLabel jLabelDM;
    private javax.swing.JLabel jLabelNote;
    private javax.swing.JLabel jLabelOrderDate;
    private javax.swing.JLabel jLabelOrderID;
    private javax.swing.JLabel jLabelOrderId;
    private javax.swing.JLabel jLabelOrderId2;
    private javax.swing.JLabel jLabelOrderId3;
    private javax.swing.JLabel jLabelOrderId4;
    private javax.swing.JLabel jLabelOrderId5;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDM;
    private javax.swing.JPanel jPanelOrderSummary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableItems;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JButton rejectOrderButton;
    private javax.swing.JButton viewOrderButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
