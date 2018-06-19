/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.view.admin;

import com.olta.crm.issue.ViewIssueAdmin;
import com.olta.crm.issue.ViewIssueAdminImpl;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Olti
 */
public class ViewIssue extends javax.swing.JFrame {

    /**
     * Creates new form ViewIssue
     */
    public ViewIssue() {
        initComponents();
        setLocationRelativeTo(null);
        issue();
    }

    private HomeAdmin home;

    private ViewIssueAdmin allIssues = new ViewIssueAdminImpl();

    public JLabel getUser_name() {
        return user_name;
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
        user_name = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        woring_procces = new javax.swing.JLabel();
        topic_issue = new javax.swing.JLabel();
        isseUser = new javax.swing.JLabel();
        project_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelOfIssues = new javax.swing.JTable();
        project_contect = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 265, 20));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 67, 48));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("User Issues");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 29, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        woring_procces.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        woring_procces.setText("Working Procces ");
        jPanel2.add(woring_procces, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 168, 34));

        topic_issue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        topic_issue.setText("Topic Issue");
        jPanel2.add(topic_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 168, 34));

        isseUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        isseUser.setText("User");
        jPanel2.add(isseUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 34));

        project_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        project_name.setText("Project Name");
        jPanel2.add(project_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 168, 34));

        tabelOfIssues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Topic Issue", "Project Name", "Working Procces", "Project Contect", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelOfIssues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelOfIssuesMouseClicked(evt);
            }
        });
        tabelOfIssues.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelOfIssuesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelOfIssues);
        if (tabelOfIssues.getColumnModel().getColumnCount() > 0) {
            tabelOfIssues.getColumnModel().getColumn(2).setResizable(false);
            tabelOfIssues.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 930, 410));

        project_contect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        project_contect.setText("Project Contect");
        jPanel2.add(project_contect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 168, 34));

        description.setColumns(20);
        description.setRows(5);
        description.setText("Description\n");
        jScrollPane2.setViewportView(description);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 930, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1150, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        home = new HomeAdmin();
        home.setVisible(true);
        home.getWelcome_user().setText(user_name.getText());
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void tabelOfIssuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelOfIssuesMouseClicked
        int selectedRow = tabelOfIssues.getSelectedRow();
        isseUser.setText(tabelOfIssues.getValueAt(selectedRow, 0).toString());
        topic_issue.setText(tabelOfIssues.getValueAt(selectedRow, 1).toString());
        project_name.setText(tabelOfIssues.getValueAt(selectedRow, 2).toString());
        woring_procces.setText(tabelOfIssues.getValueAt(selectedRow, 3).toString());
        project_contect.setText(tabelOfIssues.getValueAt(selectedRow, 4).toString());
        description.setText(tabelOfIssues.getValueAt(selectedRow, 5).toString());

    }//GEN-LAST:event_tabelOfIssuesMouseClicked

    private void tabelOfIssuesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelOfIssuesKeyPressed

    }//GEN-LAST:event_tabelOfIssuesKeyPressed

    private void issue() {

        DefaultTableModel tableModel = configTable();

        Object[] row = new Object[6];

        //Impllement The user Var
        for (int i = 0; i < allIssues.listOfIssues().size(); i++) {
            row[0] = allIssues.listOfIssues().get(i).getUser();
            row[1] = allIssues.listOfIssues().get(i).getTopicIssue();
            row[2] = allIssues.listOfIssues().get(i).getProjectName();
            row[3] = allIssues.listOfIssues().get(i).getWorkingProcces();
            row[4] = allIssues.listOfIssues().get(i).getProjectContect();
            row[5] = allIssues.listOfIssues().get(i).getDescription();

            tableModel.addRow(row);
        }
        tabelOfIssues.setModel(tableModel);

    }

    private DefaultTableModel configTable() {
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][]{{}},
                new Object[]{"User", "Topic Issue", "Project Name", "Working Procces","Project Context", "Description"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tableModel.setRowCount(0);
        return tableModel;
    }

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
            java.util.logging.Logger.getLogger(ViewIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewIssue().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel isseUser;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel project_contect;
    private javax.swing.JLabel project_name;
    private javax.swing.JTable tabelOfIssues;
    private javax.swing.JLabel topic_issue;
    private javax.swing.JLabel user_name;
    private javax.swing.JLabel woring_procces;
    // End of variables declaration//GEN-END:variables
}