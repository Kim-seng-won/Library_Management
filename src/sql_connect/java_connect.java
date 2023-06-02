package sql_connect;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class java_connect {

	public static void main(String[] args) {
        int majorVersion = SQLServerDriver.getMajorVersion();
        int minorVersion = SQLServerDriver.getMinorVersion();

        System.out.println("JDBC 드라이버 버전: " + majorVersion + "." + minorVersion);
    }
	
}