package com.relaynetwork;

/**
 * Created by IntelliJ IDEA.
 * User: superg
 * Date: Oct 12, 2010
 * Time: 7:00:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class TextBrew {

    public static BrewResult compare(String left, String right) {
        return new TextBrew().computeSimilarity(left,right);
    }

    public BrewResult computeSimilarity(String left, String right) {
        return new BrewResult();
    }
}
