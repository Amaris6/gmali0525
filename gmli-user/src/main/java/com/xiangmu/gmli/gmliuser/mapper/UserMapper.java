package com.xiangmu.gmli.gmliuser.mapper;


import com.xiangmu.gmli.gmliuser.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @program: gmali0525
 * @Date: 2020/5/26 21:33
 * @Author: Mr.Hu
 * @Description:
 */

public interface UserMapper  extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();


}
