import java.sql.*;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String user = sc.nextLine();
        //String sql = "select name from users where id=?";
        String sql1 = "insert into users values(?,?)";

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "rohith434724";

        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement st = con.prepareStatement(sql1);
        st.setInt(1,id);
        st.setString(2,user);
        //ResultSet rs = st.executeQuery();
        //rs.next();
        st.executeUpdate();
        //String name = rs.getString(1);
        //System.out.println(name);
        st.close();
        con.close();
    }
}
