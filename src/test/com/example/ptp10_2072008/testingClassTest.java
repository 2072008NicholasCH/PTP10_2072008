package com.example.ptp10_2072008;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class testingClassTest {
    static testingClass tes;
    @BeforeAll
    static void setUp(){
        tes = new testingClass();
    }
    @AfterEach
    void done(){
        System.out.println("Test is done!");
    }

    @Test
    void hitung() {
        int tempHit = tes.hitung();
        assertEquals(1, tempHit);
    }

}