package ngdemo.repositories.impl.mock;

import java.util.List;

import ngdemo.domain.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

    @Select("SELECT id as id,firstname as firstName,lastname as lastName FROM user WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);
    
    @Select("SELECT id as id,firstname as firstName,lastname as lastName FROM user order by id")
    List<User> getAllUser();
    
    @Insert("insert into user(firstname,lastname) values(#{firstName},#{lastName})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
    
    @Select("SELECT id as id,firstname as firstName,lastname as lastName FROM user WHERE id = #{id}")
    User getUserById(@Param("id") int id);

    @Update("update user set firstName = #{firstName},   lastName = #{lastName} where id = #{id} ")
	void updateUser(User user);
    
    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);

}
