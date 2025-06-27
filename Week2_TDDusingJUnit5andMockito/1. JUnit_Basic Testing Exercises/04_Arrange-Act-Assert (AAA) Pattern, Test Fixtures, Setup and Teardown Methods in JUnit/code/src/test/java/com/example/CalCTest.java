package com.example;
import org.junit.*;
public class CalCTest {
        private CalC cal;
        @Before
        public void setup(){
            System.out.println("Setup is going on..");
            cal=new CalC();
        }
        @After
        public void teardown(){
            System.out.println("Cleaning up...");
        }
        @Test
        public void Add1(){
          int res1=cal.addition(2, 3);
          Assert.assertEquals("Addition should be 5",res1, 5);
        }
                @Test
        public void Add2(){
          int res2=cal.addition(7, 3);
          Assert.assertEquals("Addition should be 10",res2, 10);
        }


}
