/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

//import backup.Patient_old;
//import backup.Person_old;
import Model.Patient;
import Model.Person;
import Model.PersonDirectory;
import Model.PieChartArray;
import Model.VitalSign;
import Model.barChartAtrributes;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author swapn
 */
public class MainJFrame extends javax.swing.JFrame {

    Person person;
    Patient patient;
    PersonDirectory PRD;
    PieChartArray PCA;
    barChartAtrributes bsa;
    String ZipCode;
    boolean addNewRowflag;
    boolean processFlag;
    boolean consideredFlag;
    boolean refreshFlag = false;
    String color;
    Integer color_coordinate1;
    Integer color_coordinate2;
    Integer color_coordinate3;
    float total;
    float percentage;
    String SelectedVital;
    int errorCodeVital;

//    PatientDirectory patientDirectory;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.person = person;
        this.patient = patient;
        this.bsa = bsa;
        PCA = new PieChartArray();
        PRD = new PersonDirectory();
//        patientDirectory = new PatientDirectory();
        PRD.PersonList();
        PCA.bCAList();
        showPieChart1();
//        if (processFlag == true){
//            showPieChart2();
//        }
//        showPieChart2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        top_panel = new javax.swing.JPanel();
        lbl_Title = new javax.swing.JLabel();
        bottom_panel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PersonPanel = new javax.swing.JPanel();
        btn_CreatePerson = new javax.swing.JButton();
        btn_SearchforExistingPerson = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PatientPanel = new javax.swing.JPanel();
        btn_ExistingPatient = new javax.swing.JButton();
        btn_NewPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DashboardPanel = new javax.swing.JPanel();
        GraphSearchLabel = new javax.swing.JLabel();
        btn_DisplayResult = new javax.swing.JButton();
        panelBarChart = new javax.swing.JPanel();
        txt_ComminityCode = new javax.swing.JTextField();
        btn_Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        abonormalPatientsCount = new javax.swing.JTable();
        GraphSearchLabel1 = new javax.swing.JLabel();
        drpdwn_VitalSign = new javax.swing.JComboBox<>();
        btn_DisplayVitalResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 913));

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        top_panel.setBackground(new java.awt.Color(204, 0, 0));
        top_panel.setForeground(new java.awt.Color(255, 255, 255));

        lbl_Title.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("Vital Sign Management System");
        lbl_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 388, Short.MAX_VALUE))
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_panelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbl_Title)
                .addGap(21, 21, 21))
        );

        splitPane.setTopComponent(top_panel);

        bottom_panel.setBackground(new java.awt.Color(255, 255, 255));
        bottom_panel.setLayout(new java.awt.CardLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 0, 0));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N

        PersonPanel.setBackground(new java.awt.Color(255, 255, 255));
        PersonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CreatePerson.setBackground(new java.awt.Color(204, 0, 0));
        btn_CreatePerson.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btn_CreatePerson.setForeground(new java.awt.Color(255, 255, 255));
        btn_CreatePerson.setText("Create New Person Profile");
        btn_CreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreatePersonActionPerformed(evt);
            }
        });
        PersonPanel.add(btn_CreatePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 165, 210, -1));

        btn_SearchforExistingPerson.setBackground(new java.awt.Color(204, 0, 0));
        btn_SearchforExistingPerson.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btn_SearchforExistingPerson.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchforExistingPerson.setText("View Person Directory");
        btn_SearchforExistingPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchforExistingPersonActionPerformed(evt);
            }
        });
        PersonPanel.add(btn_SearchforExistingPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 210, 210, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Profiling.gif"))); // NOI18N
        PersonPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jTabbedPane1.addTab("Person", PersonPanel);

        PatientPanel.setBackground(new java.awt.Color(255, 255, 255));
        PatientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ExistingPatient.setBackground(new java.awt.Color(204, 0, 0));
        btn_ExistingPatient.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btn_ExistingPatient.setForeground(new java.awt.Color(255, 255, 255));
        btn_ExistingPatient.setText("Existing Patient");
        btn_ExistingPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExistingPatientActionPerformed(evt);
            }
        });
        PatientPanel.add(btn_ExistingPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, -1));

        btn_NewPatient.setBackground(new java.awt.Color(204, 0, 0));
        btn_NewPatient.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btn_NewPatient.setForeground(new java.awt.Color(255, 255, 255));
        btn_NewPatient.setText("New Patient");
        btn_NewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewPatientActionPerformed(evt);
            }
        });
        PatientPanel.add(btn_NewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Winning the battle against Coronavirus (1).gif"))); // NOI18N
        PatientPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 760, -1));

        jTabbedPane1.addTab("Clinic", PatientPanel);

        DashboardPanel.setBackground(new java.awt.Color(255, 255, 255));

        GraphSearchLabel.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        GraphSearchLabel.setText("Please Enter a ZipCode to view Abnormal cases in a community - ");

        btn_DisplayResult.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_DisplayResult.setText("Display result");
        btn_DisplayResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DisplayResultActionPerformed(evt);
            }
        });

        panelBarChart.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        txt_ComminityCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_ComminityCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ComminityCodeActionPerformed(evt);
            }
        });

        btn_Refresh.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_Refresh.setText("Refresh");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });

        abonormalPatientsCount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community", "Total Abnormal Patients"
            }
        ));
        jScrollPane1.setViewportView(abonormalPatientsCount);

        GraphSearchLabel1.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        GraphSearchLabel1.setText("Please select a Vital Sign from the Drop Down to display Abnormal Cases - ");

        drpdwn_VitalSign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Temperature" }));

        btn_DisplayVitalResult.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_DisplayVitalResult.setText("Display result");
        btn_DisplayVitalResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DisplayVitalResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardPanelLayout.createSequentialGroup()
                        .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashboardPanelLayout.createSequentialGroup()
                        .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GraphSearchLabel)
                            .addComponent(GraphSearchLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ComminityCode, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(drpdwn_VitalSign, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashboardPanelLayout.createSequentialGroup()
                                .addComponent(btn_DisplayResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Refresh))
                            .addComponent(btn_DisplayVitalResult))))
                .addGap(622, 622, 622))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GraphSearchLabel)
                    .addComponent(btn_DisplayResult)
                    .addComponent(txt_ComminityCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Refresh))
                .addGap(14, 14, 14)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GraphSearchLabel1)
                    .addComponent(drpdwn_VitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DisplayVitalResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBarChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );

        jTabbedPane1.addTab("Dashboard", DashboardPanel);

        bottom_panel.add(jTabbedPane1, "card2");

        splitPane.setRightComponent(bottom_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SearchforExistingPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchforExistingPersonActionPerformed
        // TODO add your handling code here:\
        ViewPersonJPanel viewpersonpanel = new ViewPersonJPanel(bottom_panel, PRD);
        bottom_panel.add("ViewPersonJPanel", viewpersonpanel);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);
    }//GEN-LAST:event_btn_SearchforExistingPersonActionPerformed

    private void btn_CreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreatePersonActionPerformed
        // TODO add your handling code here:
        CreateNewPersonJPanel createnewpersonpanel = new CreateNewPersonJPanel(bottom_panel, person, PRD, PCA);
        bottom_panel.add("CreateNewPersonJPanel", createnewpersonpanel);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);
    }//GEN-LAST:event_btn_CreatePersonActionPerformed

    private void btn_NewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewPatientActionPerformed
        // TODO add your handling code here:
        NewPatient newpatientpanel = new NewPatient(bottom_panel, PRD);
        bottom_panel.add("NewPatient", newpatientpanel);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);
    }//GEN-LAST:event_btn_NewPatientActionPerformed

    private void btn_ExistingPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExistingPatientActionPerformed
        // TODO add your handling code here:
        String UserInput = JOptionPane.showInputDialog("Please Enter the UniqueID of patient");
        for (Person pr : PRD.getPersonDirectory()) {
            if (pr.getPersonUniqueID().equalsIgnoreCase(UserInput)) {
                System.out.println("inside loop person found");
                Patient patient = pr.getPatient();
                System.out.println(patient);
                System.out.println(patient.getPatientID());

                try {
                    if (!patient.getPatientID().isEmpty()) {
                        ExistingPatientJPanel existingpatientpanel = new ExistingPatientJPanel(bottom_panel, pr, PRD, UserInput, PCA);
                        bottom_panel.add("ExistingPatientJPanel", existingpatientpanel);
                        CardLayout layout = (CardLayout) bottom_panel.getLayout();
                        layout.next(bottom_panel);
                    }
                } catch (NullPointerException npe) {
                    JOptionPane.showMessageDialog(null, "Patient with Unique ID " + UserInput + " Not Found, please register the Patient and then continue.");
                }

                //                if (patient.getPatientID().isEmpty()) {
                //                    ExistingPatientJPanel existingpatientpanel = new ExistingPatientJPanel(bottom_panel, pr, PRD, UserInput);
                //                    bottom_panel.add("ExistingPatientJPanel", existingpatientpanel);
                //                    CardLayout layout = (CardLayout) bottom_panel.getLayout();
                //                    layout.next(bottom_panel);
                //                } else {
                //                    JOptionPane.showMessageDialog(null, "Patient with Unique ID " + UserInput + " Not Found, please register the Patient and then continue.");
                //                }
            }
        }

        //        for (Map.Entry<String, person> entry : hash.
        //        for (Person person : patientDirectory.getPatientDirectory())
        //        {
        //            if (person.getUniqueID().equalsIgnoreCase(UserInput)){
        //                ExistingPatientJPanel existingpatientpanel = new ExistingPatientJPanel(bottom_panel, person);
        //                bottom_panel.add("ExistingPatientJPanel", existingpatientpanel);
        //                CardLayout layout = (CardLayout) bottom_panel.getLayout();
        //                layout.next(bottom_panel);
        //            } else {
        //                JOptionPane.showMessageDialog(null, "Patient with Last Name:"+UserInput+" Not Found, please register the Patient and then continue.");
        //            }
        //
        //        }
    }//GEN-LAST:event_btn_ExistingPatientActionPerformed

    private void btn_DisplayResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DisplayResultActionPerformed
        // TODO add your handling code here:
