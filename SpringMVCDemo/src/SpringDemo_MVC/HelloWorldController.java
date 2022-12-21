package SpringDemo_MVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController 
{
	
	//need a controller method to show initial form page
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloWorld-Form";
	}
	
	//need a controller method to handle the form data
	
	@RequestMapping("/processForm") // processForm is defined in action attribute of form tag
	public String processForm()
	{
		return "helloWorld";
	}
	
	@RequestMapping("/shoutOut") // // shoutOut is defined in action attribute of form tag
	public String shoutoutPage(HttpServletRequest request, Model model)
	{
		var name = request.getParameter("name");
		var result = "YO! "+name.toUpperCase();
		model.addAttribute("name", result);
		return "helloWorld";
		
	}

}

