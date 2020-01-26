package com.akash.java.main;

public class Utils {

    public static boolean portInRange(final String inputProtocol, final String[] ruleProtocol) {
        if(ruleProtocol.length == 1)
            return Integer.parseInt(ruleProtocol[0]) == Integer.parseInt(inputProtocol);
        return Integer.parseInt(ruleProtocol[0]) <= Integer.parseInt(inputProtocol) &&
                Integer.parseInt(inputProtocol) <= Integer.parseInt(ruleProtocol[1]);
    }

    public static boolean ipInRange(final String inputIp, final String[] ruleIp) {
        String[] inputIpArr = inputIp.split("\\.");
        if(ruleIp.length == 1) {
            String[] ruleIpArr = ruleIp[0].split("\\.");
            return Integer.parseInt(inputIpArr[0]) == Integer.parseInt(ruleIpArr[0]) &&
            Integer.parseInt(inputIpArr[1]) == Integer.parseInt(ruleIpArr[1]) &&
            Integer.parseInt(inputIpArr[2]) == Integer.parseInt(ruleIpArr[2]) &&
            Integer.parseInt(inputIpArr[3]) == Integer.parseInt(ruleIpArr[3]);
        }
        String[] startRuleIpArr = ruleIp[0].split("\\."), endRuleIpArr = ruleIp[1].split("\\.");
        return Integer.parseInt(startRuleIpArr[0]) <= Integer.parseInt(inputIpArr[0]) &&
                Integer.parseInt(inputIpArr[0]) <= Integer.parseInt(endRuleIpArr[0]) &&
                Integer.parseInt(startRuleIpArr[1]) <= Integer.parseInt(inputIpArr[1]) &&
                Integer.parseInt(inputIpArr[1]) <= Integer.parseInt(endRuleIpArr[1]) &&
                Integer.parseInt(startRuleIpArr[2]) <= Integer.parseInt(inputIpArr[2]) &&
                Integer.parseInt(inputIpArr[2]) <= Integer.parseInt(endRuleIpArr[2]) &&
                Integer.parseInt(startRuleIpArr[3]) <= Integer.parseInt(inputIpArr[3]) &&
                Integer.parseInt(inputIpArr[3]) <= Integer.parseInt(endRuleIpArr[3]);
    }

}
