package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
/**
 * Created by Mitura on 2017-07-13.
 */
public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error");
        }
        Calculator calculator = new Calculator( 9, 5);

        int result1 = calculator.add();
        if (result1 == 14){
            System.out.println("Result is OK");
        }else{
            System.out.println("Something is wrong!");
        }

        int result2 = calculator.subtract();
        if (result2 == 4){
            System.out.println("Result is OK");
        }else{
            System.out.println("Something is wrong!");
        }
    }
}
