package com.example.tharani.testing;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
       /*Context allows access to application-specific resources and classes
        An exposed registry instance that holds a reference to the instrumentation running in the process and it's arguments.
        It also provides an easy way for callers to get a hold of instrumentation, application context and instrumentation arguments Bundle.
        getTargetContext() to retrieve a Context for the target application*/
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.tharani.testing", appContext.getPackageName());
        //assertEquals is whatever input we put it will compare
    }
}
