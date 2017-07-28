package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.entity.Hero;
import com.ssm.utils.Page;

@Repository
public interface HeroDao {

	/**
	 * ����Ӣ��
	 * 
	 * @param hero
	 *            Ӣ��
	 */
	public void add(Hero hero);

	/**
	 * ����ID��ѯӢ��
	 * 
	 * @param id
	 *            Ӣ��ID
	 * @return Ӣ��
	 */
	public Hero get(Integer id);

	/**
	 * ����IDɾ��Ӣ��
	 * 
	 * @param id
	 *            Ӣ��ID
	 */
	public void delete(Integer id);

	/**
	 * ��ѯӢ���б����޷�ҳ��
	 * 
	 * @return Ӣ���б�
	 */
	public List<Hero> findList();

	/**
	 * ��ѯӢ���б�����ҳ��
	 * 
	 * @param page
	 *            ��ҳ
	 * @return Ӣ���б�
	 */
	public List<Hero> findList(Page page);

	/**
	 * ͳ��Ӣ������
	 * 
	 * @return Ӣ������
	 */
	public Integer total();
}
