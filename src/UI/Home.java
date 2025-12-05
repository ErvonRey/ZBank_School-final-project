package UI;

import User.ManageUser;
import User.UserSession;

/**
 *
 * @author Mellisa
 */
public class Home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        loadHomeData();
    }
    
    private void loadHomeData(){
        
        UserSession.getUserInformation();
        
        String balance = String.format("%.2f",UserSession.getCurrentUserBalance());
        String investment = String.format("%.2f",UserSession.getCurrentInvestmentBalance());
        
        lFullName.setText(UserSession.getCurrentUser());
        lUsername.setText("Username: @" + UserSession.getCurrentUsername() + " - User ID: " + ManageUser.getUserID());
        lBalance.setText(balance);
        lInvestment.setText(investment);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelNavigation = new javax.swing.JPanel();
        lHomeLogo = new javax.swing.JLabel();
        lHomeInfo = new javax.swing.JLabel();
        panelSearch = new javax.swing.JPanel();
        lSearchNav = new javax.swing.JLabel();
        panelInvestment = new javax.swing.JPanel();
        lInvestmentNav = new javax.swing.JLabel();
        panelProfile = new javax.swing.JPanel();
        lProfileNav = new javax.swing.JLabel();
        lFullName = new javax.swing.JLabel();
        lInvestmentText = new javax.swing.JLabel();
        lInvestment = new javax.swing.JLabel();
        lBalanceText = new javax.swing.JLabel();
        lBalance = new javax.swing.JLabel();
        btnSendMoney = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        lUsername = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        refreshIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 600));

        panelBackground.setBackground(new java.awt.Color(51, 51, 51));
        panelBackground.setLayout(null);

        panelNavigation.setBackground(new java.awt.Color(102, 102, 102));
        panelNavigation.setLayout(null);

        lHomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home Logo.png"))); // NOI18N
        panelNavigation.add(lHomeLogo);
        lHomeLogo.setBounds(10, 10, 60, 60);

        lHomeInfo.setBackground(new java.awt.Color(255, 255, 255));
        lHomeInfo.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lHomeInfo.setForeground(new java.awt.Color(255, 255, 255));
        lHomeInfo.setText("Home");
        panelNavigation.add(lHomeInfo);
        lHomeInfo.setBounds(90, 30, 120, 50);

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setForeground(new java.awt.Color(255, 255, 255));

        lSearchNav.setBackground(new java.awt.Color(255, 255, 255));
        lSearchNav.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lSearchNav.setForeground(new java.awt.Color(51, 51, 51));
        lSearchNav.setText("Search");
        lSearchNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lSearchNav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lSearchNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lSearchNavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lSearchNavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lSearchNavMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lSearchNav)
                .addGap(17, 17, 17))
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lSearchNav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelNavigation.add(panelSearch);
        panelSearch.setBounds(730, 50, 83, 30);

        panelInvestment.setBackground(new java.awt.Color(255, 255, 255));

        lInvestmentNav.setBackground(new java.awt.Color(255, 255, 255));
        lInvestmentNav.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lInvestmentNav.setForeground(new java.awt.Color(51, 51, 51));
        lInvestmentNav.setText("Investment");
        lInvestmentNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lInvestmentNav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lInvestmentNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lInvestmentNavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lInvestmentNavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lInvestmentNavMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelInvestmentLayout = new javax.swing.GroupLayout(panelInvestment);
        panelInvestment.setLayout(panelInvestmentLayout);
        panelInvestmentLayout.setHorizontalGroup(
            panelInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInvestmentLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lInvestmentNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInvestmentLayout.setVerticalGroup(
            panelInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lInvestmentNav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelNavigation.add(panelInvestment);
        panelInvestment.setBounds(600, 50, 120, 30);

        panelProfile.setBackground(new java.awt.Color(255, 255, 255));

        lProfileNav.setBackground(new java.awt.Color(255, 255, 255));
        lProfileNav.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lProfileNav.setForeground(new java.awt.Color(51, 51, 51));
        lProfileNav.setText("Profile");
        lProfileNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lProfileNav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lProfileNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lProfileNavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lProfileNavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lProfileNavMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelProfileLayout = new javax.swing.GroupLayout(panelProfile);
        panelProfile.setLayout(panelProfileLayout);
        panelProfileLayout.setHorizontalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfileLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lProfileNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProfileLayout.setVerticalGroup(
            panelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lProfileNav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelNavigation.add(panelProfile);
        panelProfile.setBounds(500, 50, 90, 30);

        panelBackground.add(panelNavigation);
        panelNavigation.setBounds(0, 0, 850, 80);

        lFullName.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lFullName.setForeground(new java.awt.Color(255, 255, 255));
        lFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFullName.setText("Name of User");
        panelBackground.add(lFullName);
        lFullName.setBounds(20, 140, 800, 60);

        lInvestmentText.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lInvestmentText.setForeground(new java.awt.Color(255, 255, 255));
        lInvestmentText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lInvestmentText.setText("Investment:");
        panelBackground.add(lInvestmentText);
        lInvestmentText.setBounds(40, 310, 220, 60);

        lInvestment.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lInvestment.setForeground(new java.awt.Color(255, 255, 255));
        lInvestment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lInvestment.setText("00.00");
        panelBackground.add(lInvestment);
        lInvestment.setBounds(270, 310, 550, 60);

        lBalanceText.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lBalanceText.setForeground(new java.awt.Color(255, 255, 255));
        lBalanceText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lBalanceText.setText("Balance:");
        panelBackground.add(lBalanceText);
        lBalanceText.setBounds(40, 250, 170, 60);

        lBalance.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lBalance.setForeground(new java.awt.Color(255, 255, 255));
        lBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lBalance.setText("00.00");
        panelBackground.add(lBalance);
        lBalance.setBounds(210, 250, 610, 60);

        btnSendMoney.setBackground(new java.awt.Color(102, 102, 102));
        btnSendMoney.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSendMoney.setForeground(new java.awt.Color(255, 255, 255));
        btnSendMoney.setText("Send Money");
        btnSendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMoneyActionPerformed(evt);
            }
        });
        panelBackground.add(btnSendMoney);
        btnSendMoney.setBounds(430, 490, 360, 50);

        btnWithdraw.setBackground(new java.awt.Color(102, 102, 102));
        btnWithdraw.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdraw Money");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        panelBackground.add(btnWithdraw);
        btnWithdraw.setBounds(430, 430, 360, 50);

        btnPay.setBackground(new java.awt.Color(102, 102, 102));
        btnPay.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        panelBackground.add(btnPay);
        btnPay.setBounds(50, 490, 360, 50);

        btnDeposit.setBackground(new java.awt.Color(102, 102, 102));
        btnDeposit.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("Deposit Money");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        panelBackground.add(btnDeposit);
        btnDeposit.setBounds(50, 430, 360, 50);

        lUsername.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lUsername.setForeground(new java.awt.Color(255, 255, 255));
        lUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lUsername.setText("Username: (username) - User ID: (ID)");
        panelBackground.add(lUsername);
        lUsername.setBounds(20, 200, 810, 20);

        logoutIcon.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        logoutIcon.setForeground(new java.awt.Color(255, 255, 255));
        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout Logo.png"))); // NOI18N
        logoutIcon.setText("Log-out");
        logoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconMouseClicked(evt);
            }
        });
        panelBackground.add(logoutIcon);
        logoutIcon.setBounds(770, 80, 80, 30);

        refreshIcon.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        refreshIcon.setForeground(new java.awt.Color(255, 255, 255));
        refreshIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh Icon.png"))); // NOI18N
        refreshIcon.setText("Refresh");
        refreshIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshIconMouseClicked(evt);
            }
        });
        panelBackground.add(refreshIcon);
        refreshIcon.setBounds(0, 80, 80, 30);

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

        setSize(new java.awt.Dimension(864, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lProfileNavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProfileNavMouseEntered
        lProfileNav.setText("<html><u>" + "Profile" + "<u/><html>");
    }//GEN-LAST:event_lProfileNavMouseEntered

    private void lProfileNavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProfileNavMouseExited
        lProfileNav.setText("Profile");
    }//GEN-LAST:event_lProfileNavMouseExited

    private void lSearchNavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSearchNavMouseEntered
        lSearchNav.setText("<html><u>" + "Search" + "<u/><html>");
    }//GEN-LAST:event_lSearchNavMouseEntered

    private void lSearchNavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSearchNavMouseExited
        lSearchNav.setText("Search");
    }//GEN-LAST:event_lSearchNavMouseExited

    private void lInvestmentNavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInvestmentNavMouseEntered
        lInvestmentNav.setText("<html><u>" + "Investment" + "<u/><html>");
    }//GEN-LAST:event_lInvestmentNavMouseEntered

    private void lInvestmentNavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInvestmentNavMouseExited
        lInvestmentNav.setText("Investment");
    }//GEN-LAST:event_lInvestmentNavMouseExited

    private void refreshIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIconMouseClicked
        loadHomeData();
    }//GEN-LAST:event_refreshIconMouseClicked

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        Deposit deposit = new Deposit();
        deposit.setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        Withdraw withdraw = new Withdraw();
        withdraw.setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnSendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMoneyActionPerformed
        SendMoney sendMoney = new SendMoney();
        sendMoney.setVisible(true);
    }//GEN-LAST:event_btnSendMoneyActionPerformed

    private void lProfileNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProfileNavMouseClicked
        // TODO add your handling code here:
        Profile profile = new Profile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lProfileNavMouseClicked

    private void logoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIconMouseClicked
        UserSession.logOut();
        this.dispose();
    }//GEN-LAST:event_logoutIconMouseClicked

    private void lInvestmentNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInvestmentNavMouseClicked
        // TODO add your handling code here:
        Investment investment = new Investment();
        investment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lInvestmentNavMouseClicked

    private void lSearchNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSearchNavMouseClicked
        // TODO add your handling code here:
        Search search = new Search();
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lSearchNavMouseClicked

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:\
        Pay pay = new Pay();
        pay.setVisible(true);
    }//GEN-LAST:event_btnPayActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSendMoney;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lBalance;
    private javax.swing.JLabel lBalanceText;
    private javax.swing.JLabel lFullName;
    private javax.swing.JLabel lHomeInfo;
    private javax.swing.JLabel lHomeLogo;
    private javax.swing.JLabel lInvestment;
    private javax.swing.JLabel lInvestmentNav;
    private javax.swing.JLabel lInvestmentText;
    private javax.swing.JLabel lProfileNav;
    private javax.swing.JLabel lSearchNav;
    private javax.swing.JLabel lUsername;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelInvestment;
    private javax.swing.JPanel panelNavigation;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JLabel refreshIcon;
    // End of variables declaration//GEN-END:variables
}
