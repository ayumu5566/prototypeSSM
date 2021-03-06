package com.ssm.service.impl;

import java.util.List;
import java.util.Map;

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
	 * 修改英雄
	 */
	public void update(Hero hero) {
		heroDao.update(hero);
	}

	/**
	 * 根据ID查询英雄
	 */
	public Hero get(Integer id) {
		return heroDao.get(id);
	}

	/**
	 * 根据ID删除英雄
	 */
	public void delete(Integer id) {
		heroDao.delete(id);
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
	public List<Hero> findList(Map<String, Object> map, Page page) {
		return heroDao.findList(map, page);
	}

	/**
	 * 统计英雄数量
	 */
	public Integer total() {
		return heroDao.total();
	}

}
