/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FrontEnd.BeauticianRole;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.OrganizationNutritionConsulatant;
import Backend.Organization.Organization;
import Backend.Organization.OrganizationBeautySalon;
import Backend.User.User;
import Backend.WorkQueue.NutritionistWorkRequest;
import Backend.WorkQueue.BeauticianWorkRequest;
import Backend.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aashay
 */
public class WorkAreaSalonJPanel extends javax.swing.JPanel {


    private JPanel userProcessContainer;
    private OrganizationBeautySalon salonorganization;
    private Enterprise enterprise;
    private User userAccount;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork;  
    
    public WorkAreaSalonJPanel(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem system, Network sourceNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salonorganization = (OrganizationBeautySalon) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.sourceNetwork = sourceNetwork;
        valueLabel.setText(organization.getName());
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organizationjLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignjButton = new javax.swing.JButton();
        processjButton = new javax.swing.JButton();
        declinejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        organizationjLabel.setForeground(new java.awt.Color(0, 153, 153));
        organizationjLabel.setText("Organization:");
        add(organizationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 100, 30));

        valueLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 153, 153));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 210, 30));

        workRequestJTable.setBackground(new java.awt.Color(0, 153, 153));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client Request Details", "Client Name", "Assignee", "Appointment Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 660, 150));

        assignjButton.setBackground(new java.awt.Color(0, 153, 153));
        assignjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignjButton.setForeground(new java.awt.Color(255, 255, 255));
        assignjButton.setText("Confirm Appointment");
        assignjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });
        add(assignjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 210, 30));

        processjButton.setBackground(new java.awt.Color(0, 153, 153));
        processjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processjButton.setForeground(new java.awt.Color(255, 255, 255));
        processjButton.setText("Appointment Completed");
        processjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        processjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButtonActionPerformed(evt);
            }
        });
        add(processjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 210, 30));

        declinejButton.setBackground(new java.awt.Color(0, 153, 153));
        declinejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        declinejButton.setForeground(new java.awt.Color(255, 255, 255));
        declinejButton.setText("Decline Appoinment");
        declinejButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        declinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declinejButtonActionPerformed(evt);
            }
        });
        add(declinejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo-transparent-png (1).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 400, 180));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hair Salon Employee Appointment Page");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 430, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Confirmed");

        populateRequestTable();
    }//GEN-LAST:event_assignjButtonActionPerformed

    private void processjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow,0);
        request.setReceiver(userAccount);
        request.setStatus("Processed");
        populateRequestTable();
    }//GEN-LAST:event_processjButtonActionPerformed

    private void declinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declinejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Declined");

        populateRequestTable();
                              
    }//GEN-LAST:event_declinejButtonActionPerformed
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : salonorganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof BeauticianWorkRequest){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton declinejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel organizationjLabel;
    private javax.swing.JButton processjButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
