package com.zhs.sys.service.impl;

import com.zhs.sys.domain.User;
import com.zhs.sys.mapper.UserMapper;
import com.zhs.sys.service.UserService;
import com.zhs.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(UserVo userVo) {
        System.out.println("service&&&&&&&&&&&&&&&&&&&&&进入了"+userVo);
        return userMapper.login(userVo);
    }

    @Override
    public void updateUser(Integer userId) {
        User user = new User();
        user.setUserid(userId);
        user.setLastlogintime(new Date());
        //更新
        userMapper.updateByPrimaryKeySelective(user);
    }
}
