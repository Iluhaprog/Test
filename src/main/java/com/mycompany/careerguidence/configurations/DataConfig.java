package com.mycompany.careerguidence.configurations;

import com.mycompany.careerguidence.mappers.AnswersMapper;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.mappers.ProfessionsMapper;
import com.mycompany.careerguidence.mappers.QuestionsMapper;
import com.mycompany.careerguidence.mappers.RolesMapper;
import com.mycompany.careerguidence.mappers.TestsMapper;
import com.mycompany.careerguidence.mappers.UsersMapper;
import com.mycompany.careerguidence.mappers.WorksMapper;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


@Configuration 
@MapperScan("com.mycompany.careerguidence.mappers") 

public class DataConfig {
    
    @Bean 
    public BasicDataSource dataSource(){ 
        BasicDataSource dataSource = new BasicDataSource(); 
        dataSource.setDriverClassName("com.mysql.jdbc.Driver"); 
        dataSource.setUrl("jdbc:mysql://localhost/test?useUnicode=true&characterCharacterEncoding=utf8"); 
        dataSource.setUsername("root"); 
        dataSource.setPassword("root"); 
        return dataSource; 
    } 


    @Bean 
    public DataSourceTransactionManager transactionManager() { 
        return new DataSourceTransactionManager(dataSource()); 
    } 


     @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setTypeAliasesPackage("com.mycompany.testwebproject.dao.type");
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath                                                                                                                                                                                                                :/src/main/resources/mappersXml/*.xml"));
        return sqlSessionFactory.getObject();
    }

    @Bean 
    public MapperFactoryBean<AnswersMapper> AnswersMapper() throws Exception { 
        MapperFactoryBean<AnswersMapper> factoryBean = new MapperFactoryBean<>(AnswersMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<QuestionsMapper> CityMapper() throws Exception { 
        MapperFactoryBean<QuestionsMapper> factoryBean = new MapperFactoryBean<>(QuestionsMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<EnterpricesMapper> StreetsMapper() throws Exception { 
        MapperFactoryBean<EnterpricesMapper> factoryBean = new MapperFactoryBean<>(EnterpricesMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<ProfessionsMapper> ProfessionsMapper() throws Exception { 
        MapperFactoryBean<ProfessionsMapper> factoryBean = new MapperFactoryBean<>(ProfessionsMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<RolesMapper> RolesMapper() throws Exception { 
        MapperFactoryBean<RolesMapper> factoryBean = new MapperFactoryBean<>(RolesMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<TestsMapper> TestsMapper() throws Exception { 
        MapperFactoryBean<TestsMapper> factoryBean = new MapperFactoryBean<>(TestsMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<UsersMapper> UsersMapper() throws Exception { 
        MapperFactoryBean<UsersMapper> factoryBean = new MapperFactoryBean<>(UsersMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 


    @Bean 
    public MapperFactoryBean<WorksMapper> WorksMapper() throws Exception { 
        MapperFactoryBean<WorksMapper> factoryBean = new MapperFactoryBean<>(WorksMapper.class); 
        factoryBean.setSqlSessionFactory((SqlSessionFactory) sqlSessionFactory()); 
        return factoryBean; 
    } 
    
}
