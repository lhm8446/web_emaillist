package com.bit2016.emaillist.dat.test;

import java.util.List;

import com.bit2016.emaillist.dao.EmailListDao;
import com.bit2016.emaillist.vo.EmailListVo;

public class EmailListDaoTest {

	public static void main(String[] args) {
		insertTest();
		getListTest();

	}
	public static void insertTest(){
		EmailListVo vo = new EmailListVo();
		
		vo.setLastname("고");
		vo.setFirstname("길동");
		vo.setEmail("gildong@gmail.com");
		
		EmailListDao dao = new EmailListDao();
		dao.insert(vo);
				
	}
	public static void getListTest(){
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list =dao.getList();
		for(EmailListVo vo : list){
			System.out.println(vo);
		}
	}
}
