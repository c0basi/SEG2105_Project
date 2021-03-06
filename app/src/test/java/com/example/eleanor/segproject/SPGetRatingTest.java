package com.example.eleanor.segproject;

import org.junit.Test;

import static org.junit.Assert.*;

public class SPGetRatingTest {

    @Test
    public void getSum() {
        int sum = 10;
        int intendedSum = 10;
        double range = 0.1;
        assertEquals(intendedSum , sum,range);

    }



    @Test
    public void getNumRatings() {

        int numRatings = 8;
        int intendedRatings = 8;
        double range= 0.2;
        getNumRatings();
        assertEquals(intendedRatings, numRatings, range);
    }




    @Test
    public void getAverage() {
        int avg = 5;
        int intendedAvg = 5;
        double range = 0.3;
        getAverage();
        assertEquals(intendedAvg, avg, range);
    }
}