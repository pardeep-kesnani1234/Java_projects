/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 *
 * @author pardeep
 */
public class Calculators extends javax.swing.JFrame {
double firstnum;
double secondnum;
double result;
String operations;

    /**
     * Creates new form Calculators
     */
    public Calculators() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtDisplay = new javax.swing.JTextField();
        jButn1 = new javax.swing.JButton();
        jButn2 = new javax.swing.JButton();
        jButn5 = new javax.swing.JButton();
        jButn6 = new javax.swing.JButton();
        jButn9 = new javax.swing.JButton();
        jButn0 = new javax.swing.JButton();
        jButnmult = new javax.swing.JButton();
        jButndivi = new javax.swing.JButton();
        jButn3 = new javax.swing.JButton();
        jButn4 = new javax.swing.JButton();
        jButn7 = new javax.swing.JButton();
        jButn8 = new javax.swing.JButton();
        jButnadd = new javax.swing.JButton();
        jButnsub = new javax.swing.JButton();
        jButnneg = new javax.swing.JButton();
        jButndot = new javax.swing.JButton();
        jButnequal = new javax.swing.JButton();
        jButnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn1.setText("1");
        jButn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn1ActionPerformed(evt);
            }
        });

        jButn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn2.setText("2");
        jButn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn2ActionPerformed(evt);
            }
        });

        jButn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn5.setText("5");
        jButn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn5ActionPerformed(evt);
            }
        });

        jButn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn6.setText("6");
        jButn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn6ActionPerformed(evt);
            }
        });

        jButn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn9.setText("9");
        jButn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn9ActionPerformed(evt);
            }
        });

        jButn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn0.setText("0");
        jButn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn0ActionPerformed(evt);
            }
        });

        jButnmult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButnmult.setText("*");
        jButnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButnmultActionPerformed(evt);
            }
        });

        jButndivi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButndivi.setText("/");
        jButndivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButndiviActionPerformed(evt);
            }
        });

        jButn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn3.setText("3");
        jButn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn3ActionPerformed(evt);
            }
        });

        jButn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn4.setText("4");
        jButn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn4ActionPerformed(evt);
            }
        });

        jButn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn7.setText("7");
        jButn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn7ActionPerformed(evt);
            }
        });

        jButn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButn8.setText("8");
        jButn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButn8ActionPerformed(evt);
            }
        });

        jButnadd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButnadd.setText("+");
        jButnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButnaddActionPerformed(evt);
            }
        });

        jButnsub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButnsub.setText("-");
        jButnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButnsubActionPerformed(evt);
            }
        });

        jButnneg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButnneg.setText("+/-");
        jButnneg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButnnegActionPerformed(evt);
            }
        });

        jButndot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButndot.setText(".");
        jButndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButndotActionPerformed(evt);
            }
        });

        jButnequal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButnequal.setText("=");
        jButnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButnequalActionPerformed(evt);
            }
        });

        jButnclear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButnclear.setText("c");
        jButnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtxtDisplay)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButnmult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButndivi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButnneg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButndot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButn2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButn0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButnmult, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButndivi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButnneg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButndot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn3ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn3.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn3ActionPerformed

    private void jButn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn1ActionPerformed
        String Enternumber=jtxtDisplay.getText()+jButn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn1ActionPerformed

    private void jButn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn2ActionPerformed
       String Enternumber=jtxtDisplay.getText()+jButn2.getText();
       jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn2ActionPerformed

    private void jButn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn4ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn4.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn4ActionPerformed

    private void jButn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn5ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn5.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn5ActionPerformed

    private void jButn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn6ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn6.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn6ActionPerformed

    private void jButn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn7ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn7.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn7ActionPerformed

    private void jButn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn8ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn8.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn8ActionPerformed

    private void jButn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn9ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn9.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn9ActionPerformed

    private void jButn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButn0ActionPerformed
String Enternumber=jtxtDisplay.getText()+jButn0.getText();
jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButn0ActionPerformed

    private void jButnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButnaddActionPerformed
 firstnum=Double.parseDouble(jtxtDisplay.getText());
 jtxtDisplay.setText("");
 operations="+";
    }//GEN-LAST:event_jButnaddActionPerformed

    private void jButnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButnsubActionPerformed
firstnum=Double.parseDouble(jtxtDisplay.getText());
jtxtDisplay.setText("");
operations="-";
    }//GEN-LAST:event_jButnsubActionPerformed

    private void jButnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButnmultActionPerformed
firstnum=Double.parseDouble(jtxtDisplay.getText());
jtxtDisplay.setText("");
operations="*";
    }//GEN-LAST:event_jButnmultActionPerformed

    private void jButndiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButndiviActionPerformed
firstnum=Double.parseDouble(jtxtDisplay.getText());
jtxtDisplay.setText("");
operations="/";
    }//GEN-LAST:event_jButndiviActionPerformed

    private void jButndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButndotActionPerformed
  String Enternumber=jtxtDisplay.getText()+jButndot.getText();
  jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButndotActionPerformed

    private void jButnnegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButnnegActionPerformed
  double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
  ops=ops*(-1);
  jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButnnegActionPerformed

    private void jButnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButnequalActionPerformed
   String answer;
   secondnum=Double.parseDouble(jtxtDisplay.getText());
   if (operations == "+")
   {
       result=firstnum+secondnum;
       answer=String.format("%.0f", result);
       jtxtDisplay.setText(answer);
   }
  else if (operations == "-")
   {
       result=firstnum - secondnum;
       answer=String.format("%.0f",result );
       jtxtDisplay.setText(answer);
       
    }//GEN-LAST:event_jButnequalActionPerformed
    else if (operations == "*")
{
    result =firstnum * secondnum;
    answer=String.format("%.0f",result);
    jtxtDisplay.setText(answer);
}
 else if (operations == "/")
   {
       result=firstnum / secondnum;
       answer=String.format("%.0f",result);
       jtxtDisplay.setText(answer);
   }
    }
    
    private void jButnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButnclearActionPerformed
   jtxtDisplay.setText("");
    }//GEN-LAST:event_jButnclearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculators().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButn0;
    private javax.swing.JButton jButn1;
    private javax.swing.JButton jButn2;
    private javax.swing.JButton jButn3;
    private javax.swing.JButton jButn4;
    private javax.swing.JButton jButn5;
    private javax.swing.JButton jButn6;
    private javax.swing.JButton jButn7;
    private javax.swing.JButton jButn8;
    private javax.swing.JButton jButn9;
    private javax.swing.JButton jButnadd;
    private javax.swing.JButton jButnclear;
    private javax.swing.JButton jButndivi;
    private javax.swing.JButton jButndot;
    private javax.swing.JButton jButnequal;
    private javax.swing.JButton jButnmult;
    private javax.swing.JButton jButnneg;
    private javax.swing.JButton jButnsub;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
