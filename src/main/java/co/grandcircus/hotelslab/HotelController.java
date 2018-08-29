package co.grandcircus.hotelslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {

	@RequestMapping("/")
	public ModelAndView showHomePage() {
	ModelAndView mav = new ModelAndView("index");
	return mav;
	}
	
	@RequestMapping("/results")
	public ModelAndView showResults() {
		ModelAndView mav = new ModelAndView("results");
				return mav;
	}
}