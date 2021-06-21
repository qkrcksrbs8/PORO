package kr.co.porostone.contents.report.controllers;

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
public class ReportController {

	protected Logger logger = LoggerFactory.getLogger(getClass());


	
	//--------------------------------------------------------------------------------------------
	@RequestMapping(value = "/mres0103", method = { RequestMethod.GET, RequestMethod.POST })
	public String mres0103(Locale locale, Model model) {
		 return "contents/report/mres0103.tiles";
	}
	@RequestMapping(value = "/mres0201", method = { RequestMethod.GET, RequestMethod.POST })
	public String mres0201(Locale locale, Model model) {
		 return "contents/report/mres0201.tiles";
	}
	@RequestMapping(value = "/mres0206", method = { RequestMethod.GET, RequestMethod.POST })
	public String mres0206(Locale locale, Model model) {
		 return "contents/report/mres0206.tiles";
	}
	@RequestMapping(value = "/mres0602", method = { RequestMethod.GET, RequestMethod.POST })
	public String mres0602(Locale locale, Model model) {
		 return "contents/report/mres0602.tiles";
	}
	@RequestMapping(value = "/mres0707", method = { RequestMethod.GET, RequestMethod.POST })
	public String mres0707(Locale locale, Model model) {
		 return "contents/report/mres0707.tiles";
	}

	@RequestMapping(value = "/main", method = { RequestMethod.GET, RequestMethod.POST })
	public String home(Locale locale, Model model) {
		 return "contents/main/main.tiles";
	}
	

}
