package com.lab2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LabTest {
    @Test
    public void testPrintMessage() {
        final String message = "message";

        assertTrue(message.length() > 0);
    }
}
