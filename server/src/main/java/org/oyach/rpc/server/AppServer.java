package org.oyach.rpc.server;

import com.facebook.fb303.FacebookService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/26
 * @since 0.0.1
 */
public class AppServer {

    public static final int PORT = 9090;

    public static void main(String[] args) {
        try {
            TServerTransport serverTransport = new TServerSocket(PORT);

            FacebookService.Iface facebookService = new FacebookServiceImpl();

            // 关联处理器与 Hello 服务的实现
            TProcessor processor = new FacebookService.Processor<>(facebookService);

            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

            // Use this for a multithreaded server
            // TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

            System.out.println("Starting the simple server...");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
