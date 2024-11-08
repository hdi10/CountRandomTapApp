package com.example.randomchoicehelperapplicationapp;

import org.junit.Assert;
import org.junit.Test;

public class UnitTests {

    @Test
    public void gutTestCounterBottomTab(){

            int tmpCounter = 0;
            String hayhay = "*****";

            while(tmpCounter<=4){
                tmpCounter = tmpCounter+1;

                for (int i = 0; i < 5; i++) {
                    System.out.println(hayhay+" "+tmpCounter);
                }

            }

            Assert.assertEquals(tmpCounter,5);

        }

    @Test
    public void GrenzTestCounterBottomTab(){
        double tmpCounter0 = 1.5;
        int tmpCounter = 0;
        String hayhay = "*****";
        String hayhay1 = "*****";

        while(tmpCounter<=4){
            tmpCounter = tmpCounter+1;
            tmpCounter0 = tmpCounter+2;

            for (int i = 0; i < 5; i ++) {

                System.out.println(hayhay+" "+tmpCounter);
                System.out.println(hayhay1+" "+tmpCounter0);
            }

        }

        Assert.assertEquals(tmpCounter,5);

    }

    @Test
    public void SchlechtTestCounterBottomTab(){

        int tmpCounter = 0;
        String hayhay = "*****";

        while(tmpCounter<=4){
            tmpCounter = tmpCounter+1;

            for (int i = 0; i < 5; i++) {
                System.out.println(hayhay+" "+tmpCounter);
            }

        }

        Assert.assertEquals(tmpCounter,7);

    }
}
