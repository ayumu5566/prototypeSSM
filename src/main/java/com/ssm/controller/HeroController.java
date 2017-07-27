package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.Hero;
import com.ssm.service.HeroService;

@Controller
@RequestMapping("/hero")
public class HeroController {
	@Autowired
	private HeroService heroService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Hero> heroList = heroService.findList();

		model.addAttribute("heroList", heroList);

		return "heroList";
	}
}
