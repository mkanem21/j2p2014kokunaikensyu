package jp.ac.hiroshimacu.test1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;







/**
 * Servlet implementation class PostgreSQLTest
 */
@WebServlet("/PostgreSQLTest")
public class PostgreSQLTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostgreSQLTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			  Class.forName("org.postgresql.Driver").newInstance();
			  conn = DriverManager.getConnection("jdbc:postgresql://localhost/testdb?user=postgres&password=masa0803");
			  stmt = conn.createStatement();
			  rs = stmt.executeQuery("SELECT id,name FROM test");


			  response.setContentType("text/plain");
			  while (rs.next()) {
			    response.getWriter().write("id=" + rs.getString("id") + ", ");
			    response.getWriter().write("name=" + rs.getString("name") + "\n");
			  }
			} catch(Exception e) {
			  e.printStackTrace();
			} finally {
			  if (rs != null ) { try {rs.close(); } catch (SQLException e) {e.printStackTrace();} }
			  if (stmt != null ) { try {stmt.close(); } catch (SQLException e) {e.printStackTrace();} }
			  if (conn != null ) { try {conn.close(); } catch (SQLException e) {e.printStackTrace();} }
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
