/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.User.User;
import FrontEnd.Customer.CustomerLoginWorkAreaJPanel;
import FrontEnd.Customer.CustomerWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Akhil
 */
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
//        System.out.println(getClass().getResource("/FrontEnd/wallpaperflare.com_wallpaper (11) (1).jpg"));
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1800,1800);
        logoutBtn.setEnabled(false);
        userNameTextfield.setEditable(false);
        passwordTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        userNameTextfield = new javax.swing.JTextField();
        customerBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(300);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 1800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(userNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 160, 30));

        customerBtn.setBackground(new java.awt.Color(0, 102, 102));
        customerBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerBtn.setText("Customer");
        customerBtn.setBorderPainted(false);
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(customerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 170, 30));

        logoutBtn.setBackground(new java.awt.Color(0, 102, 102));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setBorderPainted(false);
        logoutBtn.setMaximumSize(new java.awt.Dimension(70, 25));
        logoutBtn.setMinimumSize(new java.awt.Dimension(70, 25));
        logoutBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 90, 30));

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 160, 30));

        loginBtn.setBackground(new java.awt.Color(0, 102, 102));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Sign in");
        loginBtn.setBorderPainted(false);
        loginBtn.setMaximumSize(new java.awt.Dimension(70, 25));
        loginBtn.setMinimumSize(new java.awt.Dimension(70, 25));
        loginBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 80, 30));

        jLabel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 160, 460));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enterprise Employee");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Password_icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/User_login_icon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 40, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Fit USA Admin");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 170, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enterprise Admin");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 170, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FIT_USA_logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login With Your Account");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 50));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(231, 200, 237));
        container.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hompage_Image_4.png"))); // NOI18N
        container.add(jLabel1, "card3");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed

        CardLayout layout=(CardLayout)container.getLayout();
        container.add("workArea", new CustomerWorkAreaJPanel(container, null, system, null));
        layout.next(container);
        logoutBtn.setEnabled(true);
        customerBtn.setEnabled(false);
        userNameTextfield.setEditable(false);
        passwordTextField.setEditable(false);
    }//GEN-LAST:event_customerBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        logoutBtn.setEnabled(false);
        userNameTextfield.setEnabled(true);
        passwordTextField.setEnabled(true);
        customerBtn.setEnabled(true);
        userNameTextfield.setEditable(true);
        passwordTextField.setEditable(true);

        userNameTextfield.setText("");
        passwordTextField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String userName = userNameTextfield.getText();
        // Get Password
        char[] passwordCharArray = passwordTextField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        User userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        Network inNetwork=null;
        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inNetwork=network;
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, inNetwork));
            layout.next(container);
        }

        customerBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        userNameTextfield.setEnabled(false);
        passwordTextField.setEnabled(false);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void userNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextfieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userNameTextfield.setEditable(true);
        passwordTextField.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userNameTextfield.setEditable(true);
        passwordTextField.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userNameTextfield.setEditable(true);
        passwordTextField.setEditable(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton customerBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField userNameTextfield;
    // End of variables declaration//GEN-END:variables
}
