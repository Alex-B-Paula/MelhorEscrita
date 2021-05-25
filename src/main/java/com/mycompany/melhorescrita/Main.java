/*
 */
package com.mycompany.melhorescrita;

import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 * Classe Principal do programa Melhor Escrita para a AV2 de Programação Orientada a Objeto
 * @author Alex Barbosa - Matricula: 2014000174 - Turma: 136
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Jframe
     */
    public Main() {
        initComponents();
    }

    /**
     * Método gerado pelo NetBeans com a formatação do Jframe.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        //Codigo Customizado para definir o pangrama atual
        jLabelPangrama = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPangrama = new javax.swing.JTextArea();
        jLabelResultado = new javax.swing.JLabel();
        //Modificação do código para contador de pontuação
        jLabelPontuacao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonU = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonComma = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonSemi = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonAccent = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonÇ = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jButtonA = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonTil = new javax.swing.JButton();
        jButtonPeriod = new javax.swing.JButton();
        jButtonSpace = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        jLabel1.setText("Escreva o pangrama abaixo sem olhar para o teclado. Pressione Enter para confirmar.");

        jLabelPangrama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPangrama.setText(Pan.GetPangrama(numAtual));

        jTextPangrama.setColumns(20);
        jTextPangrama.setRows(5);
        jTextPangrama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPangramaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPangramaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPangrama);

        jLabelResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelPontuacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPontuacao.setText("Pontuação: 0");

        jPanel1.setPreferredSize(new java.awt.Dimension(840, 250));

        jButtonU.setBackground(java.awt.Color.lightGray);
        jButtonU.setText("U");

        jButtonBack.setBackground(java.awt.Color.lightGray);
        jButtonBack.setText("Backspace");

        jButtonComma.setBackground(java.awt.Color.lightGray);
        jButtonComma.setText(",");

        jButtonJ.setBackground(java.awt.Color.lightGray);
        jButtonJ.setText("J");

        jButton4.setBackground(java.awt.Color.lightGray);
        jButton4.setText("4");

        jButtonD.setBackground(java.awt.Color.lightGray);
        jButtonD.setText("D");

        jButton7.setBackground(java.awt.Color.lightGray);
        jButton7.setText("7");

        jButton3.setBackground(java.awt.Color.lightGray);
        jButton3.setText("3");

        jButtonW.setBackground(java.awt.Color.lightGray);
        jButtonW.setText("W");

        jButtonN.setBackground(java.awt.Color.lightGray);
        jButtonN.setText("N");

        jButtonL.setBackground(java.awt.Color.lightGray);
        jButtonL.setText("L");

        jButtonI.setBackground(java.awt.Color.lightGray);
        jButtonI.setText("I");

        jButtonP.setBackground(java.awt.Color.lightGray);
        jButtonP.setText("P");

        jButton9.setBackground(java.awt.Color.lightGray);
        jButton9.setText("9");

        jButtonK.setBackground(java.awt.Color.lightGray);
        jButtonK.setText("K");

        jButtonQ.setBackground(java.awt.Color.lightGray);
        jButtonQ.setText("Q");

        jButtonM.setBackground(java.awt.Color.lightGray);
        jButtonM.setText("M");

        jButtonV.setBackground(java.awt.Color.lightGray);
        jButtonV.setText("V");

        jButtonC.setBackground(java.awt.Color.lightGray);
        jButtonC.setText("C");

        jButtonB.setBackground(java.awt.Color.lightGray);
        jButtonB.setText("B");

        jButtonT.setBackground(java.awt.Color.lightGray);
        jButtonT.setText("T");

        jButtonRight.setBackground(java.awt.Color.lightGray);
        jButtonRight.setText("/");

        jButtonG.setBackground(java.awt.Color.lightGray);
        jButtonG.setText("G");

        jButtonS.setBackground(java.awt.Color.lightGray);
        jButtonS.setText("S");

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setText("2");

        jButtonF.setBackground(java.awt.Color.lightGray);
        jButtonF.setText("F");

        jButtonR.setBackground(java.awt.Color.lightGray);
        jButtonR.setText("R");

        jButton8.setBackground(java.awt.Color.lightGray);
        jButton8.setText("8");

        jButton0.setBackground(java.awt.Color.lightGray);
        jButton0.setText("0");

        jButtonSemi.setBackground(java.awt.Color.lightGray);
        jButtonSemi.setText(";");

        jButtonOpen.setBackground(java.awt.Color.lightGray);
        jButtonOpen.setText("[");

        jButtonH.setBackground(java.awt.Color.lightGray);
        jButtonH.setText("H");

        jButtonEnter.setBackground(java.awt.Color.lightGray);
        jButtonEnter.setText("Enter");

        jButtonMinus.setBackground(java.awt.Color.lightGray);
        jButtonMinus.setText("-");

        jButtonAccent.setBackground(java.awt.Color.lightGray);
        jButtonAccent.setText("´");

        jButtonY.setBackground(java.awt.Color.lightGray);
        jButtonY.setText("Y");

        jButtonÇ.setBackground(java.awt.Color.lightGray);
        jButtonÇ.setText("Ç");

        jButtonClose.setBackground(java.awt.Color.lightGray);
        jButtonClose.setText("]");

        jButtonA.setBackground(java.awt.Color.lightGray);
        jButtonA.setText("A");

        jButtonZ.setBackground(java.awt.Color.lightGray);
        jButtonZ.setText("Z");

        jButtonEquals.setBackground(java.awt.Color.lightGray);
        jButtonEquals.setText("=");

        jButtonTil.setBackground(java.awt.Color.lightGray);
        jButtonTil.setText("~");

        jButtonPeriod.setBackground(java.awt.Color.lightGray);
        jButtonPeriod.setText(".");

        jButtonSpace.setBackground(java.awt.Color.lightGray);
        jButtonSpace.setText("Space");

        jButtonX.setBackground(java.awt.Color.lightGray);
        jButtonX.setText("X");

        jButton5.setBackground(java.awt.Color.lightGray);
        jButton5.setText("5");

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setText("6");

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setText("1");

        jButtonE.setBackground(java.awt.Color.lightGray);
        jButtonE.setText("E");

        jButtonO.setBackground(java.awt.Color.lightGray);
        jButtonO.setText("O");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonQ)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonW)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonT)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonY)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonU)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonO)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonAccent)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonOpen))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMinus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonEquals)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonÇ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClose))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonZ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonComma))
                                    .addComponent(jButtonSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPeriod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSemi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRight)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonA, jButtonAccent, jButtonB, jButtonC, jButtonClose, jButtonComma, jButtonD, jButtonE, jButtonEquals, jButtonF, jButtonG, jButtonH, jButtonI, jButtonJ, jButtonK, jButtonL, jButtonM, jButtonMinus, jButtonN, jButtonO, jButtonOpen, jButtonP, jButtonPeriod, jButtonQ, jButtonR, jButtonRight, jButtonS, jButtonSemi, jButtonT, jButtonTil, jButtonU, jButtonV, jButtonW, jButtonX, jButtonY, jButtonZ, jButtonÇ});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonMinus)
                        .addComponent(jButtonEquals)
                        .addComponent(jButton0))
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonQ)
                            .addComponent(jButtonW)
                            .addComponent(jButtonE)
                            .addComponent(jButtonR)
                            .addComponent(jButtonT)
                            .addComponent(jButtonY)
                            .addComponent(jButtonU)
                            .addComponent(jButtonI)
                            .addComponent(jButtonO)
                            .addComponent(jButtonP)
                            .addComponent(jButtonAccent)
                            .addComponent(jButtonOpen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonA)
                            .addComponent(jButtonS)
                            .addComponent(jButtonD)
                            .addComponent(jButtonF)
                            .addComponent(jButtonG)
                            .addComponent(jButtonH)
                            .addComponent(jButtonJ)
                            .addComponent(jButtonK)
                            .addComponent(jButtonL)
                            .addComponent(jButtonÇ)
                            .addComponent(jButtonTil)
                            .addComponent(jButtonClose)))
                    .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZ)
                    .addComponent(jButtonX)
                    .addComponent(jButtonC)
                    .addComponent(jButtonV)
                    .addComponent(jButtonB)
                    .addComponent(jButtonN)
                    .addComponent(jButtonM)
                    .addComponent(jButtonComma)
                    .addComponent(jButtonPeriod)
                    .addComponent(jButtonSemi)
                    .addComponent(jButtonRight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonA, jButtonAccent, jButtonB, jButtonC, jButtonClose, jButtonComma, jButtonD, jButtonE, jButtonEquals, jButtonF, jButtonG, jButtonH, jButtonI, jButtonJ, jButtonK, jButtonL, jButtonM, jButtonMinus, jButtonN, jButtonO, jButtonOpen, jButtonP, jButtonPeriod, jButtonQ, jButtonR, jButtonRight, jButtonS, jButtonSemi, jButtonT, jButtonTil, jButtonU, jButtonV, jButtonW, jButtonX, jButtonY, jButtonZ, jButtonÇ});

        jButtonQ.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(761, 761, 761)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelPangrama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPangrama, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que retorna as teclas do teclado que estavam pressionadas e foram
     * liberadas. Cada decisão abaixo representa uma letra do teclado que quando
     * liberada retorna seu respectivo jButton a seu estado original.
     */
    private void jTextPangramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPangramaKeyReleased
        

        
        if (evt.getKeyCode() == 49) {
            jButton1.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 50) {
            jButton2.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 51) {
            jButton3.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 52) {
            jButton4.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 53) {
            jButton5.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 54) {
            jButton6.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 55) {
            jButton7.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 56) {
            jButton8.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 57) {
            jButton9.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 48) {
            jButton0.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_MINUS) {
            jButtonMinus.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_EQUALS) {
            jButtonEquals.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 81) {
            jButtonQ.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 87) {
            jButtonW.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 69) {
            jButtonE.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 82) {
            jButtonR.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 84) {
            jButtonT.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 89) {
            jButtonY.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 85) {
            jButtonU.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 73) {
            jButtonI.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 79) {
            jButtonO.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 80) {
            jButtonP.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DEAD_ACUTE) {
            jButtonAccent.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
            jButtonOpen.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 65) {
            jButtonA.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 83) {
            jButtonS.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 68) {
            jButtonD.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 70) {
            jButtonF.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 71) {
            jButtonG.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 72) {
            jButtonH.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 74) {
            jButtonJ.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 75) {
            jButtonK.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 76) {
            jButtonL.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyChar() == 'ç') {
            jButtonÇ.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DEAD_TILDE) {
            jButtonTil.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
            jButtonClose.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 90) {
            jButtonZ.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 88) {
            jButtonX.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 67) {
            jButtonC.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 86) {
            jButtonV.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 66) {
            jButtonB.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 78) {
            jButtonN.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == 77) {
            jButtonM.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_COMMA) {
            jButtonComma.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            jButtonPeriod.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEMICOLON) {
            jButtonSemi.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyChar() == '/') {
            jButtonRight.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            jButtonBack.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jButtonSpace.setBackground(Color.LIGHT_GRAY);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonEnter.setBackground(Color.LIGHT_GRAY);
        }

        
    }//GEN-LAST:event_jTextPangramaKeyReleased

    /**
     * Evento que retorna as teclas que foram presionadas. Cada decisão abaixo
     * representa uma letra do teclado que, quando pressionada, muda sua cor de
     * fundo.
     */
    private void jTextPangramaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPangramaKeyPressed


        
        if (evt.getKeyCode() == 49) {
            jButton1.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 50) {
            jButton2.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 51) {
            jButton3.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 52) {
            jButton4.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 53) {
            jButton5.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 54) {
            jButton6.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 55) {
            jButton7.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 56) {
            jButton8.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 57) {
            jButton9.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 48) {
            jButton0.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_MINUS) {
            jButtonMinus.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_EQUALS) {
            jButtonEquals.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 81) {
            jButtonQ.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 87) {
            jButtonW.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 69) {
            jButtonE.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 82) {
            jButtonR.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 84) {
            jButtonT.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 89) {
            jButtonY.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 85) {
            jButtonU.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 73) {
            jButtonI.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 79) {
            jButtonO.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 80) {
            jButtonP.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DEAD_ACUTE) {
            jButtonAccent.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
            jButtonOpen.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 65) {
            jButtonA.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 83) {
            jButtonS.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 68) {
            jButtonD.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 70) {
            jButtonF.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 71) {
            jButtonG.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 72) {
            jButtonH.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 74) {
            jButtonJ.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 75) {
            jButtonK.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 76) {
            jButtonL.setBackground(Color.WHITE);
        }
        if (evt.getKeyChar() == 'ç') {
            jButtonÇ.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DEAD_TILDE) {
            jButtonTil.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
            jButtonClose.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 90) {
            jButtonZ.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 88) {
            jButtonX.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 67) {
            jButtonC.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 86) {
            jButtonV.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 66) {
            jButtonB.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 78) {
            jButtonN.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == 77) {
            jButtonM.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_COMMA) {
            jButtonComma.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            jButtonPeriod.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEMICOLON) {
            jButtonSemi.setBackground(Color.WHITE);
        }
        if (evt.getKeyChar() == '/') {
            jButtonRight.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            jButtonBack.setBackground(Color.WHITE);
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jButtonSpace.setBackground(Color.WHITE);
        }
        
        // Junto com o mudança de cor, pressionar a tecla Enter verifica se o pangrama está correto e retorna o resultado
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonEnter.setBackground(Color.WHITE);

            Verificador Veri = new Verificador();
            boolean Resultado;
            // O texto digitado pelo usuário é enviada para classe Verificador para comparar com o pangrama.
            Resultado = Veri.Verificar(numAtual, jTextPangrama.getText());
            // Um novo pangrama é retirado da classe Pangrama e colocado no programa.
            numAtual = numAtual + 1;
            jLabelPangrama.setText(Pan.GetPangrama(numAtual));
            jTextPangrama.setText("");
            
            //A resultado do Verificado é apresentado para o usuário e a pontuação sobe caso seja necessário
            if (Resultado == true) {
                Pontuacao = Pontuacao + 1;
                jLabelPontuacao.setText("Pontuação: " + String.valueOf(Pontuacao));
                jLabelResultado.setText("Correto!");
            } else {
                jLabelResultado.setText("Errado!");
            }
        }
        
        switch(evt.getKeyCode()){
            case KeyEvent.VK_SEMICOLON -> jButtonSemi.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jTextPangramaKeyPressed

    /**
     * @param args the command line arguments
     * Método main.
     */
    public static void main(String args[]) {
        /* Código look and feel Nimbus.  */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
            
 
            
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonAccent;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonComma;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonPeriod;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonSemi;
    private javax.swing.JButton jButtonSpace;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonTil;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JButton jButtonÇ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPangrama;
    Pangramas Pan = new Pangramas();
    int numAtual = 0;
    private javax.swing.JLabel jLabelPontuacao;
    private int Pontuacao = 0;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextPangrama;
    // End of variables declaration//GEN-END:variables
}
