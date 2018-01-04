package com.sgc.app.service;

import com.baomidou.mybatisplus.service.IService;
import com.sgc.domain.Entity.Account;
import com.sgc.domain.User;
import com.sgc.domain.vm.ResultVM;

public interface UserService extends IService<User> {

	ResultVM register(User user);
	ResultVM registerAccount(Account account);
}
