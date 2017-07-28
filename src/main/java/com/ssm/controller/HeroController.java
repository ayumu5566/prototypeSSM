package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.Hero;
import com.ssm.service.HeroService;
import com.ssm.utils.Page;

@Controller
@RequestMapping("/hero")
public class HeroController {
	@Autowired
	private HeroService heroService;

	@RequestMapping("/list")
	public String list(Model model, Page page) {
		List<Hero> heroList = heroService.findList(page);
		Integer total = heroService.total();
		page.caculateLast(total);

		model.addAttribute("total", total);
		model.addAttribute("page", page);
		model.addAttribute("heroList", heroList);
		return "heroList";
	}
}
