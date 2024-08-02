package Chap2_GenerateObjectAndDestory.item1.jdbc;

import java.sql.*;

public class JDBC_sample {
    /*
        이전의 프로젝트를 통해 다시 공부해보는 JDBC
        java.sql.Driver : 서비스 제공자 인터페이스 역할 수행

    */
    static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    //local mysql url
    //static final String MYSQL_URL = "jdbc:mysql://localhost:3306/your-database-name?serverTimezone=Asia/Seoul";

    //원격 mysql url
    static final String MYSQL_URL = "jdbc:mysql://your-database-host:3306/your-database-name?serverTimezone=Asia/Seoul";

    public JDBC_sample() {
        try {
            Class.forName(MYSQL_DRIVER); // DriverManager.registerDriver : 제공자 등록 API 역할 //JDBC 4.0 이후: DriverManager는 클래스패스에서 자동으로 드라이버를 찾고 등록
        } catch (ClassNotFoundException e) {
            System.out.println("Database driver error: " + e.getMessage());
        }
    }

    public Connection getConnection() { //Connection 서비스 인터페이스 역할
        Connection conn = null;
        try {
            //local 연결
            //conn = DriverManager.getConnection(MYSQL_URL, "your-username", "your-password"); //getConnection 서비스 접근 API 역할

            //원격 mysql 연결
            conn = DriverManager.getConnection(MYSQL_URL, "your-username", "your-password");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
        return conn;
    }

    public void dbClose(PreparedStatement pstmt, Connection conn) {
        try {
            pstmt.close();
            conn.close();
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
