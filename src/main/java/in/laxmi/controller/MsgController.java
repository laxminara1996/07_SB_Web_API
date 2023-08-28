package in.laxmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MsgController {
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "welcome to the world");
		mv.setViewName("message");
		return mv;
	}

	@GetMapping("/greet")
	public ModelAndView greetMsg() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "good evening to the world");
		mv.setViewName("message");
		return mv;
	}
}
