package org.zerock.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages= {"org.zerock.sample"})
//@MapperScan(basePackages = {"org.zerock.mapper"})
public class RootConfig{
	
//	@Bean
//	public DataSource dataSource() {
//		HikariConfig hikariConfig = new HikariConfig();
//		hikariConfig.setDriverClassname("oracle.jdbc.driver.OracleDriver");
//		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
//		hikariConfig.setUserName("book_ex");
//		hikariConfig.setPassword("book_ex");
//		
//		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
//		
//		return dataSource;
//		
//	}
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFActoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//		sqlSessionFActory.setDataSource(dataSource());
//	return (SqlSessionFactory) sqlSessionFactory.getObject();
//	}
	
}
