/*
 * Data API
 * Serves the Clever Data API
 *
 * The version of the OpenAPI document: 3.1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.DistrictResponse;
import com.konfigthis.client.model.DistrictsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DistrictsApi
 */
@Disabled
public class DistrictsApiTest {

    private static DistrictsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DistrictsApi(apiClient);
    }

    /**
     * Returns a list of districts. In practice this will only return the one district associated with the bearer token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String count = null;
        DistrictsResponse response = api.getList()
                .count(count)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a specific district
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificDistrictTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getSpecificDistrict(id)
                .execute();
        // TODO: test validations
    }

}
