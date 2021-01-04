package pers.xzj.mybatis.sqlsession.defaults;

import pers.xzj.mybatis.cfg.Configuration;
import pers.xzj.mybatis.sqlsession.SqlSession;
import pers.xzj.mybatis.sqlsession.SqlSessionFactory;


public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
