package com.study.jsp.command;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.jsp.BDao;
import com.study.jsp.BDto;



public class BWriteCommand implements BCommand {
	
	@Override    
	public void execute(HttpServletRequest request, HttpServletResponse response) 
	{
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");

		BDao dao = BDao.getInstance();
		dao.write(bName, bTitle, bContent);
	}

}
