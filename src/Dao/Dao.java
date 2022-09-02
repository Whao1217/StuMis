package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.student;
import DBUtil.DBUtil;

public class Dao {
	public static boolean add(student student)
	{
		
	        String sql = "insert into student1(name,idc,born,phone,birthday,major,beizhu) values('" + student.getName() + "','" +  student.getIdc() + "','" + student.getBorn() + "','" + student.getPhone() + "','" + student.getBirthday() + "','" + student.getMajor() + "','" + student.getBeizhu() + "')";
	        //创建数据库链接
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;
	        
	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            //关闭连接
	            DBUtil.close(state, conn);
	        }
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	}
	   public static boolean delete (String name) {
	        boolean f = false;
	        String sql = "delete from student1 where name='" + name + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        int a = 0;
	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
	   public static boolean update(student student) {
	        String sql = "update student1 set name='" + student.getName() + "', idc='" + student.getIdc() + "', born='" + student.getBorn() + "', phone='" + student.getPhone() + "', birthday='" + student.getBirthday() + "', major='" + student.getMajor() + "', beizhu='" + student.getBeizhu()
	            + "' where id='" + student.getId() + "'";
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        boolean f = false;
	        int a = 0;

	        try {
	            state = conn.createStatement();
	            a = state.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(state, conn);
	        }
	        
	        if (a > 0) {
	            f = true;
	        }
	        return f;
	    }
	   public static List<student> list() {
	        String sql = "select * from student1";
	        List<student> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;

	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            student bean = null;
	            while (rs.next()) {
	            	String id = rs.getString("id");
	            	String idc2 = rs.getString("idc");
	                String name2 = rs.getString("name");
	                String born = rs.getString("born");
	                String phone = rs.getString("phone");
	                String birthday = rs.getString("birthday");
	                String major = rs.getString("major");
	                String beizhu = rs.getString("beizhu");
	                bean = new student(name2,idc2,born,phone,birthday,major,beizhu);
	                bean.setId(id);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }
	   public static List<student> search(String name,String idc, String birthday) {
	        String sql = "select * from student1 where ";
	        
	        if (name != "") {
	            sql += "name like '%" + name + "%'";
	        }
	        else if (idc != "") {
	            sql += "idc like '%" + idc + "%'";
	        }
	        else if (birthday != "") {
	            sql += "birthday like '%" + birthday + "%'";
	        }
	        else 
	        {
	        }
	        
	        List<student> list = new ArrayList<>();
	        Connection conn = DBUtil.getConn();
	        Statement state = null;
	        ResultSet rs = null;

	        try {
	            state = conn.createStatement();
	            rs = state.executeQuery(sql);
	            student bean = null;
	            while (rs.next()) {
	            	String id = rs.getString("id");
	            	String idc2 = rs.getString("idc");
	                String name2 = rs.getString("name");
	                String born = rs.getString("born");
	                String phone = rs.getString("phone");
	                String birthday1 = rs.getString("birthday");
	                String major = rs.getString("major");
	                String beizhu = rs.getString("beizhu");
	                bean = new student(name2,idc2,born,phone,birthday1,major,beizhu);
	                bean.setId(id);
	                list.add(bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DBUtil.close(rs, state, conn);
	        }
	        
	        return list;
	    }

}
