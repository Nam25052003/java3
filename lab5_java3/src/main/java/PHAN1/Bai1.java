package PHAN1;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NAM PC
 */
public class Bai1 {

    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String url = "jdbc:sqlserver://localhost; database = QLSV";
    public static String user = "sa";
    public static String password = "123";

    public static void main(String[] args) {
        connJDBC();

    }

    private static void connJDBC() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from STUDENTS";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("masv") + ", ");
                System.out.print(rs.getString("hoten") + ", ");
                System.out.print(rs.getString("email") + ", ");
                System.out.print(rs.getString("sodt") + ", ");
                System.out.println(rs.getString("gioitinh"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
