package com.ssm.dao;

import com.ssm.model.User;
import com.ssm.model.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void deleteByPrimaryKey() {
        String resource = "mybatis/SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        System.out.println("sqlSessionfactory:"+sqlSessionFactoryBuilder);
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper);

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
         criteria.andFirstnameEqualTo("赵");

        List<User> list = userMapper.selectByExample(userExample);
        System.out.println(list);

        User user = userMapper.selectByPrimaryKey(1001);
        System.out.println(user);
    }
}