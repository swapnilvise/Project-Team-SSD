/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.TestingLabOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author SHRISHTI
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private TestingLabOrganization labOrganization;
    private DB4OUtil dB4OUtil;
    
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (TestingLabOrganization) organization;
        this.dB4OUtil=dB4OUtil;
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getEmpName();
            row[2] = ((PatientTreatmentWorkRequest) request).getLabAssistant();
            row[3] = request.getStatus();
            row[4] = ((PatientTreatmentWorkRequest) request).getPatient().getPatientFirstName() + " " + ((PatientTreatmentWorkRequest) request).getPatient().getPatientLastName();
            row[5] = ((PatientTreatmentWorkRequest) request).getPatient().getPatientId();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogoutPatient = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setText("LAB ASSISTANT WORK AREA");

        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(188, 188, 188));
        valueLabel.setText("<value>");

        workRequestJTable.setBackground(new java.awt.Color(13, 17, 23));
        workRequestJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(188, 188, 188));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient Name", "Patient Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(188, 188, 188));
        enterpriseLabel.setText("Enterprise :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Lab Test Work Queue");

        btnLogoutPatient.setBackground(new java.awt.Color(13, 17, 23));
        btnLogoutPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogoutPatient.setForeground(new java.awt.Color(188, 188, 188));
        btnLogoutPatient.setText("Logout");
        btnLogoutPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutPatientMouseExited(evt);
            }
        });
        btnLogoutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutPatientActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(13, 17, 23));
        processJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        processJButton.setForeground(new java.awt.Color(188, 188, 188));
        processJButton.setText("Process Request");
        processJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                processJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                processJButtonMouseExited(evt);
            }
        });
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(13, 17, 23));
        assignJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(188, 188, 188));
        assignJButton.setText("Assign To Me");
        assignJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assignJButtonMouseExited(evt);
            }
        });
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(640, 640, 640)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282)
                                .addComponent(btnLogoutPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnLogoutPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseEntered
        // TODO add your handling code here:
        btnLogoutPatient.setForeground(new Color(255, 255, 255));
        btnLogoutPatient.setBackground(new Color(158, 33, 50));
    }//GEN-LAST:event_btnLogoutPatientMouseEntered

    private void btnLogoutPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseExited
        // TODO add your handling code here:
        btnLogoutPatient.setForeground(new Color(188, 188, 188));
        btnLogoutPatient.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnLogoutPatientMouseExited

    private void btnLogoutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutPatientActionPerformed
        // TODO add your handling code here:

        userProcessContainer.removeAll();
        LoginPageJPanel lp = new LoginPageJPanel(business, dB4OUtil, userProcessContainer);
        userProcessContainer.add("LoginJPanel", lp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(business);
    }//GEN-LAST:event_btnLogoutPatientActionPerformed

    private void processJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processJButtonMouseEntered
        // TODO add your handling code here:
        processJButton.setForeground(new Color(0,0,0));
        processJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_processJButtonMouseEntered

    private void processJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processJButtonMouseExited
        // TODO add your handling code here:
        processJButton.setForeground(new Color(188,188,188));
        processJButton.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_processJButtonMouseExited

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        ProcessWorkRequestsJPanel processWorkRequestJPanel = new ProcessWorkRequestsJPanel(userProcessContainer, request);
        if (request.getLabAssistant() != null) {
            if (userAccount.equals(request.getLabAssistant())) {
                if (request.getStatus().equalsIgnoreCase("Pending on Lab Assistant")) {

                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot process the request as the status is: " + request.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(null, "Not authorised to process the request", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Request must be assigned first for processing", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignJButtonMouseEntered
        // TODO add your handling code here:
        assignJButton.setForeground(new Color(0,0,0));
        assignJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_assignJButtonMouseEntered

    private void assignJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignJButtonMouseExited
        // TODO add your handling code here:
        assignJButton.setForeground(new Color(188,188,188));
        assignJButton.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_assignJButtonMouseExited

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getLabAssistant() == null) {
            if (request.getStatus().equalsIgnoreCase("Sent To Lab")) {
                request.setLabAssistant(userAccount);
                request.setStatus("Pending on Lab Assistant");
                populateTable();
                JOptionPane.showMessageDialog(null, "The request is assigned to You!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cannot assign this lab request as the current status is: " + request.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (userAccount.equals(request.getLabAssistant())) {
                JOptionPane.showMessageDialog(null, "Request is already assigned to you", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Request is assigned to other Lab Assistant", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnLogoutPatient;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
