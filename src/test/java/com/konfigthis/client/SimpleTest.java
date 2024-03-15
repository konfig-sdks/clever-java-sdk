package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.clever.com/v3.1";
        
        // Configure OAuth2 access token for authorization: oauth
        configuration.accessToken = "YOUR ACCESS TOKEN";
        Clever client = new Clever(configuration);
        assertNotNull(client);
    }
}
