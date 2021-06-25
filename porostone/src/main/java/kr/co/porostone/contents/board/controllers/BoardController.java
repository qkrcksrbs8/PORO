package kr.co.porostone.contents.board.controllers;


import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class BoardController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value = "/main", method = { RequestMethod.GET, RequestMethod.POST })
	public String home(Locale locale, Model model) {
		 return "contents/main/main.tiles";
	}
	
	@RequestMapping(value = "/poroBoard", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView poroBoard(Locale locale, Model model, HttpSession session) {
		logger.info("====================================START====================================");
		logger.info("TRS_NO = ["+session.getAttribute("TRS_NO")+"], [boardList]"); 
		ModelAndView  mav = new ModelAndView("contents/board/poroBoard.tiles");//연간스케쥴 model

		//AOP 구현 전
	
		
		
		logger.info("====================================E N D====================================");
		return mav;
	}

	
}
