package com.spring.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.dao.PersonDao;
import com.spring.service.PersonService;

/**
 * @Scope("prototype")ָ������bean��ģʽ
 */
@Service("personService") 
@Scope("prototype")
public class PersonServiceBean implements PersonService {

	private PersonDao personDao;
	
	/**
	 * @PostConstructָ����ʼ��bean֮����õķ���
	 */
	@PostConstruct
	public void init() {
		
		System.out.println("init");
	}
	
	/**
	 * @PreDestroyָ������bean֮ǰ���õķ���
	 */
	@PreDestroy
	public void destory() {
		
		System.out.println("destory");
	}
	
	public PersonServiceBean() {}

	public PersonServiceBean(PersonDao personDao) {
		
		this.personDao = personDao;
	}

	public void save() {
		
		personDao.add();
	}
}
