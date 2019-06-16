package com.instant.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by dingxuyang on 2019/01/21.
 */
public class LocalHostUtil {
    protected static Logger log = LoggerFactory.getLogger(LocalHostUtil.class);
    private static String localhost="";
    public static void setLocalhost(){
        Enumeration allNetInterfaces = null;
        try {
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        InetAddress ip = null;
        while (allNetInterfaces.hasMoreElements())
        {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements())
            {
                ip = (InetAddress) addresses.nextElement();
                if (ip != null && ip instanceof Inet4Address)
                {
                    String ipStr=ip.getHostAddress();
                    log.info("ip.getHostAddress() ip="+ipStr);
                    if(!"127.0.0.1".equals(ipStr)){
                        localhost=ipStr;
                        log.info("本机的IP = " + ipStr);
                        break;
                    }
                }
            }
        }
    }
    public static String getLocalhost(){
        return localhost;
    }

}
