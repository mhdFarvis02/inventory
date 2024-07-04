
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class inventorymenegment extends javax.swing.JFrame {
private static final String username="root";
   private static final String password="";
   private static final String url="jdbc:mysql://localhost:3306/product_details";
   
   Connection sqlcon=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   
   int q, i, id, deleteitem;
    
    public inventorymenegment() {
        initComponents();
    }

   public void update(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
                pst=(PreparedStatement) sqlcon.prepareStatement("select * from product"); 
                
               rs=(ResultSet) pst.executeQuery();
                ResultSetMetaData stdata=(ResultSetMetaData) rs.getMetaData();
               
                 q= stdata.getColumnCount();
                 
               DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 RecordTable.setRowCount(0);
                 
                 while(rs.next()){
                     Vector columnData=new Vector();
                     for(i=1;i<= q; i++){

                         columnData.add(rs.getString("productid"));
                         columnData.add(rs.getString("productname"));
                         columnData.add(rs.getString("catagory"));
                         columnData.add(rs.getString("price"));
                         columnData.add(rs.getString("quantity"));
                         columnData.add(rs.getString("availablestokess"));
                         
                     }
                    RecordTable.addRow(columnData);
                 }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
        }
                
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        pcata = new javax.swing.JTextField();
        pquant = new javax.swing.JTextField();
        pas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        updateS = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Shop Invetory Inventory System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Product id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Catagory");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Available stoke");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Product name");

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });

        pcata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcataActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Print");

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        updateS.setBackground(new java.awt.Color(51, 0, 255));
        updateS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateS.setText("Update");
        updateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 0, 255));
        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "pid", "pname", "catagary", "price", "quantity", "avalblestoke"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(pname)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(add)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pquant)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pprice, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(pcata)
                                        .addComponent(pas))
                                    .addComponent(updateS))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(93, 93, 93)
                .addComponent(jButton3)
                .addGap(95, 95, 95)
                .addComponent(jButton4)
                .addGap(134, 134, 134))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(pcata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(updateS)
                    .addComponent(add)
                    .addComponent(jButton4))
                .addGap(75, 75, 75)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void pcataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcataActionPerformed
private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame("Exit");
      if(JOptionPane.showConfirmDialog(frame,"confirm exit","mysqlconnn",JOptionPane.YES_NO_OPTION)
              ==JOptionPane.YES_OPTION){
          
      }
     System.exit(0);
              
    }//GEN-LAST:event_exitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pid.setText("");
     pname.setText("");
    pcata.setText("");
     pprice.setText("");
    
     pquant.setText("");
     pas.setText("");
                             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.mysql.jdbc.Driver");
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
pst=(PreparedStatement) sqlcon.prepareStatement
        ("insert into product(productid, productname, catagory, price, quantity, availablestokess) values(?,?,?,?,?,?)");
                
                pst.setString(1,pid.getText());
                pst.setString(2,pname.getText());
                pst.setString(3,pcata.getText());
                pst.setString(4,pprice.getText());
                pst.setString(5,pquant.getText());
                pst.setString(6, pas.getText());
                     
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "record add");
                     update();
          }
           catch(ClassNotFoundException ex){
              java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
              
          }
          
          catch(Exception ex){
              java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
              
          }
    }                                   

    private void jTextidActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
         DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
           pid.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;   
           pname.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           pcata.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           pprice.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           pquant.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           pas.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
                                      

    }                                    

    private void printActionPerformed(java.awt.event.ActionEvent evt) {                                      
       
                                       

    }//GEN-LAST:event_addActionPerformed

    private void updateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
                 
                 try{
                     id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
                Class.forName("com.mysql.jdbc.Driver");
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
                 pst=(PreparedStatement) sqlcon.prepareStatement
("update product set productid=?, productname=?, catagory=?, price=?, quantity=?, availableStokess=? where productid =? ");
               
                 
                 /*int i = jTable1.getSelectedRow();
                DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                if(i >=0){*/
                    
                
                pst.setString(1,pid.getText());
                pst.setString(2,pname.getText());
                pst.setString(3,pcata.getText());
                pst.setString(4,pprice.getText());
                pst.setString(5,pquant.getText());
                pst.setString(6, pas.getText());
                  
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "record updated");
                     update();
          }
           catch(ClassNotFoundException ex){
              java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
              
          }
          
          catch(Exception ex){
              java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
              
}
    }//GEN-LAST:event_updateSActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
                 
                 try{
                     id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
                     deleteitem = JOptionPane.showConfirmDialog(null, "if you want delete", "warning", JOptionPane.YES_NO_OPTION);
                     if(deleteitem ==JOptionPane.YES_OPTION){
                         
                     
                     Class.forName("com.mysql.jdbc.Driver");
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
                 pst=(PreparedStatement) sqlcon.prepareStatement("delete from product where productid =? ");
                 pst.setInt(1, id);
                  pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "record updated");
                     update();
                     
                       pid.setText("");
                       pid.requestFocus();
     pname.setText("");
    pcata.setText("");
     pprice.setText("");
    
     pquant.setText("");
     pas.setText("");
                 }
    }                                      
            catch(ClassNotFoundException ex){
              java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
              
          }
          
          catch(Exception ex){
             System.err.println(ex);
              
          }
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventorymenegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventorymenegment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pas;
    private javax.swing.JTextField pcata;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField pquant;
    private javax.swing.JButton updateS;
    // End of variables declaration//GEN-END:variables
}
