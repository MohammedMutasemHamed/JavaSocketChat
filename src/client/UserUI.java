/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JOptionPane;
import messages.AccountLocked;
import messages.AuthMessage;
import messages.DoRegister;
import messages.LoginOk;
import messages.Message;
import messages.RegisterOk;
import messages.WrongPassword;

/**
 *
 * @author Durrah
 */
public class UserUI extends javax.swing.JFrame {

    ChatClientApplication clientUi;
    ChatUI chatUI;

    /**
     * Creates new form ChatClientUI
     */
    public UserUI(ChatClientApplication clientUi) {
        initComponents();
        setResizable(false);
        this.clientUi = clientUi;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        loginUsernameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginPasswordTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regNameTxt = new javax.swing.JTextField();
        regPass = new javax.swing.JPasswordField();
        regRePass = new javax.swing.JPasswordField();
        regBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        loginPasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordTxtActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginPasswordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(loginUsernameTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(loginBtn)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        tabs.addTab("Login", jPanel2);

        jLabel3.setText("Name");

        jLabel4.setText("Password");

        jLabel5.setText("Re-Password");

        regNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNameTxtActionPerformed(evt);
            }
        });

        regBtn.setText("Register");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regRePass, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(regNameTxt)
                            .addComponent(regPass)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(regBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(regNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(regBtn)
                .addContainerGap())
        );

        tabs.addTab("Register", jPanel3);

        getContentPane().add(tabs);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("Do login");
        String loginID = loginUsernameTxt.getText();
        String loginPASS = String.valueOf(loginPasswordTxt.getPassword());
        try {
            clientUi.client.login(loginID, loginPASS);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginPasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordTxtActionPerformed

    private void regNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNameTxtActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        // TODO add your handling code here:
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name = regNameTxt.getText();
                String pass = String.valueOf(regPass.getPassword());
                String rePass = String.valueOf(regRePass.getPassword());
                String id;
                try {
                    clientUi.client.register(name, pass, rePass);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(UserUI.this, "An error occurred");
                }
            }

        }).start();
    }//GEN-LAST:event_regBtnActionPerformed

    void processLoginMessage(Message loginMessage) {
        if (loginMessage instanceof AuthMessage) {
            if (loginMessage instanceof LoginOk) {
                chatUI((LoginOk) loginMessage);
            } else if (loginMessage instanceof WrongPassword) {
                JOptionPane.showMessageDialog(this, "Wrong password");
            } else if (loginMessage instanceof AccountLocked) {
                JOptionPane.showMessageDialog(this, "Account is locked");
            } else if (loginMessage instanceof DoRegister) {
                JOptionPane.showMessageDialog(this, "Please Register Registered");
                tabs.setSelectedIndex(1);
            }
        }
    }

    void processRegisterMessage(Message message) {
        if (message instanceof AuthMessage) {
            if (message instanceof RegisterOk) {
                RegisterOk msg = (RegisterOk) message;
                JOptionPane.showMessageDialog(this, "Welcome " + msg.clientName + ", please Login with id: " + msg.clientId);
                tabs.setSelectedIndex(0);
            } else if (message instanceof WrongPassword) {
                JOptionPane.showMessageDialog(null, "Password not match");
            }
        }
    }

    void chatUI(LoginOk par) {
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    chatUI = new ChatUI(clientUi);
                    chatUI.setTitle("Welcome " + par.user);
                    chatUI.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(UserUI.this, "Not Registered");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField loginPasswordTxt;
    private javax.swing.JTextField loginUsernameTxt;
    private javax.swing.JButton regBtn;
    private javax.swing.JTextField regNameTxt;
    private javax.swing.JPasswordField regPass;
    private javax.swing.JPasswordField regRePass;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables

    void process(Message message) {
        processLoginMessage(message);
        processRegisterMessage(message);
        if (chatUI != null) {
            chatUI.process(message);
        }
    }
}
