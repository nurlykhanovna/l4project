/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alima
 */

import java.lang.Object;
import java.util.*;

public class Frame4 extends javax.swing.JFrame {

    /**
     * Creates new form Frame4
     */
    public Frame4() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Encrypt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("plaintext:");

        jLabel2.setText("key:");

        jLabel3.setText("ciphertext:");

        jButton2.setText("Decrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField4.setText("jTextField4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addComponent(jTextField1)))
                        .addContainerGap(115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 245, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(jButton1)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p = jTextField1.getText();//plaintext
        String k =jTextField3.getText().toLowerCase();//key
        String cipher="";
        
        int n = 0;
        char[][] m= {{'\0','\0','\0','\0','\0'},
                     {'\0','\0','\0','\0','\0'},
                     {'\0','\0','\0','\0','\0'},
                     {'\0','\0','\0','\0','\0'},
                     {'\0','\0','\0','\0','\0'},
              
        };//matrix
        
        k=k+"abcdefghiklmnopqrstuvwxyz";//addibg alphabet letter to the key, that later will help to fill the matrix
        k.replace('j','i');
        Set<Character> set = new LinkedHashSet<Character>();
		
		for(int u=0; u< k.length(); u++) {
			set.add(k.charAt(u));
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character ch: set) {
                    if(Character.isLetter(ch))
			sb.append(ch);
		}
		k = sb.toString();
                
                //using string builder and linked list we avoid duplicates in a key
  
        

        jTextField4.setText(k);
        for (int i=0;i<5;i++)
            for (int j=0;j<5;j++){
               

                m[i][j]=k.charAt(n);
            n++;
            }//we initialize array to the letters that are in a key
        
          int    z=1;
       while(z!=p.length()-1){         
           
        if (!Character.isLetter(p.charAt(z))){
        p = p.substring(0, z)+p.substring(z+1);
                }
                z++;
              
        }//eliminating whitespaces and other symbols from the plaintext
       
         for (int q = 1; q < p.length(); q++) {
             if (p.charAt(q)==p.charAt(q-1) && q%2==1){
             
             p = p.substring(0,q)+"x"+p.substring(q);
             }
            }//to avoid the repetition of letters in a pair of letters we insert letter X between them
         
         if (p.length()%2==1)
             p=p+"x"; //if the last letter is single we add the letter X
         char[] plain= p.toLowerCase().toCharArray();
              //converting string to lowercase char array
                 
         
         int row1=0,row2=0,col1=0,col2=0;
         
         
         for (int y=0;y<p.length()-1;y=y+2){
         
         for (int row=0;row<5;row++)
             for (int col=0;col<5;col++){
             if (plain[y]==m[row][col]){
             row1=row;
             col1=col;
             
             }
              if (plain[y+1]==m[row][col]){
             row2=row;
             col2=col;
             
             }
             
              //searching the plaintext letter in the matrix m
             }
         
         if (row1==row2){//Two plaintext letters that fall in the same row of the matrix are each replaced by 
//the letter to the right, with the first element of the row circularly following the 
//last.
         plain[y]=m[row1][(col1+1)%5];
         plain[y+1] = m[row2][(col2+1)%5];
         }
         else if (col1==col2){
             //Two plaintext letters that fall in the same column are each replaced by the letter 
             //beneath, with the top element of the column circularly following the last.
         plain[y]=m[(row1+1)%5][col1];
         plain[y+1] = m[(row2+1)%5][col2];
         
         }
         else {
             //Otherwise, each plaintext letter in a pair is replaced by the letter that lies in its 
            //own row and the column occupied by the other plaintext letter
         plain[y]=m[row1][col2];
         plain[y+1] = m[row2][col1];
         
         
         }
             
         }
         
         for (Character ch1 : plain)
                         cipher += ch1.toString();//converting char array back to string
        
         
        jTextField2.setText(cipher);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String c = jTextField2.getText();
        String k = jTextField3.getText();
        String p ="";
        
        int n = 0;
        char[][] m= {{'\0','\0','\0','\0','\0'},
            {'\0','\0','\0','\0','\0'},
            {'\0','\0','\0','\0','\0'},
               {'\0','\0','\0','\0','\0'},
                  {'\0','\0','\0','\0','\0'},
              
        };//matrix
        k=k+"abcdefghiklmnopqrstuvwxyz";//addibg alphabet letter to the key, that later will help to fill the matrix
        k.replace('j','i');
        Set<Character> set = new LinkedHashSet<Character>();
		
		for(int u=0; u< k.length(); u++) {
			set.add(k.charAt(u));
		}		
		StringBuilder sb = new StringBuilder();
		for(Character ch: set) {
                    if(Character.isLetter(ch))
			sb.append(ch);
		}
		k = sb.toString();
                
                //using string builder and linked list we avoid duplicates in a key
                
        for (int i=0;i<5;i++)
            for (int j=0;j<5;j++){
                  m[i][j]=k.charAt(n);
            n++;
            }
        
        char cipher[]= c.toLowerCase().toCharArray();
        
        int row1=0,row2=0,col1=0,col2=0;
         
         
         for (int y=0;y<c.length()-1;y=y+2){
         
         for (int row=0;row<5;row++)
             for (int col=0;col<5;col++){
             if (cipher[y]==m[row][col]){
             row1=row;
             col1=col;
             
             }
              if (cipher[y+1]==m[row][col]){
             row2=row;
             col2=col;
             
             }
             //searching the ciphertext letter in the matrix m
             
             }
         
         if (row1==row2){//Two ciphertext letters that fall in the same row of the matrix are each replaced by 
//the letter to the left, with the last element of the row circularly following the first.
         cipher[y]=m[row1][(col1+4)%5];
         cipher[y+1] = m[row2][(col2+4)%5];
         }
         else if (col1==col2){
             //Two ciphertext letters that fall in the same column are each replaced by the letter 
             //above, with the last element of the column circularly following the top
         cipher[y]=m[(row1+4)%5][col1];
         cipher[y+1] = m[(row2+4)%5][col2];
         
         }
         else {
             //Otherwise, each ciphertext letter in a pair is replaced by the letter that lies in its 
            //own row and the column occupied by the other ciphertext letter
         cipher[y]=m[row1][col2];
         cipher[y+1] = m[row2][col1];
         
         
         }
             
         }
         for (Character ch1 : cipher)
         
             p += ch1.toString();//converting char array back to string
        int r=1;
     while(r!=p.length()-3){
     if (p.charAt(r)=='x' && p.charAt(r-1) == p.charAt(r+1)){
     p = p.substring(0,r)+p.substring(r+1);
     }
         
     r++;
     //eliminatin the letter X that were inserted earlier
     
     }
         
         
        jTextField1.setText(p);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
