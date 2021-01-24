
package calctest;


public class JCalc extends javax.swing.JFrame {

    
    public JCalc() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button44 = new javax.swing.JButton();
        buttonx = new javax.swing.JButton();
        button55 = new javax.swing.JButton();
        buttonEqual = new javax.swing.JButton();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button44.setBackground(new java.awt.Color(255, 204, 204));
        button44.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        button44.setText("4");
        button44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button44ActionPerformed(evt);
            }
        });

        buttonx.setBackground(new java.awt.Color(255, 204, 204));
        buttonx.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonx.setText("x");
        buttonx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonxActionPerformed(evt);
            }
        });

        button55.setBackground(new java.awt.Color(255, 204, 204));
        button55.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        button55.setText("5");
        button55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button55ActionPerformed(evt);
            }
        });

        buttonEqual.setBackground(new java.awt.Color(255, 204, 204));
        buttonEqual.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonEqual.setText("=");
        buttonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualActionPerformed(evt);
            }
        });

        txt.setBackground(new java.awt.Color(255, 255, 153));
        txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button44, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonx, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button55, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button44, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonx, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button55, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button44ActionPerformed
        txt.setText(txt.getText()+"4");
    }//GEN-LAST:event_button44ActionPerformed

    private void button55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button55ActionPerformed
         txt.setText(txt.getText()+"5");
    }//GEN-LAST:event_button55ActionPerformed

    private void buttonxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonxActionPerformed
       n1=Double.parseDouble(txt.getText());
       oper='*';
       txt.setText("");
       
    }//GEN-LAST:event_buttonxActionPerformed

    private void buttonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualActionPerformed
        n2=Double.parseDouble(txt.getText()); 
        switch(oper){
           case  '*':
          res=n1*n2;
          break;
    }
        txt.setText(String.valueOf(res));
        
    }//GEN-LAST:event_buttonEqualActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed
     double n1,n2,res;
     char oper;
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button44;
    private javax.swing.JButton button55;
    private javax.swing.JButton buttonEqual;
    private javax.swing.JButton buttonx;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
