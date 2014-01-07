package am.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import am.domain.model.user.User;

public interface UserMapper {

//    @Select("select * from user where id = #{key}")
//    User getUser(@Param("key") String key);
    
  
    
  
//    
//    @Select("SELECT id as id,firstname as firstName,lastname as lastName FROM user WHERE id = #{id}")
//    User getUserById(@Param("id") int id);

   
    
   
    
    
    
    
    
    @Select("select key_ as 'key', cellphone, email, enabled, name, password, salt from pm_user order by key_")
    List<User> getAllUser();
    
    @Insert("insert into pm_user(key_,cellphone,email,enabled,name,password,salt) " +
    		"values(#{key},#{cellphone},#{email},#{enabled},#{name},#{password},#{salt})")
    void insertUser(User user);

    @Select("select key_ as 'key', cellphone, email, enabled, name, password, salt from pm_user where key_=#{key}")
	User find(String key);
    
    @Update("update pm_user set name= #{name},cellphone = #{cellphone},email=#{email},enabled=#{enabled} where key_ = #{key} ")
   	void updateUser(User user);
    
    @Delete("delete from pm_user where key_=#{key}")
    void deleteUser(String key);

}
