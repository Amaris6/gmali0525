package com.xiangmu.gmli.gmliuser.contorller;

import com.xiangmu.gmli.gmliuser.bean.UmsMember;
import com.xiangmu.gmli.gmliuser.bean.UmsMemberReceiveAddress;
import com.xiangmu.gmli.gmliuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * @program: gmali0525
 * @Date: 2020/5/26 21:29
 * @Author: Mr.Hu
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember=userService.getAllUser();
        return umsMember;
    }
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello";
    }
}
