### mybatis的环境搭建
第一步 ： 创建maven工程并导入坐标
第二步 ： 创建实体bean和dao的接口  
第三步 ： 创建mybatis的主配置文件SqlMapConfig.xml  
第四步 ： 创建映射的配置文件IUserDao.xml  
环境搭建的注意事项：
第一个:创建IUserDao.java和IUserDao.xml时名称是为了和我们之前的知识保持一致。
在mybatis中它把持久层的操作接口名称和映射文件也交错Mapper
所有 ：IUserDao和IUserMapper是一样的  
第二个：在idea创建目录的时候，它和包是不一样的。
包在创建时：com.gdchent.cn.dao 是四级结构  
目录在创建时候：com.gdchent.cn.dao是一级目录  
第三个：mybatis的映射文件位置必须和dao接口的包结构相同(就是指resources的IUserDao跟java代码下的IUserDao的包结构要相同)  
第四个：映射配置文件的mapper标签namespace属性地址必须是dao接口的全限定类名  
第五个：映射配置文件的操作配置（select）id属性的取值必须是dao接口的方法名  
当我们遵从了第三四 五点之后，我们在开发中就无须再写dao的实现类。   

mybatis的入门案例  
第一步：读取配置文件   
第二步：创建SqlSessionFactory工厂  
第三步：创建SqlSession   
第四步：创建Dao接口的代理对象  
第五步：执行dao中的方法  
第六步：释放资源  