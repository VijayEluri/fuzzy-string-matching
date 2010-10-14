package com.relaynetwork;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: superg
 * Date: Oct 14, 2010
 * Time: 12:32:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextBrewTest {
    @Test
    public void wordTest () {
        TextBrew.BrewResult result = TextBrew.compare("apple","wpple");
        assertEquals(1.0,result.cost);
    }

}
