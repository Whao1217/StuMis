package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.student;
import Dao.Dao;
/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
        //获取数据
        String name = req.getParameter("name");
        String idc = req.getParameter("idc");
        String born = req.getParameter("born");
        String phone = req.getParameter("phone");
        String birthday = req.getParameter("birthday");
        String major = req.getParameter("major");
        String beizhu = req.getParameter("beizhu");
        
        student student = new student(name,idc,born,phone,birthday,major,beizhu);
        
        //添加后消息显示
        if(Dao.add(student)) {
            req.setAttribute("message", "添加成功");
            req.getRequestDispatcher("add.jsp").forward(req,resp);
        } else {
            req.setAttribute("message", "添加失败，请重新录入");
            req.getRequestDispatcher("add.jsp").forward(req,resp);
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
