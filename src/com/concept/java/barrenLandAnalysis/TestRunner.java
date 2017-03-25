package com.concept.java.barrenLandAnalysis;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/25/17
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestRunner {


    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TestJUnit.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("Tests failed. " + failure.toString());
        }

        System.out.println("Tests were successfull! " + result.wasSuccessful());
    }
}
