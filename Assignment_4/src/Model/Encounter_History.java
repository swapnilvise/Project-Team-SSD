package Model;

import java.util.ArrayList;
/**
 *
 * @author swapn
 */
public class Encounter_History {
    
    private ArrayList<VitalSign> history;
    
    public Encounter_History() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSign> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign createAndAddVitalSign() {
        VitalSign vitalsign = new VitalSign();
        history.add(vitalsign);
        return vitalsign;
    }
    
    public void deleteVitalSign(Encounters encounter) {
        history.remove(encounter);
    }
}
