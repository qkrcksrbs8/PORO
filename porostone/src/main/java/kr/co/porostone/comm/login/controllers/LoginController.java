package kr.co.porostone.comm.login.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);	
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "login";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView loginCheck(HttpSession session, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		ModelAndView mav = new ModelAndView();	
		session.setAttribute("loginInfo", "loginok");
		session.setAttribute("userId", "test");
		session.setAttribute("TRS_NO", getTrsNo());
		mav.setViewName("redirect:/main");		
		return mav;
	}
	
	public static synchronized String getTrsNo() {
		Random rand = new Random();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		int rnum = rand.nextInt(100);
		String rnumStr = String.valueOf(rnum);
		int len = rnumStr.length();
		
		for (int i = 0; i < 2 - len; i++) {
			rnumStr = "0" + rnumStr;
		}
		String trsNo = "9999" + sdf.format(date) + rnumStr;
		return trsNo;
	}
}
