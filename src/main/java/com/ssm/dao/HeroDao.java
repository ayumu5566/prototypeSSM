package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.entity.Hero;
import com.ssm.utils.Page;

@Repository
public interface HeroDao {
	public List<Hero> findList();

	public List<Hero> findList(Page page);

	public Integer total();
}
