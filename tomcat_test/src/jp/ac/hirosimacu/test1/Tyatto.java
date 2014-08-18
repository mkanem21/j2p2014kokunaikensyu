package jp.ac.hirosimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tyatto
 */
@WebServlet("/Tyatto")
public class Tyatto extends HttpServlet {
	private static final long serialVersionUID = 1L;
     StringBuffer meall=new StringBuffer();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tyatto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String message = "";
        out.println(createHTML());    
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
		String message = "";
        message = request.getParameter("message");
        if (message == null || message.length() == 0){

        }else{
        	 meall.append(message+"<br>");
        }
        out.println(createHTML());    
		out.close();
	}
	protected String createHTML(){
        StringBuffer sb = new StringBuffer();
       
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>サンプル</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<form action=\"/tomcat_test/Tyatto\" method=\"post\">");
        sb.append("<td><input type=\"text\" size=\"20\" value=\"\" name=\"message\"></td>");
        sb.append("<input type=\"submit\" value=\"送信\">");
        sb.append("</form>");
        
        sb.append(meall);
        sb.append("</body>");
        sb.append("</html>");

        return (new String(sb));
    }
}
