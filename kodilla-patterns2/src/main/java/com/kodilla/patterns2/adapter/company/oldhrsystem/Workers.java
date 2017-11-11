package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers ={
            {"6703985433004", "Jane", "Kalin"},
            {"5500983233004", "Ane", "Stein"},
            {"6703985093868", "Ivo", "Murphy"},
            {"8329743634848", "Klara", "Rider"},
            {"6703980006567", "Marion", "Lewis"}};
    private double[] salaries = {
            4500.00,
            3400.00,
            4550.00,
            8900.00,
            3999.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + "," + workers[n];
    }
    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
