package com.ssm.controller;

import java.io.IOException;
import java.util.List;

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
	 * ��ת����ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/addPage")
	public String addPage() {
		return "heroAdd";
	}

	/**
	 * ����Ӣ��
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
	 * ����ID��ѯӢ��
	 * 
	 * @param model
	 * @param id
	 *            Ӣ��ID
	 * @return
	 */
	@RequestMapping("detail")
	public String get(Model model, @RequestParam(value = "id", required = true) Integer id) {
		Hero hero = heroService.get(id);
		model.addAttribute("hero", hero);
		return "heroDetail";
	}

	/**
	 * ����IDɾ��Ӣ��
	 * 
	 * @param response
	 * @param id
	 *            Ӣ��ID
	 * @throws IOException
	 */
	@RequestMapping("delete")
	public void delete(HttpServletResponse response, @RequestParam(value = "id", required = true) Integer id)
			throws IOException {
		heroService.delete(id);
		response.sendRedirect("list");
	}

	/**
	 * ��ѯӢ���б�����ҳ��
	 * 
	 * @param model
	 * @param page
	 *            ��ҳ
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
