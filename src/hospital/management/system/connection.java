package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {

    Connection connection;
    Statement statement;

    public connection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_management_system", "root","Dc@2004");

            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}




