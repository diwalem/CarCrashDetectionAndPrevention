/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalHelpDeskRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mrunalini
 */
public class HospitalHelpDeskOrganization extends Organization {

    public HospitalHelpDeskOrganization() {
        super(Organization.Type.HospitalHelpDesk.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalHelpDeskRole());
        return roles;
    }

}
