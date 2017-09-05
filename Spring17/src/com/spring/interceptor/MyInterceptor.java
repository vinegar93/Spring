package com.spring.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ������MyInterceptor����Ϊһ������
 */
@Aspect
public class MyInterceptor {
	
	/**
	 * ����һ�������
	 */
	@Pointcut("execution(* com.spring.service.impl.PersonServiceBean.*(..))")
	private void qrd() {}
	
	/**
	 * ����ǰ��֪ͨ
	 */
	@Before("qrd()")
	public void qztz() {
		
		System.out.println("ǰ��֪ͨ");
	}
	
	/**
	 * �������֪ͨ
	 */
	@AfterReturning(("qrd()"))
	public void hztz() {
		
		System.out.println("����֪ͨ");
	}
	
	/**
	 * ��������֪ͨ
	 */
	@After("qrd()")
	public void zztz() {
		
		System.out.println("����֪ͨ");
	}
	
	/**
	 * �����쳣֪ͨ
	 */
	@AfterThrowing(("qrd()"))
	public void yctz() {
		
		System.out.println("����֪ͨ");
	}
	
	/**
	 * ���廷��֪ͨ
	 */
	@Around("qrd()")
	public Object hrtz(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("���뷽��");
		Object result = pjp.proceed();
		System.out.println("�˳�����");
		return result;
	}	
}
