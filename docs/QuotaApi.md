# QuotaApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quotasIdGet**](QuotaApi.md#quotasIdGet) | **GET** /quotas/{id} | Get the specified quota
[**quotasIdPut**](QuotaApi.md#quotasIdPut) | **PUT** /quotas/{id} | Update the specified quota


<a name="quotasIdGet"></a>
# **quotasIdGet**
> Quota quotasIdGet(id)

Get the specified quota

Get the specified quota

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
Integer id = 56; // Integer | Quota ID
try {
    Quota result = apiInstance.quotasIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#quotasIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Quota ID |

### Return type

[**Quota**](Quota.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="quotasIdPut"></a>
# **quotasIdPut**
> quotasIdPut(id, hard)

Update the specified quota

Update hard limits of the specified quota

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
Integer id = 56; // Integer | Quota ID
QuotaUpdateReq hard = new QuotaUpdateReq(); // QuotaUpdateReq | The new hard limits for the quota
try {
    apiInstance.quotasIdPut(id, hard);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#quotasIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Quota ID |
 **hard** | [**QuotaUpdateReq**](QuotaUpdateReq.md)| The new hard limits for the quota |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

