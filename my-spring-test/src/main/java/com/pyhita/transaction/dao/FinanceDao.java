package com.pyhita.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Repository
public class FinanceDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addMoney(Long id, int money) {
		try {
			// Connection connection = JdbcUtils.getConnection();
			// PreparedStatement preparedStatement = connection
			// 		.prepareStatement("update tbl_employee set salary = salary + ? where id = ?");
			// preparedStatement.setInt(1, money);
			// preparedStatement.setLong(2, id);
			// preparedStatement.executeUpdate();
			// preparedStatement.close();
			// connection.close();
			String sql = "update tbl_employee set salary = salary + ? where id = ?";
			jdbcTemplate.update(sql, money, id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void subtractMoney(Long id, int money) {
		try {
			// Connection connection = JdbcUtils.getConnection();
			// PreparedStatement preparedStatement = connection
			// 		.prepareStatement("update tbl_employee set salary = salary - ? where id = ?");
			// preparedStatement.setInt(1, money);
			// preparedStatement.setLong(2, id);
			// preparedStatement.executeUpdate();
			String sql = "update tbl_employee set salary = salary - ? where id = ?";
			jdbcTemplate.update(sql, money, id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}