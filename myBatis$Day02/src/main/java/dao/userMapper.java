package dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
    public abstract domain.user getByName$if(domain.user user);
    void insertUser$if(domain.user user);
    void updateUserInfo$set(domain.user user);
    domain.user insertFroeach(List<String> list);
    List<domain.user> selectByName(@Param("yoyo") List<String> list);


}
