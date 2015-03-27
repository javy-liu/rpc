package org.oyach.rpc.server;

import com.facebook.fb303.FacebookService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.net.TransferProtocolClient;

import static org.junit.Assert.*;

public class FacebookServiceImplTest {

    private FacebookService.Client client;

    private TTransport transport;

    @Before
    public void setUp() throws Exception {
        Runnable runnable = () -> AppServer.main(new String[]{});
        new Thread(runnable).start();

        transport = new TSocket("localhost", AppServer.PORT);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);

        client = new FacebookService.Client(protocol);

    }

    @Test
    public void testGetName() throws Exception {
        String name = client.getName();
        assertEquals("oyach", name);
    }

    @Test
    public void testGetVersion() throws Exception {
        String version = client.getName();
        assertEquals("0.0.1", version);
    }

    @Test
    public void testGetStatus() throws Exception {
        String version = client.getName();
        assertEquals("0.0.1", version);
    }

    @Test
    public void testGetStatusDetails() throws Exception {

    }

    @Test
    public void testGetCounters() throws Exception {

    }

    @Test
    public void testGetCounter() throws Exception {

    }

    @Test
    public void testSetOption() throws Exception {

    }

    @Test
    public void testGetOption() throws Exception {

    }

    @Test
    public void testGetOptions() throws Exception {

    }
}