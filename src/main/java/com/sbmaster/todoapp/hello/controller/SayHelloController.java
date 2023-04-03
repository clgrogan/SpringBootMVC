package com.sbmaster.todoapp.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class SayHelloController {
	//"say-hell" => "Hello! What are you learning today?"
	
	
	//map the end point
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	@RequestMapping("say-hello-stringbuilder")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>HTML Hello Page using StringBuffer</title>");
		sb.append("</head>");
		sb.append("<bod>");
		sb.append("<p> Using StringBuffer, StringBuilder, or some other manipulation of Strings to output HTML is tedious!</p>");
		sb.append("</body>");
		sb.append("</html>");
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	// redirect: "say-hello-jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp
	@RequestMapping("say-hello-jsp")
//	@ResponseBody
	public String sayHelloJsp() {
		//o.s.w.servlet.view.InternalResourceView  : 
		// Forwarding to [/WEB-INF/jsp/sayHellosayHello.jsp]
		return "sayHello";
	}
}
