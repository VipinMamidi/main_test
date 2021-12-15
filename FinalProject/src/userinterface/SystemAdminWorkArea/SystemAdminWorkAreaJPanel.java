/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.DonorRole.DonorAreaJPanel;
import userinterface.DonorRole.DonorProfilePanel;
import userinterface.FCAdminRole.FCAdminWorkAreaPanel;
import userinterface.MainJFrame;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    JPanel jp;
    JSplitPane jsp;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem, JPanel jp, JSplitPane jsp) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.jp = jp;
        this.jsp = jsp;
      //  this.userAcc = userAcc;
      logoutlogo();
      setBG();
      setLogo();
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneSysAdmin = new javax.swing.JSplitPane();
        MenubarPanel = new javax.swing.JPanel();
        btnMgWH = new javax.swing.JButton();
        btnMgPT = new javax.swing.JButton();
        btnMgUsers = new javax.swing.JButton();
        lblWelcomemsg = new javax.swing.JLabel();
        btnMgNGO = new javax.swing.JButton();
        lbllogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        WorkAreaPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        SplitPaneSysAdmin.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MenubarPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenubarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMgWH.setBackground(new java.awt.Color(105, 158, 208));
        btnMgWH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgWH.setText("Manage Warehouse");
        btnMgWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgWHActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnMgWH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        btnMgPT.setBackground(new java.awt.Color(105, 158, 208));
        btnMgPT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgPT.setText("Manage Pantry");
        btnMgPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgPTActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnMgPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        btnMgUsers.setBackground(new java.awt.Color(105, 158, 208));
        btnMgUsers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgUsers.setText("Manage Users");
        btnMgUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgUsersActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnMgUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        lblWelcomemsg.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblWelcomemsg.setForeground(new java.awt.Color(51, 153, 255));
        lblWelcomemsg.setText("Welcome System Admin !");
        MenubarPanel.add(lblWelcomemsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnMgNGO.setBackground(new java.awt.Color(105, 158, 208));
        btnMgNGO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgNGO.setText("Manage NGO");
        btnMgNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgNGOActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnMgNGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbllogoutMousePressed(evt);
            }
        });
        MenubarPanel.add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 40, 30));
        MenubarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, 120));
        MenubarPanel.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 60));

        SplitPaneSysAdmin.setLeftComponent(MenubarPanel);

        WorkAreaPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout WorkAreaPanelLayout = new javax.swing.GroupLayout(WorkAreaPanel);
        WorkAreaPanel.setLayout(WorkAreaPanelLayout);
        WorkAreaPanelLayout.setHorizontalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        WorkAreaPanelLayout.setVerticalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        SplitPaneSysAdmin.setRightComponent(WorkAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneSysAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneSysAdmin)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setLogo() {
        try {
            logoImage.setMinimumSize(new Dimension(100, 100));
            logoImage.setPreferredSize(new Dimension(100, 100));
            logoImage.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            logoImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void logoutlogo() {

        try {
           
            lbllogout.setMinimumSize(new Dimension(50,60));
            lbllogout.setPreferredSize(new Dimension(50,60));
            lbllogout.setMaximumSize(new Dimension(50,60));
            
            Image img1 = ImageIO.read(getClass().getResource("/Images/Logout.png"));
            Image newimg1 = img1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

            lbllogout.setIcon(new ImageIcon(newimg1));
            
            
        } catch (IOException ex) {
            Logger.getLogger(DonorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      
    private void btnMgWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgWHActionPerformed
        // TODO add your handling code here:
        ManageWarehousePanel objWH = new ManageWarehousePanel(userProcessContainer,ecosystem);
        SplitPaneSysAdmin.setRightComponent(objWH);
        /*userProcessContainer.add("Manage Warehouse",objWH);
        CardLayout crdlyt = (CardLayout) userProcessContainer.getLayout();
        crdlyt.next(userProcessContainer); */
    }//GEN-LAST:event_btnMgWHActionPerformed

    private void btnMgPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgPTActionPerformed
        // TODO add your handling code here:
        ManagePantryPanel objFCP = new ManagePantryPanel(userProcessContainer,ecosystem);
         SplitPaneSysAdmin.setRightComponent(objFCP);
       /* userProcessContainer.add("Manage Pantry",objFCP);
        CardLayout crdlyt = (CardLayout) userProcessContainer.getLayout();
        crdlyt.next(userProcessContainer); */
    }//GEN-LAST:event_btnMgPTActionPerformed

    private void btnMgNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgNGOActionPerformed
        try {
            // TODO add your handling code here:
            ManageNGOJPanel objNGO = new ManageNGOJPanel(userProcessContainer,ecosystem);
            SplitPaneSysAdmin.setRightComponent(objNGO);
        } catch (IOException ex) {
            Logger.getLogger(SystemAdminWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMgNGOActionPerformed

    private void btnMgUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgUsersActionPerformed
        // TODO add your handling code here:
        ManageUsersPanel objUSER = new ManageUsersPanel(userProcessContainer,ecosystem);
         SplitPaneSysAdmin.setRightComponent(objUSER);
    }//GEN-LAST:event_btnMgUsersActionPerformed

    private void lbllogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
            Logger.getLogger(FCAdminWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbllogoutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JPanel MenubarPanel;
    private javax.swing.JSplitPane SplitPaneSysAdmin;
    private javax.swing.JPanel WorkAreaPanel;
    private javax.swing.JButton btnMgNGO;
    private javax.swing.JButton btnMgPT;
    private javax.swing.JButton btnMgUsers;
    private javax.swing.JButton btnMgWH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcomemsg;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel logoImage;
    // End of variables declaration//GEN-END:variables
}