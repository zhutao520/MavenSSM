package com.web.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.ssm.pojo.User;


@Repository
public interface userDao {
	
	List<User> selectAll();
}
