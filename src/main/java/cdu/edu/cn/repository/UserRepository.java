package cdu.edu.cn.repository;


import cdu.edu.cn.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {


    @Select("select * from user where id=#{id} and password=#{password}")
    public Integer checkUser(User user);
}
