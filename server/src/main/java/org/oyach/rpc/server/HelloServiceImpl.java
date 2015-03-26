package org.oyach.rpc.server;

import org.apache.thrift.TException;
import service.demo.Hello;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/26
 * @since 0.0.1
 */
public class HelloServiceImpl implements Hello.Iface {

    @Override
    public String helloString(String para) throws TException {
        System.out.println("-----helloString------");
        return para;
    }

    @Override
    public int helloInt(int para) throws TException {
        System.out.println("-----helloInt------");
        return para;
    }

    @Override
    public boolean helloBoolean(boolean para) throws TException {
        System.out.println("-----helloBoolean------");
        return para;
    }

    @Override
    public void helloVoid() throws TException {
        System.out.println("-----helloVoid------");

    }

    @Override
    public String helloNull() throws TException {
        System.out.println("-----helloNull------");

        return null;
    }
}
