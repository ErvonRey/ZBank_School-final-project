package UI;

import Core.Transaction;
import User.UserSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Mellisa
 */
public class SendMoney extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SendMoney.class.getName());

    /**
     * Creates new form Deposit
     */
    public SendMoney() {
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
        tfSendAmount = new javax.swing.JTextField();
        btnSendMoney = new javax.swing.JButton();
        lDepositAmount1 = new javax.swing.JLabel();
        tfSendTo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Send Money");
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));

        panelBackground.setBackground(new java.awt.Color(51, 51, 51));
        panelBackground.setLayout(null);

        lBalance.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lBalance.setForeground(new java.awt.Color(255, 255, 255));
        lBalance.setText("Current Balance: ");
        panelBackground.add(lBalance);
        lBalance.setBounds(10, 70, 770, 40);

        lDepositAmount.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lDepositAmount.setForeground(new java.awt.Color(255, 255, 255));
        lDepositAmount.setText("Send Amount:");
        panelBackground.add(lDepositAmount);
        lDepositAmount.setBounds(90, 140, 170, 40);

        tfSendAmount.setBackground(new java.awt.Color(102, 102, 102));
        tfSendAmount.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tfSendAmount.setForeground(new java.awt.Color(255, 255, 255));
        tfSendAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSendAmountKeyReleased(evt);
            }
        });
        panelBackground.add(tfSendAmount);
        tfSendAmount.setBounds(260, 140, 470, 40);

        btnSendMoney.setBackground(new java.awt.Color(102, 102, 102));
        btnSendMoney.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnSendMoney.setForeground(new java.awt.Color(255, 255, 255));
        btnSendMoney.setText("Send Money");
        btnSendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMoneyActionPerformed(evt);
            }
        });
        panelBackground.add(btnSendMoney);
        btnSendMoney.setBounds(240, 300, 350, 40);

        lDepositAmount1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lDepositAmount1.setForeground(new java.awt.Color(255, 255, 255));
        lDepositAmount1.setText("(ID or Username):");
        panelBackground.add(lDepositAmount1);
        lDepositAmount1.setBounds(20, 190, 240, 40);

        tfSendTo.setBackground(new java.awt.Color(102, 102, 102));
        tfSendTo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tfSendTo.setForeground(new java.awt.Color(255, 255, 255));
        tfSendTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSendToKeyReleased(evt);
            }
        });
        panelBackground.add(tfSendTo);
        tfSendTo.setBounds(260, 190, 470, 40);

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

    private void tfSendAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSendAmountKeyReleased
        
        if (!tfSendAmount.getText().trim().isEmpty()){
            
            try {
                
                //nothing here just to catch numbers input only
            
            } catch (NumberFormatException e) {
                String errorMessage = "Invalid input, only numerical values are allowed.";
                JOptionPane.showMessageDialog(null, errorMessage, "Deposit Failed", JOptionPane.ERROR_MESSAGE);
                tfSendAmount.setText("");
            }
            
        }
        
    }//GEN-LAST:event_tfSendAmountKeyReleased

    private void btnSendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMoneyActionPerformed
         
        if (!tfSendAmount.getText().trim().isEmpty()){
            
            double sendAmount = Double.parseDouble(tfSendAmount.getText().trim());
            
            String sendTo = tfSendTo.getText().trim();
            
            if (sendTo.matches("\\d+")){
                Transaction.sendMoney(sendAmount, Integer.parseInt(sendTo));
                //AMOUNT, ID
            } else if (sendTo.matches("[a-zA-Z0-9]+")) {
                Transaction.sendMoney(sendAmount, sendTo);
                //AMOUNT, USERNAME
            } else {
                String errorMessage = "Invalid input, please enter a valid username or ID.";
                JOptionPane.showMessageDialog(null, errorMessage, "Request to Send Money Failed", JOptionPane.ERROR_MESSAGE);
                tfSendAmount.setText("00.00");
            }
            
            this.dispose();
            
        } else {
            String errorMessage = "Invalid input, please enter a username or ID.";
            JOptionPane.showMessageDialog(null, errorMessage, "Request to Send Money Failed", JOptionPane.ERROR_MESSAGE);
            tfSendAmount.setText("00.00");
        }
        
    }//GEN-LAST:event_btnSendMoneyActionPerformed

    private void tfSendToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSendToKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSendToKeyReleased

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
        java.awt.EventQueue.invokeLater(() -> new SendMoney().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendMoney;
    private javax.swing.JLabel lBalance;
    private javax.swing.JLabel lDepositAmount;
    private javax.swing.JLabel lDepositAmount1;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JTextField tfSendAmount;
    private javax.swing.JTextField tfSendTo;
    // End of variables declaration//GEN-END:variables
}
