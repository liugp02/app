package com.pdgz.app;

import com.github.stuxuhai.jpinyin.PinyinException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.github.stuxuhai.jpinyin.PinyinHelper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests {

	@Test
	public void contextLoads() throws PinyinException {
		String name ="刘";
		String nameper= PinyinHelper.getShortPinyin(name.substring(0,1).toUpperCase());
		System.out.println(nameper);

	}

}
