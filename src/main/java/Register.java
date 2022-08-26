

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
	    String confirmPassword = request.getParameter("confirmPassword");
        String createdDate = request.getParameter("createdDate");  
		String modifiedDate =request.getParameter("modifiedDate");
		String type = request.getParameter("type");
		String logTag = request.getParameter("logTag");
		String status= request.getParameter("status");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date modifieddate = null;
		Date createddate = null;

		try {
			createddate = formatter.parse(createdDate);

			modifieddate = formatter.parse(modifiedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserMaster userMaster =new UserMaster(userName,confirmPassword,createddate,modifieddate,type,logTag,status);
     
	     
		UserMasterDao userMasterDao=new UserMasterDao();
		String result = 	userMasterDao.insert(userMaster);
	}

	
}
