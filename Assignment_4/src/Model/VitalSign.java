/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author swapn
 */
public class VitalSign {
    
    private Integer respiratoryRate;
    private Integer heartRate;
    private Integer bloodPressure;
    private double weight;
    private double temperature;
    private Integer height;
    private String Status;
    private Date timestamp;
    private boolean abnormalRespiratoryRate;
    private boolean abnormalHeartRate;
    private boolean abnormalBloodPressure;
    private boolean abnormalWeight;
    private boolean abnormalTemperature;

    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public boolean isAbnormalRespiratoryRate() {
        return abnormalRespiratoryRate;
    }

    public void setAbnormalRespiratoryRate(boolean abnormalRespiratoryRate) {
        this.abnormalRespiratoryRate = abnormalRespiratoryRate;
    }

    public boolean isAbnormalHeartRate() {
        return abnormalHeartRate;
    }

    public void setAbnormalHeartRate(boolean abnormalHeartRate) {
        this.abnormalHeartRate = abnormalHeartRate;
    }

    public boolean isAbnormalBloodPressure() {
        return abnormalBloodPressure;
    }

    public void setAbnormalBloodPressure(boolean abnormalBloodPressure) {
        this.abnormalBloodPressure = abnormalBloodPressure;
    }

    public boolean isAbnormalWeight() {
        return abnormalWeight;
    }

    public void setAbnormalWeight(boolean abnormalWeight) {
        this.abnormalWeight = abnormalWeight;
    }

    public boolean isAbnormalTemperature() {
        return abnormalTemperature;
    }

    public void setAbnormalTemperature(boolean abnormalTemperature) {
        this.abnormalTemperature = abnormalTemperature;
    }
    
    
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
    
}
