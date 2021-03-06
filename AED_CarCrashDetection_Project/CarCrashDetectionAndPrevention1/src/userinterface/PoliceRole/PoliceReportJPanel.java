/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PoliceRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceFrontDeskOrganization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.PoliceToCustomerServiceWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Smruthi
 */
public class PoliceReportJPanel extends javax.swing.JPanel {

    private PoliceOrganization policeOrganization;
    private JPanel userProcessContainer;
    private UserAccount userAccount;

    private Organization organization;
    private Enterprise enterprise;

    /**
     * Creates new form PoliceReportJPanel
     */
    public PoliceReportJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization policeOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;

        this.policeOrganization = (PoliceOrganization) policeOrganization;
        this.enterprise = enterprise;

        int size = policeOrganization.getWorkQueue().getWorkRequestList().size();

        if (policeOrganization.getWorkQueue().getWorkRequestList() != null && !policeOrganization.getWorkQueue().getWorkRequestList().isEmpty()) {

            WorkRequest request1 = policeOrganization.getWorkQueue().getWorkRequestList().get(size - 1);
            if (request1 instanceof WorkRequest) {

                String patientName = request1.getPatientName().getEmployee().getName();
                String location = request1.getLocation();

                txtLocation.setText(location);
                txtName.setText(patientName);

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        txtDamages = new javax.swing.JTextField();
        cmbReason = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 53, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Reason");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 118, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Location");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 184, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Description");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 256, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Damages");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 395, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 53, 237, -1));
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 184, 237, -1));

        txtAreaDescription.setColumns(20);
        txtAreaDescription.setLineWrap(true);
        txtAreaDescription.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 256, 237, -1));
        jPanel1.add(txtDamages, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 395, 237, -1));

        cmbReason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drunk Driving", "Distracted driving", "Speeding", "Reckless Driving", "Environmental factors", "Faulty vehicle", "Disobeying traffic rules", "Bad road conditions", "Collision", "Pre-existing health condition", " " }));
        cmbReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReasonActionPerformed(evt);
            }
        });
        jPanel1.add(cmbReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 118, 237, -1));

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 465, 146, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 465, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReasonActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // for (WorkRequest workRequest : policeOrganization.getWorkQueue().getWorkRequestList()){

        int size1 = policeOrganization.getWorkQueue().getWorkRequestList().size();

        if (policeOrganization.getWorkQueue().getWorkRequestList() != null && !policeOrganization.getWorkQueue().getWorkRequestList().isEmpty()) {

            WorkRequest request1 = policeOrganization.getWorkQueue().getWorkRequestList().get(size1 - 1);
            if (request1 instanceof WorkRequest) {

                String reason = cmbReason.getSelectedItem().toString();
                String loc = request1.getLocation();
                PoliceToCustomerServiceWorkRequest pcswr = new PoliceToCustomerServiceWorkRequest();
                pcswr.setPatientName(request1.getPatientName());
                pcswr.setLocation(loc);
                pcswr.setReason(reason);
                pcswr.setDescription(txtAreaDescription.getText());
                pcswr.setDamage(txtDamages.getText());

                Organization org = null;

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PoliceFrontDeskOrganization) {

                        org = organization;
                        break;
                    }

                }
                if (org != null) {

                    if (pcswr instanceof PoliceToCustomerServiceWorkRequest) {
                        org.getWorkQueue().getWorkRequestList().add(pcswr);
                    }
                }

            }
        }
                JOptionPane.showMessageDialog(null, "Report Generated.", "Message To You.", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> cmbReason;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextField txtDamages;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
