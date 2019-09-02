package com.lotto.web.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.Domains.ConsumerBean;
import com.lotto.web.ServiceImpls.ConsumerServiceImpl;
import com.lotto.web.Services.ConsumerService;


@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public ConsumerController() {
	super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cid = request.getParameter("cid");
		String pass = request.getParameter("pass");
		
		ConsumerBean param = new ConsumerBean();
		param.setCid(cid);
		param.setPass(pass);
		
		ConsumerService service = new ConsumerServiceImpl();
		service.registerConsumer(param);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
