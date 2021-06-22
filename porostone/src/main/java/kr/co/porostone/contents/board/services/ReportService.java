package kr.co.porostone.contents.board.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;								
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;										
import org.slf4j.Logger;									
import org.slf4j.LoggerFactory;									
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;									
import com.google.gson.reflect.TypeToken;						


@Service
public class ReportService {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	

	public void selectScheduleList(HttpServletRequest request, String division, String addList){
		
		logger.info("================================ START ================================");
		
		
	};//selectScheduleList
	
	
}
