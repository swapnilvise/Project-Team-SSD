/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author swapn
 */
public class barChartAtrributes {
    
    private String ZipCode;
    private Integer NoofAbnormalCases;
    

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public Integer getNoofAbnormalCases() {
        return NoofAbnormalCases;
    }

    public void setNoofAbnormalCases(Integer NoofAbnormalCases) {
        this.NoofAbnormalCases = NoofAbnormalCases;
    }

    

    
    
    
    
    @Override
    public String toString()
    {
        return this.ZipCode;
    }
    
}
