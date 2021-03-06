/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooksproject;

/**
 *
 * @author GİZER
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBookjButton1 = new javax.swing.JButton();
        DeleteBookjButton2 = new javax.swing.JButton();
        BookInformationjButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ListBooksbyauthorjButton1 = new javax.swing.JButton();
        ListBooksbyCategoryjButton1 = new javax.swing.JButton();
        BookCoverjButton2 = new javax.swing.JButton();
        ListBooksjButton3 = new javax.swing.JButton();
        sortedjButton1 = new javax.swing.JButton();
        exitjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 7680));

        AddBookjButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AddBookjButton1.setText("Add Book");
        AddBookjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookjButton1ActionPerformed(evt);
            }
        });

        DeleteBookjButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DeleteBookjButton2.setText("Delete Book");
        DeleteBookjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookjButton2ActionPerformed(evt);
            }
        });

        BookInformationjButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BookInformationjButton3.setText("Book Information");
        BookInformationjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookInformationjButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MY LIBRARY");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 40));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        ListBooksbyauthorjButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ListBooksbyauthorjButton1.setText("List Books by Author");
        ListBooksbyauthorjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBooksbyauthorjButton1ActionPerformed(evt);
            }
        });

        ListBooksbyCategoryjButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ListBooksbyCategoryjButton1.setText("List Books by Category");
        ListBooksbyCategoryjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBooksbyCategoryjButton1ActionPerformed(evt);
            }
        });

        BookCoverjButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BookCoverjButton2.setText("Book Cover");
        BookCoverjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookCoverjButton2ActionPerformed(evt);
            }
        });

        ListBooksjButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ListBooksjButton3.setText("Finished Book");
        ListBooksjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBooksjButton3ActionPerformed(evt);
            }
        });

        sortedjButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sortedjButton1.setText("List Books by Sorted Category");
        sortedjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortedjButton1ActionPerformed(evt);
            }
        });

        exitjButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitjButton2.setForeground(new java.awt.Color(255, 0, 51));
        exitjButton2.setText("Exit");
        exitjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(565, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddBookjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListBooksjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortedjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookCoverjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBookjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookInformationjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListBooksbyauthorjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListBooksbyCategoryjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(663, 663, 663))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(AddBookjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBookjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookInformationjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookCoverjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListBooksbyauthorjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListBooksbyCategoryjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortedjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListBooksjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookjButton1ActionPerformed
        new AddBook().setVisible(true);
    }//GEN-LAST:event_AddBookjButton1ActionPerformed

    private void DeleteBookjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBookjButton2ActionPerformed
        new DeleteBook().setVisible(true);
    }//GEN-LAST:event_DeleteBookjButton2ActionPerformed

    private void BookInformationjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookInformationjButton3ActionPerformed
        new BookInformation().setVisible(true);
    }//GEN-LAST:event_BookInformationjButton3ActionPerformed

    private void ListBooksbyCategoryjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBooksbyCategoryjButton1ActionPerformed
        new ListbyCategory().setVisible(true);
    }//GEN-LAST:event_ListBooksbyCategoryjButton1ActionPerformed

    private void exitjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitjButton2ActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_exitjButton2ActionPerformed

    private void BookCoverjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookCoverjButton2ActionPerformed
        new BookCover().setVisible(true);
    }//GEN-LAST:event_BookCoverjButton2ActionPerformed

    private void ListBooksbyauthorjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBooksbyauthorjButton1ActionPerformed
        new ListAuthor().setVisible(true);
    }//GEN-LAST:event_ListBooksbyauthorjButton1ActionPerformed

    private void ListBooksjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBooksjButton3ActionPerformed
        new FinishedBook().setVisible(true);
    }//GEN-LAST:event_ListBooksjButton3ActionPerformed

    private void sortedjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortedjButton1ActionPerformed
        new ListbyCategorySorted().setVisible(true);
    }//GEN-LAST:event_sortedjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookjButton1;
    private javax.swing.JButton BookCoverjButton2;
    private javax.swing.JButton BookInformationjButton3;
    private javax.swing.JButton DeleteBookjButton2;
    private javax.swing.JButton ListBooksbyCategoryjButton1;
    private javax.swing.JButton ListBooksbyauthorjButton1;
    private javax.swing.JButton ListBooksjButton3;
    private javax.swing.JButton exitjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sortedjButton1;
    // End of variables declaration//GEN-END:variables
}
