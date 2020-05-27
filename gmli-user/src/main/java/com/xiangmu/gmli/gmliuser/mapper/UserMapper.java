package com.xiangmu.gmli.gmliuser.mapper;


import com.xiangmu.gmli.gmliuser.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: gmali0525
 * @Date: 2020/5/26 21:33
 * @Author: Mr.Hu
 * @Description:
 */
@Mapper
public interface UserMapper {

    List<UmsMember> selectAllUser();
}
