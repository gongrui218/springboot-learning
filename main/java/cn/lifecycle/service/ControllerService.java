package cn.lifecycle.service;

import cn.lifecycle.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerService {

    @Autowired
    private UserMapper userMapper;

    public String getMessage(){
        return userMapper.getUserName().getName();
    }
}
