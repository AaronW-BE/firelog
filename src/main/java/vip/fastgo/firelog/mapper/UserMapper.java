package vip.fastgo.firelog.mapper;

import org.apache.ibatis.annotations.Mapper;
import vip.fastgo.firelog.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectList();
}
