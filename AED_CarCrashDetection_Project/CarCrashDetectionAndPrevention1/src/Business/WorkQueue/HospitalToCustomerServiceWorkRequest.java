/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Mrunalini
 */
public class HospitalToCustomerServiceWorkRequest extends WorkRequest {

    private String lifeSaved;
    private String injuryDescription;
    private String condition;

    public String getLifeSaved() {
        return lifeSaved;
    }

    public void setLifeSaved(String lifeSaved) {
        this.lifeSaved = lifeSaved;
    }

    public String getInjuryDescription() {
        return injuryDescription;
    }

    public void setInjuryDescription(String injuryDescription) {
        this.injuryDescription = injuryDescription;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
