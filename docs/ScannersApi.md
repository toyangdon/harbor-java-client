# ScannersApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectsProjectIdScannerCandidatesGet**](ScannersApi.md#projectsProjectIdScannerCandidatesGet) | **GET** /projects/{project_id}/scanner/candidates | Get scanner registration candidates for configurating project level scanner
[**projectsProjectIdScannerGet**](ScannersApi.md#projectsProjectIdScannerGet) | **GET** /projects/{project_id}/scanner | Get project level scanner
[**projectsProjectIdScannerPut**](ScannersApi.md#projectsProjectIdScannerPut) | **PUT** /projects/{project_id}/scanner | Configure scanner for the specified project
[**scannersGet**](ScannersApi.md#scannersGet) | **GET** /scanners | List scanner registrations
[**scannersPingPost**](ScannersApi.md#scannersPingPost) | **POST** /scanners/ping | Tests scanner registration settings
[**scannersPost**](ScannersApi.md#scannersPost) | **POST** /scanners | Create a scanner registration
[**scannersRegistrationIdDelete**](ScannersApi.md#scannersRegistrationIdDelete) | **DELETE** /scanners/{registration_id} | Delete a scanner registration
[**scannersRegistrationIdGet**](ScannersApi.md#scannersRegistrationIdGet) | **GET** /scanners/{registration_id} | Get a scanner registration details
[**scannersRegistrationIdMetadataGet**](ScannersApi.md#scannersRegistrationIdMetadataGet) | **GET** /scanners/{registration_id}/metadata | Get the metadata of the specified scanner registration
[**scannersRegistrationIdPatch**](ScannersApi.md#scannersRegistrationIdPatch) | **PATCH** /scanners/{registration_id} | Set system default scanner registration
[**scannersRegistrationIdPut**](ScannersApi.md#scannersRegistrationIdPut) | **PUT** /scanners/{registration_id} | Update a scanner registration


<a name="projectsProjectIdScannerCandidatesGet"></a>
# **projectsProjectIdScannerCandidatesGet**
> List&lt;ScannerRegistration&gt; projectsProjectIdScannerCandidatesGet(projectId)

Get scanner registration candidates for configurating project level scanner

Retrieve the system configured scanner registrations as candidates of setting project level scanner. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
Long projectId = 789L; // Long | The project identifier.
try {
    List<ScannerRegistration> result = apiInstance.projectsProjectIdScannerCandidatesGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#projectsProjectIdScannerCandidatesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The project identifier. |

### Return type

[**List&lt;ScannerRegistration&gt;**](ScannerRegistration.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdScannerGet"></a>
# **projectsProjectIdScannerGet**
> ScannerRegistration projectsProjectIdScannerGet(projectId)

Get project level scanner

Get the scanner registration of the specified project. If no scanner registration is configured for the specified project, the system default scanner registration will be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
Long projectId = 789L; // Long | The project identifier.
try {
    ScannerRegistration result = apiInstance.projectsProjectIdScannerGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#projectsProjectIdScannerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The project identifier. |

### Return type

[**ScannerRegistration**](ScannerRegistration.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdScannerPut"></a>
# **projectsProjectIdScannerPut**
> projectsProjectIdScannerPut(projectId, payload)

Configure scanner for the specified project

Set one of the system configured scanner registration as the indepndent scanner of the specified project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
Long projectId = 789L; // Long | The project identifier.
ProjectScanner payload = new ProjectScanner(); // ProjectScanner | 
try {
    apiInstance.projectsProjectIdScannerPut(projectId, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#projectsProjectIdScannerPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The project identifier. |
 **payload** | [**ProjectScanner**](ProjectScanner.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersGet"></a>
# **scannersGet**
> List&lt;ScannerRegistration&gt; scannersGet()

List scanner registrations

Returns a list of currently configured scanner registrations. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
try {
    List<ScannerRegistration> result = apiInstance.scannersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ScannerRegistration&gt;**](ScannerRegistration.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersPingPost"></a>
# **scannersPingPost**
> scannersPingPost(settings)

Tests scanner registration settings

Pings scanner adapter to test endpoint URL and authorization settings. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
ScannerRegistrationSettings settings = new ScannerRegistrationSettings(); // ScannerRegistrationSettings | A scanner registration settings to be tested.
try {
    apiInstance.scannersPingPost(settings);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settings** | [**ScannerRegistrationSettings**](ScannerRegistrationSettings.md)| A scanner registration settings to be tested. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersPost"></a>
# **scannersPost**
> scannersPost(registration)

Create a scanner registration

Creats a new scanner registration with the given data. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
ScannerRegistrationReq registration = new ScannerRegistrationReq(); // ScannerRegistrationReq | A scanner registration to be created.
try {
    apiInstance.scannersPost(registration);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registration** | [**ScannerRegistrationReq**](ScannerRegistrationReq.md)| A scanner registration to be created. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersRegistrationIdDelete"></a>
# **scannersRegistrationIdDelete**
> ScannerRegistration scannersRegistrationIdDelete(registrationId)

Delete a scanner registration

Deletes the specified scanner registration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifier.
try {
    ScannerRegistration result = apiInstance.scannersRegistrationIdDelete(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersRegistrationIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| The scanner registration identifier. |

### Return type

[**ScannerRegistration**](ScannerRegistration.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersRegistrationIdGet"></a>
# **scannersRegistrationIdGet**
> ScannerRegistration scannersRegistrationIdGet(registrationId)

Get a scanner registration details

Retruns the details of the specified scanner registration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifer.
try {
    ScannerRegistration result = apiInstance.scannersRegistrationIdGet(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersRegistrationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| The scanner registration identifer. |

### Return type

[**ScannerRegistration**](ScannerRegistration.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersRegistrationIdMetadataGet"></a>
# **scannersRegistrationIdMetadataGet**
> ScannerAdapterMetadata scannersRegistrationIdMetadataGet(registrationId)

Get the metadata of the specified scanner registration

Get the metadata of the specified scanner registration, including the capabilities and customzied properties. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifier.
try {
    ScannerAdapterMetadata result = apiInstance.scannersRegistrationIdMetadataGet(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersRegistrationIdMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| The scanner registration identifier. |

### Return type

[**ScannerAdapterMetadata**](ScannerAdapterMetadata.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersRegistrationIdPatch"></a>
# **scannersRegistrationIdPatch**
> scannersRegistrationIdPatch(registrationId, payload)

Set system default scanner registration

Set the specified scanner registration as the system default one. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifier.
IsDefault payload = new IsDefault(); // IsDefault | 
try {
    apiInstance.scannersRegistrationIdPatch(registrationId, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersRegistrationIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| The scanner registration identifier. |
 **payload** | [**IsDefault**](IsDefault.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scannersRegistrationIdPut"></a>
# **scannersRegistrationIdPut**
> scannersRegistrationIdPut(registrationId, registration)

Update a scanner registration

Updates the specified scanner registration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScannersApi apiInstance = new ScannersApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifier.
ScannerRegistrationReq registration = new ScannerRegistrationReq(); // ScannerRegistrationReq | A scanner registraiton to be updated.
try {
    apiInstance.scannersRegistrationIdPut(registrationId, registration);
} catch (ApiException e) {
    System.err.println("Exception when calling ScannersApi#scannersRegistrationIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| The scanner registration identifier. |
 **registration** | [**ScannerRegistrationReq**](ScannerRegistrationReq.md)| A scanner registraiton to be updated. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

