# SchoolsApi

All URIs are relative to *https://api.clever.com/v3.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCourses**](SchoolsApi.md#getCourses) | **GET** /schools/{id}/courses |  |
| [**getDistrict**](SchoolsApi.md#getDistrict) | **GET** /schools/{id}/district |  |
| [**getSections**](SchoolsApi.md#getSections) | **GET** /schools/{id}/sections |  |
| [**getSpecificSchool**](SchoolsApi.md#getSpecificSchool) | **GET** /schools/{id} |  |
| [**getTerms**](SchoolsApi.md#getTerms) | **GET** /schools/{id}/terms |  |
| [**getUsers**](SchoolsApi.md#getUsers) | **GET** /schools/{id}/users |  |
| [**list**](SchoolsApi.md#list) | **GET** /schools |  |


<a name="getCourses"></a>
# **getCourses**
> CoursesResponse getCourses(id).limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();



Returns the courses for a school

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
    Integer limit = 56;
    String startingAfter = "startingAfter_example";
    String endingBefore = "endingBefore_example";
    try {
      CoursesResponse result = client
              .schools
              .getCourses(id)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getCourses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CoursesResponse> response = client
              .schools
              .getCourses(id)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getCourses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **startingAfter** | **String**|  | [optional] |
| **endingBefore** | **String**|  | [optional] |

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

<a name="getDistrict"></a>
# **getDistrict**
> DistrictResponse getDistrict(id).execute();



Returns the district for a school

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
              .schools
              .getDistrict(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getDistrict");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DistrictResponse> response = client
              .schools
              .getDistrict(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getDistrict");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

<a name="getSections"></a>
# **getSections**
> SectionsResponse getSections(id).limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();



Returns the sections for a school

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
    Integer limit = 56;
    String startingAfter = "startingAfter_example";
    String endingBefore = "endingBefore_example";
    try {
      SectionsResponse result = client
              .schools
              .getSections(id)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getSections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SectionsResponse> response = client
              .schools
              .getSections(id)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getSections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **startingAfter** | **String**|  | [optional] |
| **endingBefore** | **String**|  | [optional] |

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

<a name="getSpecificSchool"></a>
# **getSpecificSchool**
> SchoolResponse getSpecificSchool(id).execute();



Returns a specific school

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
      SchoolResponse result = client
              .schools
              .getSpecificSchool(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getSpecificSchool");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SchoolResponse> response = client
              .schools
              .getSpecificSchool(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getSpecificSchool");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**SchoolResponse**](SchoolResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

<a name="getTerms"></a>
# **getTerms**
> TermsResponse getTerms(id).limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();



Returns the terms for a school

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
    Integer limit = 56;
    String startingAfter = "startingAfter_example";
    String endingBefore = "endingBefore_example";
    try {
      TermsResponse result = client
              .schools
              .getTerms(id)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getTerms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsResponse> response = client
              .schools
              .getTerms(id)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getTerms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **startingAfter** | **String**|  | [optional] |
| **endingBefore** | **String**|  | [optional] |

### Return type

[**TermsResponse**](TermsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

<a name="getUsers"></a>
# **getUsers**
> UsersResponse getUsers(id).role(role).primary(primary).limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();



Returns the staff, student, and/or teacher users for a school

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
    String role = "staff";
    String primary = "";
    Integer limit = 56;
    String startingAfter = "startingAfter_example";
    String endingBefore = "endingBefore_example";
    try {
      UsersResponse result = client
              .schools
              .getUsers(id)
              .role(role)
              .primary(primary)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersResponse> response = client
              .schools
              .getUsers(id)
              .role(role)
              .primary(primary)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#getUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **role** | **String**|  | [optional] [enum: staff, student, teacher] |
| **primary** | **String**|  | [optional] [enum: , true] |
| **limit** | **Integer**|  | [optional] |
| **startingAfter** | **String**|  | [optional] |
| **endingBefore** | **String**|  | [optional] |

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

<a name="list"></a>
# **list**
> SchoolsResponse list().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).count(count).execute();



Returns a list of schools

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Clever;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SchoolsApi;
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
    Integer limit = 56;
    String startingAfter = "startingAfter_example";
    String endingBefore = "endingBefore_example";
    String count = "";
    try {
      SchoolsResponse result = client
              .schools
              .list()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .count(count)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SchoolsResponse> response = client
              .schools
              .list()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .count(count)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SchoolsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **startingAfter** | **String**|  | [optional] |
| **endingBefore** | **String**|  | [optional] |
| **count** | **String**|  | [optional] [enum: , true, false, undefined] |

### Return type

[**SchoolsResponse**](SchoolsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK Response |  -  |

