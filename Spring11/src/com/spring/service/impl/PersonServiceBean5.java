package com.spring.service.impl;

import javax.annotation.Resource;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

public class PersonServiceBean5 implements PersonService {

	/**
	 * @Resource(name="personDao")ָ��ע��nameΪpersonDao��bean��������������쳣
	 */
	@Resource(name="personDao")
	private PersonDao personDao;
	
	public PersonServiceBean5() {}

	public PersonServiceBean5(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save(){
		
		personDao.add();
	}
}
