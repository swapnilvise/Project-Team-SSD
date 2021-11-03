/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Patient;
import Model.Person;
import Model.PieChartArray;
import Model.VitalSign;
import Model.barChartAtrributes;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author swapn
 */
public class CheckCurrentVitals extends javax.swing.JPanel {

    private JPanel bottom_panel;
    Person person;
    Patient patient;
    VitalSign vs;
    PieChartArray PCA;
    String ageGroup;
    Integer RespiratoryRate;
    Integer HeartRate;
    Integer BloodPressure;
    double Weight;
    double Temperature;
    boolean AbnormalRespiratoryRate;
    boolean AbnormalHeartRate;
    boolean AbnormalBloodPressure;
    boolean AbnormalWeight;
    boolean highTemperatureFlag;
    String Status;

    /**
     * Creates new form ViewPreviousVitalsJPanel
     */
    public CheckCurrentVitals(JPanel bottom_panel, Person person, PieChartArray PCA) {
        initComponents();
        this.bottom_panel = bottom_panel;
        this.person = person;
        this.patient = person.getPatient();
        this.PCA = PCA;
        this.vs = new VitalSign();
        txt_PatientName.setText(person.getPersonLastName() + ", " + person.getPersonFirstName());
        decideAgeGroup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Title = new javax.swing.JLabel();
        lbl_PatientName = new javax.swing.JLabel();
        txt_PatientName = new javax.swing.JTextField();
        txt_RespiratoryRate = new javax.swing.JTextField();
        lbl_PatientName1 = new javax.swing.JLabel();
        txt_HeartRate = new javax.swing.JTextField();
        lbl_PatientName2 = new javax.swing.JLabel();
        txt_BloodPressure = new javax.swing.JTextField();
        lbl_PatientName3 = new javax.swing.JLabel();
        txt_Weight = new javax.swing.JTextField();
        lbl_PatientName4 = new javax.swing.JLabel();
        lbl_PatientName5 = new javax.swing.JLabel();
        txt_Temperature = new javax.swing.JTextField();
        btn_Save1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Status = new javax.swing.JTextField();
        btn_Check = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Title.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("CHECK CURRENT VITALS");
        lbl_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 1364, 33));

        lbl_PatientName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_PatientName.setText("Patient Name : ");
        add(lbl_PatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, -1, -1));

        txt_PatientName.setEditable(false);
        txt_PatientName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(txt_PatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 195, -1));

        txt_RespiratoryRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_RespiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RespiratoryRateActionPerformed(evt);
            }
        });
        add(txt_RespiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 195, -1));

        lbl_PatientName1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_PatientName1.setText("Respiratory Rate : ");
        add(lbl_PatientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        txt_HeartRate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_HeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HeartRateActionPerformed(evt);
            }
        });
        add(txt_HeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 300, 195, -1));

        lbl_PatientName2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_PatientName2.setText("Heart Rate : ");
        add(lbl_PatientName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        txt_BloodPressure.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_BloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BloodPressureActionPerformed(evt);
            }
        });
        add(txt_BloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 195, -1));

        lbl_PatientName3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_PatientName3.setText("Blood Pressure : ");
        add(lbl_PatientName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, -1));

        txt_Weight.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add(txt_Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 195, -1));

        lbl_PatientName4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_PatientName4.setText("Weight (in lbs) : ");
        add(lbl_PatientName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, -1, -1));

        lbl_PatientName5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_PatientName5.setText("Temperature (in °F) : ");
        add(lbl_PatientName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, -1, -1));

        txt_Temperature.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_Temperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TemperatureActionPerformed(evt);
            }
        });
        add(txt_Temperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 420, 195, -1));

        btn_Save1.setBackground(new java.awt.Color(204, 0, 0));
        btn_Save1.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btn_Save1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save1.setText("Go Back");
        btn_Save1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Save1ActionPerformed(evt);
            }
        });
        add(btn_Save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 87, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Status : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, -1, -1));

        txt_Status.setEditable(false);
        txt_Status.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        txt_Status.setForeground(new java.awt.Color(255, 0, 51));
        txt_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StatusActionPerformed(evt);
            }
        });
        add(txt_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 195, -1));

        btn_Check.setBackground(new java.awt.Color(204, 0, 0));
        btn_Check.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btn_Check.setForeground(new java.awt.Color(255, 255, 255));
        btn_Check.setText("Check");
        btn_Check.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckActionPerformed(evt);
            }
        });
        add(btn_Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 510, 87, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Medicine (1).gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RespiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RespiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RespiratoryRateActionPerformed

    private void txt_BloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BloodPressureActionPerformed

    private void txt_TemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TemperatureActionPerformed

    private void txt_HeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HeartRateActionPerformed

    private void btn_Save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Save1ActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);
    }//GEN-LAST:event_btn_Save1ActionPerformed

    private void txt_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StatusActionPerformed

    private void btn_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckActionPerformed
        // TODO add your handling code here:
        JOptionPane message = new JOptionPane();

        int errorCode = 0;

        validateVitals();
        switch (errorCode) {
            case 1:
                message.showMessageDialog(this,
                        "Please enter values against all the vital signs");
                break;
            case 2:
                message.showMessageDialog(this,
                        "Respiratory Rate is the number of breaths you take per minute and can only be numeric");
                break;
            case 3:
                message.showMessageDialog(this,
                        "Heart Rate is the number of times your heart beats per minute and can only be numeric");
                break;
            case 4:
                message.showMessageDialog(this,
                        "Blood Pressure can only be numeric");
                break;
            case 5:
                message.showMessageDialog(this,
                        "Weight can only be numeric");
                break;
            case 6:
                message.showMessageDialog(this,
                        "Temperature can only be numeric");
                break;
//            case 7:
//                txt_Status.setText("Abnormal Respiratory Rate");
//                break;
//            case 8:
//                txt_Status.setText("Abnormal Heart Rate");
//                break;
//            case 9:
//                txt_Status.setText("Abnormal Blood Pressure");
//                break;
//            case 10:
//                txt_Status.setText("High Temperature");
//                break;
            default:

        }

        checkIfPatientIsNormal();
        VitalSign vitalsign = patient.getVitalSignHistory().createAndAddVitalSign();
        vitalsign.setRespiratoryRate(RespiratoryRate);
        vitalsign.setHeartRate(HeartRate);
        vitalsign.setBloodPressure(BloodPressure);
        vitalsign.setWeight(Weight);
        vitalsign.setTemperature(Temperature);
        vitalsign.setStatus(Status);
        vitalsign.setAbnormalRespiratoryRate(AbnormalRespiratoryRate);
        vitalsign.setAbnormalHeartRate(AbnormalHeartRate);
        vitalsign.setAbnormalBloodPressure(AbnormalBloodPressure);
        vitalsign.setAbnormalWeight(AbnormalWeight);
        vitalsign.setAbnormalTemperature(highTemperatureFlag);
        vitalsign.setTimestamp(new Date());
        if (Status == "Normal Vital Signs"){
            message.showMessageDialog(this, "Vital Signs for " + txt_PatientName.getText() + " has been captured.");
        } else {
            message.showMessageDialog(this, "Vital Signs for " + txt_PatientName.getText() + " has been captured with abnormalities.");
        }
