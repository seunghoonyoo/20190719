package spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller{
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		//이 메소드에서는 ModelAndView의 객체를 반환해야함(규칙)
		//-model과view정보를 설정
		ModelAndView mv= new ModelAndView();
		mv.setViewName("/WEB-INF/view/main.jsp");
		return mv;
	}
}
