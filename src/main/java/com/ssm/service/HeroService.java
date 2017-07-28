package com.ssm.service;

import java.util.List;

import com.ssm.entity.Hero;
import com.ssm.utils.Page;

public interface HeroService {

	/**
	 * 新增英雄
	 * 
	 * @param hero
	 *            英雄
	 */
	public void add(Hero hero);

	/**
	 * 根据ID查询英雄
	 * 
	 * @param id
	 *            英雄ID
	 * @return 英雄
	 */
	public Hero get(Integer id);

	/**
	 * 根据ID删除英雄
	 * 
	 * @param id
	 *            英雄ID
	 */
	public void delete(Integer id);

	/**
	 * 查询英雄列表（无分页）
	 * 
	 * @return 英雄列表
	 */
	public List<Hero> findList();

	/**
	 * 查询英雄列表（分页）
	 * 
	 * @param page
	 *            分页
	 * @return 英雄列表
	 */
	public List<Hero> findList(Page page);

	/**
	 * 统计英雄数量
	 * 
	 * @return 英雄总数
	 */
	public Integer total();
}
