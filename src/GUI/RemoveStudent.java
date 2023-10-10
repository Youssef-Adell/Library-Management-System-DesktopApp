/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import library.LibraryManagementSystem;
import library.Student;

/**
 *
 * @author Abdo Nagy
 */
public class RemoveStudent extends javax.swing.JFrame {

    ArrayList<Student> List= new ArrayList<Student>();
    LibraryManagementSystem A= LibraryManagementSystem.getInstance();
    /**
     * Creates new form RemoveStudent
     */
    public RemoveStudent() {
        initComponents();
        try{
           List= A.getAllStudents();
           for(int i=0;i<List.size();i++){
            StudentsNames.addItem(List.get(i).getName());
        
        }
        }catch(Exception s){
            JOptionPane.showMessageDialog(this,s.getMessage());
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
        Name = new javax.swing.JLabel();
        RemoveStuInterface = new javax.swing.JLabel();
        RemoveStudent = new javax.swing.JButton();
        StudentsNames = new javax.swing.JComboBox<>();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Name.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        Name.setText("Name");

        RemoveStuInterface.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        RemoveStuInterface.setText("        Remove Student");

        RemoveStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-remove-48.png"))); // NOI18N
        RemoveStudent.setText("Remove");
        RemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentActionPerformed(evt);
            }
        });

        StudentsNames.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                StudentsNamesComponentAdded(evt);
            }
        });
        StudentsNames.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                StudentsNamesComponentShown(evt);
            }
        });
        StudentsNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsNamesActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-close-window-48.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(RemoveStudent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RemoveStuInterface)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(Exit))
                            .addComponent(StudentsNames, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(RemoveStuInterface))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit)))
                .addGap(101, 101, 101)
                .addComponent(Name)
                .addGap(30, 30, 30)
                .addComponent(StudentsNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(RemoveStudent)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
        StudentManag D=new StudentManag();
        D.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void StudentsNamesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_StudentsNamesComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsNamesComponentAdded

    private void StudentsNamesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_StudentsNamesComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsNamesComponentShown

    private void RemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentActionPerformed
        try{
            int[]arr= new int[20];
            for(int i=0;i<List.size();i++){
                arr[i]= A.getAllStudents().get(i).getUnvId();}
            int SelectedValue=StudentsNames.getSelectedIndex();
            int z=arr[SelectedValue];
            A.removeStudent(z);
            dispose();
            StudentManag S=new StudentManag();
            S.show();
            
        }catch(Exception s){
            JOptionPane.showMessageDialog(this,s.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveStudentActionPerformed

    private void StudentsNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsNamesActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_StudentsNamesActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel RemoveStuInterface;
    private javax.swing.JButton RemoveStudent;
    private javax.swing.JComboBox<String> StudentsNames;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}