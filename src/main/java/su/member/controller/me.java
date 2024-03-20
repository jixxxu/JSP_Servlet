package su.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import su.member.dto.MemberDTO;

@WebServlet("/me")
public class me extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("./view/join.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
		 String name = request.getParameter("name");
		 String id = request.getParameter("id");
		 int age = Integer.parseInt(request.getParameter("age"));
		 String birthday = request.getParameter("birthday");
		 String password = request.getParameter("password");
		 String gender= request.getParameter("gender");
		 String[ ] hobbyAarray= request.getParameterValues("hobby");
		 String hobby="";
		 for(int i = 0; i < hobbyAarray.length; i++) {
		 hobby += hobbyAarray[i] + " ";
		 }
		 MemberDTO memberDTO = new MemberDTO( );
		 memberDTO.setName(name);
		 memberDTO.setId(id);
		 memberDTO.setAge(age);
		 memberDTO.setBirthday(birthday);
		 memberDTO.setPassword(password);
		 memberDTO.setGender(gender);
		 memberDTO.setHobby(hobby);
		 
		 request.setAttribute("name", memberDTO.getName());
		 request.setAttribute("id", memberDTO.getId());
		 request.setAttribute("age", memberDTO.getAge());
		 request.setAttribute("birthday", memberDTO.getBirthday());
		 request.setAttribute("password", memberDTO.getPassword());
		 request.setAttribute("gender", memberDTO.getGender());
		 request.setAttribute("hobby", memberDTO.getHobby());
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("./view/joinCall.jsp");
			dispatcher.forward(request, response);
	}

}
