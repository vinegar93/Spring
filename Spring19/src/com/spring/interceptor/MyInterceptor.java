package com.spring.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyInterceptor {

	public void qztz() {
		
		System.out.println("ǰ��֪ͨ");
	}

	public void hztz() {
		
		System.out.println("����֪ͨ");
	}

	public void zztz() {
		
		System.out.println("����֪ͨ");
	}

	public void yctz() {
		
		System.out.println("����֪ͨ");
	}

	public Object hrtz(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("���뷽��");
		Object result = pjp.proceed();
		System.out.println("�˳�����");
		return result;
	}	
}
