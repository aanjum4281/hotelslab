package co.grandcircus.hotelslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotelslab.dao.HotelDao;
import co.grandcircus.hotelslab.entity.Hotel;

@Controller
public class HotelController {

	@Autowired
	private HotelDao hotelDao;
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
	ModelAndView mav = new ModelAndView("index");
//	List<Hotel> hotel = hotelDao.findAll();
//	System.out.println(hotel);
	return mav;
	}
	
	@RequestMapping("/results")
	public ModelAndView showResults(@RequestParam(value="city",required=false) String city){
		List<Hotel> hotels = hotelDao.findAll();
//		System.out.println(hotel);
		ModelAndView mav = new ModelAndView( "results");
		mav.addObject("hotels", hotels); 
		return mav;
		
	}
	
	
}