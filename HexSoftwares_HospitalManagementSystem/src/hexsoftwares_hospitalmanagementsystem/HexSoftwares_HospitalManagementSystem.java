
package hexsoftwares_hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Tshabalala MG
 */
public class HexSoftwares_HospitalManagementSystem {
    
    
     private static final String url="jdbc:mysql://localhost:3306/hospital";
     private static final String username="root";
     private static final String password="12345";
     
     

    public static void main(String[] args) {
        
        
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }  
        
      
        
        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            
                 HomePage HomePageFrame = new HomePage(connection);
                  HomePageFrame.setVisible(true);
                 HomePageFrame.pack();
                 HomePageFrame.setLocationRelativeTo(null);//center
                  
            
        }
        catch(Exception e)
        {
            
           e.printStackTrace();
            
        }   
        
        
        
        
        
            
              // PatientFrame.dispose();
        
       
        // TODO code application logic here
    }

   
}
