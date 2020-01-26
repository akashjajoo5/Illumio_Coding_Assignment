package com.akash.java.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Firewall {
    private Set<Rule> rules;

    public Set<Rule> getRules() { return rules; }

    public Firewall(final String filePath) throws IOException {
        this.rules = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parameters = line.split(",");
            getRules().add(new Rule( parameters[0], parameters[1], parameters[2], parameters[3]));
        }
    }

    public boolean accept_packet(final String direction, final String protocol, final int port, final String ipAddress) {
        Rule rule = new Rule(direction, protocol, String.valueOf(port), ipAddress);
        Iterator<Rule> ruleIterator = getRules().iterator();
        while (ruleIterator.hasNext())
            if (rule.equals(ruleIterator.next()))
                return true;
        return false;
    }
}
