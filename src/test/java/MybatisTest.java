import com.gdchent.cn.dao.IUserDao;
import com.gdchent.cn.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {


    public static void main(String ...args){
         //1.读取配置文件 通过Resource
        try {
            InputStream inputStream =Resources.getResourceAsStream("SqlMapConfig.xml");
            //2 创建SqlSessionFactory工厂
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream,"mysql");
            //3 使用工厂生产SqlSession对象
            SqlSession sqlSession =sqlSessionFactory.openSession();
            //4 使用SqlSession创建dao接口的代理对象
            IUserDao iUserDao=sqlSession.getMapper(IUserDao.class);
            //5 使用代理对象执行方法
            List<User> users =iUserDao.findAll();

            for(User user:users){
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
