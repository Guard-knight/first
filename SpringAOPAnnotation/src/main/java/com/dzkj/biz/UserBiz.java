package com.dzkj.biz;

import org.springframework.stereotype.Service;

@Service
public class UserBiz {
	public void findAll() {
		System.out.println("查询所有用户");
	}
	public boolean delete(int id) {
		System.out.println("成功删除用户,id:"+id);
		System.out.println(1/0);
		return true;
	}
}
