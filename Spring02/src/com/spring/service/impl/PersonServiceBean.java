package com.spring.service.impl;

import com.spring.service.PersonService;

public class PersonServiceBean implements PersonService {

	public void init(){
		
		System.out.println("��ʼ��");
	}
	
	public PersonServiceBean(){
		
		System.out.println("�ұ�ʵ������");
	}
	
	public void save(){
		
		System.out.println("ִ����PersonServiceBean��save����");
	}
	
	public void destory(){
		
		System.out.println("���մ򿪵���Դ");
	}
}
