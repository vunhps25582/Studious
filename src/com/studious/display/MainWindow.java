package com.studious.display;

/**
 *
 * @author SsuBii
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Studious - Màn hình chính");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnTeacher = new javax.swing.JButton();
        pnlMenuBar = new javax.swing.JPanel();
        lblHomeMenuBar = new javax.swing.JLabel();
        lblAccountMenuBar = new javax.swing.JLabel();
        lblTeacherMenuBar = new javax.swing.JLabel();
        lblStudentMenuBar = new javax.swing.JLabel();
        lblQnAMenuBar = new javax.swing.JLabel();
        lblStatMenuBar = new javax.swing.JLabel();
        lblLogoutMenuBar = new javax.swing.JLabel();
        btnStat = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnQnA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(232, 255, 183));
        pnlBackground.setForeground(new java.awt.Color(232, 255, 183));

        lblTitle.setBackground(new java.awt.Color(232, 255, 183));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studious/icons/Studious-350x350.png"))); // NOI18N

        btnTeacher.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        btnTeacher.setForeground(new java.awt.Color(8, 115, 6));
        btnTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studious/icons/teacher 1.png"))); // NOI18N
        btnTeacher.setText("Giáo viên");
        btnTeacher.setToolTipText("");
        btnTeacher.setBorder(null);
        btnTeacher.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTeacher.setIconTextGap(1);
        btnTeacher.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });

        pnlMenuBar.setBackground(new java.awt.Color(231, 254, 182));

        lblHomeMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Home-Menubar.png"))); // NOI18N

        lblAccountMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/account_circle.png"))); // NOI18N

        lblTeacherMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/teacher-Menubar.png"))); // NOI18N

        lblStudentMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/student-Menubar.png"))); // NOI18N

        lblQnAMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/QnA-Menubar.png"))); // NOI18N

        lblStatMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/statistics-Menubar.png"))); // NOI18N

        lblLogoutMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout-menubar.png"))); // NOI18N

        javax.swing.GroupLayout pnlMenuBarLayout = new javax.swing.GroupLayout(pnlMenuBar);
        pnlMenuBar.setLayout(pnlMenuBarLayout);
        pnlMenuBarLayout.setHorizontalGroup(
            pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblQnAMenuBar))
                    .addGroup(pnlMenuBarLayout.createSequentialGroup()
                        .addGroup(pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHomeMenuBar)
                            .addComponent(lblAccountMenuBar)
                            .addComponent(lblTeacherMenuBar)
                            .addComponent(lblStudentMenuBar)
                            .addComponent(lblStatMenuBar)
                            .addComponent(lblLogoutMenuBar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuBarLayout.setVerticalGroup(
            pnlMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHomeMenuBar)
                .addGap(18, 18, 18)
                .addComponent(lblAccountMenuBar)
                .addGap(18, 18, 18)
                .addComponent(lblTeacherMenuBar)
                .addGap(18, 18, 18)
                .addComponent(lblStudentMenuBar)
                .addGap(18, 18, 18)
                .addComponent(lblQnAMenuBar)
                .addGap(18, 18, 18)
                .addComponent(lblStatMenuBar)
                .addGap(18, 18, 18)
                .addComponent(lblLogoutMenuBar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnStat.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        btnStat.setForeground(new java.awt.Color(8, 115, 6));
        btnStat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studious/icons/statistics 1.png"))); // NOI18N
        btnStat.setText("Thống kê");
        btnStat.setToolTipText("");
        btnStat.setBorder(null);
        btnStat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStat.setIconTextGap(1);
        btnStat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatActionPerformed(evt);
            }
        });

        btnStudent.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(8, 115, 6));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studious/icons/Student1.png"))); // NOI18N
        btnStudent.setText("Học sinh");
        btnStudent.setToolTipText("");
        btnStudent.setBorder(null);
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.setIconTextGap(1);
        btnStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnQnA.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        btnQnA.setForeground(new java.awt.Color(8, 115, 6));
        btnQnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studious/icons/QnA 1.png"))); // NOI18N
        btnQnA.setText("Hỏi đáp");
        btnQnA.setToolTipText("");
        btnQnA.setBorder(null);
        btnQnA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQnA.setIconTextGap(1);
        btnQnA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQnAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQnA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQnA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTeacherActionPerformed

    private void btnStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnQnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQnAActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQnA;
    private javax.swing.JButton btnStat;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JLabel lblAccountMenuBar;
    private javax.swing.JLabel lblHomeMenuBar;
    private javax.swing.JLabel lblLogoutMenuBar;
    private javax.swing.JLabel lblQnAMenuBar;
    private javax.swing.JLabel lblStatMenuBar;
    private javax.swing.JLabel lblStudentMenuBar;
    private javax.swing.JLabel lblTeacherMenuBar;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlMenuBar;
    // End of variables declaration//GEN-END:variables
}
