package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.HeroDao;
import com.ssm.entity.Hero;
import com.ssm.service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

	@Autowired
	private HeroDao heroDao;

	public List<Hero> findList() {
		return heroDao.findList();
	}

}
