package com.zhaike.service.impl;

import com.zhaike.entity.Users;
import com.zhaike.entity.UsersExample;
import com.zhaike.mapping.UsersMapper;
import com.zhaike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> getAllUsers() {
        UsersExample usersExample = new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }
}
