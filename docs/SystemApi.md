# SystemApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemCVEWhitelistGet**](SystemApi.md#systemCVEWhitelistGet) | **GET** /system/CVEWhitelist | Get the system level whitelist of CVE.
[**systemCVEWhitelistPut**](SystemApi.md#systemCVEWhitelistPut) | **PUT** /system/CVEWhitelist | Update the system level whitelist of CVE.
[**systemOidcPingPost**](SystemApi.md#systemOidcPingPost) | **POST** /system/oidc/ping | Test the OIDC endpoint.


<a name="systemCVEWhitelistGet"></a>
# **systemCVEWhitelistGet**
> CVEWhitelist systemCVEWhitelistGet()

Get the system level whitelist of CVE.

Get the system level whitelist of CVE.  This API can be called by all authenticated users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SystemApi apiInstance = new SystemApi();
try {
    CVEWhitelist result = apiInstance.systemCVEWhitelistGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemCVEWhitelistGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CVEWhitelist**](CVEWhitelist.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemCVEWhitelistPut"></a>
# **systemCVEWhitelistPut**
> systemCVEWhitelistPut(whitelist)

Update the system level whitelist of CVE.

This API overwrites the system level whitelist of CVE with the list in request body.  Only system Admin has permission to call this API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SystemApi apiInstance = new SystemApi();
CVEWhitelist whitelist = new CVEWhitelist(); // CVEWhitelist | The whitelist with new content
try {
    apiInstance.systemCVEWhitelistPut(whitelist);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemCVEWhitelistPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whitelist** | [**CVEWhitelist**](CVEWhitelist.md)| The whitelist with new content | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemOidcPingPost"></a>
# **systemOidcPingPost**
> systemOidcPingPost(endpoint)

Test the OIDC endpoint.

Test the OIDC endpoint, the setting of the endpoint is provided in the request.  This API can only be called by system admin.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SystemApi apiInstance = new SystemApi();
Endpoint endpoint = new Endpoint(); // Endpoint | Request body for OIDC endpoint to be tested.
try {
    apiInstance.systemOidcPingPost(endpoint);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemOidcPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpoint** | [**Endpoint**](Endpoint.md)| Request body for OIDC endpoint to be tested. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

