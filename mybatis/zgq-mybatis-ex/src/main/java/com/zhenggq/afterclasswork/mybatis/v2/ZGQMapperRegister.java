package com.zhenggq.afterclasswork.mybatis.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 10:23
 * @Description:
 * @Version: 1.0
 */
public class ZGQMapperRegister {

    public static final Map<String, mapperData> methodSqlMapping = new HashMap<String, mapperData>();

    public ZGQMapperRegister(String mapperPackage) {
        //扫描注解,存入map

        methodSqlMapping.put("com.zhenggq.afterclasswork.mybatis.v2.mapper.UserMapper.selectByPrimaryKey", null);

        // methodSqlMapping.put();
    }


    public mapperData getMapper(String key) {
        return methodSqlMapping.get(key);
    }


    class mapperData<T> {
        private String sql;
        private Class<T> clazz;

        public mapperData(String sql, Class<T> clazz) {
            this.sql = sql;
            this.clazz = clazz;
        }

        public String getSql() {
            return sql;
        }

        public void setSql(String sql) {
            this.sql = sql;
        }

        public Class getClazz() {
            return clazz;
        }

        public void setClazz(Class clazz) {
            this.clazz = clazz;
        }
    }

}
