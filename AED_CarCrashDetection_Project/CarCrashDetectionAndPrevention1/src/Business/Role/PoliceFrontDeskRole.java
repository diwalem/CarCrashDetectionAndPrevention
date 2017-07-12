/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceFrontDeskOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PoliceFrontDeskRole.PoliceFrontDeskWorkAreaJPanel;

/**
 *
 * @author Mrunalini
 */
public class PoliceFrontDeskRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PoliceFrontDeskWorkAreaJPanel(userProcessContainer, account, (PoliceFrontDeskOrganization) organization, business, enterprise);
    }
}
