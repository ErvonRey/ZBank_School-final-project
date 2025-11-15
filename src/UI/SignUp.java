package UI;

public class SignUp extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SignUp.class.getName());

    public SignUp() {
        initComponents();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_panel = new javax.swing.JPanel();
        lProfile = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        lFirstName = new javax.swing.JLabel();
        lMiddleName = new javax.swing.JLabel();
        tfMiddleName = new javax.swing.JTextField();
        lLastName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        lBirthday = new javax.swing.JLabel();
        lMonth = new javax.swing.JLabel();
        lDay = new javax.swing.JLabel();
        lYear = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        tfYear = new javax.swing.JTextField();
        tfDay = new javax.swing.JTextField();
        lAddress = new javax.swing.JLabel();
        tfPurStr = new javax.swing.JTextField();
        tfMunCit = new javax.swing.JTextField();
        tfRegion = new javax.swing.JTextField();
        lRegion = new javax.swing.JLabel();
        lMunicipalityCity = new javax.swing.JLabel();
        lPurokStreet = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        lPhoneNumber = new javax.swing.JLabel();
        lNameExtension = new javax.swing.JLabel();
        tfNameExtension = new javax.swing.JTextField();
        lAccount = new javax.swing.JLabel();
        top = new javax.swing.JPanel();
        lWelcome = new javax.swing.JLabel();
        lWelcome3 = new javax.swing.JLabel();
        lAlreadyHaveAnAccount = new javax.swing.JLabel();
        lSignIn = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        background_panel.setBackground(new java.awt.Color(51, 51, 51));

        lProfile.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lProfile.setForeground(new java.awt.Color(204, 255, 255));
        lProfile.setText("Profile");

        lEmail.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lEmail.setForeground(new java.awt.Color(255, 255, 255));
        lEmail.setText("Email:");

        tfEmail.setBackground(new java.awt.Color(102, 102, 102));
        tfEmail.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));

        lUsername.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lUsername.setForeground(new java.awt.Color(255, 255, 255));
        lUsername.setText("Username:");

        tfUsername.setBackground(new java.awt.Color(102, 102, 102));
        tfUsername.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(255, 255, 255));

        lPassword.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lPassword.setForeground(new java.awt.Color(255, 255, 255));
        lPassword.setText("Password:");

        tfPassword.setBackground(new java.awt.Color(102, 102, 102));
        tfPassword.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(255, 255, 255));

        tfFirstName.setBackground(new java.awt.Color(102, 102, 102));
        tfFirstName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfFirstName.setForeground(new java.awt.Color(255, 255, 255));

        lFirstName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lFirstName.setText("First Name:");

        lMiddleName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lMiddleName.setForeground(new java.awt.Color(255, 255, 255));
        lMiddleName.setText("Middle Name:");

        tfMiddleName.setBackground(new java.awt.Color(102, 102, 102));
        tfMiddleName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfMiddleName.setForeground(new java.awt.Color(255, 255, 255));

        lLastName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lLastName.setForeground(new java.awt.Color(255, 255, 255));
        lLastName.setText("Last Name:");

        tfLastName.setBackground(new java.awt.Color(102, 102, 102));
        tfLastName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfLastName.setForeground(new java.awt.Color(255, 255, 255));

        lBirthday.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lBirthday.setForeground(new java.awt.Color(204, 255, 255));
        lBirthday.setText("Birthday");

        lMonth.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lMonth.setForeground(new java.awt.Color(255, 255, 255));
        lMonth.setText("Month:");

        lDay.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lDay.setForeground(new java.awt.Color(255, 255, 255));
        lDay.setText("Day:");

        lYear.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lYear.setForeground(new java.awt.Color(255, 255, 255));
        lYear.setText("Year:");

        cbMonth.setBackground(new java.awt.Color(102, 102, 102));
        cbMonth.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbMonth.setForeground(new java.awt.Color(255, 255, 255));
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        tfYear.setBackground(new java.awt.Color(102, 102, 102));
        tfYear.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfYear.setForeground(new java.awt.Color(255, 255, 255));

        tfDay.setBackground(new java.awt.Color(102, 102, 102));
        tfDay.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfDay.setForeground(new java.awt.Color(255, 255, 255));

        lAddress.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lAddress.setForeground(new java.awt.Color(204, 255, 255));
        lAddress.setText("Address");

        tfPurStr.setBackground(new java.awt.Color(102, 102, 102));
        tfPurStr.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfPurStr.setForeground(new java.awt.Color(255, 255, 255));

        tfMunCit.setBackground(new java.awt.Color(102, 102, 102));
        tfMunCit.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfMunCit.setForeground(new java.awt.Color(255, 255, 255));

        tfRegion.setBackground(new java.awt.Color(102, 102, 102));
        tfRegion.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfRegion.setForeground(new java.awt.Color(255, 255, 255));

        lRegion.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lRegion.setForeground(new java.awt.Color(255, 255, 255));
        lRegion.setText("Region:");

        lMunicipalityCity.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lMunicipalityCity.setForeground(new java.awt.Color(255, 255, 255));
        lMunicipalityCity.setText("Municipality/City:");

        lPurokStreet.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lPurokStreet.setForeground(new java.awt.Color(255, 255, 255));
        lPurokStreet.setText("Purok/Street:");

        tfPhoneNumber.setBackground(new java.awt.Color(102, 102, 102));
        tfPhoneNumber.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));

        lPhoneNumber.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lPhoneNumber.setText("Phone Number:");

        lNameExtension.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lNameExtension.setForeground(new java.awt.Color(255, 255, 255));
        lNameExtension.setText("Name Extension:");

        tfNameExtension.setBackground(new java.awt.Color(102, 102, 102));
        tfNameExtension.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfNameExtension.setForeground(new java.awt.Color(255, 255, 255));

        lAccount.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lAccount.setForeground(new java.awt.Color(204, 255, 255));
        lAccount.setText("Account");

        top.setBackground(new java.awt.Color(102, 102, 102));
        top.setLayout(null);

        lWelcome.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lWelcome.setText("Welcome to ZBank new user!");
        top.add(lWelcome);
        lWelcome.setBounds(15, 11, 390, 29);

        lWelcome3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lWelcome3.setForeground(new java.awt.Color(255, 255, 255));
        lWelcome3.setText("Please fill up the required information to proceed with the account creation.");
        top.add(lWelcome3);
        lWelcome3.setBounds(15, 46, 616, 17);

        lAlreadyHaveAnAccount.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lAlreadyHaveAnAccount.setForeground(new java.awt.Color(255, 255, 255));
        lAlreadyHaveAnAccount.setText("Already have an account?");
        top.add(lAlreadyHaveAnAccount);
        lAlreadyHaveAnAccount.setBounds(620, 70, 192, 17);

        lSignIn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lSignIn.setForeground(new java.awt.Color(153, 204, 255));
        lSignIn.setText("Sign-in");
        lSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lSignInMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lSignInMousePressed(evt);
            }
        });
        top.add(lSignIn);
        lSignIn.setBounds(820, 70, 56, 17);

        btnCreateAccount.setBackground(new java.awt.Color(102, 102, 102));
        btnCreateAccount.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(background_panel);
        background_panel.setLayout(background_panelLayout);
        background_panelLayout.setHorizontalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(background_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMonth)
                            .addComponent(lDay, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lYear, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDay)
                            .addComponent(tfYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lRegion)
                            .addComponent(lPurokStreet)
                            .addComponent(lMunicipalityCity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfMunCit)
                                .addComponent(tfPurStr, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background_panelLayout.createSequentialGroup()
                                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lEmail)
                                    .addComponent(lUsername)
                                    .addComponent(lPassword)
                                    .addComponent(lPhoneNumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfPassword)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(background_panelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lAccount))
                            .addGroup(background_panelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(lBirthday)))
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background_panelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lMiddleName, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                                        .addComponent(lProfile)
                                        .addGap(208, 208, 208))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                                        .addComponent(lNameExtension)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNameExtension, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAddress)
                                .addGap(208, 208, 208)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        background_panelLayout.setVerticalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addComponent(lAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lUsername)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEmail)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPassword)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPhoneNumber)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                        .addComponent(lProfile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lFirstName)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lMiddleName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lLastName)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNameExtension)
                            .addComponent(tfNameExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lBirthday))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lMonth)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lDay)
                            .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lYear)
                            .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(background_panelLayout.createSequentialGroup()
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPurStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPurokStreet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMunCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lMunicipalityCity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lRegion))))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(background_panel);
        background_panel.setBounds(0, 0, 900, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSignInMouseEntered
        lSignIn.setText("<html><u>"+"Sign-in"+"<u/><html>");
    }//GEN-LAST:event_lSignInMouseEntered

    private void lSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSignInMouseExited
        lSignIn.setText("Sign-in");
    }//GEN-LAST:event_lSignInMouseExited

    private void lSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSignInMousePressed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lSignInMousePressed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        
        //check the validity of the fields first before creating account
