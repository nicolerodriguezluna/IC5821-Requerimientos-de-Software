/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controller;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Nott
 */
public class FrameLogIn extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogIn
     */
    int xMouse, yMouse;
    public FrameLogIn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buttonCreateAccount = new javax.swing.JButton();
        LabelAnyAccount = new javax.swing.JLabel();
        txtCorreoOrPhoneLogIn = new javax.swing.JTextField();
        buttonRecuperationAccount = new javax.swing.JButton();
        buttomNext = new javax.swing.JButton();
        txtPasswordLogIn = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(231, 222, 217));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setPreferredSize(new java.awt.Dimension(700, 600));
        bg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bgKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(168, 168, 168));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Iniciar sesión");

        jPanel4.setBackground(new java.awt.Color(0, 103, 184));
        jPanel4.setPreferredSize(new java.awt.Dimension(305, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        buttonCreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        buttonCreateAccount.setForeground(new java.awt.Color(40, 127, 195));
        buttonCreateAccount.setText("Cree una.");
        buttonCreateAccount.setContentAreaFilled(false);
        buttonCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCreateAccountMouseClicked(evt);
            }
        });
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateAccountActionPerformed(evt);
            }
        });

        LabelAnyAccount.setText("¿No tiene ninguna cuenta?");

        txtCorreoOrPhoneLogIn.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreoOrPhoneLogIn.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreoOrPhoneLogIn.setText("Correo electrónico o teléfono");
        txtCorreoOrPhoneLogIn.setBorder(null);
        txtCorreoOrPhoneLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCorreoOrPhoneLogIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCorreoOrPhoneLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoOrPhoneLogInMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoOrPhoneLogInMousePressed(evt);
            }
        });
        txtCorreoOrPhoneLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoOrPhoneLogInActionPerformed(evt);
            }
        });
        txtCorreoOrPhoneLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoOrPhoneLogInKeyPressed(evt);
            }
        });

        buttonRecuperationAccount.setBackground(new java.awt.Color(255, 255, 255));
        buttonRecuperationAccount.setForeground(new java.awt.Color(40, 127, 195));
        buttonRecuperationAccount.setText("¿No puede acceder a su cuenta?");
        buttonRecuperationAccount.setContentAreaFilled(false);
        buttonRecuperationAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRecuperationAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonRecuperationAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRecuperationAccountMouseClicked(evt);
            }
        });
        buttonRecuperationAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecuperationAccountActionPerformed(evt);
            }
        });

        buttomNext.setBackground(new java.awt.Color(0, 103, 184));
        buttomNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttomNext.setForeground(new java.awt.Color(255, 255, 255));
        buttomNext.setBorder(null);
        buttomNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomNext.setLabel("Siguiente");
        buttomNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomNextActionPerformed(evt);
            }
        });
        buttomNext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttomNextKeyPressed(evt);
            }
        });

        txtPasswordLogIn.setForeground(new java.awt.Color(102, 102, 102));
        txtPasswordLogIn.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordLogIn.setText("Contraseña");
        txtPasswordLogIn.setBorder(null);
        txtPasswordLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPasswordLogIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPasswordLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordLogInMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordLogInMousePressed(evt);
            }
        });
        txtPasswordLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordLogInActionPerformed(evt);
            }
        });
        txtPasswordLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordLogInKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttomNext, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(LabelAnyAccount)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonCreateAccount))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(191, 191, 191))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoOrPhoneLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(buttonRecuperationAccount))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(txtPasswordLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreoOrPhoneLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAnyAccount)
                    .addComponent(buttonCreateAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRecuperationAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttomNext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(txtPasswordLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        ExitButton.setText("X");
        ExitButton.setBorder(null);
        ExitButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ExitButtonMouseDragged(evt);
            }
        });
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonMousePressed(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(231, 222, 217));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                headerKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreateAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCreateAccountMouseClicked

    private void buttonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateAccountActionPerformed
        // TODO add your handling code here:
//        CreateNewAccount FrameCA = new CreateNewAccount();
//        FrameCA.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_buttonCreateAccountActionPerformed

    private void txtCorreoOrPhoneLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoOrPhoneLogInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoOrPhoneLogInMouseClicked

    private void txtCorreoOrPhoneLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoOrPhoneLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoOrPhoneLogInActionPerformed

    private void buttonRecuperationAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRecuperationAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRecuperationAccountMouseClicked

    private void buttonRecuperationAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRecuperationAccountActionPerformed
        // TODO add your handling code here:
