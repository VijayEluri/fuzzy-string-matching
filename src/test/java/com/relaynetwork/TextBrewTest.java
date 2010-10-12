package com.relaynetwork;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: superg
 * Date: Oct 12, 2010
 * Time: 6:51:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextBrewTest {
    @Test
    public void testAsDefaultLevenshtien() {
        TextBrew brew = new TextBrew();
        BrewResult res = brew.computeSimilarity("apple", "opple");
        assertEquals(1, res.getDistance() );
        
        assertEquals(1, TextBrew.compare("apple", "opple").getDistance());

        assertEquals(0,"","");
        assertEquals(0,null,null);

        assertEquals(0,"foo","foo");

        assertEquals(1,"foox","foo");
        assertEquals(1,"foo","foox");

        assertEquals(1,"xfoo","foo");
        assertEquals(1,"foo","xfoo");

        assertEquals(3,"foo","");
        assertEquals(3,"","foo");

    }


    // assert the path was computed correctly in the base case

    // test cost tables changes
}
