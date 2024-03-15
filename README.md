<div align="center">

[![Visit Clever](./header.png)](https://clever.com)

# [Clever](https://clever.com)

Serves the Clever Data API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Clever&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>clever-java-sdk</artifactId>
  <version>3.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:clever-java-sdk:3.1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/clever-java-sdk-3.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CoursesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.clever.com/v3.1";
    
    // Configure OAuth2 access token for authorization: oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Clever client = new Clever(configuration);
    String id = "id_example";
    try {
      DistrictResponse result = client
              .courses
              .getDistrict(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getDistrict");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DistrictResponse> response = client
              .courses
              .getDistrict(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursesApi#getDistrict");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.clever.com/v3.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CoursesApi* | [**getDistrict**](docs/CoursesApi.md#getDistrict) | **GET** /courses/{id}/district | 
*CoursesApi* | [**getList**](docs/CoursesApi.md#getList) | **GET** /courses | 
*CoursesApi* | [**getResources**](docs/CoursesApi.md#getResources) | **GET** /courses/{id}/resources | 
*CoursesApi* | [**getSchools**](docs/CoursesApi.md#getSchools) | **GET** /courses/{id}/schools | 
*CoursesApi* | [**getSections**](docs/CoursesApi.md#getSections) | **GET** /courses/{id}/sections | 
*CoursesApi* | [**getSpecificCourse**](docs/CoursesApi.md#getSpecificCourse) | **GET** /courses/{id} | 
*DistrictsApi* | [**getList**](docs/DistrictsApi.md#getList) | **GET** /districts | 
*DistrictsApi* | [**getSpecificDistrict**](docs/DistrictsApi.md#getSpecificDistrict) | **GET** /districts/{id} | 
*ResourcesApi* | [**getById**](docs/ResourcesApi.md#getById) | **GET** /resources/{id} | 
*ResourcesApi* | [**getCourses**](docs/ResourcesApi.md#getCourses) | **GET** /resources/{id}/courses | 
*ResourcesApi* | [**getList**](docs/ResourcesApi.md#getList) | **GET** /resources | 
*ResourcesApi* | [**getUsers**](docs/ResourcesApi.md#getUsers) | **GET** /resources/{id}/users | 
*ResourcesApi* | [**listSections**](docs/ResourcesApi.md#listSections) | **GET** /resources/{id}/sections | 
*SchoolsApi* | [**getCourses**](docs/SchoolsApi.md#getCourses) | **GET** /schools/{id}/courses | 
*SchoolsApi* | [**getDistrict**](docs/SchoolsApi.md#getDistrict) | **GET** /schools/{id}/district | 
*SchoolsApi* | [**getSections**](docs/SchoolsApi.md#getSections) | **GET** /schools/{id}/sections | 
*SchoolsApi* | [**getSpecificSchool**](docs/SchoolsApi.md#getSpecificSchool) | **GET** /schools/{id} | 
*SchoolsApi* | [**getTerms**](docs/SchoolsApi.md#getTerms) | **GET** /schools/{id}/terms | 
*SchoolsApi* | [**getUsers**](docs/SchoolsApi.md#getUsers) | **GET** /schools/{id}/users | 
*SchoolsApi* | [**list**](docs/SchoolsApi.md#list) | **GET** /schools | 
*SectionsApi* | [**getCourse**](docs/SectionsApi.md#getCourse) | **GET** /sections/{id}/course | 
*SectionsApi* | [**getDistrict**](docs/SectionsApi.md#getDistrict) | **GET** /sections/{id}/district | 
*SectionsApi* | [**getList**](docs/SectionsApi.md#getList) | **GET** /sections | 
*SectionsApi* | [**getResources**](docs/SectionsApi.md#getResources) | **GET** /sections/{id}/resources | 
*SectionsApi* | [**getSchool**](docs/SectionsApi.md#getSchool) | **GET** /sections/{id}/school | 
*SectionsApi* | [**getSpecificSection**](docs/SectionsApi.md#getSpecificSection) | **GET** /sections/{id} | 
*SectionsApi* | [**getTerm**](docs/SectionsApi.md#getTerm) | **GET** /sections/{id}/term | 
*SectionsApi* | [**getUsers**](docs/SectionsApi.md#getUsers) | **GET** /sections/{id}/users | 
*TermsApi* | [**getDistrictById**](docs/TermsApi.md#getDistrictById) | **GET** /terms/{id}/district | 
*TermsApi* | [**getList**](docs/TermsApi.md#getList) | **GET** /terms | 
*TermsApi* | [**getSchoolsForTerm**](docs/TermsApi.md#getSchoolsForTerm) | **GET** /terms/{id}/schools | 
*TermsApi* | [**getSections**](docs/TermsApi.md#getSections) | **GET** /terms/{id}/sections | 
*TermsApi* | [**getSpecificTerm**](docs/TermsApi.md#getSpecificTerm) | **GET** /terms/{id} | 
*UsersApi* | [**getDistrict**](docs/UsersApi.md#getDistrict) | **GET** /users/{id}/district | 
*UsersApi* | [**getList**](docs/UsersApi.md#getList) | **GET** /users | 
*UsersApi* | [**getMyContacts**](docs/UsersApi.md#getMyContacts) | **GET** /users/{id}/mycontacts | 
*UsersApi* | [**getResources**](docs/UsersApi.md#getResources) | **GET** /users/{id}/resources | 
*UsersApi* | [**getSchools**](docs/UsersApi.md#getSchools) | **GET** /users/{id}/schools | 
*UsersApi* | [**getSections**](docs/UsersApi.md#getSections) | **GET** /users/{id}/sections | 
*UsersApi* | [**getStudentUsers**](docs/UsersApi.md#getStudentUsers) | **GET** /users/{id}/mystudents | 
*UsersApi* | [**getTeachersForUser**](docs/UsersApi.md#getTeachersForUser) | **GET** /users/{id}/myteachers | 
*UsersApi* | [**getUserById**](docs/UsersApi.md#getUserById) | **GET** /users/{id} | 


## Documentation for Models

 - [BadRequest](docs/BadRequest.md)
 - [Contact](docs/Contact.md)
 - [Course](docs/Course.md)
 - [CourseResponse](docs/CourseResponse.md)
 - [CoursesResponse](docs/CoursesResponse.md)
 - [Credentials](docs/Credentials.md)
 - [Disability](docs/Disability.md)
 - [District](docs/District.md)
 - [DistrictAdmin](docs/DistrictAdmin.md)
 - [DistrictContact](docs/DistrictContact.md)
 - [DistrictResponse](docs/DistrictResponse.md)
 - [DistrictsResponse](docs/DistrictsResponse.md)
 - [InternalError](docs/InternalError.md)
 - [Link](docs/Link.md)
 - [Location](docs/Location.md)
 - [Name](docs/Name.md)
 - [PreferredName](docs/PreferredName.md)
 - [Principal](docs/Principal.md)
 - [Resource](docs/Resource.md)
 - [ResourceResponse](docs/ResourceResponse.md)
 - [ResourcesResponse](docs/ResourcesResponse.md)
 - [Roles](docs/Roles.md)
 - [School](docs/School.md)
 - [SchoolEnrollment](docs/SchoolEnrollment.md)
 - [SchoolResponse](docs/SchoolResponse.md)
 - [SchoolsResponse](docs/SchoolsResponse.md)
 - [Section](docs/Section.md)
 - [SectionResponse](docs/SectionResponse.md)
 - [SectionsResponse](docs/SectionsResponse.md)
 - [Staff](docs/Staff.md)
 - [Student](docs/Student.md)
 - [StudentRelationship](docs/StudentRelationship.md)
 - [Teacher](docs/Teacher.md)
 - [Term](docs/Term.md)
 - [TermResponse](docs/TermResponse.md)
 - [TermsResponse](docs/TermsResponse.md)
 - [User](docs/User.md)
 - [UserResponse](docs/UserResponse.md)
 - [UsersResponse](docs/UsersResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
