package com.zy;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhouyu
 * @create 2023-12-04 10:46
 */


//@Component
//@EnableTransactionManagement(mode = AdviceMode.PROXY)
public class SchoolRepository implements ISchoolRepository{

	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

//	@Transactional(propagation = Propagation.REQUIRED)
	public void saveSchool(School school) {
		Session session = sessionFactory.openSession();
		session.save(school);
	}
}
