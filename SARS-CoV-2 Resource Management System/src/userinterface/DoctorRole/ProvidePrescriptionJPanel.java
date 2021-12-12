/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
//import Business.Organization.DeliveryManOrganization;
import Business.Organization.Organization;
import Business.Pharmacy.Medicine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalDeliveryWorkRequest;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Networks.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumit
 */
public class ProvidePrescriptionJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private PatientTreatmentWorkRequest request;
    private HashMap<Medicine, Integer> medicines;

    public ProvidePrescriptionJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientTreatmentWorkRequest workRequest, EcoSystem system) {
        initComponents();

        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Doctor.gif"));
        icon.getImage().flush();
        jLabel3.setIcon(icon);

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = workRequest;
        this.ecosystem = system;
        this.medicines = new HashMap<>();
        populateTable();
        populatePharmacyJCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JLabel();
        txtLastName1 = new javax.swing.JLabel();
        txtMedicalCondition1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        pharmacyjComboBox = new javax.swing.JComboBox<>();
        viewMedicines = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicinejTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrescription = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 17, 23));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(13, 17, 23));
        backJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(188, 188, 188));
        backJButton.setText("Back");
        backJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backJButtonMouseExited(evt);
            }
        });
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(188, 188, 188));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<> with ♡ by Team Batman");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 705, 282, -1));

        jPanel1.setBackground(new java.awt.Color(22, 27, 34));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(188, 188, 188));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PATIENT PRESCRIPTION");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(188, 188, 188));
        jLabel11.setText("Prescription :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(188, 188, 188));
        jLabel12.setText("First Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reason :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(188, 188, 188));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Age :");

        txtFirstName1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtFirstName1.setForeground(new java.awt.Color(188, 188, 188));

        txtAge1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtAge1.setForeground(new java.awt.Color(188, 188, 188));

        txtLastName1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtLastName1.setForeground(new java.awt.Color(188, 188, 188));

        txtMedicalCondition1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtMedicalCondition1.setForeground(new java.awt.Color(188, 188, 188));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(188, 188, 188));
        jLabel15.setText("Last Name :");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(188, 188, 188));
        jLabel27.setText("Pharmacy :");

        pharmacyjComboBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        pharmacyjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmacyjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyjComboBoxActionPerformed(evt);
            }
        });

        viewMedicines.setBackground(new java.awt.Color(22, 27, 34));
        viewMedicines.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewMedicines.setForeground(new java.awt.Color(188, 188, 188));
        viewMedicines.setText("View Meds");
        viewMedicines.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                viewMedicinesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                viewMedicinesFocusLost(evt);
            }
        });
        viewMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMedicinesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMedicinesMouseExited(evt);
            }
        });
        viewMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicinesActionPerformed(evt);
            }
        });

        medicinejTable.setBackground(new java.awt.Color(22, 27, 34));
        medicinejTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicinejTable.setForeground(new java.awt.Color(188, 188, 188));
        medicinejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Price($)"
            }
        ));
        medicinejTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(medicinejTable);

        btnAdd.setBackground(new java.awt.Color(22, 27, 34));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(188, 188, 188));
        btnAdd.setText("Add");
        btnAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAddFocusLost(evt);
            }
        });
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPrescription.setBackground(new java.awt.Color(22, 27, 34));
        txtPrescription.setColumns(20);
        txtPrescription.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtPrescription.setForeground(new java.awt.Color(188, 188, 188));
        txtPrescription.setRows(5);
        jScrollPane1.setViewportView(txtPrescription);

        btnSubmit.setBackground(new java.awt.Color(22, 27, 34));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(188, 188, 188));
        btnSubmit.setText("Submit");
        btnSubmit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSubmitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSubmitFocusLost(evt);
            }
        });
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(viewMedicines)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pharmacyjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMedicalCondition1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMedicalCondition1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pharmacyjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewMedicines, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(25, 25, 25))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel15, txtLastName1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel27, txtMedicalCondition1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel24, txtAge1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnSubmit, viewMedicines});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 71, 460, 570));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Doctor.gif"))); // NOI18N
        jLabel3.setText("jLabel1");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 600, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String prescription = txtPrescription.getText();
        if (prescription.equals("")) {
            JOptionPane.showMessageDialog(null, "Prescription is mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                request.setPrescription(prescription);
                request.setStatus("Prescription Provided");

                MedicalDeliveryWorkRequest md = new MedicalDeliveryWorkRequest();
                md.setAssignedDoctor(userAccount);
                md.setMedicines(this.medicines);
                md.setStatus("Medicines Sent");
                double amount = 0;

                for (Medicine m : this.medicines.keySet()) {
                    amount += m.getMedicinePrice() * this.medicines.get(m);
                }
                this.request.setMedicationCharges(amount);

                Organization org = null;
                for (Network n : this.ecosystem.getNetworks()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizations()) {
//                            if (o instanceof DeliveryManOrganization) {
//                                org = o;
//                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(md);
                }

                JOptionPane.showMessageDialog(null, "Prescription submitted successfully", "Submitted", JOptionPane.INFORMATION_MESSAGE);
                this.medicines.clear();
                btnSubmit.setEnabled(false);

                jLabel3.setIcon(null);
                jLabel3.revalidate();

                userProcessContainer.remove(this);
                Component[] componentArray = userProcessContainer.getComponents();
                Component component = componentArray[componentArray.length - 1];
                DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
                dwjp.populateRequestTable();
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void viewMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicinesActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) medicinejTable.getModel();
        if (!pharmacyjComboBox.getSelectedItem().toString().equals("Select Pharmacy")) {
            for (Network n : this.ecosystem.getNetworks()) {
                if (n.getEnterpriseDirectory().getEnterpriseList().contains(this.enterprise)) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                        if (e instanceof PharmacyEnterprise
                                & e.getName().equals(pharmacyjComboBox.getSelectedItem().toString())) {
//                            System.out.println(e.getName());
                            PharmacyEnterprise pe = (PharmacyEnterprise) e;
//                            System.out.println(pe.getName());
                            Object[] row = new Object[2];
                            for (Medicine m : pe.getPharmacy().getMedicineList()) {
//                                System.out.println(m.getMedicineName());
                                row[0] = m;
                                row[1] = m.getMedicinePrice();
                                dtm.addRow(row);
                            }
                        }

                    }
                }

            }

        }
    }//GEN-LAST:event_viewMedicinesActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) medicinejTable.getModel();
        int selectedRow = medicinejTable.getSelectedRow();

        if (selectedRow != -1) {
            JFrame frame = new JFrame("Please enter quantity");
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter quantity"));;
            if (this.medicines.containsKey((Medicine) dtm.getValueAt(selectedRow, 0))) {
                JOptionPane.showMessageDialog(null, "Medicine already added", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.medicines.put((Medicine) dtm.getValueAt(selectedRow, 0), quantity);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select medicine to add", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void pharmacyjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyjComboBoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_pharmacyjComboBoxActionPerformed

    private void backJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseEntered
        // TODO add your handling code here:
        backJButton.setForeground(new Color(0, 0, 0));
        backJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_backJButtonMouseEntered

    private void backJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseExited
        // TODO add your handling code here:
        backJButton.setForeground(new Color(188, 188, 188));
        backJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_backJButtonMouseExited

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jLabel3.setIcon(null);
        jLabel3.revalidate();

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:

        jLabel5.setFont(new Font(jLabel5.getFont().getName(), Font.PLAIN, 19));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:

        jLabel5.setFont(new Font(jLabel5.getFont().getName(), Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel5MouseExited

    private void viewMedicinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicinesMouseEntered
        // TODO add your handling code here:
        viewMedicines.setForeground(new Color(0, 0, 0));
        viewMedicines.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_viewMedicinesMouseEntered

    private void viewMedicinesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicinesMouseExited
        // TODO add your handling code here:
        viewMedicines.setForeground(new Color(188, 188, 188));
        viewMedicines.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_viewMedicinesMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        btnAdd.setForeground(new Color(0, 0, 0));
        btnAdd.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        btnAdd.setForeground(new Color(188, 188, 188));
        btnAdd.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddFocusGained
        // TODO add your handling code here:
        btnAdd.setForeground(new Color(0, 0, 0));
        btnAdd.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAddFocusGained

    private void btnAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddFocusLost
        // TODO add your handling code here:
        btnAdd.setForeground(new Color(188, 188, 188));
        btnAdd.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnAddFocusLost

    private void viewMedicinesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewMedicinesFocusGained
        // TODO add your handling code here:
        viewMedicines.setForeground(new Color(0, 0, 0));
        viewMedicines.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_viewMedicinesFocusGained

    private void viewMedicinesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewMedicinesFocusLost
        // TODO add your handling code here:
        viewMedicines.setForeground(new Color(188, 188, 188));
        viewMedicines.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_viewMedicinesFocusLost

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
        btnSubmit.setForeground(new Color(0, 0, 0));
        btnSubmit.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        // TODO add your handling code here:
        btnSubmit.setForeground(new Color(188, 188, 188));
        btnSubmit.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnSubmitMouseExited

    private void btnSubmitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubmitFocusGained
        // TODO add your handling code here:
        btnSubmit.setForeground(new Color(0, 0, 0));
        btnSubmit.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnSubmitFocusGained

    private void btnSubmitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubmitFocusLost
        // TODO add your handling code here:
        btnSubmit.setForeground(new Color(188, 188, 188));
        btnSubmit.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnSubmitFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medicinejTable;
    private javax.swing.JComboBox<String> pharmacyjComboBox;
    private javax.swing.JLabel txtAge1;
    private javax.swing.JLabel txtFirstName1;
    private javax.swing.JLabel txtLastName1;
    private javax.swing.JLabel txtMedicalCondition1;
    private javax.swing.JTextArea txtPrescription;
    private javax.swing.JButton viewMedicines;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
//        txtFirstName1.setText(request.getStudent().getStudentFirstName());
//        txtLastName1.setText(request.getStudent().getStudentLastName());
//        txtAge1.setText(String.valueOf(request.getStudent().getStudentAge()));
        txtMedicalCondition1.setText(request.getReasonForVisit());

    }

    private void populatePharmacyJCombo() {
        pharmacyjComboBox.removeAllItems();
        pharmacyjComboBox.addItem("Select Pharmacy");
        for (Network n : this.ecosystem.getNetworks()) {
            if (n.getEnterpriseDirectory().getEnterpriseList().contains(this.enterprise)) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                    if (e.getEnterpriseType().getValue().contains("Pharmacy")) {
                        pharmacyjComboBox.addItem(e.getName());
                    }

                }
            }

        }

    }
}
