package com.akash.java.main;

import java.util.Objects;

public class Rule {
    private String direction;
    private String protocol;
    private String port;
    private String ipAddress;

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    public String getProtocol() { return protocol; }
    public void setProtocol(String protocol) { this.protocol = protocol; }

    public String getPort() { return port; }
    public void setPort(String port) { this.port = port; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress;}

    public Rule(String direction, String protocol, String port, String ipAddress) {
        this.direction = direction;
        this.protocol = protocol;
        this.port = port;
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rule)) return false;
        Rule rule = (Rule) o;
        return Objects.equals(direction, rule.direction) &&
                Objects.equals(protocol, rule.protocol) &&
                Utils.portInRange(port, rule.port.split("-")) &&
                Utils.ipInRange(ipAddress, rule.ipAddress.split("-"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, protocol, port, ipAddress);
    }
}
