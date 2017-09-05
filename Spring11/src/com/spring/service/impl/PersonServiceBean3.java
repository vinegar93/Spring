package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean3 implements PersonService {

	/**
	 * @Autowired(required=true)��ʾ����ΪpersonDaoע��ֵ
	 * @Qualifier("personDao")ָ��ע��nameΪpersonDao��bean��������������쳣
	 */
	@Autowired(required=true)
	@Qualifier("personDao")
	private PersonDao personDao;

	public PersonServiceBean3() {}

	public PersonServiceBean3(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
