package spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller{
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		//�� �޼ҵ忡���� ModelAndView�� ��ü�� ��ȯ�ؾ���(��Ģ)
		//-model��view������ ����
		ModelAndView mv= new ModelAndView();
		mv.setViewName("/WEB-INF/view/main.jsp");
		return mv;
	}
}
