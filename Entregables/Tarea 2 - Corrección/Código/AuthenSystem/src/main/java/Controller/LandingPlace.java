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
public class LandingPlace extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogIn
     */
    int xMouse, yMouse;
    public LandingPlace() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        generalInfoTxt = new javax.swing.JLabel();
        generalInfoTxt1 = new javax.swing.JLabel();
        generalInfoTxt2 = new javax.swing.JLabel();
        generalInfoTxt3 = new javax.swing.JLabel();
        generalInfoTxt4 = new javax.swing.JLabel();
        generalInfoTxt5 = new javax.swing.JLabel();
        generalInfoTxt6 = new javax.swing.JLabel();
        generalInfoTxt7 = new javax.swing.JLabel();
        generalInfoTxt8 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        insideScrollPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

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

        generalInfoTxt.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt.setText("Información general");
        generalInfoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxtMouseExited(evt);
            }
        });

        generalInfoTxt1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt1.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt1.setText("Configuración y privacidad");
        generalInfoTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt1MouseExited(evt);
            }
        });

        generalInfoTxt2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt2.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt2.setText("Información de seguridad");
        generalInfoTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt2MouseExited(evt);
            }
        });

        generalInfoTxt3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt3.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt3.setText("Dispositivos");
        generalInfoTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt3MouseExited(evt);
            }
        });

        generalInfoTxt4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt4.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt4.setText("Contraseñas");
        generalInfoTxt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt4MouseExited(evt);
            }
        });

        generalInfoTxt5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt5.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt5.setText("Organizaciones");
        generalInfoTxt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt5MouseExited(evt);
            }
        });

        generalInfoTxt6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt6.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt6.setText("Suscripciones");
        generalInfoTxt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt6MouseExited(evt);
            }
        });

        generalInfoTxt7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt7.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt7.setText("Mis inicios de sesión");
        generalInfoTxt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt7MouseExited(evt);
            }
        });

        generalInfoTxt8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        generalInfoTxt8.setForeground(new java.awt.Color(102, 102, 102));
        generalInfoTxt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalInfoTxt8.setText("Aplicaciones Office");
        generalInfoTxt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generalInfoTxt8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generalInfoTxt8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(generalInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
            .addComponent(generalInfoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(generalInfoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(generalInfoTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(generalInfoTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(generalInfoTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generalInfoTxt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generalInfoTxt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generalInfoTxt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addComponent(generalInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(generalInfoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(generalInfoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(generalInfoTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalInfoTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalInfoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(generalInfoTxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(generalInfoTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalInfoTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
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

        insideScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Información de seguridad");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        textArea.setRows(5);
        textArea.setText(" Mantenga actualizados los\n métodos de comprobación y \n la información de seguridad");
        textArea.setBorder(null);
        jScrollPane1.setViewportView(textArea);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 120, 212));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Actualizar información");

        javax.swing.GroupLayout insideScrollPaneLayout = new javax.swing.GroupLayout(insideScrollPane);
        insideScrollPane.setLayout(insideScrollPaneLayout);
        insideScrollPaneLayout.setHorizontalGroup(
            insideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insideScrollPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insideScrollPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(insideScrollPaneLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insideScrollPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        insideScrollPaneLayout.setVerticalGroup(
            insideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insideScrollPaneLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

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
            .addGap(0, 565, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgKeyPressed
        // TODO add your handling code here
    }//GEN-LAST:event_bgKeyPressed

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

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        // TODO add your handling code here:
        ExitButton.setBackground(Color.red);
    }//GEN-LAST:event_ExitButtonMouseEntered

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

    private void generalInfoTxt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt8MouseExited

    private void generalInfoTxt8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt8MouseEntered

    private void generalInfoTxt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt7MouseExited

    private void generalInfoTxt7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt7MouseEntered

    private void generalInfoTxt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt6MouseExited

    private void generalInfoTxt6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt6MouseEntered

    private void generalInfoTxt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt5MouseExited

    private void generalInfoTxt5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt5MouseEntered

    private void generalInfoTxt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt4MouseExited

    private void generalInfoTxt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt4MouseEntered

    private void generalInfoTxt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt3MouseExited

    private void generalInfoTxt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt3MouseEntered

    private void generalInfoTxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt2MouseExited

    private void generalInfoTxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt2MouseEntered

    private void generalInfoTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt1MouseExited

    private void generalInfoTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTxt1MouseEntered

    private void generalInfoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxtMouseExited
//        generalInfoPanel.setBackground(Color.white);
//        generalInfoTxt.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_generalInfoTxtMouseExited

    private void generalInfoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalInfoTxtMouseEntered
//        generalInfoPanel.setBackground(new Color(168,168,168));
//        generalInfoTxt.setForeground(new Color(0,120,212));
    }//GEN-LAST:event_generalInfoTxtMouseEntered

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

    private void headerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_headerKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_headerKeyPressed
    public boolean emailValidation(String email) {
       String reg = "^(.+)@(\\S+)$";
       Pattern pattern = Pattern.compile(reg);
       Matcher matcher = pattern.matcher(email);
       return matcher.matches();
    }
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
            java.util.logging.Logger.getLogger(LandingPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPlace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel generalInfoTxt;
    private javax.swing.JLabel generalInfoTxt1;
    private javax.swing.JLabel generalInfoTxt2;
    private javax.swing.JLabel generalInfoTxt3;
    private javax.swing.JLabel generalInfoTxt4;
    private javax.swing.JLabel generalInfoTxt5;
    private javax.swing.JLabel generalInfoTxt6;
    private javax.swing.JLabel generalInfoTxt7;
    private javax.swing.JLabel generalInfoTxt8;
    private javax.swing.JPanel header;
    private javax.swing.JPanel insideScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
