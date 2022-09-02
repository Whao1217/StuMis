package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import pojo.student;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        boolean a=false;
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String idc = req.getParameter("idc");
        String born = req.getParameter("born");
        String phone = req.getParameter("phone");
        String birthday = req.getParameter("birthday");
        String major = req.getParameter("major");
        String beizhu = req.getParameter("beizhu");
        student student = new student(name,idc,born,phone,birthday,major,beizhu);
        student.setId(id);
        a=Dao.update(student);
        if(a==true)
        {
        req.setAttribute("message", "修改成功!");
        req.getRequestDispatcher("menu.jsp").forward(req,resp);
        }
        else
        {
        	req.setAttribute("message", "修改失败!");
            req.getRequestDispatcher("menu.jsp").forward(req,resp);
        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
