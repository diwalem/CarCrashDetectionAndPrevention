/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Mrunalini
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    // Create Enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);

        }
        if (type == Enterprise.EnterpriseType.Police) {
            enterprise = new PoliceEnterprise(name);
            enterpriseList.add(enterprise);

        }
        if (type == Enterprise.EnterpriseType.SaveLives) {
            enterprise = new SaveLivesEnterprise(name);
            enterpriseList.add(enterprise);

        }
        return enterprise;
    }
}
