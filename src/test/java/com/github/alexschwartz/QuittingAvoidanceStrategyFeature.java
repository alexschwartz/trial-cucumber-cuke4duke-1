package com.github.alexschwartz;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import static junit.framework.Assert.assertEquals;


@SuppressWarnings({"UnusedDeclaration"})
public class QuittingAvoidanceStrategyFeature {

    QuittingAvoidanceStrategy strategy;
    
    @Given ("^I have a high-potential team member in my team$")
    public void iHaveAHighPotentialTeamMemberInMyTeam() {
    }

    @When ("^a (.*) quits$")
    public void someoneQuits(String who) {
        this.strategy = new QuittingAvoidanceStrategy(who);
    }

    @Then ("^say \"([^\"]*)\"\\.")
    public void say(String what) {
        assertEquals(what, strategy.getReaction());
    }



}
