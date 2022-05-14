package springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping ("/home")
	public ModelAndView Home(Model m)
	{
		ModelAndView mn=new ModelAndView();
		mn.addObject("username","Alandi");
		mn.setViewName("index");
		return mn;
	}
}
