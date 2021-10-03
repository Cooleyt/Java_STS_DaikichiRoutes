package com.cooley.daikichi_routes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("")
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!!";
	}
	
	@RequestMapping("/m/{city}")
	public String showCity(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to:" + city;
	}
	
	@RequestMapping("/lotto/{num}")
	public String showLotto(@PathVariable("num") int num){
		if(num%2 != 0) {
			return "You will take a grand journey to the near future, but be wary of tempting offers.";
			} 
			else {
				return "You have enjoyed the fruits of you labor but now is agreat time to spend time with your family and friends";
		}
	}
}
