/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartWindows;

import UserInfo.CustomUser;
import UserInfo.User;
import api.CovidConnection;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author jodic
 */
public class CovidRegister extends javax.swing.JFrame {
CustomUser cu;
RegisterWindow rw;

String loc;
    /**
     * Creates new form CovidRegister
     */
    public CovidRegister() {
        initComponents();
    }
public CovidRegister(RegisterWindow rw, CustomUser cu){
    this.cu = cu;
    this.rw = rw;
    initComponents();
    this.setTitle("Covid Information Register: 2/5 (\u2713OOOO)");
    this.setLocationRelativeTo(null);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jrbtnCovidUseState = new javax.swing.JRadioButton();
        jrbtnCovidNewState = new javax.swing.JRadioButton();
        jcbStateSel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbtnNext = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jrbtnYesCovid = new javax.swing.JRadioButton();
        jrbtnNoCovid = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrbtnCovidUseState.setText("Use State/Territory you live in");
        jrbtnCovidUseState.setEnabled(false);
        jrbtnCovidUseState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnCovidUseStateActionPerformed(evt);
            }
        });

        jrbtnCovidNewState.setText("Select New State/Territory");
        jrbtnCovidNewState.setEnabled(false);
        jrbtnCovidNewState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnCovidNewStateActionPerformed(evt);
            }
        });

        jcbStateSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Select-One->", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming", "Washington", "DC", "American Samoa", "Baker Island", "Guam", "Howland Island", "Jarvis Island", "Johnston Atoll", "Kingman Reef", "Midway Islands", "Navassa Island", "Northern", "Mariana Islands", "Palmyra Atoll", "Puerto Rico", "Virgin Islands", "Wake Island" }));
        jcbStateSel.setEnabled(false);
        jcbStateSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStateSelActionPerformed(evt);
            }
        });

        jLabel1.setText("Would you like to Use the location that you have provided or look at another location?");
        jLabel1.setOpaque(true);

        jbtnNext.setBackground(new java.awt.Color(153, 153, 153));
        jbtnNext.setText("Next");
        jbtnNext.setBorderPainted(false);
        jbtnNext.setEnabled(false);
        jbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNextActionPerformed(evt);
            }
        });

        jbtnBack.setBackground(new java.awt.Color(153, 153, 153));
        jbtnBack.setText("Back to Main Menu");
        jbtnBack.setBorderPainted(false);
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Would you like to get Covid-19 information?");

        jrbtnYesCovid.setText("I would Like Covid-19 info");
        jrbtnYesCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnYesCovidActionPerformed(evt);
            }
        });

        jrbtnNoCovid.setText("I would not like Covid-19 info");
        jrbtnNoCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnNoCovidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jrbtnYesCovid)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnNoCovid)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnYesCovid)
                    .addComponent(jrbtnNoCovid))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbStateSel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbtnCovidUseState)
                                .addGap(71, 71, 71)
                                .addComponent(jrbtnCovidNewState, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnBack)
                                .addGap(224, 224, 224)
                                .addComponent(jbtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnCovidUseState)
                    .addComponent(jrbtnCovidNewState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbStateSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtnCovidUseStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnCovidUseStateActionPerformed
        if(jrbtnCovidUseState.isSelected()){
            jrbtnCovidNewState.setEnabled(true);
            jrbtnCovidUseState.setEnabled(false);
            jrbtnCovidNewState.setSelected(false);
            jcbStateSel.setEnabled(false);
        }
    }//GEN-LAST:event_jrbtnCovidUseStateActionPerformed

    private void jrbtnCovidNewStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnCovidNewStateActionPerformed
        if(jrbtnCovidNewState.isSelected()){
            jrbtnCovidUseState.setEnabled(true);
            jrbtnCovidNewState.setEnabled(false);
            jrbtnCovidUseState.setSelected(false);
            jcbStateSel.setEnabled(true);
        }
    }//GEN-LAST:event_jrbtnCovidNewStateActionPerformed

    private void jcbStateSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStateSelActionPerformed
        // TODO add your handling code here:
        loc = jcbStateSel.getSelectedItem().toString();
        System.out.println(loc);
    }//GEN-LAST:event_jcbStateSelActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        this.dispose();
        rw.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNextActionPerformed
        // TODO add your handling code here:
       //Get the code to get whether one of the items is being selected
      if(jrbtnYesCovid.isSelected()){
       if(jrbtnCovidUseState.isSelected()){
           cu.setCovidstate(cu.getStateTerritory());
           CovidConnection cc = new CovidConnection(cu.getStateTerritory());
           cu.setCovid(cc);
       }
       else if(jrbtnCovidNewState.isSelected()){
           if(loc =="<-Select-One->"){
               JOptionPane.showMessageDialog(this, "Need to select a State");
               return;
           }
           else{
               CovidConnection newState= new CovidConnection(loc);
               cu.setCovidstate(loc);
               cu.setCovid(newState);
           }
       }
       cu.setIsCovid(true);
      }
      else if(jrbtnNoCovid.isSelected()){
          cu.setIsCovid(false);
      }
      System.out.print("Covid Info:Entered");
      System.out.println(cu.getCovidinfo());
        this.setVisible(false);
        //cu.useCovid(false); //Implemented to make sure that if user does not want this feature
       // cu.setCovid();
        NewsRegister nr = new NewsRegister(cu, this);
        nr.setVisible(true);
    }//GEN-LAST:event_jbtnNextActionPerformed

    private void jrbtnYesCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnYesCovidActionPerformed
       if(jrbtnYesCovid.isSelected()){
           jrbtnYesCovid.setEnabled(false);
           jbtnNext.setEnabled(true);
           jrbtnCovidNewState.setEnabled(true);
           jrbtnCovidUseState.setEnabled(true);
           jrbtnNoCovid.setSelected(false);
           jrbtnNoCovid.setEnabled(true);
       }
    }//GEN-LAST:event_jrbtnYesCovidActionPerformed

    private void jrbtnNoCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnNoCovidActionPerformed
       if(jrbtnNoCovid.isSelected()){
           jrbtnYesCovid.setEnabled(true);
           jrbtnYesCovid.setSelected(false);
           jrbtnNoCovid.setEnabled(false);
           jrbtnCovidUseState.setEnabled(false);
           jrbtnCovidNewState.setEnabled(false);
           jbtnNext.setEnabled(true);
       }
    }//GEN-LAST:event_jrbtnNoCovidActionPerformed

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
            java.util.logging.Logger.getLogger(CovidRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnNext;
    private javax.swing.JComboBox<String> jcbStateSel;
    private javax.swing.JRadioButton jrbtnCovidNewState;
    private javax.swing.JRadioButton jrbtnCovidUseState;
    private javax.swing.JRadioButton jrbtnNoCovid;
    private javax.swing.JRadioButton jrbtnYesCovid;
    // End of variables declaration//GEN-END:variables
}
