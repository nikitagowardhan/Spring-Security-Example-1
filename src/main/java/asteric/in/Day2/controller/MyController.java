package asteric.in.Day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	@RequestMapping
	String MyFun()
	{
		return "home.jsp";
	}

}
