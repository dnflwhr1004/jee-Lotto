package com.lotto.web.Services;

import com.lotto.web.Domains.LottoBean;

public interface LottoService {
	public void createLotto(LottoBean param);
	public String createLottoNum();
	public String lottoseq();
	public boolean deduplication(int[] arr);
	public String ascendingSort(int[] arr);
}
