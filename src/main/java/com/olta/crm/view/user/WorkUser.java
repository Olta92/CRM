/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.view.user;

import com.olta.crm.work.Work;
import com.olta.crm.work.WorkImpl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Olta
 */
public class WorkUser extends javax.swing.JFrame {

    private HomeUser home;
    private final Work listOfWork;

    /**
     * Creates new form Work_User
     */
    public WorkUser() {
        initComponents();
        setLocationRelativeTo(null);
        listOfWork = new WorkImpl();
        setWorkUserTabel(user_name.getText());
    }

    public JLabel getUser_name() {
        return user_name;
    }

    public void setWorkUserTabel(String username) {
        work(username);
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
        jLabel1 = new javax.swing.JLabel();
        task_number = new javax.swing.JLabel();
        project_name = new javax.swing.JLabel();
        type_of_project = new javax.swing.JLabel();
        project_issue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelOfWork = new javax.swing.JTable();
        mark_done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        user_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Work");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394)
                .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel16)
                    .addContainerGap(946, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(user_name)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(21, 21, 21)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("My Work ToDo");

        task_number.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        task_number.setText("Task Number");

        project_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        project_name.setText("Project Name");

        type_of_project.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        type_of_project.setText("Type of Procces");

        project_issue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        project_issue.setText("Project Issue");

        tabelOfWork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project Name", "Project Issue", "Task Number", "Type of Procces"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelOfWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelOfWorkMouseClicked(evt);
            }
        });
        tabelOfWork.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelOfWorkKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelOfWork);
        if (tabelOfWork.getColumnModel().getColumnCount() > 0) {
            tabelOfWork.getColumnModel().getColumn(0).setResizable(false);
            tabelOfWork.getColumnModel().getColumn(1).setResizable(false);
            tabelOfWork.getColumnModel().getColumn(2).setResizable(false);
            tabelOfWork.getColumnModel().getColumn(3).setResizable(false);
        }

        mark_done.setBackground(new java.awt.Color(255, 255, 255));
        mark_done.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        mark_done.setForeground(new java.awt.Color(0, 102, 255));
        mark_done.setText("Mark Done ");
        mark_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark_doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type_of_project, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(project_issue, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(project_name, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(mark_done, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(task_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 982, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(project_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(project_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(task_number, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(type_of_project, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(mark_done, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1150, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        home = new HomeUser();
        home.setVisible(true);
        home.getWelcome_user().setText(user_name.getText());
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void mark_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark_doneActionPerformed
        if (!project_name.getText().equals("Project Name")) {
            listOfWork.updateCompltedWork(Integer.parseInt(task_number.getText().trim()));
            work(user_name.getText());
            project_name.setText("Project Name");
            project_issue.setText("Project Issue");
            task_number.setText("Task Number");
            type_of_project.setText("Type Of Procces");

        } else {
            JOptionPane.showMessageDialog(null, "Select a row in the table");
        }

    }//GEN-LAST:event_mark_doneActionPerformed

    private void tabelOfWorkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelOfWorkKeyPressed
    }//GEN-LAST:event_tabelOfWorkKeyPressed

    private void tabelOfWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelOfWorkMouseClicked
        int selectedRow = tabelOfWork.getSelectedRow();
        project_name.setText(tabelOfWork.getValueAt(selectedRow, 0).toString());
        project_issue.setText(tabelOfWork.getValueAt(selectedRow, 1).toString());
        task_number.setText(tabelOfWork.getValueAt(selectedRow, 2).toString());
        type_of_project.setText(tabelOfWork.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tabelOfWorkMouseClicked

    private void work(String user) {

        DefaultTableModel tableModel = configTable();

        Object[] row = new Object[4];

        //Impllement The user Var
        for (int i = 0; i < listOfWork.listOfHouer(user).size(); i++) {
            row[0] = listOfWork.listOfHouer(user).get(i).getProjectName();
            row[1] = listOfWork.listOfHouer(user).get(i).getProjectIssue();
            row[2] = listOfWork.listOfHouer(user).get(i).getTaskNumber();
            row[3] = listOfWork.listOfHouer(user).get(i).getTypeOfProcces();

            tableModel.addRow(row);
        }
        tabelOfWork.setModel(tableModel);

    }

    private DefaultTableModel configTable() {
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][]{{}},
                new Object[]{"Project Name", "Project Issue", "Task Number", "Type Of Procces"}
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
     *
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
            java.util.logging.Logger.getLogger(WorkUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WorkUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mark_done;
    private javax.swing.JLabel project_issue;
    private javax.swing.JLabel project_name;
    private javax.swing.JTable tabelOfWork;
    private javax.swing.JLabel task_number;
    private javax.swing.JLabel type_of_project;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}