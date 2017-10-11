

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaskUI
 */
@WebServlet("/TaskUI")
public class TaskUI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskUI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/TaskUI.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		// Java's naming convention suggests that variable should be camel case
		// e.g. String collectionName, please fix yourself.
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String Email = request.getParameter("Email");
		String Mobile = request.getParameter("Mobile");
		String College = request.getParameter("College");
		String Branch = request.getParameter("Branch");
		String Year = request.getParameter("Year");
		String Address = request.getParameter("Address");
		
		request.setAttribute("fName", fName);
		request.setAttribute("lName", lName);
		request.setAttribute("Email", Email);
		request.setAttribute("Mobile", Mobile);
		request.setAttribute("College", College);
		request.setAttribute("Branch", Branch);
		request.setAttribute("Year", Year);
		request.setAttribute("Address", Address);		
		//-- response.sendRedirect("index3.html");
		// sendredirect will create a fresh request. As a result, the CollectionName you stored in the previous
		// request does not exist anymore. You don't want that because your
		// second page will get it from the request scope, see step 3.
		// use forward instead
		request.getRequestDispatcher("DisplayValues.jsp").forward(request,response);

		// Not sure what these two lines are doing here because
		// the previous html page do not have any input with name **Pattern**
		// or "NotPattern", so you are not getting anything.
		// please fix accordingly
		//String Pattern = request.getParameter("Pattern");
		//String NotPattern = request.getParameter("NotPattern");
		//response.sendRedirect("DisplayValues.jsp");
	}

}
