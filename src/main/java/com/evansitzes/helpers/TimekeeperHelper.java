package com.evansitzes.helpers;

/*
Helper class to simplify and encapsulate away the logic of keeping track of running time for an algorithm in a
cleaner way.
 */

public class TimekeeperHelper {

    private final long startTime;

    public TimekeeperHelper() {
        this.startTime = System.currentTimeMillis();
    }

    public void endTimekeeping() {
        final float totalTime = (System.currentTimeMillis() - startTime) / 1000.0F;
        System.out.println("Total running time: " + totalTime + " seconds.");
    }

}
