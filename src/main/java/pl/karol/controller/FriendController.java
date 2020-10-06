package pl.karol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pl.karol.model.Friend;
import pl.karol.service.FriendService;

@Controller
public class FriendController {
	
	@Autowired
	private FriendService friendService;
	
	@GetMapping("/form")
	public String formToAd(Model model) {
		Friend friend = new Friend();
		model.addAttribute("friend", friend);
		return "form";
	}
	
	
	
	@GetMapping("/test")
	public String homePage(Model model) {
		Friend friend = friendService.read(1);
		model.addAttribute("friend", friend);
		return "test";
	}
	
	@PostMapping("/save")
	public String saveFriend(@ModelAttribute("friend") Friend theFriend) {
		friendService.create(theFriend);
		
		return "redirect:/test";
	}
	
	//@DeleteMapping("/friends/{id}")
	
	

}
