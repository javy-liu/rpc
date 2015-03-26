package org.oyach.rpc.server;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import service.demo.Hello;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/26
 * @since 0.0.1
 */
public class HelloWorldTest {

    private Hello.Client client;

    @Before
    public void setUp() throws Exception {

        Runnable myRunnable = () -> {
            try {
                AppServer.main(new String[]{});
            } catch (TTransportException e) {
                e.printStackTrace();
            }
        };

        new Thread(myRunnable).start();

        TTransport transport = new TSocket("localhost", 9090);
        transport.open();

        // 设置传输协议为 TBinaryProtocol
        TProtocol protocol = new TBinaryProtocol(transport);

        client = new Hello.Client(protocol);
    }

    @Test
    public void test01() throws Exception {

        System.out.println(client.helloString("oyach"));
    }
}
