package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
// implements Serializable 继承序列化
// lombok.Data 让它生成get、set方法
@Data
public class UserLoginRequest implements Serializable {
    // 序列化id
    private static final long serialVersionUID = 3191241716373120793L;
    private String userAccount;
    private String userPassword;
}
