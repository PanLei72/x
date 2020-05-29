package com.panlei.x.framework.service.impl;

import com.panlei.x.framework.entity.User;
import com.panlei.x.framework.repository.UserRepository;
import com.panlei.x.framework.service.ifc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class UserService implements IUserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionLogService transactionLogService;

    @Override
    public User createUser(User user) throws Exception {
        if (StringUtils.isEmpty(user.getUsername())) {
            throw new Exception("username cannot be null");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            throw new Exception("password cannot be null");
        }

        user.setStatus("0");

        user.setCreateUser("admin");
        user.setUpdateUser("admin");
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        return userRepository.save(user);
    }

    @Override
    public List<User> queryUser() {
        transactionLogService.logDebug(UserService.class.getName(), "queryUser", "query all user");

        return userRepository.findAll();
    }

    @Override
    public User queryUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User updateUserNicknameByUsername(String username, String nickname) throws Exception {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new Exception("username is not exist");
        }


        user.setNickname(nickname);
        userRepository.save(user);

        transactionLogService.logInfo(UserService.class.getName(), "updateUserNicknameByUsername", "update userName " + username + ", nickname :" + nickname);
        return user;
    }

    @Override
    public User login(String username, String password) throws Exception {
        User user = this.queryUserByUsername(username);
        if (password.equals(user.getPassword())) {
            return user;
        } else {
            throw new Exception("Username or password is error .");
        }
    }


}
