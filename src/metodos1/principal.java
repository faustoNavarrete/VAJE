/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos1;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    DefaultTableModel modelo = new DefaultTableModel();

    public principal() {
        initComponents();
        modelo.addColumn("X");
        modelo.addColumn("Y");
        jTableDatos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jTextField_X = new javax.swing.JTextField();
        jTextField_Y = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Intervalo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jLabel1.setText("X:");

        jLabel2.setText("Y:");

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Agregar Punto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingreso de datos:");

        jLabel5.setText("Con que intervalo desea calcular la tabla de investigacion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField_Intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(jTextField_X, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Interpolacion de Lagrange");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    public void lagrange1(float x[], float y[]) {

        float valX7Polin, valX6Polin, valX5Polin, valX4Polin, valX3Polin, valX2Polin, valXPolin, valCPolin;
        int n = x.length;
        double[] datosPolinomio = new double[n];
        
        Polinomio polinomio = new Polinomio();
        switch (n) {
            case 2:
                valXPolin = ((y[0] / (x[0] - x[1])) + (y[1] / (x[1] - x[0])));
                valCPolin = ((-(y[0] * x[1]) / (x[0] - x[1])) - ((y[1] * x[0]) / (x[1] - x[0])));

                datosPolinomio[0] = valXPolin;
                datosPolinomio[1] = valCPolin;
                
                polinomio.jLabelValorPolinomio.setText("("+valXPolin+")*x+("+valCPolin+")");
               
               
                break;
            case 3:
                valX2Polin = (((y[0]) / ((x[0] - x[1]) * (x[0] - x[2])))) + (((y[1]) / ((x[1] - x[0]) * (x[1] - x[2])))) + (((y[2]) / ((x[2] - x[0]) * (x[2] - x[1]))));
                valXPolin = ((((y[0]) * (-x[2] - x[1])) / ((x[0] - x[1]) * (x[0] - x[2])))) + ((((y[1]) * (-x[2] - x[0])) / ((x[1] - x[0]) * (x[1] - x[2])))) + ((((y[2]) * (-x[1] - x[0])) / ((x[2] - x[0]) * (x[2] - x[1]))));
                valCPolin = (((y[0] * x[1] * x[2]) / ((x[0] - x[1]) * (x[0] - x[2])))) + (((y[1] * x[0] * x[2]) / ((x[1] - x[0]) * (x[1] - x[2])))) + (((y[2] * x[0] * x[1]) / ((x[2] - x[0]) * (x[2] - x[1]))));

                datosPolinomio[0] = valX2Polin;
                datosPolinomio[1] = valXPolin;
                datosPolinomio[2] = valCPolin;

                polinomio.jLabelValorPolinomio.setText("("+valX2Polin+")*x^2+("+ valXPolin+")*x+("+valCPolin+")");
                
                
                break;
            case 4:
                valX3Polin = (((y[0]) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])))) + (((y[1]) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])))) + (((y[2]) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])))) + (((y[3]) / ((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2]))));
                valX2Polin = ((((y[0]) * (-x[2] - x[1] - x[3])) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])))) + ((((y[1]) * (-x[3] - x[2] - x[0])) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])))) + ((((y[2]) * (-x[3] - x[1] - x[0])) / (((((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3]))))))) + ((((y[3]) * (-x[2] - x[1] - x[0])) / (((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2])))));
                valXPolin = ((((y[0]) * (x[2] * x[3] + x[1] * x[3] + x[1] * x[2])) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])))) + ((((y[1]) * (x[0] * x[2] + x[2] * x[3] + x[3] * x[0])) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])))) + ((((y[2]) * (x[0] * x[1] + x[3] * x[1] + x[3] * x[0])) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])))) + ((((y[3]) * (x[0] * x[1] + x[2] * x[1] + x[2] * x[0])) / ((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2]))));
                valCPolin = (((y[0] * (-x[1] * x[2] * x[3])) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])))) + (((y[1] * (-x[0] * x[2] * x[3])) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])))) + (((y[2] * (-x[0] * x[1] * x[3])) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])))) + (((y[3] * (-x[0] * x[1] * x[2])) / ((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2]))));

                datosPolinomio[0] = valX3Polin;
                datosPolinomio[1] = valX2Polin;
                datosPolinomio[2] = valXPolin;
                datosPolinomio[3] = valCPolin;
                
                polinomio.jLabelValorPolinomio.setText("("+valX3Polin+")*x^3+"+"("+valX2Polin+")*x^2+("+ valXPolin+")*x+("+valCPolin+")");
                
                break;
            case 5:
                valX4Polin = (((y[0]) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])*(x[0] - x[4])))) + (((y[1]) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])*(x[1] - x[4])))) + (((y[2]) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])*(x[2] - x[4])))) + (((y[3]) / ((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2])*(x[3] - x[4])))) + (((y[4]) / ((x[4] - x[0]) * (x[4] - x[1]) * (x[4] - x[2])*(x[4] - x[3]))));
                valX3Polin = ((((y[0]) * (-x[2] - x[1] - x[3]-x[4])) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])*(x[0] - x[4])))) + ((((y[1]) * (-x[3] - x[2] - x[0]-x[4])) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])*(x[1] - x[4])))) + ((((y[2]) * (-x[3] - x[1] - x[0]-x[4])) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])*(x[2] - x[4])))) + ((((y[3]) * (-x[2] - x[1] - x[0]-x[4])) / ((x[3] - x[1]) * (x[3] - x[2])*(x[3] - x[4]))));
                
                valX2Polin = ((((y[0]) * (x[2] * x[3] + x[1] * x[3] + x[1] * x[2])) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])))) + ((((y[1]) * (x[0] * x[2] + x[2] * x[3] + x[3] * x[0])) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])))) + ((((y[2]) * (x[0] * x[1] + x[3] * x[1] + x[3] * x[0])) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])))) + ((((y[3]) * (x[0] * x[1] + x[2] * x[1] + x[2] * x[0])) / ((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2]))));
                valXPolin=1;
                valCPolin = (((y[0] * (-x[1] * x[2] * x[3])) / ((x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3])))) + (((y[1] * (-x[0] * x[2] * x[3])) / ((x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3])))) + (((y[2] * (-x[0] * x[1] * x[3])) / ((x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3])))) + (((y[3] * (-x[0] * x[1] * x[2])) / ((x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2]))));

                datosPolinomio[0] = valX4Polin;
                datosPolinomio[1] = valX3Polin;
                datosPolinomio[2] = valXPolin;
                datosPolinomio[3] = valCPolin;
                
                polinomio.jLabelValorPolinomio.setText("("+valX4Polin+")*x^4+"+"("+valX3Polin+")*x^3+"+"("+valX2Polin+")*x^2+("+ valXPolin+")*x+("+valCPolin+")");
                
                break;
        }
        float intervalo=Float.parseFloat(jTextField_Intervalo.getText());
        polinomio.investigacion(datosPolinomio, intervalo);
                polinomio.setVisible(true);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (validarCampos()) {
            Object[] datos = new Object[2];
            datos[0] = jTextField_X.getText();
            datos[1] = jTextField_Y.getText();
            modelo.addRow(datos);

            jTextField_X.setText("");
            jTextField_Y.setText("");
            
            jTextField_X.requestFocus();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TableModel modelo = jTableDatos.getModel();
        int nDatos = modelo.getRowCount();
        float[] x = new float[nDatos];
        float[] y = new float[nDatos];
        for (int i = 0; i < nDatos; i++) {
            x[i] = Float.valueOf(modelo.getValueAt(i, 0).toString());
            y[i] = Float.valueOf(modelo.getValueAt(i, 1).toString());

        }

        lagrange1(x, y);

    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean validarCampos() {
        if (jTextField_X.equals("")) {
            return false;
        }
        if (jTextField_Y.equals("")) {
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextField_Intervalo;
    private javax.swing.JTextField jTextField_X;
    private javax.swing.JTextField jTextField_Y;
    // End of variables declaration//GEN-END:variables
}
