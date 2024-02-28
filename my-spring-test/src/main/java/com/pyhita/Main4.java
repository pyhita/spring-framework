package com.pyhita;

import com.pyhita.transaction.config.TransactionAspectConfiguration;
import com.pyhita.transaction.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class Main4 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				TransactionAspectConfiguration.class);

		FinanceService financeService = ctx.getBean(FinanceService.class);
		financeService.transfer(1L, 2L, 100);
	}

}
