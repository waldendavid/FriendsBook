package pl.karol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.karol.model.Friend;
import pl.karol.service.FriendService;

@Controller
public class FriendController {
	
	@Autowired
	private FriendService friendService;
	
	@GetMapping("/test")
	public String homePage(Model model) {
		Friend friend = friendService.read(1);
		model.addAttribute("friend", friend);
		return "test";
	}

}
