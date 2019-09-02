package com.lotto.web.ServiceImpls;

import java.util.Random;


import com.lotto.web.Daos.LottoDAO;

import com.lotto.web.Domains.LottoBean;
import com.lotto.web.Services.LottoService;

public class LottoServiceImpl implements LottoService{

	private LottoDAO dao;

	@Override
	public void createLotto(LottoBean param) {
		
		param.setBall(createLottoNum());
		param.setLotteryNum(lotteryNum());
		param.setLottoSeq( lottoseq());
		dao.insertLotto(param);
		
	}

	@Override
	public String lottoseq() {
		String seq = "No.";
		Random r = new Random();
		for(int i = 0; i < 4; i++) {
			seq += r.nextInt(10) + "";
		}
		return seq;
	}
	
	@Override
	public String createLottoNum() {
		String ball = "";
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			
			ball += r.nextInt(45) +1 + ""; 
		}
		return ball;
	}
	
	public String lotteryNum() {
		String lotteryNum = "";
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			lotteryNum += r.nextInt(45) +1 + ""; 
		}
		return lotteryNum;
	}

	@Override
	public boolean deduplication(int[] arr) {
		
		return false;
	}

	@Override
	public String ascendingSort(int[] arr) {
		
		return null;
	}
	
	
	
}
