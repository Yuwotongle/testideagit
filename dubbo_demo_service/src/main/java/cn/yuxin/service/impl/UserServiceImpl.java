package cn.yuxin.service.impl;

import cn.yuxin.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;


@Service
public class UserServiceImpl implements UserService {

    public String getName() {
        return "itheima";
    }
}
