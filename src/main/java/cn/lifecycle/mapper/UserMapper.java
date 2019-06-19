package cn.lifecycle.mapper;

import cn.lifecycle.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserName();
}
