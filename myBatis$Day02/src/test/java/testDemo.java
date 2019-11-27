import domain.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testDemo {
    @Test
    public void ifTest01(){
        SqlSession sqlSession=null;
        try {
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.userMapper userMapper=sqlSession.getMapper(dao.userMapper.class);
            domain.user user=new user();
            user.setName("tom");
            System.out.println(user);
            System.out.println(userMapper.getByName$if(user));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }

    }
    @Test
    public void testIf02(){
        SqlSession sqlSession=null;
        try {
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.userMapper userMapper=sqlSession.getMapper(dao.userMapper.class);
            domain.user user=new user();
            user.setName("sally");
            user.setPassword("3307");
            user.setEmail("sally@sina.com");
            user.setPhoneNumber("23433324");
            userMapper.insertUser$if(user);

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }

        }
    }
    @Test
    public void testIf03(){
        SqlSession sqlSession=null;
        try {
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.userMapper userMapper=sqlSession.getMapper(dao.userMapper.class);
            domain.user user=new user();
            user.setId(1);
            user.setName("tomm");
            userMapper.updateUserInfo$set(user);

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void testIf04(){
        SqlSession sqlSession=null;
        try {
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.userMapper userMapper=sqlSession.getMapper(dao.userMapper.class);
            List<String> list=new ArrayList<String>();
            list.add("tomm");
            domain.user user=userMapper.insertFroeach(list);
            System.out.println(user);

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }

        }
    }

    @Test
    public void testIf05(){
        SqlSession sqlSession=null;
        try {
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.userMapper userMapper=sqlSession.getMapper(dao.userMapper.class);
            List<String> list=new ArrayList<String>();
            list.add("tomm");
            list.add("jack");
            List<domain.user> list1=userMapper.selectByName(list);
            for (user user : list1) {
                System.out.println(user);
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }

        }
    }
}
