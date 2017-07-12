/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PoliceFrontDeskRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mrunalini
 */
public class PoliceFrontDeskOrganization extends Organization {

    public PoliceFrontDeskOrganization() {
        super(Organization.Type.PoliceFrontDesk.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PoliceFrontDeskRole());
        return roles;
    }
}
