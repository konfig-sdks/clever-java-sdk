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
import com.konfigthis.client.model.CoursesResponse;
import com.konfigthis.client.model.DistrictResponse;
import com.konfigthis.client.model.SchoolResponse;
import com.konfigthis.client.model.SchoolsResponse;
import com.konfigthis.client.model.SectionsResponse;
import com.konfigthis.client.model.TermsResponse;
import com.konfigthis.client.model.UsersResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchoolsApi
 */
@Disabled
public class SchoolsApiTest {

    private static SchoolsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SchoolsApi(apiClient);
    }

    /**
     * Returns the courses for a school
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCoursesTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        CoursesResponse response = api.getCourses(id)
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the district for a school
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDistrictTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrict(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the sections for a school
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSectionsTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSections(id)
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a specific school
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificSchoolTest() throws ApiException {
        String id = null;
        SchoolResponse response = api.getSpecificSchool(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the terms for a school
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTermsTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        TermsResponse response = api.getTerms(id)
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the staff, student, and/or teacher users for a school
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String id = null;
        String role = null;
        String primary = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        UsersResponse response = api.getUsers(id)
                .role(role)
                .primary(primary)
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of schools
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        String count = null;
        SchoolsResponse response = api.list()
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .count(count)
                .execute();
        // TODO: test validations
    }

}
