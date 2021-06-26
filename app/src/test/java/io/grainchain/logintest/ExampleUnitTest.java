package io.grainchain.logintest;

import org.junit.Assert;
import org.junit.Test;
import methods.multipleMethods;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void genPass_isCorrect() {

        //We could make this unit test more robust but for the time being this will do
        int valid = 6;
        int invalid =5;
        int passlength;
        String numRegex   = ".*[0-9].*";
        String alphaRegex = ".*[A-z].*";

        multipleMethods.genPassword("GenAlfaNum");

        System.out.println("Valid password with Letters and numbers: "+multipleMethods.password);
        passlength = multipleMethods.password.length();
            Assert.assertTrue(multipleMethods.password.matches(numRegex));
            Assert.assertTrue(multipleMethods.password.matches(alphaRegex));
            Assert.assertTrue(passlength >= valid);

        multipleMethods.genPassword("GenIVAlpha");
        System.out.println("Invalid password with Letters: "+multipleMethods.password);
        passlength = multipleMethods.password.length();
            Assert.assertTrue(multipleMethods.password.matches(alphaRegex));
            Assert.assertTrue(passlength <= invalid);



    }

//    @Test
//    public genPassword_isCorrect(){
//        m
//    }
}