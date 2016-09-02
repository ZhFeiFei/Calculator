package com.zuoye.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zuoye.bean.CalBean;

public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取数据并将数据封装到CalBean.java中
		CalBean calculator=new CalBean();
		calculator.setNum1(Float.parseFloat(request.getParameter("num1")));
		calculator.setNum2(Float.parseFloat(request.getParameter("num2")));
		calculator.setOp(request.getParameter("op"));
		//switch方法进行选择计算方法
		float result=0;
		switch(calculator.getOp().charAt(0)){
		case '+': result=calculator.getNum1()+calculator.getNum2();
				break;
		case '-': result=calculator.getNum1()-calculator.getNum2();
				break;
		case '*': result=calculator.getNum1()*calculator.getNum2();
				break;
		case '/': result=calculator.getNum1()/calculator.getNum2();
				break;
		default: break;				
		}
		//将对象及结果用request打包返回到Calculator.jsp中
		request.setAttribute("calculator", calculator);
		request.setAttribute("result", result);
		request.getRequestDispatcher("Calculator.jsp").forward(request, response);;
		
		
	}

}
