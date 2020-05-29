package com.panlei.x.framework.service.ifc;

import com.panlei.x.framework.entity.User;

import java.util.List;

public interface IUserService {

    public User createUser(User user) throws Exception;

    public List<User> queryUser();

    public User queryUserByUsername(String username);

    public User updateUserNicknameByUsername(String username, String nickname) throws Exception;

    public User login(String username, String password) throws Exception;
}

