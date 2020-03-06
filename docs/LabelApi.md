# LabelApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartrepoRepoChartsNameVersionLabelsGet**](LabelApi.md#chartrepoRepoChartsNameVersionLabelsGet) | **GET** /chartrepo/{repo}/charts/{name}/{version}/labels | Return the attahced labels of chart.
[**chartrepoRepoChartsNameVersionLabelsIdDelete**](LabelApi.md#chartrepoRepoChartsNameVersionLabelsIdDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version}/labels/{id} | Remove label from chart.
[**chartrepoRepoChartsNameVersionLabelsPost**](LabelApi.md#chartrepoRepoChartsNameVersionLabelsPost) | **POST** /chartrepo/{repo}/charts/{name}/{version}/labels | Mark label to chart.


<a name="chartrepoRepoChartsNameVersionLabelsGet"></a>
# **chartrepoRepoChartsNameVersionLabelsGet**
> chartrepoRepoChartsNameVersionLabelsGet(repo, name, version)

Return the attahced labels of chart.

Return the attahced labels of the specified chart version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LabelApi apiInstance = new LabelApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#chartrepoRepoChartsNameVersionLabelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **name** | **String**| The chart name |
 **version** | **String**| The chart version |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsNameVersionLabelsIdDelete"></a>
# **chartrepoRepoChartsNameVersionLabelsIdDelete**
> chartrepoRepoChartsNameVersionLabelsIdDelete(repo, name, version, id)

Remove label from chart.

Remove label from the specified chart version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LabelApi apiInstance = new LabelApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Integer id = 56; // Integer | The label ID
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsIdDelete(repo, name, version, id);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#chartrepoRepoChartsNameVersionLabelsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **name** | **String**| The chart name |
 **version** | **String**| The chart version |
 **id** | **Integer**| The label ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsNameVersionLabelsPost"></a>
# **chartrepoRepoChartsNameVersionLabelsPost**
> chartrepoRepoChartsNameVersionLabelsPost(repo, name, version, label)

Mark label to chart.

Mark label to the specified chart version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LabelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LabelApi apiInstance = new LabelApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Label label = new Label(); // Label | The label being marked to the chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsPost(repo, name, version, label);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#chartrepoRepoChartsNameVersionLabelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **name** | **String**| The chart name |
 **version** | **String**| The chart version |
 **label** | [**Label**](Label.md)| The label being marked to the chart version |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

