package com.ssm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	 * 跳转修改页面
	 * 
	 * @param model
	 * @param id
	 *            英雄ID
	 * @return
	 */
	@RequestMapping("/updatePage")
	public String updatePage(Model model, @RequestParam(value = "id", required = true) Integer id) {
		Hero hero = heroService.get(id);
		model.addAttribute("hero", hero);
		return "heroEdit";
	}

	/**
	 * 修改英雄
	 * 
	 * @param response
	 * @param hero
	 *            英雄
	 * @throws IOException
	 */
	@RequestMapping("/update")
	public void update(HttpServletResponse response, Hero hero) throws IOException {
		heroService.update(hero);
		response.sendRedirect("list");
	}

	/**
	 * 根据ID查询英雄
	 * 
	 * @param model
	 * @param id
	 *            英雄ID
	 * @return
	 */
	@RequestMapping("detail")
	public String get(Model model, @RequestParam(value = "id", required = true) Integer id) {
		Hero hero = heroService.get(id);
		model.addAttribute("hero", hero);
		return "heroDetail";
	}

	/**
	 * 根据ID删除英雄
	 * 
	 * @param response
	 * @param id
	 *            英雄ID
	 * @throws IOException
	 */
	@RequestMapping("delete")
	public void delete(HttpServletResponse response, @RequestParam(value = "id", required = true) Integer id)
			throws IOException {
		heroService.delete(id);
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
	public String list(HttpServletRequest request, Model model, Page page,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "hp", required = false) Float hp,
			@RequestParam(value = "damage", required = false) Integer damage) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (null != name) {
			map.put("name", name);
		}
		if (null != hp) {
			map.put("hp", hp);
		}
		if (null != damage) {
			map.put("damage", damage);
		}

		List<Hero> heroList = heroService.findList(map, page);
		Integer total = heroService.total();
		page.caculateLast(total);

		model.addAttribute("total", total);
		model.addAttribute("page", page);
		model.addAttribute("heroList", heroList);
		model.addAttribute("map", map);
		return "heroList";
	}
}
