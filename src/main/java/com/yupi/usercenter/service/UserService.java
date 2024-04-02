package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author hcj
* @description 针对表【user】的数据库操作Service
* @createDate 2024-04-02 11:47:21
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
