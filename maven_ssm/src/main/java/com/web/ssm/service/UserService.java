package com.web.ssm.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.web.ssm.dao.userDao;
import com.web.ssm.pojo.User;


@Service

public class UserService {
	
	@Resource
	private userDao userDao;

	public List<User> getUserAll() {
		return userDao.selectAll();
	}
	
	
	
	

}
