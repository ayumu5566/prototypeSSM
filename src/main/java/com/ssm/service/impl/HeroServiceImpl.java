package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.HeroDao;
import com.ssm.entity.Hero;
import com.ssm.service.HeroService;
import com.ssm.utils.Page;

@Service
public class HeroServiceImpl implements HeroService {

	@Autowired
	private HeroDao heroDao;

	/**
	 * 新增英雄
	 */
	public void add(Hero hero) {
		heroDao.add(hero);
	}

	/**
	 * 根据ID查询英雄
	 */
	public Hero get(Integer id) {
		return heroDao.get(id);
	}

	/**
	 * 查询英雄列表（无分页）
	 */
	public List<Hero> findList() {
		return heroDao.findList();
	}

	/**
	 * 查询英雄列表（分页）
	 */
	public List<Hero> findList(Page page) {
		return heroDao.findList(page);
	}

	/**
	 * 统计英雄数量
	 */
	public Integer total() {
		return heroDao.total();
	}

}
