package com.softserve.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBService {
    //private static Connection con = null;
    private static String username = "postgres";
    private static String password = "root";
    private static String URL = "jdbc:postgresql://localhost:5432/lv667";

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.printf("\n***Connection OK");
            Statement st = con.createStatement();
            System.out.printf("\n***statement OK");
            ResultSet rs = st.executeQuery("select name from temp;");
            System.out.printf("\n***Select OK");
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    //System.out.print(rs.getString(i) + "\t");
                    names.add(rs.getString(i));
                }
                System.out.println();
            }
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch(Exception e) {
            System.out.printf("\t***DB Error");
            e.printStackTrace();
            //e.getStackTrace();
        }
        return names;
    }
}