//        
//        if (processFlag == true){
//            showPieChart2();
//        }
//        showPieChart2();
        refreshFlag = false;
        showPieChart1();
        populateFilteredTable();

    }//GEN-LAST:event_btn_DisplayResultActionPerformed

    private void txt_ComminityCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ComminityCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ComminityCodeActionPerformed

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        // TODO add your handling code here:
        refreshFlag = true;
        showPieChart1();
//        if (processFlag == true){
//            showPieChart2();
//        }
//        showPieChart2();
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void btn_DisplayVitalResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DisplayVitalResultActionPerformed
        // TODO add your handling code here:
        SelectedVital = drpdwn_VitalSign.getSelectedItem().toString();
        int errorCode = assignCodetoVitals();
        errorCodeVital = errorCode;
        setFilteredBsa();
        populateVitalFilteredTable();
        
    }//GEN-LAST:event_btn_DisplayVitalResultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JLabel GraphSearchLabel;
    private javax.swing.JLabel GraphSearchLabel1;
    private javax.swing.JPanel PatientPanel;
    private javax.swing.JPanel PersonPanel;
    private javax.swing.JTable abonormalPatientsCount;
    private javax.swing.JPanel bottom_panel;
    private javax.swing.JButton btn_CreatePerson;
    private javax.swing.JButton btn_DisplayResult;
    private javax.swing.JButton btn_DisplayVitalResult;
    private javax.swing.JButton btn_ExistingPatient;
    private javax.swing.JButton btn_NewPatient;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_SearchforExistingPerson;
    private javax.swing.JComboBox<String> drpdwn_VitalSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel top_panel;
    private javax.swing.JTextField txt_ComminityCode;
    // End of variables declaration//GEN-END:variables

