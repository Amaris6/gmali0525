package com.xiangmu.gmli.gmliuser.service.impl;

import com.xiangmu.gmli.gmliuser.bean.UmsMember;
import com.xiangmu.gmli.gmliuser.mapper.UserMapper;
import com.xiangmu.gmli.gmliuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: gmali0525
 * @Date: 2020/5/26 21:32
 * @Author: Mr.Hu
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberlist= userMapper.selectAllUser();
        return umsMemberlist;
    }
}
