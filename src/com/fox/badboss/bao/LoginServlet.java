package com.fox.badboss.bao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		System.out.println("=========doGet========");
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		PrintWriter pWriter = resp.getWriter();
		System.out.println("=========doPost========");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("=========username========" + username);
		System.out.println("=========password========" + password);

		// ʵ��Ϊ���ݿ��ѯ��ģ���½�ɹ�
		if ("test".equals(username) && "test".equals(password)) {
			pWriter.println(true);
		} else {
			pWriter.println(false);
		}
	}

}
