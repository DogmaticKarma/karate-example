package com.iv.karate.controllers;

import com.intuit.karate.junit5.Karate;

/**
 * @see https://github.com/intuit/karate#junit-5
 */
public class HelloRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run("helloBasic").relativeTo(getClass());
    }

    @Karate.Test
    Karate testTags() {
        return Karate.run("helloBasic").tags("withParam").relativeTo(getClass());
    }
}
