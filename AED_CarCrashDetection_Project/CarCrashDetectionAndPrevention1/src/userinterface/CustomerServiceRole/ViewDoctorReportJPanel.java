/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerServiceRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalToCustomerServiceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mrunalini
 */
public class ViewDoctorReportJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CustomerServiceOrganization customerServiceOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form ViewDoctorReportJPanel
     */
    public ViewDoctorReportJPanel(JPanel userProcessContainer, UserAccount account, Organization customerServiceOrganization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        userAccount = account;
        this.business = business;
        this.customerServiceOrganization = (CustomerServiceOrganization) customerServiceOrganization;
        this.enterprise = enterprise;

        for (WorkRequest wr : customerServiceOrganization.getWorkQueue().getWorkRequestList()) {

            if (wr instanceof HospitalToCustomerServiceWorkRequest) {
                if (wr.getPatientName().equals(userAccount)) {
                    String name = wr.getPatientName().getEmployee().getName();
                    String location = wr.getLocation();
                    String lifeSaved = ((HospitalToCustomerServiceWorkRequest) wr).getLifeSaved();
                    String injuries = ((HospitalToCustomerServiceWorkRequest) wr).getInjuryDescription();
                    String cond = ((HospitalToCustomerServiceWorkRequest) wr).getCondition();

                    txtName.setText(name);
                    txtLocation.setText(location);
                    txtLifeSaved.setText(lifeSaved);
                    txtAreaInjuries.setText(injuries);
                    txtCondition.setText(cond);

                }
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInjuries = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtCondition = new javax.swing.JTextField();
        txtLifeSaved = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 88, 237, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Life saved");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Location");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 237, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Injuries");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        txtAreaInjuries.setColumns(20);
        txtAreaInjuries.setRows(5);
        jScrollPane1.setViewportView(txtAreaInjuries);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 237, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Condition");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));
        add(txtCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 237, -1));
        add(txtLifeSaved, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 126, 237, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaInjuries;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtLifeSaved;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}