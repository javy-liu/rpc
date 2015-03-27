package org.oyach.rpc.server;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/27
 * @since 0.0.1
 */
public class ThriftServerPublisher implements FactoryBean<Object>, ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    private Class<?> serviceInterface;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    @Override
    public Object getObject() throws Exception {
        return this;
    }

    @Override
    public Class<?> getObjectType() {
        return this.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }



    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
