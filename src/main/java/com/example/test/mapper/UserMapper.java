package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserBean getInfo(String name,String password);

}
