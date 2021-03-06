package com.ssm.service;

import java.util.List;
import java.util.Map;

import com.ssm.entity.Hero;
import com.ssm.utils.Page;

public interface HeroService {

	/**
	 * ����Ӣ��
	 * 
	 * @param hero
	 *            Ӣ��
	 */
	public void add(Hero hero);

	/**
	 * �޸�Ӣ��
	 * 
	 * @param hero
	 *            Ӣ��
	 */
	public void update(Hero hero);

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
	public List<Hero> findList(Map<String, Object> map, Page page);

	/**
	 * ͳ��Ӣ������
	 * 
	 * @return Ӣ������
	 */
	public Integer total();
}
