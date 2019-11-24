package com.in28minutes.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
    String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":200}";


    @Test
    public void jsonAssert() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":11,\"quantity\":200}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }
    @Test
    public void jsonAssert_withoutEscape() throws JSONException {
        String expectedResponse = "{id:1,name :Ball,price:10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }
}
