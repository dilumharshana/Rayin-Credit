/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rayin.credit;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilum
 */
class dbConnector {

    String url = "jdbc:mysql://localhost:3306/rayin";
    String uname = "root";
    String pass = "papapapa";
    Connection con;
    String query = null;

    //connection
    void connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, uname, pass);
    }

    Connection getConnection() throws ClassNotFoundException, SQLException
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            return con;
        }
    
    
    //SEARCHING FOR BORROWERS
    public void search_all_deals(String typeis) throws Exception {

        {
            query = "SELECT * FROM rayin.reps Where(`Type` = '" + typeis + "');";

            if (con == null) {
                connect();
            }

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            String[] customer = new String[4];

            if (typeis.equals("FOOD")) {
                food.clearTable();
            } else {
                agroma.clearTable();
            }

            while (rs.next()) {
                customer[0] = rs.getString("RepId");
                customer[1] = rs.getString("RepName");
                customer[2] = rs.getString("Phone");
                customer[3] = rs.getString("Type");

                if (typeis.equals("FOOD")){
                    food.dealItemsToTable(customer); // calling data items setting to table method in food class
                } else {
                    agroma.dealItemsToTable(customer); // calling data items setting to table method in agroma class
                }

            }

        }
    }

    // addig new rep
    public int addNewCasher(String[] nameContact) throws Exception {

        int key = 0;

        query = "INSERT INTO `rayin`.`reps` (`RepName`, `Phone`, `Type`,`Total`) VALUES ('" + nameContact[0] + "', '" + nameContact[1] + "', '" + nameContact[2] + "' , '0');";

        if (con == null) {
            connect();
        }

        Statement st = con.createStatement();

        st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); //inserting values and Getting autoincremented dealno to insert items to item table,

        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        controllers.primaryKeyOfdealsData = String.valueOf(rs.getInt(1)); //stroting returned deal no to use latar.
        
        if(nameContact[2] == "FOOD"){
            search_all_deals("FOOD");
        }
        else{
             search_all_deals("AGROMA");
        }

        return key;
    }

    //updating reps
    public void updateBorrowerData(String colomn, String value, String PrimaryKey, int which) throws Exception {

        //borrowers
        query = "UPDATE `rayin`.`reps` SET `" + colomn + "` = '" + value + "' WHERE (`RepId` = '" + PrimaryKey + "');";

        if (con == null) {
            connect();
        }

        Statement st = con.createStatement();

        st.executeUpdate(query);

        JOptionPane.showMessageDialog(null, "Rep updated successfully !");

    }

    //delete reps
    void clearBorrows(String primaryKey) throws Exception {

        if (con == null) {
            connect();
        }

        con.createStatement(); // for get primary key
        Statement st2 = con.createStatement(); //for remove data

        query = "DELETE FROM `rayin`.`reps`  WHERE (`RepId` = '" + primaryKey + "');";

        st2.executeUpdate(query);

    }

    // THIS METHOD WILL SEARCH CUSTOMER DETAILS OF borrowers FROM DATABASE 
    public void search_every_field(String code, String type) throws Exception {

        query = "SELECT * FROM rayin.reps Where `Type` =  '" + type + "' && RepName LIKE '%" + code + "%'"; // code means customer name which wants to search from DB

        if (con == null) {
            connect();
        }

        Statement st = con.createStatement();

        String[] customer = new String[4]; // result containing list

        ResultSet rs = st.executeQuery(query);
        while (rs.next()) // IF ITEM CODE AVAILABLe THIS SECTION WILL RUN
        {

            customer[0] = rs.getString("RepId");
            customer[1] = rs.getString("RepName");
            customer[2] = rs.getString("Phone");
            customer[3] = rs.getString("Type");

            if(customer[3].equals("FOOD")){
                food.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
            }
            else{
                agroma.dealItemsToTable(customer); // calling data items setting to table method in dealHistory class
            }

        }

    }

    //add new detail
    // addig new rep
    public int addNewDetail(String[] details) throws Exception {
        int key = 0;

        query = "INSERT INTO `rayin`.`details` (`RepId`,`Date`, `InvoiceNo`, `Customer`, `route`, `Amount`) VALUES ('" + details[0] + "', '" + details[1] + "', '" + details[2] + "', '" + details[3] + "', '" + details[4] + "' ,'" + details[5] + "');";

        if (con == null) {
            connect();
        }

        Statement st = con.createStatement();

        st.executeUpdate(query); //inserting values and Getting autoincremented dealno to insert items to item table,

        return key;
    }

    //SEARCHING FOR BORROWERS
    public void search_all_repData(String repId) throws Exception {

        {
            query = "SELECT * FROM rayin.details Where(`RepId` = '" + repId + "');";

            if (con == null) {
                connect();
            }

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            String[] customer = new String[5];

            repDetails.clearTable();

            BigDecimal amount = new BigDecimal("0.0");

            while (rs.next()) {
                customer[0] = rs.getString("Date");
                customer[1] = rs.getString("InvoiceNo");
                customer[2] = rs.getString("Customer");
                customer[3] = rs.getString("Route");
                customer[4] = rs.getString("Amount");

                amount = amount.add(new BigDecimal(customer[4].toString()));

                repDetails.dealItemsToTable(customer); // calling data items setting to table method in food class
                repDetails.amount.setText("Amount - " + amount.toString());
                repDetails.total = amount.toString();

            }

        }
    }

    //delete rep data
    //delete reps
    void clearRepData(String primaryKey) throws Exception {

        if (con == null) {
            connect();
        }

        con.createStatement(); // for get primary key
        Statement st2 = con.createStatement(); //for remove data

        query = "DELETE FROM `rayin`.`details`  WHERE (`InvoiceNo` = '" + primaryKey + "');";

        st2.executeUpdate(query);
    }

    //updating reps
    public void updaterepData(String colomn, String value, String PrimaryKey) throws Exception {

        //borrowers
        query = "UPDATE `rayin`.`details` SET `" + colomn + "` = '" + value + "' WHERE (`InvoiceNo` = '" + PrimaryKey + "');";

        if (con == null) {
            connect();
        }

        Statement st = con.createStatement();

        st.executeUpdate(query);

        JOptionPane.showMessageDialog(null, "Rep updated successfully !");

    }
    
        // CHEKIKNG IS USER GIVEN PASSWORD IS EXSISTS IN DB
    public boolean passchek(String password) throws Exception {
        boolean passVeryfied;

        query = "SELECT * FROM rayin.pass WHERE `pass`= ? ;";

         if(con == null)
            {
                connect();
            }
         
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, password);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            passVeryfied = true;
        } else {
            passVeryfied = false;
        }

        return passVeryfied;
    }
    
       // CHEKIKNG IS USER GIVEN PASSWORD IS EXSISTS IN DB
    public boolean questionchek(String what, int which) throws Exception {
        boolean qestionVeryfied;

        query = "SELECT * FROM rayin.pass WHERE `question`= ? ;";
        String query2 = "SELECT * FROM rayin.pass WHERE `answer`= ? ;";

        if(con == null)
            {
                connect();
            }
        
        ResultSet rs = null;
        PreparedStatement st = null;

        if (which == 1) {
            st = con.prepareStatement(query);
            st.setString(1, what);
            rs = st.executeQuery();
        } else {
            st = con.prepareStatement(query2);
            st.setString(1, what);
            rs = st.executeQuery();
        }

        if (rs.next()) {
            qestionVeryfied = true;
        } else {
            qestionVeryfied = false;
        }


        return qestionVeryfied;
    }
    
        //CHANGING PASSWORD    
    void changePass(String oldPass, String newpass) throws Exception {
        query = " UPDATE `rayin`.`pass` SET `pass` = '" + newpass + "' WHERE (`Id` = '1');";

         if(con == null)
            {
                connect();
            }
         
        Statement st = con.createStatement();

        st.executeUpdate(query);

        JOptionPane.showMessageDialog(null, " PASSWORD SUCCESSFULLY UPDATE !");

    }
    
    
    //print state total amount setter
        //updating reps
    public void updateTotal(String PrimaryKey, String value) throws Exception {

        //borrowers
        query = "UPDATE `rayin`.`reps` SET `Total` = '" + value + "' WHERE (`RepId` = '" + PrimaryKey + "');";

        if (con == null) {
            connect();
        }

        Statement st = con.createStatement();

        st.executeUpdate(query);

    }
}
