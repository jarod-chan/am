package ngdemo.service.contract.service2;

import ngdemo.domain.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT id,name as firstName FROM user WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

}
