/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogo;

import com.sun.jdi.Value;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class jogo extends javax.swing.JFrame {

    /**
     * Creates new form jogo
     */
    String cont = "";
    String numero = "";
    String[] embaralhar = {"15","14","13","12","11","10","9","8","7","6","5","4","3","2","1",""};
    int contadorJogo = 0;
    
    public void embaralhamento (){
    
        
        List<String> lista = Arrays.asList(embaralhar);
        Collections.shuffle(lista);
        btn0.setText(lista.get(0));
        btn01.setText(lista.get(1));
        btn02.setText(lista.get(2));
        btn03.setText(lista.get(3));
        btn04.setText(lista.get(4));
        btn05.setText(lista.get(5));
        btn06.setText(lista.get(6));
        btn07.setText(lista.get(7));
        btn08.setText(lista.get(8));
        btn09.setText(lista.get(9));
        btn10.setText(lista.get(10));
        btn11.setText(lista.get(11));
        btn12.setText(lista.get(12));
        btn13.setText(lista.get(13));
        btn14.setText(lista.get(14));
        btn15.setText(lista.get(15)); 
    }    
    
    public jogo() {
        initComponents();
        embaralhamento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn15 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn09 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        contadorJogadas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 153, 255));

        btn15.setBackground(new java.awt.Color(0, 0, 255));
        btn15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn15.setForeground(new java.awt.Color(255, 255, 102));
        btn15.setText("15");
        btn15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn14.setBackground(new java.awt.Color(0, 0, 255));
        btn14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn14.setForeground(new java.awt.Color(255, 255, 102));
        btn14.setText("14");
        btn14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(0, 0, 255));
        btn13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn13.setForeground(new java.awt.Color(255, 255, 102));
        btn13.setText("13");
        btn13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(0, 0, 255));
        btn12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn12.setForeground(new java.awt.Color(255, 255, 102));
        btn12.setText("12");
        btn12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(0, 0, 255));
        btn11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn11.setForeground(new java.awt.Color(255, 255, 102));
        btn11.setText("11");
        btn11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(0, 0, 255));
        btn10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn10.setForeground(new java.awt.Color(255, 255, 102));
        btn10.setText("10");
        btn10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn09.setBackground(new java.awt.Color(0, 0, 255));
        btn09.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn09.setForeground(new java.awt.Color(255, 255, 102));
        btn09.setText("9");
        btn09.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn09ActionPerformed(evt);
            }
        });

        btn08.setBackground(new java.awt.Color(0, 0, 255));
        btn08.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn08.setForeground(new java.awt.Color(255, 255, 102));
        btn08.setText("8");
        btn08.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn08ActionPerformed(evt);
            }
        });

        btn07.setBackground(new java.awt.Color(0, 0, 255));
        btn07.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn07.setForeground(new java.awt.Color(255, 255, 102));
        btn07.setText("7");
        btn07.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn07ActionPerformed(evt);
            }
        });

        btn06.setBackground(new java.awt.Color(0, 0, 255));
        btn06.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn06.setForeground(new java.awt.Color(255, 255, 102));
        btn06.setText("6");
        btn06.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn06ActionPerformed(evt);
            }
        });

        btn05.setBackground(new java.awt.Color(0, 0, 255));
        btn05.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn05.setForeground(new java.awt.Color(255, 255, 102));
        btn05.setText("5");
        btn05.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });

        btn04.setBackground(new java.awt.Color(0, 0, 255));
        btn04.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn04.setForeground(new java.awt.Color(255, 255, 102));
        btn04.setText("4");
        btn04.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });

        btn03.setBackground(new java.awt.Color(0, 0, 255));
        btn03.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn03.setForeground(new java.awt.Color(255, 255, 102));
        btn03.setText("3");
        btn03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn02.setBackground(new java.awt.Color(0, 0, 255));
        btn02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn02.setForeground(new java.awt.Color(255, 255, 102));
        btn02.setText("2");
        btn02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn01.setBackground(new java.awt.Color(0, 0, 255));
        btn01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn01.setForeground(new java.awt.Color(255, 255, 102));
        btn01.setText("1");
        btn01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 255));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 102));
        btn0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(51, 51, 255));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Embaralhar");
        btnIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnResultado.setBackground(new java.awt.Color(51, 51, 255));
        btnResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(255, 255, 255));
        btnResultado.setText("Resultado");
        btnResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        contadorJogadas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contadorJogadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contadorJogadas.setText("0");
        contadorJogadas.setToolTipText("");
        contadorJogadas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contadorJogadas.setFocusable(false);
        contadorJogadas.setVerifyInputWhenFocusTarget(false);
        contadorJogadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contadorJogadasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn09, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contadorJogadas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contadorJogadas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn09, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        contadorJogadas.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void verificationVoid (JButton one, JButton two){
        if(one.getText().equals("")){
            numero = two.getText();
            two.setText("");
            one.setText(numero);
            contadorJogo++;
            contadorJogadas.setText(String.valueOf(contadorJogo));
        }
    }
    
    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        verificationVoid(btn14, btn13);
        verificationVoid(btn12, btn13);
        verificationVoid(btn09, btn13);        
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        verificationVoid(btn14, btn15);
        verificationVoid(btn11, btn15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        verificationVoid(btn15, btn14);
        verificationVoid(btn13, btn14);
        verificationVoid(btn10, btn14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        verificationVoid(btn13, btn12);
        verificationVoid(btn08, btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        verificationVoid(btn15, btn11);
        verificationVoid(btn10, btn11);
        verificationVoid(btn07, btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        verificationVoid(btn14, btn10);
        verificationVoid(btn11, btn10);
        verificationVoid(btn09, btn10);
        verificationVoid(btn06, btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn09ActionPerformed
        verificationVoid(btn13, btn09);
        verificationVoid(btn10, btn09);
        verificationVoid(btn08, btn09);
        verificationVoid(btn05, btn09);
    }//GEN-LAST:event_btn09ActionPerformed

    private void btn08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn08ActionPerformed
        verificationVoid(btn12, btn08);
        verificationVoid(btn09, btn08);
        verificationVoid(btn04, btn08);
    }//GEN-LAST:event_btn08ActionPerformed

    private void btn07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn07ActionPerformed
        verificationVoid(btn11, btn07);
        verificationVoid(btn06, btn07);
        verificationVoid(btn03, btn07);
    }//GEN-LAST:event_btn07ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        verificationVoid(btn10, btn06);
        verificationVoid(btn07, btn06);
        verificationVoid(btn05, btn06);
        verificationVoid(btn02, btn06);
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        verificationVoid(btn09, btn05);
        verificationVoid(btn06, btn05);
        verificationVoid(btn04, btn05);
        verificationVoid(btn01, btn05);
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        verificationVoid(btn08, btn04);
        verificationVoid(btn05, btn04);
        verificationVoid(btn0, btn04);  
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        verificationVoid(btn04, btn0);
        verificationVoid(btn01, btn0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        verificationVoid(btn05, btn01);
        verificationVoid(btn02, btn01);
        verificationVoid(btn0, btn01);
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        verificationVoid(btn06, btn02);
        verificationVoid(btn03, btn02);
        verificationVoid(btn01, btn02);
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        verificationVoid(btn07, btn03);
        verificationVoid(btn02, btn03);
    }//GEN-LAST:event_btn03ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        embaralhamento();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        if(btn15.getText().equals("1") && btn14.getText().equals("2") && btn13.getText().equals("3") 
                && btn12.getText().equals("4") && btn11.getText().equals("5") && btn10.getText().equals("6") 
                && btn09.getText().equals("7") && btn08.getText().equals("8") && btn07.getText().equals("9") 
                && btn06.getText().equals("10") && btn05.getText().equals("11") && btn04.getText().equals("12") 
                && btn03.getText().equals("13") && btn02.getText().equals("14") && btn01.getText().equals("15") 
                && btn0.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Você venceu o jogo" + String.valueOf(contadorJogo));
        }else {
            JOptionPane.showMessageDialog(null, "Continue tentando");
        }
        
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void contadorJogadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contadorJogadasActionPerformed
        // TODO add your handling code here:
        
        String cont = "0";
        
    }//GEN-LAST:event_contadorJogadasActionPerformed

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
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn07;
    private javax.swing.JButton btn08;
    private javax.swing.JButton btn09;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JTextField contadorJogadas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
