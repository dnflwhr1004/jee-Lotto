package com.lotto.web.DaoImpls;

import com.lotto.web.Daos.ConsumerDAO;
import com.lotto.web.Domains.ConsumerBean;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class ConsumerDAOImpl implements ConsumerDAO {
    public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jsee%sjee-Lotto%sWebContent%sresources%stxt%s",
            File.separator,
            File.separator,
            File.separator,
            File.separator,
            File.separator,
            File.separator,
            File.separator,
            File.separator);
	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(FILE_PATH+"consumers.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s, %s", param.getCid(), param.getPass()));
			writer.newLine();
			writer.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
