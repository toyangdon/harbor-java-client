# RetentionApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retentionsIdExecutionsEidPatch**](RetentionApi.md#retentionsIdExecutionsEidPatch) | **PATCH** /retentions/{id}/executions/{eid} | Stop a Retention job
[**retentionsIdExecutionsEidTasksGet**](RetentionApi.md#retentionsIdExecutionsEidTasksGet) | **GET** /retentions/{id}/executions/{eid}/tasks | Get Retention job tasks
[**retentionsIdExecutionsEidTasksTidGet**](RetentionApi.md#retentionsIdExecutionsEidTasksTidGet) | **GET** /retentions/{id}/executions/{eid}/tasks/{tid} | Get Retention job task log
[**retentionsIdExecutionsGet**](RetentionApi.md#retentionsIdExecutionsGet) | **GET** /retentions/{id}/executions | Get a Retention job
[**retentionsIdExecutionsPost**](RetentionApi.md#retentionsIdExecutionsPost) | **POST** /retentions/{id}/executions | Trigger a Retention job
[**retentionsIdGet**](RetentionApi.md#retentionsIdGet) | **GET** /retentions/{id} | Get Retention Policy
[**retentionsMetadatasGet**](RetentionApi.md#retentionsMetadatasGet) | **GET** /retentions/metadatas | Get Retention Metadatas
[**retentionsPost**](RetentionApi.md#retentionsPost) | **POST** /retentions | Create Retention Policy


<a name="retentionsIdExecutionsEidPatch"></a>
# **retentionsIdExecutionsEidPatch**
> retentionsIdExecutionsEidPatch(id, eid, action)

Stop a Retention job

Stop a Retention job, only support \&quot;stop\&quot; action now.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
Long id = 789L; // Long | Retention ID.
Long eid = 789L; // Long | Retention execution ID.
Action1 action = new Action1(); // Action1 | The action, only support \"stop\" now.
try {
    apiInstance.retentionsIdExecutionsEidPatch(id, eid, action);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsIdExecutionsEidPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |
 **eid** | **Long**| Retention execution ID. |
 **action** | [**Action1**](Action1.md)| The action, only support \&quot;stop\&quot; now. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsIdExecutionsEidTasksGet"></a>
# **retentionsIdExecutionsEidTasksGet**
> List&lt;RetentionExecutionTask&gt; retentionsIdExecutionsEidTasksGet(id, eid)

Get Retention job tasks

Get Retention job tasks, each repository as a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
Long id = 789L; // Long | Retention ID.
Long eid = 789L; // Long | Retention execution ID.
try {
    List<RetentionExecutionTask> result = apiInstance.retentionsIdExecutionsEidTasksGet(id, eid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsIdExecutionsEidTasksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |
 **eid** | **Long**| Retention execution ID. |

### Return type

[**List&lt;RetentionExecutionTask&gt;**](RetentionExecutionTask.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsIdExecutionsEidTasksTidGet"></a>
# **retentionsIdExecutionsEidTasksTidGet**
> String retentionsIdExecutionsEidTasksTidGet(id, eid, tid)

Get Retention job task log

Get Retention job task log, tags ratain or deletion detail will be shown in a table.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
Long id = 789L; // Long | Retention ID.
Long eid = 789L; // Long | Retention execution ID.
Long tid = 789L; // Long | Retention execution ID.
try {
    String result = apiInstance.retentionsIdExecutionsEidTasksTidGet(id, eid, tid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsIdExecutionsEidTasksTidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |
 **eid** | **Long**| Retention execution ID. |
 **tid** | **Long**| Retention execution ID. |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsIdExecutionsGet"></a>
# **retentionsIdExecutionsGet**
> List&lt;RetentionExecution&gt; retentionsIdExecutionsGet(id)

Get a Retention job

Get a Retention job, job status may be delayed before job service schedule it up.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
Long id = 789L; // Long | Retention ID.
try {
    List<RetentionExecution> result = apiInstance.retentionsIdExecutionsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsIdExecutionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |

### Return type

[**List&lt;RetentionExecution&gt;**](RetentionExecution.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsIdExecutionsPost"></a>
# **retentionsIdExecutionsPost**
> retentionsIdExecutionsPost(id, action)

Trigger a Retention job

Trigger a Retention job, if dry_run is True, nothing would be deleted actually.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
Long id = 789L; // Long | Retention ID.
Action action = new Action(); // Action | 
try {
    apiInstance.retentionsIdExecutionsPost(id, action);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsIdExecutionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |
 **action** | [**Action**](Action.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsIdGet"></a>
# **retentionsIdGet**
> RetentionPolicy retentionsIdGet(id)

Get Retention Policy

Get Retention Policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
Long id = 789L; // Long | Retention ID.
try {
    RetentionPolicy result = apiInstance.retentionsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |

### Return type

[**RetentionPolicy**](RetentionPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsMetadatasGet"></a>
# **retentionsMetadatasGet**
> RetentionMetadata retentionsMetadatasGet()

Get Retention Metadatas

Get Retention Metadatas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
try {
    RetentionMetadata result = apiInstance.retentionsMetadatasGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsMetadatasGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RetentionMetadata**](RetentionMetadata.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="retentionsPost"></a>
# **retentionsPost**
> retentionsPost(policy)

Create Retention Policy

Create Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when no retention policy binded to project yet. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RetentionApi apiInstance = new RetentionApi();
RetentionPolicy policy = new RetentionPolicy(); // RetentionPolicy | Create Retention Policy successfully.
try {
    apiInstance.retentionsPost(policy);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#retentionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy** | [**RetentionPolicy**](RetentionPolicy.md)| Create Retention Policy successfully. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

