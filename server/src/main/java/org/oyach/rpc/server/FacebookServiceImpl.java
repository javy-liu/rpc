package org.oyach.rpc.server;

import com.facebook.fb303.FacebookService;
import com.facebook.fb303.fb_status;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author liuzhenyuan
 * @version Last modified 15/3/27
 * @since 0.0.1
 */
@Service
public class FacebookServiceImpl implements FacebookService.Iface {

    @Override
    public String getName() throws TException {
        System.out.println("=======getName======");
        return "oyach";
    }

    @Override
    public String getVersion() throws TException {
        System.out.println("=======getVersion======");
        return "0.0.1";
    }

    @Override
    public fb_status getStatus() throws TException {
        System.out.println("=======getStatus======");
        return null;
    }

    @Override
    public String getStatusDetails() throws TException {
        System.out.println("=======getStatusDetails======");
        return null;
    }

    @Override
    public Map<String, Long> getCounters() throws TException {
        System.out.println("=======getCounters======");
        return null;
    }

    @Override
    public long getCounter(String key) throws TException {
        System.out.println("=======getCounter======");
        return 0;
    }

    @Override
    public void setOption(String key, String value) throws TException {
        System.out.println("=======setOption======");
    }

    @Override
    public String getOption(String key) throws TException {
        System.out.println("=======getOption======");
        return null;
    }

    @Override
    public Map<String, String> getOptions() throws TException {
        System.out.println("=======getOptions======");
        return null;
    }

    @Override
    public String getCpuProfile(int profileDurationInSec) throws TException {
        System.out.println("=======getOptions======");
        return null;
    }

    @Override
    public long aliveSince() throws TException {
        System.out.println("=======aliveSince======");

        return 0;
    }

    @Override
    public void reinitialize() throws TException {
        System.out.println("=======reinitialize======");
    }

    @Override
    public void shutdown() throws TException {
        System.out.println("=======shutdown======");

    }
}
