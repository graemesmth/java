/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Ian
 */
public class LandingPageAdmin extends javax.swing.JPanel {

    /**
     * Creates new form LandingPageAdmin1
     */
    public LandingPageAdmin() {
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

        tasks_panel = new javax.swing.JPanel();
        grading_button = new javax.swing.JButton();
        viewing_button = new javax.swing.JButton();

        tasks_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tasks"));

        grading_button.setText("Grading");
        grading_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grading_buttonActionPerformed(evt);
            }
        });

        viewing_button.setText("Viewing");

        javax.swing.GroupLayout tasks_panelLayout = new javax.swing.GroupLayout(tasks_panel);
        tasks_panel.setLayout(tasks_panelLayout);
        tasks_panelLayout.setHorizontalGroup(
            tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewing_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grading_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        tasks_panelLayout.setVerticalGroup(
            tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(grading_button)
                .addGap(30, 30, 30)
                .addComponent(viewing_button)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tasks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(tasks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void grading_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grading_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grading_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton grading_button;
    private javax.swing.JPanel tasks_panel;
    private javax.swing.JButton viewing_button;
    // End of variables declaration//GEN-END:variables
}
