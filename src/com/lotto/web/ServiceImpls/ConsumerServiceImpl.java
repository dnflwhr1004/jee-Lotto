package com.lotto.web.ServiceImpls;

import com.lotto.web.DaoImpls.ConsumerDAOImpl;
import com.lotto.web.Daos.ConsumerDAO;
import com.lotto.web.Domains.ConsumerBean;
import com.lotto.web.Services.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService {
	private ConsumerDAO dao;
	
	public ConsumerServiceImpl() {
		dao = new ConsumerDAOImpl();
	}
	
	@Override
	public void registerConsumer(ConsumerBean param) {
		dao.insertConsumer(param);
	}
	
	

}
