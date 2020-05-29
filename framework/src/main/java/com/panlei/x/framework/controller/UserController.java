package com.panlei.x.framework.controller;

import com.panlei.x.framework.entity.User;
import com.panlei.x.framework.service.impl.TransactionLogService;
import com.panlei.x.framework.service.impl.UserService;
import com.panlei.x.framework.utils.IPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private TransactionLogService transactionLogService;


    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUser(HttpServletRequest request, @RequestBody User user) throws Exception {
        return userService.createUser(user);
    }

    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    public List<User> queryUser(HttpServletRequest request) {
        String ip = IPUtil.getIpAddr(request);

        transactionLogService.logInfo(UserController.class.getName(), "queryUser", "Query all user");
        return userService.queryUser();
    }

    @RequestMapping(value = "/queryUserByUsername", method = RequestMethod.POST)
    public User queryUserByUsername(HttpServletRequest request, @RequestParam String username) {
        return userService.queryUserByUsername(username);
    }

    @RequestMapping(value = "/updateUserNicknameByUsername", method = RequestMethod.POST)
    public User updateUserNicknameByUsername(HttpServletRequest request, @RequestParam String username, @RequestParam String nickname) throws Exception {
        return userService.updateUserNicknameByUsername(username, nickname);
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(HttpServletRequest request, @RequestParam String username, @RequestParam String password) throws Exception {
        if(StringUtils.isEmpty(username)){
            throw new Exception("Username cannot be empty .");
        }
        if (StringUtils.isEmpty(password)){
            throw new Exception("Password cannot be empty .");
        }

        return userService.login(username, password);
    }
}
