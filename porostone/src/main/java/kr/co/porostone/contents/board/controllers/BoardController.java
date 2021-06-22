package kr.co.porostone.contents.board.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class BoardController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value = "/main", method = { RequestMethod.GET, RequestMethod.POST })
	public String home(Locale locale, Model model) {
		 return "contents/main/main.tiles";
	}
	
	@RequestMapping(value = "/poroBoard", method = { RequestMethod.GET, RequestMethod.POST })
	public String poroBoard(Locale locale, Model model, HttpSession session) {
		logger.info("====================================START====================================");
		logger.info("SESS_GUID = ["+session.getAttribute("TRS_NO")+"], [boardList]"); 

		logger.info("====================================E N D====================================");
		 return "contents/board/poroBoard.tiles";
	}

	
}
