Feature: high-potential quitting avoidance strategy
        As a Senior Manager
        In order to ensure that I have a productive team
        I want to have a strategy to prevent high-potentials quitting.

        Scenario: a non high-potential quits
                Given I have a high-potential team member in my team
                When a non-high potential quits
                Then say "I am sorry that you leave".
                
        Scenario: high-potential quits
                Given I have a high-potential team member in my team 
                When a high potential quits
                Then say "I can offer to double your salary".
                
