/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Swab;

import Business.Student.Student;
import java.util.HashMap;

/**
 *
 * @author swapn
 */
public class SwabDirectory {
    
    private HashMap<String, SwabDetails> SwabCollectionList;

    public SwabDirectory() {
        this.SwabCollectionList=new HashMap<>();
    }
    
    //Find customer using customer id
    public SwabDetails findCollectedSwap(String SwabID){
        SwabDetails sd = this.SwabCollectionList.get(SwabID);
        if(sd==null)
            return null;
        return sd;
    }

    public HashMap<String, SwabDetails> getSwabCollectionList() {
        return SwabCollectionList;
    }
    
    //Creating new customer
    public SwabDetails newSwab(){
        SwabDetails sd = new SwabDetails();
        this.SwabCollectionList.put(sd.getSwabID(), sd);
        
        return this.SwabCollectionList.get(sd.getSwabID());
//        return c;
    }
    
    //Removing customer
    public void removeCollectedSwab(String swabID){
        this.SwabCollectionList.remove(this.SwabCollectionList.get(swabID));
    }
    
}
