package UI;

import User.UserSession;

/**
 * @author Mellisa
 */

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_panel = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        lTopMessage = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        bottom = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        tfUsername = new javax.swing.JTextField();
        lPassword = new javax.swing.JLabel();
        btnSeePassword = new javax.swing.JRadioButton();
        tfPassword = new javax.swing.JPasswordField();
        lEmail = new javax.swing.JLabel();
        lDontHaveAccount = new javax.swing.JLabel();
        lCreateAccount = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        background_panel.setBackground(new java.awt.Color(51, 51, 51));

        top.setBackground(new java.awt.Color(51, 51, 51));

        lTopMessage.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lTopMessage.setForeground(new java.awt.Color(255, 255, 255));
        lTopMessage.setText("Welcome back user to ZBank!");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTopMessage)
                .addGap(128, 128, 128))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lTopMessage)
                .addContainerGap())
        );

        left.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        right.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bottom.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        center.setBackground(new java.awt.Color(51, 51, 51));
        center.setLayout(null);

        tfUsername.setBackground(new java.awt.Color(102, 102, 102));
        tfUsername.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(255, 255, 255));
        center.add(tfUsername);
        tfUsername.setBounds(38, 80, 520, 40);

        lPassword.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lPassword.setForeground(new java.awt.Color(255, 255, 255));
        lPassword.setText("Password:");
        center.add(lPassword);
        lPassword.setBounds(38, 132, 180, 29);

        btnSeePassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSeePassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnSeePasswordItemStateChanged(evt);
            }
        });
        center.add(btnSeePassword);
        btnSeePassword.setBounds(531, 170, 19, 40);

        tfPassword.setBackground(new java.awt.Color(102, 102, 102));
        tfPassword.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(255, 255, 255));
        center.add(tfPassword);
        tfPassword.setBounds(38, 167, 520, 40);

        lEmail.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lEmail.setForeground(new java.awt.Color(255, 255, 255));
        lEmail.setText("Username:");
        center.add(lEmail);
        lEmail.setBounds(38, 45, 170, 29);

        lDontHaveAccount.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lDontHaveAccount.setForeground(new java.awt.Color(255, 255, 255));
        lDontHaveAccount.setText("Don't have an account?");
        center.add(lDontHaveAccount);
        lDontHaveAccount.setBounds(80, 290, 230, 22);

        lCreateAccount.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lCreateAccount.setForeground(new java.awt.Color(102, 204, 255));
        lCreateAccount.setText("create account");
        lCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCreateAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lCreateAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lCreateAccountMouseExited(evt);
            }
        });
        center.add(lCreateAccount);
        lCreateAccount.setBounds(320, 290, 160, 22);

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        center.add(btnLogin);
        btnLogin.setBounds(206, 235, 166, 41);

        javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(background_panel);
        background_panel.setLayout(background_panelLayout);
        background_panelLayout.setHorizontalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panelLayout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(top, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        background_panelLayout.setVerticalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(background_panel, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("This is the frame that will launch when user run the program");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lCreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCreateAccountMouseEntered
        lCreateAccount.setText("<html><u>"+"create account"+"<u/><html>");
    }//GEN-LAST:event_lCreateAccountMouseEntered

    private void lCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCreateAccountMouseExited
        lCreateAccount.setText("create account");
    }//GEN-LAST:event_lCreateAccountMouseExited

    private void lCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCreateAccountMouseClicked
        
        //sign-up page here
        SignUp su = new SignUp();
        su.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lCreateAccountMouseClicked

    private void btnSeePasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnSeePasswordItemStateChanged
        // TODO add your handling code here:
        if (btnSeePassword.isSelected()) {
            tfPassword.setEchoChar((char) 0);
        } else {
            tfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_btnSeePasswordItemStateChanged

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
        String username = tfUsername.getText();
        String password = tfPassword.getText();
        
        boolean isLoginValid = UserSession.checkLogin(username, password);
        
        if (isLoginValid) {
            
            //go to home
            
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
        
        //Here is the main driver
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_panel;
    private javax.swing.JPanel bottom;
    private javax.swing.JButton btnLogin;
    private javax.swing.JRadioButton btnSeePassword;
    private javax.swing.JPanel center;
    private javax.swing.JLabel lCreateAccount;
    private javax.swing.JLabel lDontHaveAccount;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lTopMessage;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
