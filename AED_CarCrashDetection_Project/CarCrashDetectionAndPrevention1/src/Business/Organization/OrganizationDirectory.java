/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Mrunalini
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CustomerService.getValue())) {
            organization = new CustomerServiceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HospitalHelpDesk.getValue())) {
            organization = new HospitalHelpDeskOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PoliceFrontDesk.getValue())) {
            organization = new PoliceFrontDeskOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Police.getValue())) {
            organization = new PoliceOrganization();
            organizationList.add(organization);
        }

        return organization;
    }

}
