package com.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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

	/**
	 * 跳转新增页面
	 * 
	 * @return
	 */
	@RequestMapping("/addPage")
	public String addPage() {
		return "heroAdd";
	}

	/**
	 * 新增英雄
	 * 
	 * @param response
	 * @param hero
	 * @throws IOException
	 */
	@RequestMapping("/add")
	public void add(HttpServletResponse response, Hero hero) throws IOException {
		heroService.add(hero);
		response.sendRedirect("list");
	}

	/**
	 * 查询英雄列表（分页）
	 * 
	 * @param model
	 * @param page
	 *            分页
	 * @return
	 */
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
