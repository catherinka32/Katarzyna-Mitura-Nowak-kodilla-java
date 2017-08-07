package com.kodilla.good.patterns.challenges;

public class NewInformationService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("I'm sending email to the user");
    }
}
