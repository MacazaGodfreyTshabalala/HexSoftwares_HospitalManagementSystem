

package hexsoftwares_hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Tshabalala MG
 */
public class BookAppointment extends javax.swing.JFrame {  
    
private final Connection connection; 

   
    public BookAppointment(Connection connection) {
        initComponents();
          this.connection = connection;
    }

    private BookAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        lbBookApp = new javax.swing.JLabel();
        lbPID = new javax.swing.JLabel();
        tfPId = new javax.swing.JTextField();
        lbDID = new javax.swing.JLabel();
        tfDrID = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        btnExitApp = new javax.swing.JButton();
        dcAppDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Appointment");
        setPreferredSize(new java.awt.Dimension(500, 350));

        jPanel1.setBackground(new java.awt.Color(56, 142, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 350));

        lbBookApp.setBackground(new java.awt.Color(255, 255, 255));
        lbBookApp.setFont(new java.awt.Font("Clarendon Blk BT", 1, 24)); // NOI18N
        lbBookApp.setForeground(new java.awt.Color(255, 255, 255));
        lbBookApp.setText("Book Appointment");

        lbPID.setFont(new java.awt.Font("Clarendon Blk BT", 0, 18)); // NOI18N
        lbPID.setForeground(new java.awt.Color(255, 255, 255));
        lbPID.setText("Enter patient ID");

