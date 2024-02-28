package com.pyhita.transaction.service;

import com.pyhita.transaction.dao.FinanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Service
public class FinanceService {

	@Autowired
	FinanceDao financeDao;

	@Transactional
	public void transfer(Long source, Long target, int money) {
		financeDao.subtractMoney(source, money);
		// int i = 1 / 0;
		financeDao.addMoney(target, money);
	}
}