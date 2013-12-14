package ngdemo.infrastructure;

import static com.google.inject.name.Names.bindProperties;

import java.util.Properties;

import ngdemo.service.contract.UserService2;
import ngdemo.service.contract.service2.UserMapper;
import ngdemo.service.contract.service2.UserServiceImpl;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class MyBatis extends MyBatisModule {

	@Override
	protected void initialize() {
		install(JdbcHelper.MySQL);
		bindDataSourceProviderType(PooledDataSourceProvider.class);
		bindTransactionFactoryType(JdbcTransactionFactory.class);

		  addMapperClass(UserMapper.class);

          bindProperties(binder(), createTestProperties());
          
	}

	public static Properties createTestProperties() {
		Properties myBatisProperties = new Properties();
		myBatisProperties.setProperty("mybatis.environment.id", "test");
		myBatisProperties.setProperty("JDBC.host", "localhost");
		myBatisProperties.setProperty("JDBC.port", "3306");
		myBatisProperties.setProperty("JDBC.schema", "mybatis-guice");
		myBatisProperties.setProperty("JDBC.username", "root");
		myBatisProperties.setProperty("JDBC.password", "0");
		myBatisProperties.setProperty("JDBC.autoCommit", "false");
		return myBatisProperties;
	}

}
