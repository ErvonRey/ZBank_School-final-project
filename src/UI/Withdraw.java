package UI;

import Core.Transaction;
import User.UserSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Mellisa
 */
public class Withdraw extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Withdraw.class.getName());

    /**
     * Creates new form Deposit
     */
    public Withdraw() {
        initComponents();
        loadData();
    }
    
    private void loadData(){
        
        UserSession.getUserInformation();
        
        String balance = String.format("Current Balance: " + "%.2f" , UserSession.getCurrentUserBalance());
        lBalance.setText(balance);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        lBalance = new javax.swing.JLabel();
        lDepositAmount = new javax.swing.JLabel();
        tfWithdrawAmount = new javax.swing.JTextField();
        btnConfirmWithdrawal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit Money");
        setMinimumSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(51, 51, 51));
        panelBackground.setLayout(null);

        lBalance.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lBalance.setForeground(new java.awt.Color(255, 255, 255));
        lBalance.setText("Current Balance: ");
        panelBackground.add(lBalance);
        lBalance.setBounds(10, 70, 770, 40);

        lDepositAmount.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lDepositAmount.setForeground(new java.awt.Color(255, 255, 255));
        lDepositAmount.setText("Withdraw Amount:");
        panelBackground.add(lDepositAmount);
        lDepositAmount.setBounds(40, 140, 220, 40);

        tfWithdrawAmount.setBackground(new java.awt.Color(102, 102, 102));
        tfWithdrawAmount.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tfWithdrawAmount.setForeground(new java.awt.Color(255, 255, 255));
        tfWithdrawAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfWithdrawAmountKeyReleased(evt);
            }
        });
        panelBackground.add(tfWithdrawAmount);
        tfWithdrawAmount.setBounds(260, 140, 470, 40);

        btnConfirmWithdrawal.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmWithdrawal.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnConfirmWithdrawal.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmWithdrawal.setText("Confirm Withdrawal");
        btnConfirmWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmWithdrawalActionPerformed(evt);
            }
        });
        panelBackground.add(btnConfirmWithdrawal);
        btnConfirmWithdrawal.setBounds(240, 300, 350, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfWithdrawAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWithdrawAmountKeyReleased
        
        if (!tfWithdrawAmount.getText().trim().isEmpty()){
            
            try {
                
                //nothing here just to catch numbers input only
            
            } catch (NumberFormatException e) {
                String errorMessage = "Invalid input, only numerical values are allowed.";
                JOptionPane.showMessageDialog(null, errorMessage, "Deposit Failed", JOptionPane.ERROR_MESSAGE);
                tfWithdrawAmount.setText("");
            }
            
        }
        
    }//GEN-LAST:event_tfWithdrawAmountKeyReleased

    private void btnConfirmWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmWithdrawalActionPerformed
         
        if (!tfWithdrawAmount.getText().trim().isEmpty()){
            
            double withdrawalAmount = Double.parseDouble(tfWithdrawAmount.getText().trim());
            Transaction.withdrawCash(withdrawalAmount);
            this.dispose();
            
        } else {
            String errorMessage = "Invalid input, please enter a valid value.";
            JOptionPane.showMessageDialog(null, errorMessage, "Deposit Failed", JOptionPane.ERROR_MESSAGE);
            tfWithdrawAmount.setText("00.00");
        }
        
        
    }//GEN-LAST:event_btnConfirmWithdrawalActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Withdraw().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmWithdrawal;
    private javax.swing.JLabel lBalance;
    private javax.swing.JLabel lDepositAmount;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JTextField tfWithdrawAmount;
    // End of variables declaration//GEN-END:variables
}
