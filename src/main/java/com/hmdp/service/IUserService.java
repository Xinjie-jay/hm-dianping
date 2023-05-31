package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.dto.LoginFormDTO;
import com.hmdp.dto.Result;
import com.hmdp.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    /**
     * @param phone 手机号
     * @param session session
     * @return 发送结果
     */
    public Result sendCode(String phone, HttpSession session);


    /**
     * @param loginForm 登陆表单信息
     * @param session session
     * @return 登陆结果
     */
    public Result login(LoginFormDTO loginForm, HttpSession session);
}
