package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.entity.Hero;

@Repository
public interface HeroDao {
	public List<Hero> findList();
}
