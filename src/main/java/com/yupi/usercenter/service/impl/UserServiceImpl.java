package com.yupi.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.usercenter.model.domain.User;
import com.yupi.usercenter.service.UserService;
import com.yupi.usercenter.Mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author hcj
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-04-02 11:47:21
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