//        Function.addAccount(username, email, password, phoneNumber, firstName, middleName, lastName, nameExtension, monh, WIDTH, ERROR, PurStr, MunCit, Region);
        
        
    }//GEN-LAST:event_btnCreateAccountActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new SignUp().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_panel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JLabel lAccount;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lAlreadyHaveAnAccount;
    private javax.swing.JLabel lBirthday;
    private javax.swing.JLabel lDay;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lFirstName;
    private javax.swing.JLabel lLastName;
    private javax.swing.JLabel lMiddleName;
    private javax.swing.JLabel lMonth;
    private javax.swing.JLabel lMunicipalityCity;
    private javax.swing.JLabel lNameExtension;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lPhoneNumber;
    private javax.swing.JLabel lProfile;
    private javax.swing.JLabel lPurokStreet;
    private javax.swing.JLabel lRegion;
    private javax.swing.JLabel lSignIn;
    private javax.swing.JLabel lUsername;
    private javax.swing.JLabel lWelcome;
    private javax.swing.JLabel lWelcome3;
    private javax.swing.JLabel lYear;
    private javax.swing.JTextField tfDay;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfMiddleName;
    private javax.swing.JTextField tfMunCit;
    private javax.swing.JTextField tfNameExtension;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfPurStr;
    private javax.swing.JTextField tfRegion;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfYear;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
