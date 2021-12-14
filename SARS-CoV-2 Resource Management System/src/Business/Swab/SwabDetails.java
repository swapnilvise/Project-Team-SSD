/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Swab;

/**
 *
 * @author swapn
 */
public class SwabDetails {
    private String SwabID;
    private String SwabCollectionDate;
    private String SwabCollectionTime;
    private String SwabCollectedBy;
    private static int count = 1;
    
    public SwabDetails() {
        count++;
        this.SwabID= "S"+String.valueOf(count);
    }

    public String getSwabID() {
        return SwabID;
    }

    public void setSwabID(String SwabID) {
        this.SwabID = SwabID;
    }

    public String getSwabCollectionDate() {
        return SwabCollectionDate;
    }

    public void setSwabCollectionDate(String SwabCollectionDate) {
        this.SwabCollectionDate = SwabCollectionDate;
    }

    public String getSwabCollectionTime() {
        return SwabCollectionTime;
    }

    public void setSwabCollectionTime(String SwabCollectionTime) {
        this.SwabCollectionTime = SwabCollectionTime;
    }

    public String getSwabCollectedBy() {
        return SwabCollectedBy;
    }

    public void setSwabCollectedBy(String SwabCollectedBy) {
        this.SwabCollectedBy = SwabCollectedBy;
    }
    
    
    
}
