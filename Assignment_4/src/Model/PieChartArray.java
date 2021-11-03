/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author swapn
 */
public class PieChartArray {
    
    private ArrayList<barChartAtrributes> PieChartList;

    public PieChartArray(){
        this.PieChartList = new ArrayList<>();
    }

    public ArrayList<barChartAtrributes> getPieChartList() {
        return PieChartList;
    }

    public void setPieChartList(ArrayList<barChartAtrributes> PieChartList) {
        this.PieChartList = PieChartList;
    }  
    
    public barChartAtrributes addNewRow(){
        barChartAtrributes bsa =new barChartAtrributes();
        this.PieChartList.add(bsa);
        return bsa;
    }
    
    public void deleteRow(barChartAtrributes bsa){
        PieChartList.remove(bsa);
        return;
    }
    
    public void bCAList(){
        barChartAtrributes bsa1 = new barChartAtrributes();
        bsa1.setZipCode("02120");
        bsa1.setNoofAbnormalCases(0);
        PieChartList.add(bsa1);
        
        barChartAtrributes bsa2 = new barChartAtrributes();
        bsa2.setZipCode("02125");
        bsa2.setNoofAbnormalCases(0);
        PieChartList.add(bsa2);
        
        barChartAtrributes bsa3 = new barChartAtrributes();
        bsa3.setZipCode("02130");
        bsa3.setNoofAbnormalCases(0);
        PieChartList.add(bsa3);
    }
    
}
