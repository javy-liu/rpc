package org.oyach.rpc.server.config;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.oyach.rpc.server.StartApp;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/27
 * @since 0.0.1
 */
@Configuration
@ComponentScan(basePackageClasses = {StartApp.class})
public class AppConfig {


    public TProtocolFactory tProtocolFactory(){
        return new TBinaryProtocol.Factory();
    }
}
