package com.zy;

import java.util.List;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.interceptor.TransactionAttributeSourceAdvisor;


public class Main {

	public static void main(String[] args) {
//		ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
//		beanDefinitionReader.loadBeanDefinitions(classPathResource);
//		IPlayer player = (IPlayer)beanFactory.getBean("testAOP");
//		player.play();

//		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
//
//		IPlayer player = (IPlayer) ctx.getBean("player");
//		player.play();
//
//		ProxyFactory aopProxyFactory = new ProxyFactory(new Player());
//		aopProxyFactory.addAdvisor(new TestAdvisor());
//		IPlayer playerOne = (IPlayer)aopProxyFactory.getProxy();
//		playerOne.play();
//
//		String driver = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql:10.5.24.98:3306/dp?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&serverTimezone=Asia"
//				+ "/Shanghai&useSSL=false";
//		String username = "root";
//		String password = "Zhejianglab@123";
//
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(driver);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//
//		List<User> userList = jdbcTemplate.query("select * from user;", new BeanPropertyRowMapper<User>(User.class));
//		System.out.println("hello world");
//
//		CustomerMappingQuery customerMappingQuery = new CustomerMappingQuery(dataSource);
//		List<User> userList = customerMappingQuery.execute();
//		System.out.println("hello world");

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");

		ISchoolRepository iSchoolRepository = (ISchoolRepository) ctx.getBean("schoolDao");
		iSchoolRepository.saveSchool(
				School.builder()
						.schoolName("namexx")
						.schoolTel("1832")
						.build()
		);
	}
}