//        FrameAccountRecuperation FrameRA = new FrameAccountRecuperation();
//        FrameRA.setVisible(true);
//        this.setVisible(false); 
    }//GEN-LAST:event_buttonRecuperationAccountActionPerformed

    private void buttomNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomNextActionPerformed
        // TODO add your handling code here:
        String email = txtCorreoOrPhoneLogIn.getText();
        if(emailValidation(email)){
            FrameFinalAccount FrameLandingPlace = new FrameFinalAccount();
            FrameLandingPlace.setVisible(true);
            this.setVisible(false);
        }else{
             JOptionPane.showMessageDialog(bg, "Correo no tiene el formato correcto");
        }
    }//GEN-LAST:event_buttomNextActionPerformed

    private void txtCorreoOrPhoneLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoOrPhoneLogInMousePressed
        // TODO add your handling code here:
        if (txtCorreoOrPhoneLogIn.getText().equals("Correo electrónico, teléfono o Skype")){
            txtCorreoOrPhoneLogIn.setText(""); 
            txtCorreoOrPhoneLogIn.setForeground(Color.black);
        } 
    }//GEN-LAST:event_txtCorreoOrPhoneLogInMousePressed
    public boolean emailValidation(String email) {
       String reg = "^(.+)@(\\S+)$";
       Pattern pattern = Pattern.compile(reg);
       Matcher matcher = pattern.matcher(email);
       return matcher.matches();
    }
    private void txtCorreoOrPhoneLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoOrPhoneLogInKeyPressed
        // TODO add your handling code here:
      int key = evt.getKeyCode();  // Keyboard code for the pressed key.
      if (key == KeyEvent.VK_ENTER) {
        String email = txtCorreoOrPhoneLogIn.getText();
        if(emailValidation(email)){
            FrameFinalAccount FrameLandingPlace = new FrameFinalAccount();
            FrameLandingPlace.setVisible(true);
            this.setVisible(false);
        }else{
             JOptionPane.showMessageDialog(bg, "Correo no tiene el formato correcto");
        }
      }
    }//GEN-LAST:event_txtCorreoOrPhoneLogInKeyPressed

    private void buttomNextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttomNextKeyPressed
        // TODO add your handling code here:
        String email = txtCorreoOrPhoneLogIn.getText();
        if(emailValidation(email)){
            FrameFinalAccount FrameLandingPlace = new FrameFinalAccount();
            FrameLandingPlace.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttomNextKeyPressed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ExitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ExitButtonMousePressed

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        // TODO add your handling code here:
        ExitButton.setBackground(Color.white);
    }//GEN-LAST:event_ExitButtonMouseExited

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void ExitButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_ExitButtonMouseDragged

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        // TODO add your handling code here:
        ExitButton.setBackground(Color.red);
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void txtPasswordLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordLogInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordLogInMouseClicked

    private void txtPasswordLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordLogInMousePressed
        // TODO add your handling code here:
        if (txtPasswordLogIn.getText().equals("Contraseña")){
            txtPasswordLogIn.setText("");
            txtPasswordLogIn.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPasswordLogInMousePressed

    private void txtPasswordLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordLogInActionPerformed

    private void txtPasswordLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordLogInKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();  // Keyboard code for the pressed key.
        if (key == KeyEvent.VK_ENTER) {
            if(!txtPasswordLogIn.getText().isEmpty() && !txtPasswordLogIn.getText().equals("Contraseña")){
                FrameFinalAccount FrameFLPlace = new FrameFinalAccount();
                FrameFLPlace.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(bg, "Contraseña no válida");
            }

        }
    }//GEN-LAST:event_txtPasswordLogInKeyPressed

    private void bgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgKeyPressed
        // TODO add your handling code here
    }//GEN-LAST:event_bgKeyPressed

    private void headerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_headerKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_headerKeyPressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LabelAnyAccount;
    private javax.swing.JPanel bg;
    private javax.swing.JButton buttomNext;
    private javax.swing.JButton buttonCreateAccount;
    private javax.swing.JButton buttonRecuperationAccount;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCorreoOrPhoneLogIn;
    private javax.swing.JTextField txtPasswordLogIn;
    // End of variables declaration//GEN-END:variables
}
