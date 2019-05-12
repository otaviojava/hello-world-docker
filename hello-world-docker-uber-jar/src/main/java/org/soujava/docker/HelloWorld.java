package org.soujava.docker;

import java.net.InetAddress;

public class HelloWorld {

    private final String address;
    private final String name;

    public HelloWorld(InetAddress inetAddress ) {
        this.address = inetAddress.getHostAddress();
        this.name = inetAddress.getHostName();
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }


}
