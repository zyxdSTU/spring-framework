package com.zy;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.object.MappingSqlQuery;

/**
 * @author zhouyu
 * @create 2023-12-01 11:02
 */
public class CustomerMappingQuery extends MappingSqlQuery<User> {
	public CustomerMappingQuery(DataSource dataSource) {
		super(dataSource, "select * from user;");
		compile();
	}

	@Override
	protected User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(rs.getString("username"));
	}
}
