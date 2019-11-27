import domain.loginInfo;
import domain.user;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testDemo02 {
    @Test
    public void test01(){
        SqlSession sqlSession=null;
        try {
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.logInfoMapper logInfoMapper=sqlSession.getMapper(dao.logInfoMapper.class);
            List<domain.loginInfo> list=logInfoMapper.getLoginInfo$user();

            System.out.println("====================================");

            for (loginInfo info : list) {
                System.out.println(info);
                System.out.println(info.getUser());
            }
            System.out.println("====================================");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test02(){
        SqlSession sqlSession=null;
        try{
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.logInfoMapper logInfoMapper=sqlSession.getMapper(dao.logInfoMapper.class);

            List<domain.user> userList=logInfoMapper.oneToMuti();
            for (user user : userList) {
                System.out.println(user);
                if (user.getLoginInfoList().size() != 0) {
                    for (loginInfo info : user.getLoginInfoList()) {
                        System.out.println(info);
                    }
                }
                }
            } catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void test03(){
        SqlSession sqlSession=null;
        try{
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.logInfoMapper logInfoMapper=sqlSession.getMapper(dao.logInfoMapper.class);

            List<domain.user> userList=logInfoMapper.getUserRoles();
            for (user user : userList) {
                System.out.println(user);
                if (user.getRoleList().size() != 0) {
                    for (domain.role role : user.getRoleList()) {
                        System.out.println(role);
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test04(){
        SqlSession sqlSession=null;
        try{
            sqlSession=utils.sqlSessionFactoryUtil.getSqlSession();
            dao.logInfoMapper logInfoMapper=sqlSession.getMapper(dao.logInfoMapper.class);
            List<domain.loginInfo> list=logInfoMapper.fingAllLoginInfos();
            for (loginInfo info : list) {
                System.out.println(info);
                System.out.println(info.getUser());
            }

        }catch (Exception e){
            throw new RuntimeException("something fucked");
        }finally {
            if (sqlSession!=null){
             sqlSession.close();
            }
        }
    }
}
