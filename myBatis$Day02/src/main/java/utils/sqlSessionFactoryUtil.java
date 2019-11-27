package utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class sqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlSessionFactoryUtil.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
            System.out.println("<====Sql ses大师傅似的sion Factory initialization complied===== >");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    public static SqlSession getSqlSession2(){
        return sqlSessionFactory.openSession();
    }
}
