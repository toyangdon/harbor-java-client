# ScanApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesRepoNameTagsTagScanGet**](ScanApi.md#repositoriesRepoNameTagsTagScanGet) | **GET** /repositories/{repo_name}/tags/{tag}/scan | Get the scan report
[**repositoriesRepoNameTagsTagScanPost**](ScanApi.md#repositoriesRepoNameTagsTagScanPost) | **POST** /repositories/{repo_name}/tags/{tag}/scan | Scan the image.
[**repositoriesRepoNameTagsTagScanUuidLogGet**](ScanApi.md#repositoriesRepoNameTagsTagScanUuidLogGet) | **GET** /repositories/{repo_name}/tags/{tag}/scan/{uuid}/log | Get scan log
[**scansAllMetricsGet**](ScanApi.md#scansAllMetricsGet) | **GET** /scans/all/metrics | Get the metrics of the latest scan all process
[**scansScheduleMetricsGet**](ScanApi.md#scansScheduleMetricsGet) | **GET** /scans/schedule/metrics | Get the metrics of the latest scheduled scan all process


<a name="repositoriesRepoNameTagsTagScanGet"></a>
# **repositoriesRepoNameTagsTagScanGet**
> Report repositoriesRepoNameTagsTagScanGet(repoName, tag, accept)

Get the scan report

Retrieve the scan report for the artifact identified by the repo_name and tag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScanApi apiInstance = new ScanApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
String accept = "accept_example"; // String | Mimetype in header. e.g: \"application/vnd.scanner.adapter.vuln.report.harbor+json; version=1.0\" 
try {
    Report result = apiInstance.repositoriesRepoNameTagsTagScanGet(repoName, tag, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanApi#repositoriesRepoNameTagsTagScanGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Repository name |
 **tag** | **String**| Tag name |
 **accept** | **String**| Mimetype in header. e.g: \&quot;application/vnd.scanner.adapter.vuln.report.harbor+json; version&#x3D;1.0\&quot;  | [optional]

### Return type

[**Report**](Report.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagScanPost"></a>
# **repositoriesRepoNameTagsTagScanPost**
> repositoriesRepoNameTagsTagScanPost(repoName, tag)

Scan the image.

Trigger a scan targeting the artifact identified by the repo_name and tag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScanApi apiInstance = new ScanApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
try {
    apiInstance.repositoriesRepoNameTagsTagScanPost(repoName, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanApi#repositoriesRepoNameTagsTagScanPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Repository name |
 **tag** | **String**| Tag name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagScanUuidLogGet"></a>
# **repositoriesRepoNameTagsTagScanUuidLogGet**
> String repositoriesRepoNameTagsTagScanUuidLogGet(repoName, tag, uuid)

Get scan log

Get the log text stream for the given artifact and scan action.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScanApi apiInstance = new ScanApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
String uuid = "uuid_example"; // String | the scan unique identifier
try {
    String result = apiInstance.repositoriesRepoNameTagsTagScanUuidLogGet(repoName, tag, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanApi#repositoriesRepoNameTagsTagScanUuidLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Repository name |
 **tag** | **String**| Tag name |
 **uuid** | **String**| the scan unique identifier |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="scansAllMetricsGet"></a>
# **scansAllMetricsGet**
> Stats scansAllMetricsGet()

Get the metrics of the latest scan all process

Get the metrics of the latest scan all process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScanApi apiInstance = new ScanApi();
try {
    Stats result = apiInstance.scansAllMetricsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanApi#scansAllMetricsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Stats**](Stats.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="scansScheduleMetricsGet"></a>
# **scansScheduleMetricsGet**
> Stats scansScheduleMetricsGet()

Get the metrics of the latest scheduled scan all process

Get the metrics of the latest scheduled scan all process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScanApi apiInstance = new ScanApi();
try {
    Stats result = apiInstance.scansScheduleMetricsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanApi#scansScheduleMetricsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Stats**](Stats.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

