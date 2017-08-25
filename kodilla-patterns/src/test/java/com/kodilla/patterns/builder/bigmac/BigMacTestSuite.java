package com.kodilla.patterns.builder.bigmac;

        import org.junit.Assert;
        import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew(){
        BigMac bigMac = new BigMac.BigMacBuilder()
                .burgers(2)
                .ingredient("cheese")
                .ingredient("garlic")
                .ingredient("ham")
                .ingredient("bean")
                .sauce("standard")
                .roll("normal")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
