package com.wjf.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjf.test.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}
