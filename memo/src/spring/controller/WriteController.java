package spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import spring.repository.MemoDao;



public class WriteController implements Controller{
	public MemoDao memoDao;
	public void setMemoDao(MemoDao memoDao) {
		this.memoDao = memoDao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mv=new ModelAndView();
		if (req.getMethod().equals("GET")) {
			mv.setViewName("/WEB-INF/view/write.jsp");
			return mv;

		} else if (req.getMethod().equals("POST")) {
			String content=req.getParameter("content");
			System.out.println(content);
			memoDao.content(content);
			
			
			mv = new ModelAndView();
			mv.setViewName("redirect:/list");
			return mv;
			
			  }
		return null;

	}

}
