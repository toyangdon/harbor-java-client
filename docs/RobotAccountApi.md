# RobotAccountApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectsProjectIdRobotsGet**](RobotAccountApi.md#projectsProjectIdRobotsGet) | **GET** /projects/{project_id}/robots | Get all robot accounts of specified project
[**projectsProjectIdRobotsPost**](RobotAccountApi.md#projectsProjectIdRobotsPost) | **POST** /projects/{project_id}/robots | Create a robot account for project
[**projectsProjectIdRobotsRobotIdDelete**](RobotAccountApi.md#projectsProjectIdRobotsRobotIdDelete) | **DELETE** /projects/{project_id}/robots/{robot_id} | Delete the specified robot account
[**projectsProjectIdRobotsRobotIdGet**](RobotAccountApi.md#projectsProjectIdRobotsRobotIdGet) | **GET** /projects/{project_id}/robots/{robot_id} | Return the infor of the specified robot account.
[**projectsProjectIdRobotsRobotIdPut**](RobotAccountApi.md#projectsProjectIdRobotsRobotIdPut) | **PUT** /projects/{project_id}/robots/{robot_id} | Update status of robot account.


<a name="projectsProjectIdRobotsGet"></a>
# **projectsProjectIdRobotsGet**
> List&lt;RobotAccount&gt; projectsProjectIdRobotsGet(projectId)

Get all robot accounts of specified project

Get all robot accounts of specified project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RobotAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RobotAccountApi apiInstance = new RobotAccountApi();
Long projectId = 789L; // Long | Relevant project ID.
try {
    List<RobotAccount> result = apiInstance.projectsProjectIdRobotsGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotAccountApi#projectsProjectIdRobotsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |

### Return type

[**List&lt;RobotAccount&gt;**](RobotAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdRobotsPost"></a>
# **projectsProjectIdRobotsPost**
> RobotAccountPostRep projectsProjectIdRobotsPost(projectId, robot)

Create a robot account for project

Create a robot account for project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RobotAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RobotAccountApi apiInstance = new RobotAccountApi();
Long projectId = 789L; // Long | Relevant project ID.
RobotAccountCreate robot = new RobotAccountCreate(); // RobotAccountCreate | Request body of creating a robot account.
try {
    RobotAccountPostRep result = apiInstance.projectsProjectIdRobotsPost(projectId, robot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotAccountApi#projectsProjectIdRobotsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **robot** | [**RobotAccountCreate**](RobotAccountCreate.md)| Request body of creating a robot account. |

### Return type

[**RobotAccountPostRep**](RobotAccountPostRep.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdRobotsRobotIdDelete"></a>
# **projectsProjectIdRobotsRobotIdDelete**
> projectsProjectIdRobotsRobotIdDelete(projectId, robotId)

Delete the specified robot account

Delete the specified robot account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RobotAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RobotAccountApi apiInstance = new RobotAccountApi();
Long projectId = 789L; // Long | Relevant project ID.
Long robotId = 789L; // Long | The ID of robot account.
try {
    apiInstance.projectsProjectIdRobotsRobotIdDelete(projectId, robotId);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotAccountApi#projectsProjectIdRobotsRobotIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **robotId** | **Long**| The ID of robot account. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdRobotsRobotIdGet"></a>
# **projectsProjectIdRobotsRobotIdGet**
> RobotAccount projectsProjectIdRobotsRobotIdGet(projectId, robotId)

Return the infor of the specified robot account.

Return the infor of the specified robot account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RobotAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RobotAccountApi apiInstance = new RobotAccountApi();
Long projectId = 789L; // Long | Relevant project ID.
Long robotId = 789L; // Long | The ID of robot account.
try {
    RobotAccount result = apiInstance.projectsProjectIdRobotsRobotIdGet(projectId, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotAccountApi#projectsProjectIdRobotsRobotIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **robotId** | **Long**| The ID of robot account. |

### Return type

[**RobotAccount**](RobotAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdRobotsRobotIdPut"></a>
# **projectsProjectIdRobotsRobotIdPut**
> projectsProjectIdRobotsRobotIdPut(projectId, robotId, robot)

Update status of robot account.

Used to disable/enable a specified robot account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RobotAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RobotAccountApi apiInstance = new RobotAccountApi();
Long projectId = 789L; // Long | Relevant project ID.
Long robotId = 789L; // Long | The ID of robot account.
RobotAccountUpdate robot = new RobotAccountUpdate(); // RobotAccountUpdate | Request body of enable/disable a robot account.
try {
    apiInstance.projectsProjectIdRobotsRobotIdPut(projectId, robotId, robot);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotAccountApi#projectsProjectIdRobotsRobotIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **robotId** | **Long**| The ID of robot account. |
 **robot** | [**RobotAccountUpdate**](RobotAccountUpdate.md)| Request body of enable/disable a robot account. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

