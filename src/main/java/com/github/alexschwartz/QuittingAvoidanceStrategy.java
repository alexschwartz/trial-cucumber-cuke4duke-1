package com.github.alexschwartz;

public class QuittingAvoidanceStrategy {

    private String who;

    public QuittingAvoidanceStrategy(String who) {
        this.who = who;
    }

    public String getReaction() {
        if ("non-high potential".equals(who)) {
            return "I am sorry that you leave";
        }
        
        return "I can offer to double your salary";
    }

}
