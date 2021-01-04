package pers.xzj.dao;

import pers.xzj.domain.User;
import pers.xzj.mybatis.annotations.Select;

import java.util.List;


public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
