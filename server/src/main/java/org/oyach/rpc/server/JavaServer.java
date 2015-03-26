package org.oyach.rpc.server;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import tutorial.Calculator;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/26
 * @since 0.0.1
 */
public class JavaServer {
    public static CalculatorHandler handler;

    public static Calculator.Processor processor;

    public static void main(String [] args) {
        try {
            handler = new CalculatorHandler();
            processor = new Calculator.Processor<>(handler);

            Runnable simple = () -> {
                simple(processor);
            };


            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void simple(Calculator.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

            // Use this for a multithreaded server
            // TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