//        barChartAtrributes bsa1 = PCA.addNewRow();
//        bsa1.setZipCode(person.getPersonZipCode());
//        bsa1.setNoofAbnormalCases(1);
    }//GEN-LAST:event_btn_CheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Check;
    private javax.swing.JButton btn_Save1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_PatientName;
    private javax.swing.JLabel lbl_PatientName1;
    private javax.swing.JLabel lbl_PatientName2;
    private javax.swing.JLabel lbl_PatientName3;
    private javax.swing.JLabel lbl_PatientName4;
    private javax.swing.JLabel lbl_PatientName5;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JTextField txt_BloodPressure;
    private javax.swing.JTextField txt_HeartRate;
    private javax.swing.JTextField txt_PatientName;
    private javax.swing.JTextField txt_RespiratoryRate;
    private javax.swing.JTextField txt_Status;
    private javax.swing.JTextField txt_Temperature;
    private javax.swing.JTextField txt_Weight;
    // End of variables declaration//GEN-END:variables

    private void validateVitals() {
        int errorCode = 0;
        int RespiratoryRate;
        int HeartRate;
        int BloodPressure;
        int Weight;
        double Temperature;

        RespiratoryRate = Integer.parseInt(txt_RespiratoryRate.getText());
        HeartRate = Integer.parseInt(txt_HeartRate.getText());
        BloodPressure = Integer.parseInt(txt_BloodPressure.getText());
        Weight = Integer.parseInt(txt_Weight.getText());
        Temperature = Integer.parseInt(txt_Temperature.getText());

        if (txt_RespiratoryRate.getText().isEmpty() | txt_HeartRate.getText().isEmpty() | txt_BloodPressure.getText().isEmpty() | txt_Weight.getText().isEmpty() | txt_Temperature.getText().isEmpty()) {
            errorCode = 1;
        } else if (!Pattern.matches("\\d{2}", txt_RespiratoryRate.getText())) {
            errorCode = 2;
        } else if (!Pattern.matches("\\d", txt_HeartRate.getText())) {
            errorCode = 3;
        } else if (!Pattern.matches("\\d", txt_BloodPressure.getText())) {
            errorCode = 4;
        } else if (!Pattern.matches("\\d", txt_Weight.getText())) {
            errorCode = 5;
        } else if (!Pattern.matches("\\d", txt_Temperature.getText())) {
            errorCode = 6;
//        } else if (RespiratoryRate < 12 | RespiratoryRate > 20){
//            errorCode = 7;
//        } else if (HeartRate < 60 | HeartRate > 100){
//            errorCode = 8;
//        } else if (BloodPressure > 120){
//            errorCode = 9;
//        } else if (Temperature > 99.0){
//            errorCode = 10;
        }

    }

    private void decideAgeGroup() {
        if (person.getPersonAge() < 1) {
            ageGroup = "Newborn";
        } else if (person.getPersonAge() >= 0 & this.person.getPersonAge() < 12) {
            this.ageGroup = "Infant";
        } else if (this.person.getPersonAge() >= 1 & this.person.getPersonAge() < 3) {
            this.ageGroup = "Toddler";
        } else if (this.person.getPersonAge() >= 3 & this.person.getPersonAge() < 5) {
            this.ageGroup = "Preschooler";
        } else if (this.person.getPersonAge() >= 6 & this.person.getPersonAge() < 12) {
            this.ageGroup = "SchoolAge";
        } else if (this.person.getPersonAge() >= 12) {
            this.ageGroup = "Adolescent";
        }
    }

    private void checkIfPatientIsNormal() {
        JOptionPane message = new JOptionPane();
        boolean errorCode = true;
        RespiratoryRate = Integer.parseInt(txt_RespiratoryRate.getText());
        HeartRate = Integer.parseInt(txt_HeartRate.getText());
        BloodPressure = Integer.parseInt(txt_BloodPressure.getText());
        Weight = Double.parseDouble(txt_Weight.getText());
        Temperature = Double.parseDouble(txt_Temperature.getText());

//        this.highTempratureFlag=false;
//        
//        if(this.encounterHistory.getEncounters().size()>0){
//            
//            VitalSigns_old currentVitals= 
//                this.encounterHistory.getEncounters().get(
//                        this.encounterHistory.getEncounters().size()-1).getVitalsigns();
        switch (ageGroup) {
            case "Newborn":
                if (RespiratoryRate >= 68) {
//                    message.showMessageDialog(this, "Respiratory Rate Critical!");
                    AbnormalRespiratoryRate = true;
                    errorCode = false;
                }
                if (Temperature > 98) {
                    highTemperatureFlag = true;
                }
                
                if (!(RespiratoryRate >= 30 && RespiratoryRate <= 50)) {
                    errorCode = false;
                    AbnormalRespiratoryRate = true;
//                    message.showMessageDialog(this, "Abnormal Respiratory Rate");
                }
                if (!(HeartRate >= 120 && HeartRate <= 160)) {
//                    message.showMessageDialog(this, "Abnormal Heart Rate");
                    errorCode = false;
                    AbnormalHeartRate = true;
                }
                if (!(Weight >= 4.40925 && Weight <= 3)) {
//                    message.showMessageDialog(this, "Weight not within Range");
                    errorCode = false;
                    AbnormalWeight = true;
                }
                if (!(BloodPressure >= 50 && BloodPressure <= 70)) {
                    errorCode = false;
                    AbnormalBloodPressure = true;
//                    message.showMessageDialog(this, "Abnormal Blood Pressure");
                }
                break;

            case "Infant":
                if (RespiratoryRate >= 41) {
//                    message.showMessageDialog(this, "Respiratory Rate Critical!");
                    AbnormalRespiratoryRate = true;
                    errorCode =  false;
                }
                if (Temperature > 98) {
                    highTemperatureFlag = true;
                }
                if (!(RespiratoryRate >= 20 && RespiratoryRate <= 30)) {
                    errorCode = false;
                    AbnormalRespiratoryRate = true;
//                    message.showMessageDialog(this, "Abnormal Respiratory Rate");
                }
                if (!(HeartRate >= 80 && HeartRate <= 140)) {
                    errorCode = false;
                    AbnormalHeartRate = true;
//                    message.showMessageDialog(this, "Abnormal Heart Rate");
                }
                if (!(Weight >= 4 && Weight <= 10)) {
                    errorCode = false;
                    AbnormalWeight = true;
//                    message.showMessageDialog(this, "Weight not within Range");
                }
                if (!(BloodPressure >= 70 && BloodPressure <= 100)) {
                    errorCode = false;
                    AbnormalBloodPressure = true;
//                    message.showMessageDialog(this, "Abnormal Blood Pressure");
                }
                break;

            case "Toddler":
                if (RespiratoryRate >= 41) {
//                    message.showMessageDialog(this, "Respiratory Rate Critical!");
                    AbnormalRespiratoryRate = true;
                    errorCode = false;
                }
                if (Temperature > 98) {
                    highTemperatureFlag = true;
                }
                
                if (!(RespiratoryRate >= 20 && RespiratoryRate <= 30)) {
                    errorCode = false;
                    AbnormalRespiratoryRate = true;
//                    message.showMessageDialog(this, "Abnormal Respiratory Rate");
                }
                if (!(HeartRate >= 80 && HeartRate <= 130)) {
                    errorCode = false;
                    AbnormalHeartRate = true;
//                    message.showMessageDialog(this, "Abnormal Heart Rate");
                }
                if (!(Weight >= 10 && Weight <= 14)) {
                    errorCode = false;
                    AbnormalWeight = true;
//                    message.showMessageDialog(this, "Weight not within Range");
                }
                if (!(BloodPressure >= 80 && BloodPressure <= 110)) {
                    errorCode = false;
                    AbnormalBloodPressure = true;
//                    message.showMessageDialog(this, "Abnormal Blood Pressure");
                }
                break;

            case "Preschooler":
                if (RespiratoryRate >= 41) {
//                    message.showMessageDialog(this, "Respiratory Rate Critical!");
                    AbnormalRespiratoryRate = true;
                    errorCode = false;
                }
                if (Temperature > 98) {
                    highTemperatureFlag = true;
                }
                
                if (!(RespiratoryRate >= 20 && RespiratoryRate <= 30)) {
                    errorCode = false;
                    AbnormalRespiratoryRate = true;
//                    message.showMessageDialog(this, "Abnormal Respiratory Rate");
                }
                if (!(HeartRate >= 80 && HeartRate <= 120)) {
                    errorCode = false;
                    AbnormalHeartRate = true;
//                    message.showMessageDialog(this, "Abnormal Heart Rate");
                }
                if (!(Weight >= 14 && Weight <= 18)) {
                    errorCode = false;
                    AbnormalWeight = true;
//                    message.showMessageDialog(this, "Weight not within Range");
                }
                if (!(BloodPressure >= 80 && BloodPressure <= 110)) {
                    errorCode = false;
                    AbnormalBloodPressure = true;
//                    message.showMessageDialog(this, "Abnormal Blood Pressure");
                }
                break;

            case "SchoolAge":
                if (RespiratoryRate >= 41) {
//                    message.showMessageDialog(this, "Respiratory Rate Critical!");
                    AbnormalRespiratoryRate = true;
                    errorCode = false;
                }
                if (Temperature > 98) {
                    highTemperatureFlag = true;
                }
                if (!(RespiratoryRate >= 20 && RespiratoryRate <= 30)) {
                    errorCode = false;
                    AbnormalRespiratoryRate = true;
//                    message.showMessageDialog(this, "Abnormal Respiratory Rate");
                }
                if (!(HeartRate >= 70 && HeartRate <= 110)) {
                    errorCode = false;
                    AbnormalHeartRate = true;
//                    message.showMessageDialog(this, "Abnormal Heart Rate");
                }
                if (!(Weight >= 20 && Weight <= 42)) {
                    errorCode = false;
                    AbnormalWeight = true;
//                    message.showMessageDialog(this, "Weight not within Range");
                }
                if (!(BloodPressure >= 80 && BloodPressure <= 120)) {
                    errorCode = false;
                    AbnormalBloodPressure = true;
//                    message.showMessageDialog(this, "Abnormal Blood Pressure");
                }
                break;

            case "Adolescent":
                if (RespiratoryRate >= 28) {
//                    message.showMessageDialog(this, "Respiratory Rate Critical!");
                    AbnormalRespiratoryRate = true;
                    errorCode = false;
                }
                if (Temperature > 98) {
                    highTemperatureFlag = true;
                }
                if (!(RespiratoryRate >= 12 && RespiratoryRate <= 20)) {
                    errorCode = false;
                    AbnormalRespiratoryRate = true;
//                    message.showMessageDialog(this, "Abnormal Respiratory Rate");
                }
                if (!(HeartRate >= 55 && HeartRate <= 105)) {
                    errorCode = false;
                    AbnormalHeartRate = true;
//                    message.showMessageDialog(this, "Abnormal Heart Rate");
                }
                if (!(Weight >= 50)) {
                    errorCode = false;
                    AbnormalWeight = true;
//                    message.showMessageDialog(this, "Weight not within Range");
                }
                if (!(BloodPressure >= 110 && BloodPressure <= 120)) {
                    errorCode = false;
                    AbnormalBloodPressure = true;
//                    message.showMessageDialog(this, "Abnormal Blood Pressure");
                }
                break;

            default:
                message.showMessageDialog(this, "Check age group!");
                errorCode = false;

        }
//        }
//        else{
//            System.out.println("Create new vital sign.");
//            errorCode=false;
//        }
        if (AbnormalRespiratoryRate == true | AbnormalHeartRate == true | highTemperatureFlag == true | AbnormalBloodPressure == true | AbnormalWeight == true){
            Status = "Abnormal Vital Signs";
        } else {
            txt_Status.setCaretColor(Color.green);
            Status = "Normal Vital Signs";
        }
        
        txt_Status.setText(Status);
//        return errorCode;

    }

    
}
