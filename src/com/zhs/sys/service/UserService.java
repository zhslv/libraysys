package com.zhs.sys.service;

import com.zhs.sys.domain.User;
import com.zhs.sys.vo.UserVo;

public interface UserService {
    /**
     * 登录
     * @param userVo
     * @return
     */
    User login(UserVo userVo);

    /**
     * 更新用户最后一次登录时间
     * @param userId
     */
    void updateUser(Integer userId);
}