//    private void showPieChart() {
//        boolean Abnormalflag = false;
//        String communityCode;
//        int noOfAbnormalCases = 0;
//        int CommunityCode;
////        int CommunityCode_input = 0;
//        this.person = new Person();
////        String Status
//
//        ArrayList ZipCodeList = new ArrayList();
//        DefaultPieDataset barDataset = new DefaultPieDataset();
////        if (txt_ComminityCode.getText() != ""){
////            CommunityCode_input = Integer.parseInt(txt_ComminityCode.getText());
////        }                
//        System.out.println(person.getPersonZipCode());
////        try {
//        for (Person person : PRD.getPersonDirectory()) {
//            System.out.println(person.getPersonZipCode());
//            CommunityCode = Integer.parseInt(person.getPersonZipCode());
////            if (CommunityCode == CommunityCode_input) {
//              if (CommunityCode == txt_ComminityCode.getText()){
//                ArrayList<VitalSign> vitalSignList = person.getPatient().getVitalSignHistory().getHistory();
//                for (VitalSign vitalsign : vitalSignList) {
////                    Status = "Abnormal Vital Signs";
//                    if (vitalsign.getStatus() == "Abnormal Vital Signs") {
//                        Abnormalflag = true;
//                        System.out.println(Abnormalflag);
//                        System.out.println("Abnormal records found");
//                    } else {
//                        Abnormalflag = false;
//                        System.out.println(Abnormalflag);
//                        System.out.println("Abnormal records not found");
//                    }
//                }
//                if (Abnormalflag == true && noOfAbnormalCases == 0) {
//                    noOfAbnormalCases = 1;
//                } else if (Abnormalflag == true && noOfAbnormalCases != 0) {
//                    noOfAbnormalCases = noOfAbnormalCases + 1;
//                }
//
//            }
//            barDataset.setValue(txt_ComminityCode.getText(), noOfAbnormalCases);
//        }
////        }
////        catch(NullPointerException npe){
//////            JOptionPane.showInputDialog("No Patient Records found, please sign in a patient and then check back.");
////              txt_ComminityCode.setText("");
////              barDataset.setValue("", new Double(0));
////        }
//
////      barDataset.setValue( txt_ComminityCode.getText() ,  );  
////        barDataset.setValue("IPhone 5s", new Double(20));
////        barDataset.setValue("SamSung Grand", new Double(20));
////        barDataset.setValue("MotoG", new Double(40));
////        barDataset.setValue("Nokia Lumia", new Double(10));
//
//        //create chart
//        JFreeChart piechart = ChartFactory.createPieChart("Abnormal Cases Report", barDataset, false, true, false);//explain
//
//        PiePlot piePlot = (PiePlot) piechart.getPlot();
//
//        //changing pie chart blocks colors
////        piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
////        piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
////        piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
////        piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));
//
//        piePlot.setBackgroundPaint(Color.white);
//
//        //create chartPanel to display chart(graph)
//        ChartPanel barChartPanel = new ChartPanel(piechart);
//        panelBarChart.removeAll();
//        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
//        panelBarChart.validate();
//    }
    private void showPieChart1() {

        boolean Abnormalflag = false;
        int noOfAbnormalCases = 1;
        Integer cmp_ZipCode1 = 0;
        Integer cmp_ZipCode2 = 0;
        total = 0;
        processFlag = false;

        setCountZeroForBsa();
        consideredFlag = false;

        for (Person person : PRD.getPersonDirectory()) {
            ArrayList<VitalSign> vitalSignList = person.getPatient().getVitalSignHistory().getHistory();
            for (VitalSign vitalsign : vitalSignList) {
                if (vitalsign.getStatus() == "Abnormal Vital Signs") {
                    Abnormalflag = true;
                    consideredFlag = true;
                } else {
                    Abnormalflag = false;
                }
                this.bsa = new barChartAtrributes();

                try {
//            noOfAbnormalCases = bsa.getNoofAbnormalCases();
//            if (Abnormalflag == true && noOfAbnormalCases == 0) {
//                noOfAbnormalCases = 1;
//            } else if (Abnormalflag == true && noOfAbnormalCases != 0) {
//                noOfAbnormalCases = noOfAbnormalCases + 1;
//            }
//            if (Abnormalflag == true) {
//                barChartAtrributes bsa1 = PCA.addNewRow();
//                bsa.setZipCode(person.getPersonZipCode());
//                bsa.setNoofAbnormalCases(noOfAbnormalCases);
//        }

                    for (barChartAtrributes bsa : PCA.getPieChartList()) {
                        System.out.println(person.getPersonZipCode());
                        System.out.println(bsa.getZipCode());
                        cmp_ZipCode1 = Integer.parseInt(person.getPersonZipCode());
                        cmp_ZipCode2 = Integer.parseInt(bsa.getZipCode());
                        if ((person.getPersonZipCode() == bsa.getZipCode()) && Abnormalflag == true) {
                            noOfAbnormalCases = bsa.getNoofAbnormalCases();
//                            PCA.deleteRow(bsa);
//                            barChartAtrributes bsa1 = new barChartAtrributes();
//                            bsa.setZipCode(person.getPersonZipCode());
//                            System.out.println();
                            noOfAbnormalCases = noOfAbnormalCases + 1;
                            bsa.setNoofAbnormalCases(noOfAbnormalCases);
                            total = total + 1;
                            processFlag = true;
                        }

//                        } else if ((person.getPersonZipCode() != bsa.getZipCode()) && Abnormalflag == true) {
//                            ZipCode = person.getPersonZipCode();
//                            addNewRowflag = true;
//                        }
                    }

                } catch (NullPointerException npe) {
                    System.out.println("bsa is null");
                }
            }
            if (refreshFlag == true) {
                showPieChart2();
            }

        }

    }

    private void showPieChart2() {
        DefaultPieDataset barDataset = new DefaultPieDataset();
//        String[] Zip
        color = "204,0,204";
        color_coordinate1 = 204;
        color_coordinate2 = 0;
        color_coordinate3 = 204;
        for (barChartAtrributes bsa : PCA.getPieChartList()) {
            percentage = (bsa.getNoofAbnormalCases() / total) * 100;
            barDataset.setValue(bsa.getZipCode(), percentage);
//            int a = bsa.getNoofAbnormalCases();
//            percentage = (a / total) * 100;

//            color_coordinate = color_coordinate - 20;
//            color = "204,0,"+color_coordinate.toString();
        }

        JFreeChart piechart = ChartFactory.createPieChart3D("Abnormal Cases Report", barDataset, true, true, false);//explain

//        piechart.get
        PiePlot piePlot = (PiePlot) piechart.getPlot();
        for (barChartAtrributes bsa : PCA.getPieChartList()) {
            color_coordinate1 = color_coordinate1 - 30;
            color_coordinate2 = color_coordinate2 + 10;
            color_coordinate3 = color_coordinate3 - 20;
            piePlot.setSectionPaint(bsa.getZipCode(), new Color(color_coordinate1, color_coordinate2, color_coordinate3));
        }
        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
        populateAbnormalPatientsCountTable();
    }

    private void addNewRow() {
        barChartAtrributes bsa1 = PCA.addNewRow();
        bsa1.setZipCode(ZipCode);
        bsa1.setNoofAbnormalCases(1);
    }

    private void populateAbnormalPatientsCountTable() {
        DefaultTableModel model = (DefaultTableModel) abonormalPatientsCount.getModel();
        model.setRowCount(0);

        for (barChartAtrributes bsa : PCA.getPieChartList()) {
            Object[] row = new Object[2];
            row[0] = bsa;
            row[1] = bsa.getNoofAbnormalCases();
            model.addRow(row);
        }
    }

    private void setCountZeroForBsa() {
        for (barChartAtrributes bsa : PCA.getPieChartList()) {
            bsa.setNoofAbnormalCases(0);
        }
    }

    private void populateFilteredTable() {
        Integer zipCode1;
        Integer zipCode2;

        DefaultTableModel model = (DefaultTableModel) abonormalPatientsCount.getModel();
        model.setRowCount(0);

        for (barChartAtrributes bsa : PCA.getPieChartList()) {
            System.out.println("Filtered Validations");
            System.out.println(txt_ComminityCode.getText());
            System.out.println(bsa.getZipCode());
            zipCode1 = Integer.parseInt(bsa.getZipCode());
            zipCode2 = Integer.parseInt(txt_ComminityCode.getText());
            if (zipCode1.equals(zipCode2)) {
                Object[] row = new Object[2];
                row[0] = bsa;
                row[1] = bsa.getNoofAbnormalCases();
                model.addRow(row);
            }

        }
    }
    
    private void populateVitalFilteredTable() {
        Integer zipCode1;
        Integer zipCode2;

        DefaultTableModel model = (DefaultTableModel) abonormalPatientsCount.getModel();
        model.setRowCount(0);

        for (barChartAtrributes bsa : PCA.getPieChartList()) {
                Object[] row = new Object[2];
                row[0] = bsa;
                row[1] = bsa.getNoofAbnormalCases();
                model.addRow(row);
            }

        }
    

    private int assignCodetoVitals() {
        int errorCode=0;
    
        if (SelectedVital == "Respiratory Rate"){
            errorCode = 1;
        } else if (SelectedVital == "Heart Rate"){
            errorCode = 2;
        } else if (SelectedVital == "Blood Pressure"){
            errorCode = 3;
        } else if (SelectedVital == "Temperature"){
            errorCode = 4;
        }
        
        return errorCode;

    }
    
    private void setFilteredBsa() {

        boolean Abnormalflag = false;
        int noOfAbnormalCases = 1;
        Integer cmp_ZipCode1 = 0;
        Integer cmp_ZipCode2 = 0;
        total = 0;
        processFlag = false;

        setCountZeroForBsa();
        consideredFlag = false;

        for (Person person : PRD.getPersonDirectory()) {
            ArrayList<VitalSign> vitalSignList = person.getPatient().getVitalSignHistory().getHistory();
            Abnormalflag = false;
            for (VitalSign vitalsign : vitalSignList) {
                switch(errorCodeVital){
                    case 1:
                        if (vitalsign.isAbnormalRespiratoryRate() == true){
                            Abnormalflag = true;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (vitalsign.isAbnormalHeartRate() == true){
                            Abnormalflag = true;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (vitalsign.isAbnormalBloodPressure() == true){
                            Abnormalflag = true;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (vitalsign.isAbnormalTemperature() == true){
                            Abnormalflag = true;
                            break;
                        } else {
                            break;
                        }
                    default :
                        break;
                }
                this.bsa = new barChartAtrributes();

                try {
//            noOfAbnormalCases = bsa.getNoofAbnormalCases();
//            if (Abnormalflag == true && noOfAbnormalCases == 0) {
//                noOfAbnormalCases = 1;
//            } else if (Abnormalflag == true && noOfAbnormalCases != 0) {
//                noOfAbnormalCases = noOfAbnormalCases + 1;
//            }
//            if (Abnormalflag == true) {
//                barChartAtrributes bsa1 = PCA.addNewRow();
//                bsa.setZipCode(person.getPersonZipCode());
//                bsa.setNoofAbnormalCases(noOfAbnormalCases);
//        }

                    for (barChartAtrributes bsa : PCA.getPieChartList()) {
                        System.out.println(person.getPersonZipCode());
                        System.out.println(bsa.getZipCode());
                        cmp_ZipCode1 = Integer.parseInt(person.getPersonZipCode());
                        cmp_ZipCode2 = Integer.parseInt(bsa.getZipCode());
                        if ((person.getPersonZipCode() == bsa.getZipCode()) && Abnormalflag == true) {
                            noOfAbnormalCases = bsa.getNoofAbnormalCases();
//                            PCA.deleteRow(bsa);
//                            barChartAtrributes bsa1 = new barChartAtrributes();
//                            bsa.setZipCode(person.getPersonZipCode());
//                            System.out.println();
                            noOfAbnormalCases = noOfAbnormalCases + 1;
                            bsa.setNoofAbnormalCases(noOfAbnormalCases);
                            total = total + 1;
                            processFlag = true;
                        }

//                        } else if ((person.getPersonZipCode() != bsa.getZipCode()) && Abnormalflag == true) {
//                            ZipCode = person.getPersonZipCode();
//                            addNewRowflag = true;
//                        }
                    }

                } catch (NullPointerException npe) {
                    System.out.println("bsa is null");
                }
            }
        }

    }
}