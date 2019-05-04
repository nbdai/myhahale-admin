package com.dzl.service;

import com.dzl.pojo.Users;
import com.dzl.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}
