# ChartRepositoryApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartrepoChartsPost**](ChartRepositoryApi.md#chartrepoChartsPost) | **POST** /chartrepo/charts | Upload a chart file to the defult &#39;library&#39; project.
[**chartrepoHealthGet**](ChartRepositoryApi.md#chartrepoHealthGet) | **GET** /chartrepo/health | Check the health of chart repository service.
[**chartrepoRepoChartsGet**](ChartRepositoryApi.md#chartrepoRepoChartsGet) | **GET** /chartrepo/{repo}/charts | Get all the charts under the specified project
[**chartrepoRepoChartsNameDelete**](ChartRepositoryApi.md#chartrepoRepoChartsNameDelete) | **DELETE** /chartrepo/{repo}/charts/{name} | Delete all the versions of the specified chart
[**chartrepoRepoChartsNameGet**](ChartRepositoryApi.md#chartrepoRepoChartsNameGet) | **GET** /chartrepo/{repo}/charts/{name} | Get all the versions of the specified chart
[**chartrepoRepoChartsNameVersionDelete**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version} | Delete the specified chart version
[**chartrepoRepoChartsNameVersionGet**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionGet) | **GET** /chartrepo/{repo}/charts/{name}/{version} | Get the specified chart version
[**chartrepoRepoChartsNameVersionLabelsGet**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionLabelsGet) | **GET** /chartrepo/{repo}/charts/{name}/{version}/labels | Return the attahced labels of chart.
[**chartrepoRepoChartsNameVersionLabelsIdDelete**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionLabelsIdDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version}/labels/{id} | Remove label from chart.
[**chartrepoRepoChartsNameVersionLabelsPost**](ChartRepositoryApi.md#chartrepoRepoChartsNameVersionLabelsPost) | **POST** /chartrepo/{repo}/charts/{name}/{version}/labels | Mark label to chart.
[**chartrepoRepoChartsPost**](ChartRepositoryApi.md#chartrepoRepoChartsPost) | **POST** /chartrepo/{repo}/charts | Upload a chart file to the specified project.
[**chartrepoRepoProvPost**](ChartRepositoryApi.md#chartrepoRepoProvPost) | **POST** /chartrepo/{repo}/prov | Upload a provance file to the specified project.


<a name="chartrepoChartsPost"></a>
# **chartrepoChartsPost**
> chartrepoChartsPost(chart, prov)

Upload a chart file to the defult &#39;library&#39; project.

Upload a chart file to the default &#39;library&#39; project. Uploading together with the prov file at the same time is also supported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
File chart = new File("/path/to/file.txt"); // File | The chart file
File prov = new File("/path/to/file.txt"); // File | The provance file
try {
    apiInstance.chartrepoChartsPost(chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoChartsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart** | **File**| The chart file |
 **prov** | **File**| The provance file | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

<a name="chartrepoHealthGet"></a>
# **chartrepoHealthGet**
> InlineResponse200 chartrepoHealthGet()

Check the health of chart repository service.

Check the health of chart repository service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
try {
    InlineResponse200 result = apiInstance.chartrepoHealthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoHealthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsGet"></a>
# **chartrepoRepoChartsGet**
> List&lt;ChartInfoEntry&gt; chartrepoRepoChartsGet(repo)

Get all the charts under the specified project

Get all the charts under the specified project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
try {
    List<ChartInfoEntry> result = apiInstance.chartrepoRepoChartsGet(repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |

### Return type

[**List&lt;ChartInfoEntry&gt;**](ChartInfoEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsNameDelete"></a>
# **chartrepoRepoChartsNameDelete**
> chartrepoRepoChartsNameDelete(repo, name)

Delete all the versions of the specified chart

Delete all the versions of the specified chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    apiInstance.chartrepoRepoChartsNameDelete(repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **name** | **String**| The chart name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsNameGet"></a>
# **chartrepoRepoChartsNameGet**
> ChartVersions chartrepoRepoChartsNameGet(repo, name)

Get all the versions of the specified chart

Get all the versions of the specified chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    ChartVersions result = apiInstance.chartrepoRepoChartsNameGet(repo, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **name** | **String**| The chart name |

### Return type

[**ChartVersions**](ChartVersions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoChartsNameVersionDelete"></a>
# **chartrepoRepoChartsNameVersionDelete**
> chartrepoRepoChartsNameVersionDelete(repo, name, version)

Delete the specified chart version

Delete the specified chart version

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionDelete(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionDelete");
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

<a name="chartrepoRepoChartsNameVersionGet"></a>
# **chartrepoRepoChartsNameVersionGet**
> ChartVersionDetails chartrepoRepoChartsNameVersionGet(repo, name, version)

Get the specified chart version

Get the specified chart version

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    ChartVersionDetails result = apiInstance.chartrepoRepoChartsNameVersionGet(repo, name, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionGet");
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

[**ChartVersionDetails**](ChartVersionDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

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
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionLabelsGet");
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
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Integer id = 56; // Integer | The label ID
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsIdDelete(repo, name, version, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionLabelsIdDelete");
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
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Label label = new Label(); // Label | The label being marked to the chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsPost(repo, name, version, label);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsNameVersionLabelsPost");
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

<a name="chartrepoRepoChartsPost"></a>
# **chartrepoRepoChartsPost**
> chartrepoRepoChartsPost(repo, chart, prov)

Upload a chart file to the specified project.

Upload a chart file to the specified project. With this API, the corresponding provance file can be uploaded together with chart file at once.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
File chart = new File("/path/to/file.txt"); // File | The chart file
File prov = new File("/path/to/file.txt"); // File | The provance file
try {
    apiInstance.chartrepoRepoChartsPost(repo, chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoChartsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **chart** | **File**| The chart file |
 **prov** | **File**| The provance file | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

<a name="chartrepoRepoProvPost"></a>
# **chartrepoRepoProvPost**
> chartrepoRepoProvPost(repo, prov)

Upload a provance file to the specified project.

Upload a provance file to the specified project. The provance file should be targeted for an existing chart file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChartRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChartRepositoryApi apiInstance = new ChartRepositoryApi();
String repo = "repo_example"; // String | The project name
File prov = new File("/path/to/file.txt"); // File | The provance file
try {
    apiInstance.chartrepoRepoProvPost(repo, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartRepositoryApi#chartrepoRepoProvPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repo** | **String**| The project name |
 **prov** | **File**| The provance file |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

