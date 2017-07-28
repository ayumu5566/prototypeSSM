package com.ssm.service;

import java.util.List;

import com.ssm.entity.Hero;
import com.ssm.utils.Page;

public interface HeroService {
	public List<Hero> findList();

	public List<Hero> findList(Page page);

	public Integer total();
}
