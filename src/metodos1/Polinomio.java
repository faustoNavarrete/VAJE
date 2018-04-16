package metodos1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Graficacion.Principal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Polinomio extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio
     */
    DefaultTableModel modeloIntervalos = new DefaultTableModel();

    public Polinomio() {
        initComponents();
        tablasEncabesados();
        jTable_investigacion.setModel(investigacion);

        modeloIntervalos.addColumn("X1");
        modeloIntervalos.addColumn("X2");
        jTableDatos.setModel(modeloIntervalos);

    }

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tap1 = new DefaultTableModel();
    DefaultTableModel tap2 = new DefaultTableModel();

    private void tablasEncabesados() {
        modelo.addColumn("X");
        modelo.addColumn("Y");
        investigacion.addColumn("K");
        investigacion.addColumn("X1");
        investigacion.addColumn("X2");
        investigacion.addColumn("F(X1)");
        investigacion.addColumn("F(X2)");
        investigacion.addColumn("F(X1)*F(X2)");
        investigacion.addColumn("SIGNO");
        tap1.addColumn("k");
        tap1.addColumn("X1");
        tap1.addColumn("X2");
        tap1.addColumn("F(X1)");
        tap1.addColumn("F(X2)");
        tap1.addColumn("E");
        tap1.addColumn("X3");
        tap1.addColumn("F(X3)");
        tap1.addColumn("F(X1)*F(X3)");
        tap2.addColumn("k");
        tap2.addColumn("X1");
        tap2.addColumn("X2");
        tap2.addColumn("F(X1)");
        tap2.addColumn("F(X2)");
        tap2.addColumn("E");
        tap2.addColumn("X3");
        tap2.addColumn("F(X3)");
        tap2.addColumn("F(X1)*F(X3)");

    }

    DefaultTableModel investigacion = new DefaultTableModel();

    public double y(double r[], double x) {
        double res = 0;
        int s = r.length - 1;
        for (int i = 0; i < r.length; i++) {

            res += r[i] * Math.pow(x, s);

            s--;
        }

        return res;
    }

    public void investigacion(double r[], float intervalo) {
        double[] inter = new double[4];
        Object[] datos = new Object[inter.length];
        double rmax;
        if (r.length == 1) {
            rmax = 0;

        } else if (r.length == 2) {
            rmax = Math.sqrt(Math.pow(r[1] / r[0], 2));
        } else {
            rmax = Math.sqrt(Math.pow(r[1] / r[0], 2) - 2 * (r[2] / r[0]));
        }

        double ini = (double) ((int) rmax + 1);
        System.out.println("ini" + ini);
        jLabelValorRMax.setText(String.valueOf(rmax));
        jLabelValorInicio.setText(String.valueOf(ini));

        Object[] datosA = new Object[7];
        Object[] datosB = new Object[7];

        int conm = 0, i = 1;
        
        datosA[0] = "0";
        datosA[1] = ini;
        datosA[2] = ini - intervalo;
        datosA[3] = y(r, ini);
        datosA[4] = y(r, ini - intervalo);
        double mul = (double) datosA[4] * (double) datosA[3];
        datosA[5] = mul;
        if (mul > 0) {
            datosA[6] = "+";
        } else {
            datosA[6] = "-";
            if (conm == 0) {
                    inter[conm] = (double) datosA[1];
                    inter[conm + 1] = (double) datosA[2];
                    for (int j = 0; j < inter.length; j++) {
                        datos[j] = String.valueOf(inter[j]);
                    }
                    modeloIntervalos.addRow(datos);

                } else {
                    inter[conm + 1] = (double) datosA[1];
                    inter[conm + 2] = (double) datosA[2];
                    for (int j = 0; j < inter.length; j++) {
                        datos[j] = String.valueOf(inter[j]);
                    }
                    modeloIntervalos.addRow(datos);

                }
        }
        
        
        investigacion.addRow(datosA);

        conm = 0;
        
        while (conm != 2) {
            datosB[0] = i;
            datosB[1] = datosA[2];
            double res = (double) datosB[1] - (double) intervalo;
            datosB[2] = res;
            datosB[3] = y(r, (double) datosB[1]);
            datosB[4] = y(r, (double) datosB[2]);
            double aux = (double) datosB[4] * (double) datosB[3];
            datosB[5] = aux;
            if (aux > 0) {
                datosB[6] = "+";
            } else {
                datosB[6] = "-";
                if (conm == 0) {
                    inter[conm] = (double) datosB[1];
                    inter[conm + 1] = (double) datosB[2];
                    for (int j = 0; j < inter.length; j++) {
                        datos[j] = String.valueOf(inter[j]);
                    }
                    modeloIntervalos.addRow(datos);

                } else {
                    inter[conm + 1] = (double) datosB[1];
                    inter[conm + 2] = (double) datosB[2];
                    for (int j = 0; j < inter.length; j++) {
                        datos[j] = String.valueOf(inter[j]);
                    }
                    modeloIntervalos.addRow(datos);

                }

                

                conm++;
            }
            if (i == 25) {
                if (conm == 0) {
                    inter[0] = (double) 0;
                    inter[1] = (double) 0;
                    //inter[2] = (double) 0;
                    //inter[3] = (double) 0;
                } else {
                    //inter[2] = (double) 0;
                //    inter[3] = (double) 0;
                }
                conm = 2;
            }
            datosA[2] = datosB[2];
            
            i++;
            investigacion.addRow(datosB);
        }
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoInterpolacion = new javax.swing.ButtonGroup();
        buttonGroupInterpolacionX = new javax.swing.ButtonGroup();
        buttonGroupInterpolacionY = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_3Datos_Cancelar = new javax.swing.JButton();
        jButton_3Datos_Aceptar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelValorPolinomio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_SignoPolinomio2Datos2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_investigacion = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabelValorRMax = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelValorInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Interpolacion de Lagrange");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Polinomio encontrado:");

        jButton_3Datos_Cancelar.setText("Cancelar");
        jButton_3Datos_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3Datos_CancelarActionPerformed(evt);
            }
        });

        jButton_3Datos_Aceptar.setText("Graficar");
        jButton_3Datos_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3Datos_AceptarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("P(x) =");

        jLabelValorPolinomio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_SignoPolinomio2Datos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SignoPolinomio2Datos2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(jLabelValorPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_SignoPolinomio2Datos2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_SignoPolinomio2Datos2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(jLabelValorPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tabla de Investigacion:");

        jTable_investigacion.setBackground(new java.awt.Color(204, 255, 204));
        jTable_investigacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "K", "X1", "X2", "F(X1)", "F(X2)", "F(X1)*F(X2)", "SIGNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable_investigacion);

        jLabel3.setText("Intervalos encontrados:");

        jLabelValorRMax.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDatosMouseClicked(evt);
            }
        });
        jTableDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableDatosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        jLabel4.setText("rMax=");

        jLabel5.setText("Punto de Inicio:");

        jLabelValorInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelValorRMax, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelValorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_3Datos_Cancelar)
                        .addGap(179, 179, 179)
                        .addComponent(jButton_3Datos_Aceptar)
                        .addGap(405, 405, 405)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelValorRMax, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabelValorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_3Datos_Aceptar)
                    .addComponent(jButton_3Datos_Cancelar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_3Datos_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3Datos_AceptarActionPerformed
        // TODO add your handling code here:
        Principal graficar = new Principal();
        String funcion = jLabelValorPolinomio.getText();
        System.out.println(funcion);

        graficar.generarGrafica(funcion, 20, -20);
        graficar.jLabel_FuncionGrafico.setText(funcion);
        graficar.setVisible(true);
    }//GEN-LAST:event_jButton_3Datos_AceptarActionPerformed

    private void jButton_3Datos_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3Datos_CancelarActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jButton_3Datos_CancelarActionPerformed

    private void jTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 1) {
            // JOptionPane.showMessageDialog(null, "Pulso el izquierdo");
        } else if (evt.getButton() == 2) {
            //JOptionPane.showMessageDialog(null, "Pulso el central");
        } else if (evt.getButton() == 3) {
            //JOptionPane.showMessageDialog(null, "Pulso el derecho");
            //jPopupMenu1.show(jTableDatos, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTableDatosMouseClicked

    private void jTableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableDatosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableDatosKeyPressed

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
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polinomio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupInterpolacionX;
    private javax.swing.ButtonGroup buttonGroupInterpolacionY;
    private javax.swing.ButtonGroup buttonGroupTipoInterpolacion;
    private javax.swing.JButton jButton_3Datos_Aceptar;
    private javax.swing.JButton jButton_3Datos_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelValorInicio;
    public static javax.swing.JLabel jLabelValorPolinomio;
    private javax.swing.JLabel jLabelValorRMax;
    private javax.swing.JLabel jLabel_SignoPolinomio2Datos2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTable jTable_investigacion;
    // End of variables declaration//GEN-END:variables
}
