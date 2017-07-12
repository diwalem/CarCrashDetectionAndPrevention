/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Smruthi
 */
public class Configuration {

    private CustomerOrganization customerOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private UserAccount userAccount1;

    public Configuration(EcoSystem ecoSystem) {
        this.ecoSystem = ecoSystem;

    }

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    /**
     * 
     * @param indexList
     * @return 
     */
    public int RandomEmergency(ArrayList<Integer> indexList) {
        Random rand = new Random();

        String[] location1 = {"Boston", "Seattle", "Miami", "LosAngeles", "Illinois"};
        String[] priority1 = {"1", "2", "3", "4", "5"};
        String location = location1[rand.nextInt(location1.length)];
        String priority = priority1[rand.nextInt(priority1.length)];
        WorkRequest request = new WorkRequest();
        ArrayList<UserAccount> acc = new ArrayList<UserAccount>();
        for (Network network : ecoSystem.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof CustomerOrganization) {
                        for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {

                            acc.add(userAccount);

                        }
                    }
                }
            }
        }

        int customerCount = acc.size();
        int x = getRandomIndex(acc, indexList);
        UserAccount userAccount1 = acc.get(x);
        request.setSender(userAccount1);

        request.setLocation(location);
        request.setPriority(priority);
        request.setStatus("Received");
        for (Network network : ecoSystem.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof CustomerServiceOrganization) {

                        organization.getWorkQueue().getWorkRequestList().add(request);

                    }

                }
            }
        }
        return customerCount;
    }

    public int getRandomIndex(ArrayList<UserAccount> acc, ArrayList<Integer> indexList) {
        int a;

        a = (int) (Math.random() * acc.size());
        if (indexList.contains(a)) {
            a = getRandomIndex(acc, indexList);
        } else {
            indexList.add(a);
        }
        return a;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// public ArrayList<VS> Mastervsl = 

