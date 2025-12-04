package UI;

import Core.Transaction;
import User.UserSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Mellisa
 */
public class Deposit extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Deposit.class.getName());

    /**
     * Creates new form Deposit
     */
    public Deposit() {
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
        tfDepositAmount = new javax.swing.JTextField();
        btnConfirmDeposit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit Money");
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
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
        lDepositAmount.setText("Deposit Amount:");
        panelBackground.add(lDepositAmount);
        lDepositAmount.setBounds(50, 140, 210, 40);

        tfDepositAmount.setBackground(new java.awt.Color(102, 102, 102));
        tfDepositAmount.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tfDepositAmount.setForeground(new java.awt.Color(255, 255, 255));
        tfDepositAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDepositAmountKeyReleased(evt);
            }
        });
        panelBackground.add(tfDepositAmount);
        tfDepositAmount.setBounds(260, 140, 470, 40);

        btnConfirmDeposit.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmDeposit.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnConfirmDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmDeposit.setText("Confirm Deposit");
        btnConfirmDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDepositActionPerformed(evt);
            }
        });
        panelBackground.add(btnConfirmDeposit);
        btnConfirmDeposit.setBounds(240, 300, 350, 40);

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

        setSize(new java.awt.Dimension(814, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfDepositAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDepositAmountKeyReleased
        
        if (!tfDepositAmount.getText().trim().isEmpty()){
            
            try {
                
                //nothing here just to catch numbers input only
            
            } catch (NumberFormatException e) {
                String errorMessage = "Invalid input, only numerical values are allowed.";
                JOptionPane.showMessageDialog(null, errorMessage, "Deposit Failed", JOptionPane.ERROR_MESSAGE);
                tfDepositAmount.setText("");
            }
            
        }
        
    }//GEN-LAST:event_tfDepositAmountKeyReleased

    private void btnConfirmDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDepositActionPerformed
        
        if (!tfDepositAmount.getText().trim().isEmpty()){
            
            double depositAmount = Double.parseDouble(tfDepositAmount.getText().trim());
            Transaction.depositCash(depositAmount);
            this.dispose();
            
        } else {
            String errorMessage = "Invalid input, please enter a valid value.";
            JOptionPane.showMessageDialog(null, errorMessage, "Deposit Failed", JOptionPane.ERROR_MESSAGE);
            tfDepositAmount.setText("00.00");
        }
        
    }//GEN-LAST:event_btnConfirmDepositActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Deposit().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmDeposit;
    private javax.swing.JLabel lBalance;
    private javax.swing.JLabel lDepositAmount;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JTextField tfDepositAmount;
    // End of variables declaration//GEN-END:variables
}
