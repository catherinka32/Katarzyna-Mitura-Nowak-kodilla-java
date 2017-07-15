package com.kodilla.testing.collection;

import java.util.ArrayList;

/**
 * Created by Mitura on 2017-07-14.
 */
class OddNumberExterminator {
    ArrayList<Integer> evenNumbers;

    public OddNumberExterminator(){
        evenNumbers = new ArrayList<Integer>();
    }
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        int temporaryValue = 0;
        for (int n = 0; n < numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0){
                evenNumbers.add(temporaryValue);
            }
        }
        return evenNumbers;
    }
}