        tfPId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPIdActionPerformed(evt);
            }
        });
        tfPId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPIdKeyTyped(evt);
            }
        });

        lbDID.setFont(new java.awt.Font("Clarendon Blk BT", 0, 18)); // NOI18N
        lbDID.setForeground(new java.awt.Color(255, 255, 255));
        lbDID.setText("Enter doctor ID");

        tfDrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDrIDActionPerformed(evt);
            }
        });
        tfDrID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDrIDKeyTyped(evt);
            }
        });

        lbDate.setFont(new java.awt.Font("Clarendon Blk BT", 0, 18)); // NOI18N
        lbDate.setForeground(new java.awt.Color(255, 255, 255));
        lbDate.setText("Select appointment date");

        btnBook.setBackground(new java.awt.Color(139, 195, 74));
        btnBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnExitApp.setBackground(new java.awt.Color(139, 195, 74));
        btnExitApp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExitApp.setForeground(new java.awt.Color(255, 255, 255));
        btnExitApp.setText("Exit");
        btnExitApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbBookApp)
                .addGap(127, 127, 127))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfDrID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExitApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBook)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbBookApp)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPID)
                    .addComponent(tfPId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDID)
                    .addComponent(tfDrID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDate)
                    .addComponent(dcAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitApp)
                    .addComponent(btnBook))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPIdActionPerformed

    private void tfPIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPIdKeyTyped
     char c = evt.getKeyChar();
      if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfPIdKeyTyped

    private void tfDrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDrIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDrIDActionPerformed

    private void tfDrIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDrIDKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfDrIDKeyTyped

    public boolean GetPatientByID(int id)
    {
            String query = "SELECT * FROM patients" ;
            boolean found = false;
            
         try
            {
                
               
            
               
               Statement preparedStatement ;
             preparedStatement = connection.createStatement();
           
                ResultSet resultSet =   preparedStatement.executeQuery(query);
                
              
                 while(resultSet.next() && false==found)
                 {
                     if(id == resultSet.getInt("id"))
                     {
                       found = true;
                     }
                   
                 }
     
            }
            catch(SQLException e)
            {
                  System.out.println("Error!"+e.getMessage());
            }
        
        
        
    
          return found;
    }
    
    
     public boolean GetDoctorByID(int id)
    {
            String query = "SELECT * FROM doctors" ;
            boolean found = false;
            
         try
            {
                
               
            
               
               Statement preparedStatement ;
             preparedStatement = connection.createStatement();
           
                ResultSet resultSet =   preparedStatement.executeQuery(query);
                
              
                 while(resultSet.next() && false==found)
                 {
                     if(id == resultSet.getInt("id") )
                     {
                       found = true;
                     }
                   
                 }
     
            }
            catch(SQLException e)
            {
                  System.out.println("Error!"+e.getMessage());
            }
        
        
        
    
          return found;
    }
     
      public boolean CheckDrAvailability(int drID,String date)
    {
            String query = "SELECT * FROM appointments";
           
            boolean found = false;
            
         try
            {
                     
               Statement preparedStatement ;
             preparedStatement = connection.createStatement();
           
                ResultSet resultSet =   preparedStatement.executeQuery(query);
                
              
                 while(resultSet.next() && false==found)
                 {
                     
                     
                     
                     if(drID == resultSet.getInt("doctor_id") &&  date.equals(resultSet.getDate("appointment_date").toString()))
                     {
                         found = true;
                     }
                     else
                     {
                        
                          found = false;
                     }
                     
                     
                   
                   
                 }
                 
     
            }
            catch(SQLException e)
            {
                  System.out.println("Error!"+e.getMessage());
            }
        
        
        
    
          return found;
    }
    
    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
       
        
        
          if("".equals(tfPId.getText()))
        {
         JOptionPane.showMessageDialog(new JFrame(),"Please enter patient's ID!!", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(tfDrID.getText()))
        {
               
               JOptionPane.showMessageDialog(new JFrame(),"Please enter Dr's ID!!", "Error",JOptionPane.ERROR_MESSAGE);
        
        }
        else if(dcAppDate.getDate() == null)
        {
          JOptionPane.showMessageDialog(new JFrame(),"Please select date!!", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            try
            {
                
                int pID = Integer.parseInt( tfPId.getText());
                int drID = Integer.parseInt(tfDrID.getText());
                SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(dcAppDate.getDate());
                
                 
                    
                
                if(GetPatientByID(pID) && GetDoctorByID(drID))
                {
                    
                     if(CheckDrAvailability(drID,date))
                     {
                        JOptionPane.showMessageDialog(new JFrame(),"Doctor not available on this date!!", "Error",JOptionPane.ERROR_MESSAGE);
                    
                     
                     }
                     else
                     {
                         
                           try{
                          
                
                        String query = "INSERT INTO appointments( patient_id, doctor_id, appointment_date) VALUES"+"('"+pID+"', '"+drID+"','"+date+"')"  ;
                
                          Statement preparedStatement = connection.createStatement();
                         preparedStatement.execute(query);
               
                        JOptionPane.showMessageDialog(new JFrame(),"Appointment successfully booked!!");
                    
                           HomePage HomePageFrame = new HomePage(connection);
        HomePageFrame.setVisible(true);
        HomePageFrame.pack();
        HomePageFrame.setLocationRelativeTo(null);//center
          this.dispose();
               
               

 
            
            }
            catch(Exception e)
             {
                  System.out.println("Error!"+e.getMessage());
              }
                     }
                
                }
                else
                {
           
                     JOptionPane.showMessageDialog(new JFrame(),"Either Doctor or Patient doesn't exist!!", "Error",JOptionPane.ERROR_MESSAGE);
                }
                
                
                
                
     
                  
            
            }
            catch(Exception e)
             {
                  System.out.println("Error!"+e.getMessage());
              }
        }
        
        

       
        

    }//GEN-LAST:event_btnBookActionPerformed

    private void btnExitAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAppActionPerformed
        HomePage HomePageFrame = new HomePage(connection);
        HomePageFrame.setVisible(true);
        HomePageFrame.pack();
        HomePageFrame.setLocationRelativeTo(null);//center
          this.dispose();
       
    }//GEN-LAST:event_btnExitAppActionPerformed

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
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
new BookAppointment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnExitApp;
    private com.toedter.calendar.JDateChooser dcAppDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBookApp;
    private javax.swing.JLabel lbDID;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbPID;
    private javax.swing.JTextField tfDrID;
    private javax.swing.JTextField tfPId;
    // End of variables declaration//GEN-END:variables
}
