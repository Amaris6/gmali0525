package com.xiangmu.gmli.gmliuser.service.impl;

import com.xiangmu.gmli.gmliuser.bean.UmsMember;
import com.xiangmu.gmli.gmliuser.bean.UmsMemberReceiveAddress;
import com.xiangmu.gmli.gmliuser.mapper.UmsMemberReceiveAddressMapper;
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
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberlist= userMapper.selectAll(); //userMapper.selectAllUser();
        return umsMemberlist;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        UmsMemberReceiveAddress  umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        //List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);


        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
