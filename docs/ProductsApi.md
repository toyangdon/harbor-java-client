# ProductsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartrepoChartsPost**](ProductsApi.md#chartrepoChartsPost) | **POST** /chartrepo/charts | Upload a chart file to the defult &#39;library&#39; project.
[**chartrepoHealthGet**](ProductsApi.md#chartrepoHealthGet) | **GET** /chartrepo/health | Check the health of chart repository service.
[**chartrepoRepoChartsGet**](ProductsApi.md#chartrepoRepoChartsGet) | **GET** /chartrepo/{repo}/charts | Get all the charts under the specified project
[**chartrepoRepoChartsNameDelete**](ProductsApi.md#chartrepoRepoChartsNameDelete) | **DELETE** /chartrepo/{repo}/charts/{name} | Delete all the versions of the specified chart
[**chartrepoRepoChartsNameGet**](ProductsApi.md#chartrepoRepoChartsNameGet) | **GET** /chartrepo/{repo}/charts/{name} | Get all the versions of the specified chart
[**chartrepoRepoChartsNameVersionDelete**](ProductsApi.md#chartrepoRepoChartsNameVersionDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version} | Delete the specified chart version
[**chartrepoRepoChartsNameVersionGet**](ProductsApi.md#chartrepoRepoChartsNameVersionGet) | **GET** /chartrepo/{repo}/charts/{name}/{version} | Get the specified chart version
[**chartrepoRepoChartsNameVersionLabelsGet**](ProductsApi.md#chartrepoRepoChartsNameVersionLabelsGet) | **GET** /chartrepo/{repo}/charts/{name}/{version}/labels | Return the attahced labels of chart.
[**chartrepoRepoChartsNameVersionLabelsIdDelete**](ProductsApi.md#chartrepoRepoChartsNameVersionLabelsIdDelete) | **DELETE** /chartrepo/{repo}/charts/{name}/{version}/labels/{id} | Remove label from chart.
[**chartrepoRepoChartsNameVersionLabelsPost**](ProductsApi.md#chartrepoRepoChartsNameVersionLabelsPost) | **POST** /chartrepo/{repo}/charts/{name}/{version}/labels | Mark label to chart.
[**chartrepoRepoChartsPost**](ProductsApi.md#chartrepoRepoChartsPost) | **POST** /chartrepo/{repo}/charts | Upload a chart file to the specified project.
[**chartrepoRepoProvPost**](ProductsApi.md#chartrepoRepoProvPost) | **POST** /chartrepo/{repo}/prov | Upload a provance file to the specified project.
[**configurationsGet**](ProductsApi.md#configurationsGet) | **GET** /configurations | Get system configurations.
[**configurationsPut**](ProductsApi.md#configurationsPut) | **PUT** /configurations | Modify system configurations.
[**emailPingPost**](ProductsApi.md#emailPingPost) | **POST** /email/ping | Test connection and authentication with email server.
[**healthGet**](ProductsApi.md#healthGet) | **GET** /health | Health check API
[**internalSwitchquotaPut**](ProductsApi.md#internalSwitchquotaPut) | **PUT** /internal/switchquota | Enable or disable quota.
[**internalSyncquotaPost**](ProductsApi.md#internalSyncquotaPost) | **POST** /internal/syncquota | Sync quota from registry/chart to DB.
[**internalSyncregistryPost**](ProductsApi.md#internalSyncregistryPost) | **POST** /internal/syncregistry | Sync repositories from registry to DB.
[**labelsGet**](ProductsApi.md#labelsGet) | **GET** /labels | List labels according to the query strings.
[**labelsIdDelete**](ProductsApi.md#labelsIdDelete) | **DELETE** /labels/{id} | Delete the label specified by ID.
[**labelsIdGet**](ProductsApi.md#labelsIdGet) | **GET** /labels/{id} | Get the label specified by ID.
[**labelsIdPut**](ProductsApi.md#labelsIdPut) | **PUT** /labels/{id} | Update the label properties.
[**labelsIdResourcesGet**](ProductsApi.md#labelsIdResourcesGet) | **GET** /labels/{id}/resources | Get the resources that the label is referenced by.
[**labelsPost**](ProductsApi.md#labelsPost) | **POST** /labels | Post creates a label
[**ldapGroupsSearchGet**](ProductsApi.md#ldapGroupsSearchGet) | **GET** /ldap/groups/search | Search available ldap groups.
[**ldapPingPost**](ProductsApi.md#ldapPingPost) | **POST** /ldap/ping | Ping available ldap service.
[**ldapUsersImportPost**](ProductsApi.md#ldapUsersImportPost) | **POST** /ldap/users/import | Import selected available ldap users.
[**ldapUsersSearchGet**](ProductsApi.md#ldapUsersSearchGet) | **GET** /ldap/users/search | Search available ldap users.
[**logsGet**](ProductsApi.md#logsGet) | **GET** /logs | Get recent logs of the projects which the user is a member of
[**projectsGet**](ProductsApi.md#projectsGet) | **GET** /projects | List projects
[**projectsHead**](ProductsApi.md#projectsHead) | **HEAD** /projects | Check if the project name user provided already exists.
[**projectsPost**](ProductsApi.md#projectsPost) | **POST** /projects | Create a new project.
[**projectsProjectIdDelete**](ProductsApi.md#projectsProjectIdDelete) | **DELETE** /projects/{project_id} | Delete project by projectID
[**projectsProjectIdGet**](ProductsApi.md#projectsProjectIdGet) | **GET** /projects/{project_id} | Return specific project detail information
[**projectsProjectIdImmutabletagrulesGet**](ProductsApi.md#projectsProjectIdImmutabletagrulesGet) | **GET** /projects/{project_id}/immutabletagrules | List all immutable tag rules of current project
[**projectsProjectIdImmutabletagrulesIdDelete**](ProductsApi.md#projectsProjectIdImmutabletagrulesIdDelete) | **DELETE** /projects/{project_id}/immutabletagrules/{id} | Delete the immutable tag rule.
[**projectsProjectIdImmutabletagrulesIdPut**](ProductsApi.md#projectsProjectIdImmutabletagrulesIdPut) | **PUT** /projects/{project_id}/immutabletagrules/{id} | Update the immutable tag rule or enable or disable the rule
[**projectsProjectIdImmutabletagrulesPost**](ProductsApi.md#projectsProjectIdImmutabletagrulesPost) | **POST** /projects/{project_id}/immutabletagrules | Add an immutable tag rule to current project
[**projectsProjectIdLogsGet**](ProductsApi.md#projectsProjectIdLogsGet) | **GET** /projects/{project_id}/logs | Get access logs accompany with a relevant project.
[**projectsProjectIdMembersGet**](ProductsApi.md#projectsProjectIdMembersGet) | **GET** /projects/{project_id}/members | Get all project member information
[**projectsProjectIdMembersMidDelete**](ProductsApi.md#projectsProjectIdMembersMidDelete) | **DELETE** /projects/{project_id}/members/{mid} | Delete project member
[**projectsProjectIdMembersMidGet**](ProductsApi.md#projectsProjectIdMembersMidGet) | **GET** /projects/{project_id}/members/{mid} | Get the project member information
[**projectsProjectIdMembersMidPut**](ProductsApi.md#projectsProjectIdMembersMidPut) | **PUT** /projects/{project_id}/members/{mid} | Update project member
[**projectsProjectIdMembersPost**](ProductsApi.md#projectsProjectIdMembersPost) | **POST** /projects/{project_id}/members | Create project member
[**projectsProjectIdMetadatasGet**](ProductsApi.md#projectsProjectIdMetadatasGet) | **GET** /projects/{project_id}/metadatas | Get project metadata.
[**projectsProjectIdMetadatasMetaNameDelete**](ProductsApi.md#projectsProjectIdMetadatasMetaNameDelete) | **DELETE** /projects/{project_id}/metadatas/{meta_name} | Delete metadata of a project
[**projectsProjectIdMetadatasMetaNameGet**](ProductsApi.md#projectsProjectIdMetadatasMetaNameGet) | **GET** /projects/{project_id}/metadatas/{meta_name} | Get project metadata
[**projectsProjectIdMetadatasMetaNamePut**](ProductsApi.md#projectsProjectIdMetadatasMetaNamePut) | **PUT** /projects/{project_id}/metadatas/{meta_name} | Update metadata of a project.
[**projectsProjectIdMetadatasPost**](ProductsApi.md#projectsProjectIdMetadatasPost) | **POST** /projects/{project_id}/metadatas | Add metadata for the project.
[**projectsProjectIdPut**](ProductsApi.md#projectsProjectIdPut) | **PUT** /projects/{project_id} | Update properties for a selected project.
[**projectsProjectIdRobotsGet**](ProductsApi.md#projectsProjectIdRobotsGet) | **GET** /projects/{project_id}/robots | Get all robot accounts of specified project
[**projectsProjectIdRobotsPost**](ProductsApi.md#projectsProjectIdRobotsPost) | **POST** /projects/{project_id}/robots | Create a robot account for project
[**projectsProjectIdRobotsRobotIdDelete**](ProductsApi.md#projectsProjectIdRobotsRobotIdDelete) | **DELETE** /projects/{project_id}/robots/{robot_id} | Delete the specified robot account
[**projectsProjectIdRobotsRobotIdGet**](ProductsApi.md#projectsProjectIdRobotsRobotIdGet) | **GET** /projects/{project_id}/robots/{robot_id} | Return the infor of the specified robot account.
[**projectsProjectIdRobotsRobotIdPut**](ProductsApi.md#projectsProjectIdRobotsRobotIdPut) | **PUT** /projects/{project_id}/robots/{robot_id} | Update status of robot account.
[**projectsProjectIdScannerCandidatesGet**](ProductsApi.md#projectsProjectIdScannerCandidatesGet) | **GET** /projects/{project_id}/scanner/candidates | Get scanner registration candidates for configurating project level scanner
[**projectsProjectIdScannerGet**](ProductsApi.md#projectsProjectIdScannerGet) | **GET** /projects/{project_id}/scanner | Get project level scanner
[**projectsProjectIdSummaryGet**](ProductsApi.md#projectsProjectIdSummaryGet) | **GET** /projects/{project_id}/summary | Get summary of the project.
[**projectsProjectIdWebhookJobsGet**](ProductsApi.md#projectsProjectIdWebhookJobsGet) | **GET** /projects/{project_id}/webhook/jobs | List project webhook jobs
[**projectsProjectIdWebhookLasttriggerGet**](ProductsApi.md#projectsProjectIdWebhookLasttriggerGet) | **GET** /projects/{project_id}/webhook/lasttrigger | Get project webhook policy last trigger info
[**projectsProjectIdWebhookPoliciesGet**](ProductsApi.md#projectsProjectIdWebhookPoliciesGet) | **GET** /projects/{project_id}/webhook/policies | List project webhook policies.
[**projectsProjectIdWebhookPoliciesPolicyIdDelete**](ProductsApi.md#projectsProjectIdWebhookPoliciesPolicyIdDelete) | **DELETE** /projects/{project_id}/webhook/policies/{policy_id} | Delete webhook policy of a project
[**projectsProjectIdWebhookPoliciesPolicyIdGet**](ProductsApi.md#projectsProjectIdWebhookPoliciesPolicyIdGet) | **GET** /projects/{project_id}/webhook/policies/{policy_id} | Get project webhook policy
[**projectsProjectIdWebhookPoliciesPolicyIdPut**](ProductsApi.md#projectsProjectIdWebhookPoliciesPolicyIdPut) | **PUT** /projects/{project_id}/webhook/policies/{policy_id} | Update webhook policy of a project.
[**projectsProjectIdWebhookPoliciesPost**](ProductsApi.md#projectsProjectIdWebhookPoliciesPost) | **POST** /projects/{project_id}/webhook/policies | Create project webhook policy.
[**projectsProjectIdWebhookPoliciesTestPost**](ProductsApi.md#projectsProjectIdWebhookPoliciesTestPost) | **POST** /projects/{project_id}/webhook/policies/test | Test project webhook connection
[**quotasGet**](ProductsApi.md#quotasGet) | **GET** /quotas | List quotas
[**quotasIdGet**](ProductsApi.md#quotasIdGet) | **GET** /quotas/{id} | Get the specified quota
[**quotasIdPut**](ProductsApi.md#quotasIdPut) | **PUT** /quotas/{id} | Update the specified quota
[**registriesGet**](ProductsApi.md#registriesGet) | **GET** /registries | List registries.
[**registriesIdDelete**](ProductsApi.md#registriesIdDelete) | **DELETE** /registries/{id} | Delete specific registry.
[**registriesIdGet**](ProductsApi.md#registriesIdGet) | **GET** /registries/{id} | Get registry.
[**registriesIdInfoGet**](ProductsApi.md#registriesIdInfoGet) | **GET** /registries/{id}/info | Get registry info.
[**registriesIdNamespaceGet**](ProductsApi.md#registriesIdNamespaceGet) | **GET** /registries/{id}/namespace | List namespaces of registry
[**registriesIdPut**](ProductsApi.md#registriesIdPut) | **PUT** /registries/{id} | Update a given registry.
[**registriesPingPost**](ProductsApi.md#registriesPingPost) | **POST** /registries/ping | Ping status of a registry.
[**registriesPost**](ProductsApi.md#registriesPost) | **POST** /registries | Create a new registry.
[**replicationAdaptersGet**](ProductsApi.md#replicationAdaptersGet) | **GET** /replication/adapters | List supported adapters.
[**replicationExecutionsGet**](ProductsApi.md#replicationExecutionsGet) | **GET** /replication/executions | List replication executions.
[**replicationExecutionsIdGet**](ProductsApi.md#replicationExecutionsIdGet) | **GET** /replication/executions/{id} | Get the execution of the replication.
[**replicationExecutionsIdPut**](ProductsApi.md#replicationExecutionsIdPut) | **PUT** /replication/executions/{id} | Stop the execution of the replication.
[**replicationExecutionsIdTasksGet**](ProductsApi.md#replicationExecutionsIdTasksGet) | **GET** /replication/executions/{id}/tasks | Get the task list of one execution.
[**replicationExecutionsIdTasksTaskIdLogGet**](ProductsApi.md#replicationExecutionsIdTasksTaskIdLogGet) | **GET** /replication/executions/{id}/tasks/{task_id}/log | Get the log of one task.
[**replicationExecutionsPost**](ProductsApi.md#replicationExecutionsPost) | **POST** /replication/executions | Start one execution of the replication.
[**replicationPoliciesGet**](ProductsApi.md#replicationPoliciesGet) | **GET** /replication/policies | List replication policies
[**replicationPoliciesIdDelete**](ProductsApi.md#replicationPoliciesIdDelete) | **DELETE** /replication/policies/{id} | Delete the replication policy specified by ID.
[**replicationPoliciesIdGet**](ProductsApi.md#replicationPoliciesIdGet) | **GET** /replication/policies/{id} | Get replication policy.
[**replicationPoliciesIdPut**](ProductsApi.md#replicationPoliciesIdPut) | **PUT** /replication/policies/{id} | Update the replication policy
[**replicationPoliciesPost**](ProductsApi.md#replicationPoliciesPost) | **POST** /replication/policies | Create a replication policy
[**repositoriesGet**](ProductsApi.md#repositoriesGet) | **GET** /repositories | Get repositories accompany with relevant project and repo name.
[**repositoriesRepoNameDelete**](ProductsApi.md#repositoriesRepoNameDelete) | **DELETE** /repositories/{repo_name} | Delete a repository.
[**repositoriesRepoNameLabelsGet**](ProductsApi.md#repositoriesRepoNameLabelsGet) | **GET** /repositories/{repo_name}/labels | Get labels of a repository.
[**repositoriesRepoNameLabelsLabelIdDelete**](ProductsApi.md#repositoriesRepoNameLabelsLabelIdDelete) | **DELETE** /repositories/{repo_name}/labels/{label_id} | Delete label from the repository.
[**repositoriesRepoNameLabelsPost**](ProductsApi.md#repositoriesRepoNameLabelsPost) | **POST** /repositories/{repo_name}/labels | Add a label to the repository.
[**repositoriesRepoNamePut**](ProductsApi.md#repositoriesRepoNamePut) | **PUT** /repositories/{repo_name} | Update description of the repository.
[**repositoriesRepoNameSignaturesGet**](ProductsApi.md#repositoriesRepoNameSignaturesGet) | **GET** /repositories/{repo_name}/signatures | Get signature information of a repository
[**repositoriesRepoNameTagsGet**](ProductsApi.md#repositoriesRepoNameTagsGet) | **GET** /repositories/{repo_name}/tags | Get tags of a relevant repository.
[**repositoriesRepoNameTagsPost**](ProductsApi.md#repositoriesRepoNameTagsPost) | **POST** /repositories/{repo_name}/tags | Retag an image
[**repositoriesRepoNameTagsTagDelete**](ProductsApi.md#repositoriesRepoNameTagsTagDelete) | **DELETE** /repositories/{repo_name}/tags/{tag} | Delete a tag in a repository.
[**repositoriesRepoNameTagsTagGet**](ProductsApi.md#repositoriesRepoNameTagsTagGet) | **GET** /repositories/{repo_name}/tags/{tag} | Get the tag of the repository.
[**repositoriesRepoNameTagsTagLabelsGet**](ProductsApi.md#repositoriesRepoNameTagsTagLabelsGet) | **GET** /repositories/{repo_name}/tags/{tag}/labels | Get labels of an image.
[**repositoriesRepoNameTagsTagLabelsLabelIdDelete**](ProductsApi.md#repositoriesRepoNameTagsTagLabelsLabelIdDelete) | **DELETE** /repositories/{repo_name}/tags/{tag}/labels/{label_id} | Delete label from the image.
[**repositoriesRepoNameTagsTagLabelsPost**](ProductsApi.md#repositoriesRepoNameTagsTagLabelsPost) | **POST** /repositories/{repo_name}/tags/{tag}/labels | Add a label to image.
[**repositoriesRepoNameTagsTagManifestGet**](ProductsApi.md#repositoriesRepoNameTagsTagManifestGet) | **GET** /repositories/{repo_name}/tags/{tag}/manifest | Get manifests of a relevant repository.
[**repositoriesRepoNameTagsTagScanPost**](ProductsApi.md#repositoriesRepoNameTagsTagScanPost) | **POST** /repositories/{repo_name}/tags/{tag}/scan | Scan the image.
[**repositoriesRepoNameTagsTagScanUuidLogGet**](ProductsApi.md#repositoriesRepoNameTagsTagScanUuidLogGet) | **GET** /repositories/{repo_name}/tags/{tag}/scan/{uuid}/log | Get scan log
[**repositoriesTopGet**](ProductsApi.md#repositoriesTopGet) | **GET** /repositories/top | Get public repositories which are accessed most.
[**retentionsIdExecutionsEidPatch**](ProductsApi.md#retentionsIdExecutionsEidPatch) | **PATCH** /retentions/{id}/executions/{eid} | Stop a Retention job
[**retentionsIdExecutionsEidTasksGet**](ProductsApi.md#retentionsIdExecutionsEidTasksGet) | **GET** /retentions/{id}/executions/{eid}/tasks | Get Retention job tasks
[**retentionsIdExecutionsEidTasksTidGet**](ProductsApi.md#retentionsIdExecutionsEidTasksTidGet) | **GET** /retentions/{id}/executions/{eid}/tasks/{tid} | Get Retention job task log
[**retentionsIdExecutionsGet**](ProductsApi.md#retentionsIdExecutionsGet) | **GET** /retentions/{id}/executions | Get a Retention job
[**retentionsIdExecutionsPost**](ProductsApi.md#retentionsIdExecutionsPost) | **POST** /retentions/{id}/executions | Trigger a Retention job
[**retentionsIdGet**](ProductsApi.md#retentionsIdGet) | **GET** /retentions/{id} | Get Retention Policy
[**retentionsIdPut**](ProductsApi.md#retentionsIdPut) | **PUT** /retentions/{id} | Update Retention Policy
[**retentionsMetadatasGet**](ProductsApi.md#retentionsMetadatasGet) | **GET** /retentions/metadatas | Get Retention Metadatas
[**retentionsPost**](ProductsApi.md#retentionsPost) | **POST** /retentions | Create Retention Policy
[**scannersGet**](ProductsApi.md#scannersGet) | **GET** /scanners | List scanner registrations
[**scannersPingPost**](ProductsApi.md#scannersPingPost) | **POST** /scanners/ping | Tests scanner registration settings
[**scannersRegistrationIdGet**](ProductsApi.md#scannersRegistrationIdGet) | **GET** /scanners/{registration_id} | Get a scanner registration details
[**scannersRegistrationIdMetadataGet**](ProductsApi.md#scannersRegistrationIdMetadataGet) | **GET** /scanners/{registration_id}/metadata | Get the metadata of the specified scanner registration
[**scansAllMetricsGet**](ProductsApi.md#scansAllMetricsGet) | **GET** /scans/all/metrics | Get the metrics of the latest scan all process
[**scansScheduleMetricsGet**](ProductsApi.md#scansScheduleMetricsGet) | **GET** /scans/schedule/metrics | Get the metrics of the latest scheduled scan all process
[**searchGet**](ProductsApi.md#searchGet) | **GET** /search | Search for projects, repositories and helm charts
[**statisticsGet**](ProductsApi.md#statisticsGet) | **GET** /statistics | Get projects number and repositories number relevant to the user
[**systemCVEWhitelistGet**](ProductsApi.md#systemCVEWhitelistGet) | **GET** /system/CVEWhitelist | Get the system level whitelist of CVE.
[**systemCVEWhitelistPut**](ProductsApi.md#systemCVEWhitelistPut) | **PUT** /system/CVEWhitelist | Update the system level whitelist of CVE.
[**systemGcGet**](ProductsApi.md#systemGcGet) | **GET** /system/gc | Get gc results.
[**systemGcIdGet**](ProductsApi.md#systemGcIdGet) | **GET** /system/gc/{id} | Get gc status.
[**systemGcIdLogGet**](ProductsApi.md#systemGcIdLogGet) | **GET** /system/gc/{id}/log | Get gc job log.
[**systemGcScheduleGet**](ProductsApi.md#systemGcScheduleGet) | **GET** /system/gc/schedule | Get gc&#39;s schedule.
[**systemGcSchedulePost**](ProductsApi.md#systemGcSchedulePost) | **POST** /system/gc/schedule | Create a gc schedule.
[**systemGcSchedulePut**](ProductsApi.md#systemGcSchedulePut) | **PUT** /system/gc/schedule | Update gc&#39;s schedule.
[**systemOidcPingPost**](ProductsApi.md#systemOidcPingPost) | **POST** /system/oidc/ping | Test the OIDC endpoint.
[**systemScanAllScheduleGet**](ProductsApi.md#systemScanAllScheduleGet) | **GET** /system/scanAll/schedule | Get scan_all&#39;s schedule.
[**systemScanAllSchedulePost**](ProductsApi.md#systemScanAllSchedulePost) | **POST** /system/scanAll/schedule | Create a schedule or a manual trigger for the scan all job.
[**systemScanAllSchedulePut**](ProductsApi.md#systemScanAllSchedulePut) | **PUT** /system/scanAll/schedule | Update scan all&#39;s schedule.
[**systeminfoGet**](ProductsApi.md#systeminfoGet) | **GET** /systeminfo | Get general system info
[**systeminfoGetcertGet**](ProductsApi.md#systeminfoGetcertGet) | **GET** /systeminfo/getcert | Get default root certificate.
[**systeminfoVolumesGet**](ProductsApi.md#systeminfoVolumesGet) | **GET** /systeminfo/volumes | Get system volume info (total/free size).
[**usergroupsGet**](ProductsApi.md#usergroupsGet) | **GET** /usergroups | Get all user groups information
[**usergroupsGroupIdDelete**](ProductsApi.md#usergroupsGroupIdDelete) | **DELETE** /usergroups/{group_id} | Delete user group
[**usergroupsGroupIdGet**](ProductsApi.md#usergroupsGroupIdGet) | **GET** /usergroups/{group_id} | Get user group information
[**usergroupsGroupIdPut**](ProductsApi.md#usergroupsGroupIdPut) | **PUT** /usergroups/{group_id} | Update group information
[**usergroupsPost**](ProductsApi.md#usergroupsPost) | **POST** /usergroups | Create user group
[**usersCurrentGet**](ProductsApi.md#usersCurrentGet) | **GET** /users/current | Get current user info.
[**usersCurrentPermissionsGet**](ProductsApi.md#usersCurrentPermissionsGet) | **GET** /users/current/permissions | Get current user permissions.
[**usersGet**](ProductsApi.md#usersGet) | **GET** /users | Get registered users of Harbor.
[**usersPost**](ProductsApi.md#usersPost) | **POST** /users | Creates a new user account.
[**usersSearchGet**](ProductsApi.md#usersSearchGet) | **GET** /users/search | Search users by username
[**usersUserIdCliSecretPut**](ProductsApi.md#usersUserIdCliSecretPut) | **PUT** /users/{user_id}/cli_secret | Set CLI secret for a user.
[**usersUserIdDelete**](ProductsApi.md#usersUserIdDelete) | **DELETE** /users/{user_id} | Mark a registered user as be removed.
[**usersUserIdGet**](ProductsApi.md#usersUserIdGet) | **GET** /users/{user_id} | Get a user&#39;s profile.
[**usersUserIdPasswordPut**](ProductsApi.md#usersUserIdPasswordPut) | **PUT** /users/{user_id}/password | Change the password on a user that already exists.
[**usersUserIdPut**](ProductsApi.md#usersUserIdPut) | **PUT** /users/{user_id} | Update a registered user to change his profile.
[**usersUserIdSysadminPut**](ProductsApi.md#usersUserIdSysadminPut) | **PUT** /users/{user_id}/sysadmin | Update a registered user to change to be an administrator of Harbor.


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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
File chart = new File("/path/to/file.txt"); // File | The chart file
File prov = new File("/path/to/file.txt"); // File | The provance file
try {
    apiInstance.chartrepoChartsPost(chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoChartsPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    InlineResponse200 result = apiInstance.chartrepoHealthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoHealthGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
try {
    List<ChartInfoEntry> result = apiInstance.chartrepoRepoChartsGet(repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    apiInstance.chartrepoRepoChartsNameDelete(repo, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameDelete");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
try {
    ChartVersions result = apiInstance.chartrepoRepoChartsNameGet(repo, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionDelete(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionDelete");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    ChartVersionDetails result = apiInstance.chartrepoRepoChartsNameVersionGet(repo, name, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsGet(repo, name, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionLabelsGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Integer id = 56; // Integer | The label ID
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsIdDelete(repo, name, version, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionLabelsIdDelete");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
String name = "name_example"; // String | The chart name
String version = "version_example"; // String | The chart version
Label label = new Label(); // Label | The label being marked to the chart version
try {
    apiInstance.chartrepoRepoChartsNameVersionLabelsPost(repo, name, version, label);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsNameVersionLabelsPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
File chart = new File("/path/to/file.txt"); // File | The chart file
File prov = new File("/path/to/file.txt"); // File | The provance file
try {
    apiInstance.chartrepoRepoChartsPost(repo, chart, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoChartsPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repo = "repo_example"; // String | The project name
File prov = new File("/path/to/file.txt"); // File | The provance file
try {
    apiInstance.chartrepoRepoProvPost(repo, prov);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#chartrepoRepoProvPost");
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

<a name="configurationsGet"></a>
# **configurationsGet**
> ConfigurationsResponse configurationsGet()

Get system configurations.

This endpoint is for retrieving system configurations that only provides for admin user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    ConfigurationsResponse result = apiInstance.configurationsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#configurationsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigurationsResponse**](ConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="configurationsPut"></a>
# **configurationsPut**
> configurationsPut(configurations)

Modify system configurations.

This endpoint is for modifying system configurations that only provides for admin user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Configurations configurations = new Configurations(); // Configurations | The configuration map can contain a subset of the attributes of the schema, which are to be updated.
try {
    apiInstance.configurationsPut(configurations);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#configurationsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurations** | [**Configurations**](Configurations.md)| The configuration map can contain a subset of the attributes of the schema, which are to be updated. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="emailPingPost"></a>
# **emailPingPost**
> emailPingPost(settings)

Test connection and authentication with email server.

Test connection and authentication with email server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
EmailServerSetting settings = new EmailServerSetting(); // EmailServerSetting | Email server settings, if some of the settings are not assigned, they will be read from system configuration.
try {
    apiInstance.emailPingPost(settings);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#emailPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settings** | [**EmailServerSetting**](EmailServerSetting.md)| Email server settings, if some of the settings are not assigned, they will be read from system configuration. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="healthGet"></a>
# **healthGet**
> OverallHealthStatus healthGet()

Health check API

The endpoint returns the health stauts of the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    OverallHealthStatus result = apiInstance.healthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#healthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OverallHealthStatus**](OverallHealthStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="internalSwitchquotaPut"></a>
# **internalSwitchquotaPut**
> internalSwitchquotaPut(switcher)

Enable or disable quota.

This endpoint is for enable/disable quota. When quota is disabled, no resource require/release in image/chart push and delete. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
QuotaSwitcher switcher = new QuotaSwitcher(); // QuotaSwitcher | 
try {
    apiInstance.internalSwitchquotaPut(switcher);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#internalSwitchquotaPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **switcher** | [**QuotaSwitcher**](QuotaSwitcher.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="internalSyncquotaPost"></a>
# **internalSyncquotaPost**
> internalSyncquotaPost()

Sync quota from registry/chart to DB.

This endpoint is for syncing quota usage of registry/chart with database. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    apiInstance.internalSyncquotaPost();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#internalSyncquotaPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="internalSyncregistryPost"></a>
# **internalSyncregistryPost**
> internalSyncregistryPost()

Sync repositories from registry to DB.

This endpoint is for syncing all repositories of registry with database. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    apiInstance.internalSyncregistryPost();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#internalSyncregistryPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="labelsGet"></a>
# **labelsGet**
> List&lt;Label&gt; labelsGet(scope, name, projectId, page, pageSize)

List labels according to the query strings.

This endpoint let user list labels by name, scope and project_id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String scope = "scope_example"; // String | The label scope. Valid values are g and p. g for global labels and p for project labels.
String name = "name_example"; // String | The label name.
Long projectId = 789L; // Long | Relevant project ID, required when scope is p.
Integer page = 56; // Integer | The page nubmer.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<Label> result = apiInstance.labelsGet(scope, name, projectId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The label scope. Valid values are g and p. g for global labels and p for project labels. |
 **name** | **String**| The label name. | [optional]
 **projectId** | **Long**| Relevant project ID, required when scope is p. | [optional]
 **page** | **Integer**| The page nubmer. | [optional]
 **pageSize** | **Integer**| The size of per page. | [optional]

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="labelsIdDelete"></a>
# **labelsIdDelete**
> labelsIdDelete(id)

Delete the label specified by ID.

Delete the label specified by ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Label ID
try {
    apiInstance.labelsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Label ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="labelsIdGet"></a>
# **labelsIdGet**
> Label labelsIdGet(id)

Get the label specified by ID.

This endpoint let user get the label by specific ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Label ID
try {
    Label result = apiInstance.labelsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Label ID |

### Return type

[**Label**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="labelsIdPut"></a>
# **labelsIdPut**
> labelsIdPut(id, label)

Update the label properties.

This endpoint let user update label properties. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Label ID
Label label = new Label(); // Label | The updated label json object.
try {
    apiInstance.labelsIdPut(id, label);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Label ID |
 **label** | [**Label**](Label.md)| The updated label json object. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="labelsIdResourcesGet"></a>
# **labelsIdResourcesGet**
> Resource labelsIdResourcesGet(id)

Get the resources that the label is referenced by.

This endpoint let user get the resources that the label is referenced by. Only the replication policies are returned for now. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Label ID
try {
    Resource result = apiInstance.labelsIdResourcesGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsIdResourcesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Label ID |

### Return type

[**Resource**](Resource.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="labelsPost"></a>
# **labelsPost**
> labelsPost(label)

Post creates a label

This endpoint let user creates a label. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Label label = new Label(); // Label | The json object of label.
try {
    apiInstance.labelsPost(label);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#labelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **label** | [**Label**](Label.md)| The json object of label. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="ldapGroupsSearchGet"></a>
# **ldapGroupsSearchGet**
> List&lt;UserGroup&gt; ldapGroupsSearchGet(groupname, groupdn)

Search available ldap groups.

This endpoint searches the available ldap groups based on related configuration parameters. support to search by groupname or groupdn. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String groupname = "groupname_example"; // String | Ldap group name
String groupdn = "groupdn_example"; // String | The LDAP group DN
try {
    List<UserGroup> result = apiInstance.ldapGroupsSearchGet(groupname, groupdn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapGroupsSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **String**| Ldap group name | [optional]
 **groupdn** | **String**| The LDAP group DN | [optional]

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="ldapPingPost"></a>
# **ldapPingPost**
> ldapPingPost(ldapconf)

Ping available ldap service.

This endpoint ping the available ldap service for test related configuration parameters. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
LdapConf ldapconf = new LdapConf(); // LdapConf | ldap configuration. support input ldap service configuration. If it's a empty request, will load current configuration from the system.
try {
    apiInstance.ldapPingPost(ldapconf);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ldapconf** | [**LdapConf**](LdapConf.md)| ldap configuration. support input ldap service configuration. If it&#39;s a empty request, will load current configuration from the system. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="ldapUsersImportPost"></a>
# **ldapUsersImportPost**
> ldapUsersImportPost(uidList)

Import selected available ldap users.

This endpoint adds the selected available ldap users to harbor based on related configuration parameters from the system. System will try to guess the user email address and realname, add to harbor user information. If have errors when import user, will return the list of importing failed uid and the failed reason. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
LdapImportUsers uidList = new LdapImportUsers(); // LdapImportUsers | The uid listed for importing. This list will check users validity of ldap service based on configuration from the system.
try {
    apiInstance.ldapUsersImportPost(uidList);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapUsersImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uidList** | [**LdapImportUsers**](LdapImportUsers.md)| The uid listed for importing. This list will check users validity of ldap service based on configuration from the system. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="ldapUsersSearchGet"></a>
# **ldapUsersSearchGet**
> List&lt;LdapUsers&gt; ldapUsersSearchGet(username)

Search available ldap users.

This endpoint searches the available ldap users based on related configuration parameters. Support searched by input ladp configuration, load configuration from the system and specific filter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Registered user ID
try {
    List<LdapUsers> result = apiInstance.ldapUsersSearchGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ldapUsersSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Registered user ID | [optional]

### Return type

[**List&lt;LdapUsers&gt;**](LdapUsers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="logsGet"></a>
# **logsGet**
> List&lt;AccessLog&gt; logsGet(username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize)

Get recent logs of the projects which the user is a member of

This endpoint let user see the recent operation logs of the projects which he is member of 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Username of the operator.
String repository = "repository_example"; // String | The name of repository
String tag = "tag_example"; // String | The name of tag
String operation = "operation_example"; // String | The operation
String beginTimestamp = "beginTimestamp_example"; // String | The begin timestamp
String endTimestamp = "endTimestamp_example"; // String | The end timestamp
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<AccessLog> result = apiInstance.logsGet(username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#logsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Username of the operator. | [optional]
 **repository** | **String**| The name of repository | [optional]
 **tag** | **String**| The name of tag | [optional]
 **operation** | **String**| The operation | [optional]
 **beginTimestamp** | **String**| The begin timestamp | [optional]
 **endTimestamp** | **String**| The end timestamp | [optional]
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;AccessLog&gt;**](AccessLog.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsGet"></a>
# **projectsGet**
> List&lt;Project&gt; projectsGet(name, _public, owner, page, pageSize)

List projects

This endpoint returns all projects created by Harbor, and can be filtered by project name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String name = "name_example"; // String | The name of project.
Boolean _public = true; // Boolean | The project is public or private.
String owner = "owner_example"; // String | The name of project owner.
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<Project> result = apiInstance.projectsGet(name, _public, owner, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of project. | [optional]
 **_public** | **Boolean**| The project is public or private. | [optional]
 **owner** | **String**| The name of project owner. | [optional]
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsHead"></a>
# **projectsHead**
> projectsHead(projectName)

Check if the project name user provided already exists.

This endpoint is used to check if the project name user provided already exist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String projectName = "projectName_example"; // String | Project name for checking exists.
try {
    apiInstance.projectsHead(projectName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsHead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | **String**| Project name for checking exists. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsPost"></a>
# **projectsPost**
> projectsPost(project)

Create a new project.

This endpoint is for user to create a new project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ProjectReq project = new ProjectReq(); // ProjectReq | New created project.
try {
    apiInstance.projectsPost(project);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**ProjectReq**](ProjectReq.md)| New created project. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdDelete"></a>
# **projectsProjectIdDelete**
> projectsProjectIdDelete(projectId)

Delete project by projectID

This endpoint is aimed to delete project by project ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Project ID of project which will be deleted.
try {
    apiInstance.projectsProjectIdDelete(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Project ID of project which will be deleted. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdGet"></a>
# **projectsProjectIdGet**
> Project projectsProjectIdGet(projectId)

Return specific project detail information

This endpoint returns specific project information by project ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Project ID for filtering results.
try {
    Project result = apiInstance.projectsProjectIdGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Project ID for filtering results. |

### Return type

[**Project**](Project.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdImmutabletagrulesGet"></a>
# **projectsProjectIdImmutabletagrulesGet**
> List&lt;ImmutableTagRule&gt; projectsProjectIdImmutabletagrulesGet(projectId)

List all immutable tag rules of current project

This endpoint returns the immutable tag rules of a project 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
try {
    List<ImmutableTagRule> result = apiInstance.projectsProjectIdImmutabletagrulesGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdImmutabletagrulesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |

### Return type

[**List&lt;ImmutableTagRule&gt;**](ImmutableTagRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdImmutabletagrulesIdDelete"></a>
# **projectsProjectIdImmutabletagrulesIdDelete**
> projectsProjectIdImmutabletagrulesIdDelete(projectId, id)

Delete the immutable tag rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long id = 789L; // Long | Immutable tag rule ID.
try {
    apiInstance.projectsProjectIdImmutabletagrulesIdDelete(projectId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdImmutabletagrulesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **id** | **Long**| Immutable tag rule ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdImmutabletagrulesIdPut"></a>
# **projectsProjectIdImmutabletagrulesIdPut**
> projectsProjectIdImmutabletagrulesIdPut(projectId, id, immutabletagrule)

Update the immutable tag rule or enable or disable the rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long id = 789L; // Long | Immutable tag rule ID.
ImmutableTagRule immutabletagrule = new ImmutableTagRule(); // ImmutableTagRule | 
try {
    apiInstance.projectsProjectIdImmutabletagrulesIdPut(projectId, id, immutabletagrule);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdImmutabletagrulesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **id** | **Long**| Immutable tag rule ID. |
 **immutabletagrule** | [**ImmutableTagRule**](ImmutableTagRule.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdImmutabletagrulesPost"></a>
# **projectsProjectIdImmutabletagrulesPost**
> projectsProjectIdImmutabletagrulesPost(projectId, immutabletagrule)

Add an immutable tag rule to current project

This endpoint add an immutable tag rule to the project 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
ImmutableTagRule immutabletagrule = new ImmutableTagRule(); // ImmutableTagRule | 
try {
    apiInstance.projectsProjectIdImmutabletagrulesPost(projectId, immutabletagrule);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdImmutabletagrulesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **immutabletagrule** | [**ImmutableTagRule**](ImmutableTagRule.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdLogsGet"></a>
# **projectsProjectIdLogsGet**
> List&lt;AccessLog&gt; projectsProjectIdLogsGet(projectId, username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize)

Get access logs accompany with a relevant project.

This endpoint let user search access logs filtered by operations and date time ranges. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID
String username = "username_example"; // String | Username of the operator.
String repository = "repository_example"; // String | The name of repository
String tag = "tag_example"; // String | The name of tag
String operation = "operation_example"; // String | The operation
String beginTimestamp = "beginTimestamp_example"; // String | The begin timestamp
String endTimestamp = "endTimestamp_example"; // String | The end timestamp
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<AccessLog> result = apiInstance.projectsProjectIdLogsGet(projectId, username, repository, tag, operation, beginTimestamp, endTimestamp, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdLogsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID |
 **username** | **String**| Username of the operator. | [optional]
 **repository** | **String**| The name of repository | [optional]
 **tag** | **String**| The name of tag | [optional]
 **operation** | **String**| The operation | [optional]
 **beginTimestamp** | **String**| The begin timestamp | [optional]
 **endTimestamp** | **String**| The end timestamp | [optional]
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;AccessLog&gt;**](AccessLog.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersGet"></a>
# **projectsProjectIdMembersGet**
> List&lt;ProjectMemberEntity&gt; projectsProjectIdMembersGet(projectId, entityname)

Get all project member information

Get all project member information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
String entityname = "entityname_example"; // String | The entity name to search.
try {
    List<ProjectMemberEntity> result = apiInstance.projectsProjectIdMembersGet(projectId, entityname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **entityname** | **String**| The entity name to search. | [optional]

### Return type

[**List&lt;ProjectMemberEntity&gt;**](ProjectMemberEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersMidDelete"></a>
# **projectsProjectIdMembersMidDelete**
> projectsProjectIdMembersMidDelete(projectId, mid)

Delete project member

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long mid = 789L; // Long | Member ID.
try {
    apiInstance.projectsProjectIdMembersMidDelete(projectId, mid);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersMidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **mid** | **Long**| Member ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersMidGet"></a>
# **projectsProjectIdMembersMidGet**
> ProjectMemberEntity projectsProjectIdMembersMidGet(projectId, mid)

Get the project member information

Get the project member information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long mid = 789L; // Long | The member ID
try {
    ProjectMemberEntity result = apiInstance.projectsProjectIdMembersMidGet(projectId, mid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersMidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **mid** | **Long**| The member ID |

### Return type

[**ProjectMemberEntity**](ProjectMemberEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersMidPut"></a>
# **projectsProjectIdMembersMidPut**
> projectsProjectIdMembersMidPut(projectId, mid, role)

Update project member

Update project member relationship

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long mid = 789L; // Long | Member ID.
RoleRequest role = new RoleRequest(); // RoleRequest | 
try {
    apiInstance.projectsProjectIdMembersMidPut(projectId, mid, role);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersMidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **mid** | **Long**| Member ID. |
 **role** | [**RoleRequest**](RoleRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMembersPost"></a>
# **projectsProjectIdMembersPost**
> projectsProjectIdMembersPost(projectId, projectMember)

Create project member

Create project member relationship, the member can be one of the user_member and group_member,  The user_member need to specify user_id or username. If the user already exist in harbor DB, specify the user_id,  If does not exist in harbor DB, it will SearchAndOnBoard the user. The group_member need to specify id or ldap_group_dn. If the group already exist in harbor DB. specify the user group&#39;s id,  If does not exist, it will SearchAndOnBoard the group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
ProjectMember projectMember = new ProjectMember(); // ProjectMember | 
try {
    apiInstance.projectsProjectIdMembersPost(projectId, projectMember);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMembersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **projectMember** | [**ProjectMember**](ProjectMember.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasGet"></a>
# **projectsProjectIdMetadatasGet**
> ProjectMetadata projectsProjectIdMetadatasGet(projectId)

Get project metadata.

This endpoint returns metadata of the project specified by project ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | The ID of project.
try {
    ProjectMetadata result = apiInstance.projectsProjectIdMetadatasGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of project. |

### Return type

[**ProjectMetadata**](ProjectMetadata.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasMetaNameDelete"></a>
# **projectsProjectIdMetadatasMetaNameDelete**
> projectsProjectIdMetadatasMetaNameDelete(projectId, metaName)

Delete metadata of a project

This endpoint is aimed to delete metadata of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | The ID of project.
String metaName = "metaName_example"; // String | The name of metadat.
try {
    apiInstance.projectsProjectIdMetadatasMetaNameDelete(projectId, metaName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasMetaNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of project. |
 **metaName** | **String**| The name of metadat. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasMetaNameGet"></a>
# **projectsProjectIdMetadatasMetaNameGet**
> ProjectMetadata projectsProjectIdMetadatasMetaNameGet(projectId, metaName)

Get project metadata

This endpoint returns specified metadata of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Project ID for filtering results.
String metaName = "metaName_example"; // String | The name of metadat.
try {
    ProjectMetadata result = apiInstance.projectsProjectIdMetadatasMetaNameGet(projectId, metaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasMetaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Project ID for filtering results. |
 **metaName** | **String**| The name of metadat. |

### Return type

[**ProjectMetadata**](ProjectMetadata.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasMetaNamePut"></a>
# **projectsProjectIdMetadatasMetaNamePut**
> projectsProjectIdMetadatasMetaNamePut(projectId, metaName)

Update metadata of a project.

This endpoint is aimed to update the metadata of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | The ID of project.
String metaName = "metaName_example"; // String | The name of metadat.
try {
    apiInstance.projectsProjectIdMetadatasMetaNamePut(projectId, metaName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasMetaNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of project. |
 **metaName** | **String**| The name of metadat. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdMetadatasPost"></a>
# **projectsProjectIdMetadatasPost**
> projectsProjectIdMetadatasPost(projectId, metadata)

Add metadata for the project.

This endpoint is aimed to add metadata of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Selected project ID.
ProjectMetadata metadata = new ProjectMetadata(); // ProjectMetadata | The metadata of project.
try {
    apiInstance.projectsProjectIdMetadatasPost(projectId, metadata);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdMetadatasPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Selected project ID. |
 **metadata** | [**ProjectMetadata**](ProjectMetadata.md)| The metadata of project. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdPut"></a>
# **projectsProjectIdPut**
> projectsProjectIdPut(projectId, project)

Update properties for a selected project.

This endpoint is aimed to update the properties of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Selected project ID.
ProjectReq project = new ProjectReq(); // ProjectReq | Updates of project.
try {
    apiInstance.projectsProjectIdPut(projectId, project);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Selected project ID. |
 **project** | [**ProjectReq**](ProjectReq.md)| Updates of project. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
try {
    List<RobotAccount> result = apiInstance.projectsProjectIdRobotsGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdRobotsGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
RobotAccountCreate robot = new RobotAccountCreate(); // RobotAccountCreate | Request body of creating a robot account.
try {
    RobotAccountPostRep result = apiInstance.projectsProjectIdRobotsPost(projectId, robot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdRobotsPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long robotId = 789L; // Long | The ID of robot account.
try {
    apiInstance.projectsProjectIdRobotsRobotIdDelete(projectId, robotId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdRobotsRobotIdDelete");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long robotId = 789L; // Long | The ID of robot account.
try {
    RobotAccount result = apiInstance.projectsProjectIdRobotsRobotIdGet(projectId, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdRobotsRobotIdGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long robotId = 789L; // Long | The ID of robot account.
RobotAccountUpdate robot = new RobotAccountUpdate(); // RobotAccountUpdate | Request body of enable/disable a robot account.
try {
    apiInstance.projectsProjectIdRobotsRobotIdPut(projectId, robotId, robot);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdRobotsRobotIdPut");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | The project identifier.
try {
    List<ScannerRegistration> result = apiInstance.projectsProjectIdScannerCandidatesGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdScannerCandidatesGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | The project identifier.
try {
    ScannerRegistration result = apiInstance.projectsProjectIdScannerGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdScannerGet");
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

<a name="projectsProjectIdSummaryGet"></a>
# **projectsProjectIdSummaryGet**
> ProjectSummary projectsProjectIdSummaryGet(projectId)

Get summary of the project.

Get summary of the project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID
try {
    ProjectSummary result = apiInstance.projectsProjectIdSummaryGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdSummaryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID |

### Return type

[**ProjectSummary**](ProjectSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookJobsGet"></a>
# **projectsProjectIdWebhookJobsGet**
> List&lt;WebhookJob&gt; projectsProjectIdWebhookJobsGet(projectId, policyId)

List project webhook jobs

This endpoint returns webhook jobs of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long policyId = 789L; // Long | The policy ID.
try {
    List<WebhookJob> result = apiInstance.projectsProjectIdWebhookJobsGet(projectId, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookJobsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **policyId** | **Long**| The policy ID. |

### Return type

[**List&lt;WebhookJob&gt;**](WebhookJob.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookLasttriggerGet"></a>
# **projectsProjectIdWebhookLasttriggerGet**
> List&lt;WebhookLastTrigger&gt; projectsProjectIdWebhookLasttriggerGet(projectId)

Get project webhook policy last trigger info

This endpoint returns last trigger information of project webhook policy. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
try {
    List<WebhookLastTrigger> result = apiInstance.projectsProjectIdWebhookLasttriggerGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookLasttriggerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |

### Return type

[**List&lt;WebhookLastTrigger&gt;**](WebhookLastTrigger.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookPoliciesGet"></a>
# **projectsProjectIdWebhookPoliciesGet**
> List&lt;WebhookPolicy&gt; projectsProjectIdWebhookPoliciesGet(projectId)

List project webhook policies.

This endpoint returns webhook policies of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
try {
    List<WebhookPolicy> result = apiInstance.projectsProjectIdWebhookPoliciesGet(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookPoliciesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |

### Return type

[**List&lt;WebhookPolicy&gt;**](WebhookPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookPoliciesPolicyIdDelete"></a>
# **projectsProjectIdWebhookPoliciesPolicyIdDelete**
> projectsProjectIdWebhookPoliciesPolicyIdDelete(projectId, policyId)

Delete webhook policy of a project

This endpoint is aimed to delete webhookpolicy of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long policyId = 789L; // Long | The id of webhook policy.
try {
    apiInstance.projectsProjectIdWebhookPoliciesPolicyIdDelete(projectId, policyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookPoliciesPolicyIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **policyId** | **Long**| The id of webhook policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookPoliciesPolicyIdGet"></a>
# **projectsProjectIdWebhookPoliciesPolicyIdGet**
> WebhookPolicy projectsProjectIdWebhookPoliciesPolicyIdGet(projectId, policyId)

Get project webhook policy

This endpoint returns specified webhook policy of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long policyId = 789L; // Long | The id of webhook policy.
try {
    WebhookPolicy result = apiInstance.projectsProjectIdWebhookPoliciesPolicyIdGet(projectId, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookPoliciesPolicyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **policyId** | **Long**| The id of webhook policy. |

### Return type

[**WebhookPolicy**](WebhookPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookPoliciesPolicyIdPut"></a>
# **projectsProjectIdWebhookPoliciesPolicyIdPut**
> projectsProjectIdWebhookPoliciesPolicyIdPut(projectId, policyId, policy)

Update webhook policy of a project.

This endpoint is aimed to update the webhook policy of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
Long policyId = 789L; // Long | The id of webhook policy.
WebhookPolicy policy = new WebhookPolicy(); // WebhookPolicy | All properties needed except \"id\", \"project_id\", \"creation_time\", \"update_time\".
try {
    apiInstance.projectsProjectIdWebhookPoliciesPolicyIdPut(projectId, policyId, policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookPoliciesPolicyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **policyId** | **Long**| The id of webhook policy. |
 **policy** | [**WebhookPolicy**](WebhookPolicy.md)| All properties needed except \&quot;id\&quot;, \&quot;project_id\&quot;, \&quot;creation_time\&quot;, \&quot;update_time\&quot;. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookPoliciesPost"></a>
# **projectsProjectIdWebhookPoliciesPost**
> projectsProjectIdWebhookPoliciesPost(projectId, policy)

Create project webhook policy.

This endpoint create a webhook policy if the project does not have one. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID
WebhookPolicy policy = new WebhookPolicy(); // WebhookPolicy | Properties \"targets\" and \"event_types\" needed.
try {
    apiInstance.projectsProjectIdWebhookPoliciesPost(projectId, policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookPoliciesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID |
 **policy** | [**WebhookPolicy**](WebhookPolicy.md)| Properties \&quot;targets\&quot; and \&quot;event_types\&quot; needed. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="projectsProjectIdWebhookPoliciesTestPost"></a>
# **projectsProjectIdWebhookPoliciesTestPost**
> projectsProjectIdWebhookPoliciesTestPost(projectId, policy)

Test project webhook connection

This endpoint tests webhook connection of a project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long projectId = 789L; // Long | Relevant project ID.
WebhookPolicy policy = new WebhookPolicy(); // WebhookPolicy | Only property \"targets\" needed.
try {
    apiInstance.projectsProjectIdWebhookPoliciesTestPost(projectId, policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#projectsProjectIdWebhookPoliciesTestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| Relevant project ID. |
 **policy** | [**WebhookPolicy**](WebhookPolicy.md)| Only property \&quot;targets\&quot; needed. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="quotasGet"></a>
# **quotasGet**
> List&lt;Quota&gt; quotasGet(reference, referenceId, sort, page, pageSize)

List quotas

List quotas

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String reference = "reference_example"; // String | The reference type of quota.
String referenceId = "referenceId_example"; // String | The reference id of quota.
String sort = "sort_example"; // String | Sort method, valid values include: 'hard.resource_name', '-hard.resource_name', 'used.resource_name', '-used.resource_name'. Here '-' stands for descending order, resource_name should be the real resource name of the quota. 
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<Quota> result = apiInstance.quotasGet(reference, referenceId, sort, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#quotasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**| The reference type of quota. | [optional]
 **referenceId** | **String**| The reference id of quota. | [optional]
 **sort** | **String**| Sort method, valid values include: &#39;hard.resource_name&#39;, &#39;-hard.resource_name&#39;, &#39;used.resource_name&#39;, &#39;-used.resource_name&#39;. Here &#39;-&#39; stands for descending order, resource_name should be the real resource name of the quota.  | [optional]
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;Quota&gt;**](Quota.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Quota ID
try {
    Quota result = apiInstance.quotasIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#quotasIdGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | Quota ID
QuotaUpdateReq hard = new QuotaUpdateReq(); // QuotaUpdateReq | The new hard limits for the quota
try {
    apiInstance.quotasIdPut(id, hard);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#quotasIdPut");
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

<a name="registriesGet"></a>
# **registriesGet**
> List&lt;Registry&gt; registriesGet(name)

List registries.

This endpoint let user list filtered registries by name, if name is nil, list returns all registries. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String name = "name_example"; // String | Registry's name.
try {
    List<Registry> result = apiInstance.registriesGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Registry&#39;s name. | [optional]

### Return type

[**List&lt;Registry&gt;**](Registry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesIdDelete"></a>
# **registriesIdDelete**
> registriesIdDelete(id)

Delete specific registry.

This endpoint is for to delete specific registry. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The registry's ID.
try {
    apiInstance.registriesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The registry&#39;s ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesIdGet"></a>
# **registriesIdGet**
> Registry registriesIdGet(id)

Get registry.

This endpoint is for get specific registry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The registry ID.
try {
    Registry result = apiInstance.registriesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The registry ID. |

### Return type

[**Registry**](Registry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesIdInfoGet"></a>
# **registriesIdInfoGet**
> RegistryInfo registriesIdInfoGet(id)

Get registry info.

Get the info of one specific registry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The registry ID.
try {
    RegistryInfo result = apiInstance.registriesIdInfoGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesIdInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The registry ID. |

### Return type

[**RegistryInfo**](RegistryInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesIdNamespaceGet"></a>
# **registriesIdNamespaceGet**
> List&lt;Namespace&gt; registriesIdNamespaceGet(id, name)

List namespaces of registry

This endpoint let user list namespaces of registry according to query. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer id = 56; // Integer | The registry ID.
String name = "name_example"; // String | The name of namespace.
try {
    List<Namespace> result = apiInstance.registriesIdNamespaceGet(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesIdNamespaceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The registry ID. |
 **name** | **String**| The name of namespace. | [optional]

### Return type

[**List&lt;Namespace&gt;**](Namespace.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesIdPut"></a>
# **registriesIdPut**
> registriesIdPut(id, repoTarget)

Update a given registry.

This endpoint is for update a given registry. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The registry's ID.
PutRegistry repoTarget = new PutRegistry(); // PutRegistry | Updates registry.
try {
    apiInstance.registriesIdPut(id, repoTarget);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The registry&#39;s ID. |
 **repoTarget** | [**PutRegistry**](PutRegistry.md)| Updates registry. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesPingPost"></a>
# **registriesPingPost**
> registriesPingPost(registry)

Ping status of a registry.

This endpoint checks status of a registry, the registry can be given by ID or URL (together with credential) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Registry registry = new Registry(); // Registry | Registry to ping.
try {
    apiInstance.registriesPingPost(registry);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesPingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry** | [**Registry**](Registry.md)| Registry to ping. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="registriesPost"></a>
# **registriesPost**
> registriesPost(registry)

Create a new registry.

This endpoint is for user to create a new registry. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Registry registry = new Registry(); // Registry | New created registry.
try {
    apiInstance.registriesPost(registry);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#registriesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry** | [**Registry**](Registry.md)| New created registry. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationAdaptersGet"></a>
# **replicationAdaptersGet**
> List&lt;String&gt; replicationAdaptersGet()

List supported adapters.

This endpoint let user list supported adapters. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<String> result = apiInstance.replicationAdaptersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationAdaptersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationExecutionsGet"></a>
# **replicationExecutionsGet**
> List&lt;ReplicationExecution&gt; replicationExecutionsGet(policyId, status, trigger, page, pageSize)

List replication executions.

This endpoint let user list replication executions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer policyId = 56; // Integer | The policy ID.
String status = "status_example"; // String | The execution status.
String trigger = "trigger_example"; // String | The trigger mode.
Integer page = 56; // Integer | The page.
Integer pageSize = 56; // Integer | The page size.
try {
    List<ReplicationExecution> result = apiInstance.replicationExecutionsGet(policyId, status, trigger, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationExecutionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Integer**| The policy ID. | [optional]
 **status** | **String**| The execution status. | [optional]
 **trigger** | **String**| The trigger mode. | [optional]
 **page** | **Integer**| The page. | [optional]
 **pageSize** | **Integer**| The page size. | [optional]

### Return type

[**List&lt;ReplicationExecution&gt;**](ReplicationExecution.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationExecutionsIdGet"></a>
# **replicationExecutionsIdGet**
> ReplicationExecution replicationExecutionsIdGet(id)

Get the execution of the replication.

This endpoint is for user to get one execution of the replication. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The execution ID.
try {
    ReplicationExecution result = apiInstance.replicationExecutionsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationExecutionsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The execution ID. |

### Return type

[**ReplicationExecution**](ReplicationExecution.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationExecutionsIdPut"></a>
# **replicationExecutionsIdPut**
> replicationExecutionsIdPut(id)

Stop the execution of the replication.

This endpoint is for user to stop one execution of the replication. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The execution ID.
try {
    apiInstance.replicationExecutionsIdPut(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationExecutionsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The execution ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationExecutionsIdTasksGet"></a>
# **replicationExecutionsIdTasksGet**
> List&lt;ReplicationTask&gt; replicationExecutionsIdTasksGet(id)

Get the task list of one execution.

This endpoint is for user to get the task list of one execution. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The execution ID.
try {
    List<ReplicationTask> result = apiInstance.replicationExecutionsIdTasksGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationExecutionsIdTasksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The execution ID. |

### Return type

[**List&lt;ReplicationTask&gt;**](ReplicationTask.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationExecutionsIdTasksTaskIdLogGet"></a>
# **replicationExecutionsIdTasksTaskIdLogGet**
> replicationExecutionsIdTasksTaskIdLogGet(id, taskId)

Get the log of one task.

This endpoint is for user to get the log of one task. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | The execution ID.
Long taskId = 789L; // Long | The task ID.
try {
    apiInstance.replicationExecutionsIdTasksTaskIdLogGet(id, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationExecutionsIdTasksTaskIdLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The execution ID. |
 **taskId** | **Long**| The task ID. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationExecutionsPost"></a>
# **replicationExecutionsPost**
> replicationExecutionsPost(execution)

Start one execution of the replication.

This endpoint is for user to start one execution of the replication. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ReplicationExecution execution = new ReplicationExecution(); // ReplicationExecution | The execution that needs to be started, only the property \"policy_id\" is needed.
try {
    apiInstance.replicationExecutionsPost(execution);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationExecutionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **execution** | [**ReplicationExecution**](ReplicationExecution.md)| The execution that needs to be started, only the property \&quot;policy_id\&quot; is needed. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationPoliciesGet"></a>
# **replicationPoliciesGet**
> List&lt;ReplicationPolicy&gt; replicationPoliciesGet(name, page, pageSize)

List replication policies

This endpoint let user list replication policies 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String name = "name_example"; // String | The replication policy name.
Integer page = 56; // Integer | The page nubmer.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<ReplicationPolicy> result = apiInstance.replicationPoliciesGet(name, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationPoliciesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The replication policy name. | [optional]
 **page** | **Integer**| The page nubmer. | [optional]
 **pageSize** | **Integer**| The size of per page. | [optional]

### Return type

[**List&lt;ReplicationPolicy&gt;**](ReplicationPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationPoliciesIdDelete"></a>
# **replicationPoliciesIdDelete**
> replicationPoliciesIdDelete(id)

Delete the replication policy specified by ID.

Delete the replication policy specified by ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Replication policy ID
try {
    apiInstance.replicationPoliciesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationPoliciesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Replication policy ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationPoliciesIdGet"></a>
# **replicationPoliciesIdGet**
> ReplicationPolicy replicationPoliciesIdGet(id)

Get replication policy.

This endpoint let user get replication policy by specific ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | policy ID
try {
    ReplicationPolicy result = apiInstance.replicationPoliciesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationPoliciesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| policy ID |

### Return type

[**ReplicationPolicy**](ReplicationPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationPoliciesIdPut"></a>
# **replicationPoliciesIdPut**
> replicationPoliciesIdPut(id, policy)

Update the replication policy

This endpoint let user update policy. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | policy ID
ReplicationPolicy policy = new ReplicationPolicy(); // ReplicationPolicy | The replication policy model.
try {
    apiInstance.replicationPoliciesIdPut(id, policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationPoliciesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| policy ID |
 **policy** | [**ReplicationPolicy**](ReplicationPolicy.md)| The replication policy model. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="replicationPoliciesPost"></a>
# **replicationPoliciesPost**
> replicationPoliciesPost(policy)

Create a replication policy

This endpoint let user create a replication policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ReplicationPolicy policy = new ReplicationPolicy(); // ReplicationPolicy | The policy model.
try {
    apiInstance.replicationPoliciesPost(policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#replicationPoliciesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy** | [**ReplicationPolicy**](ReplicationPolicy.md)| The policy model. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesGet"></a>
# **repositoriesGet**
> List&lt;Repository&gt; repositoriesGet(projectId, q, sort, labelId, page, pageSize)

Get repositories accompany with relevant project and repo name.

This endpoint lets user search repositories accompanying with relevant project ID and repo name. Repositories can be sorted by repo name, creation_time, update_time in either ascending or descending order. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer projectId = 56; // Integer | Relevant project ID.
String q = "q_example"; // String | Repo name for filtering results.
String sort = "sort_example"; // String | Sort method, valid values include: 'name', '-name', 'creation_time', '-creation_time', 'update_time', '-update_time'. Here '-' stands for descending order. 
Integer labelId = 56; // Integer | The ID of label used to filter the result.
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page, default is 10, maximum is 100.
try {
    List<Repository> result = apiInstance.repositoriesGet(projectId, q, sort, labelId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**| Relevant project ID. |
 **q** | **String**| Repo name for filtering results. | [optional]
 **sort** | **String**| Sort method, valid values include: &#39;name&#39;, &#39;-name&#39;, &#39;creation_time&#39;, &#39;-creation_time&#39;, &#39;update_time&#39;, &#39;-update_time&#39;. Here &#39;-&#39; stands for descending order.  | [optional]
 **labelId** | **Integer**| The ID of label used to filter the result. | [optional]
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page, default is 10, maximum is 100. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameDelete"></a>
# **repositoriesRepoNameDelete**
> repositoriesRepoNameDelete(repoName)

Delete a repository.

This endpoint let user delete a repository with name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository which will be deleted.
try {
    apiInstance.repositoriesRepoNameDelete(repoName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository which will be deleted. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameLabelsGet"></a>
# **repositoriesRepoNameLabelsGet**
> List&lt;Label&gt; repositoriesRepoNameLabelsGet(repoName)

Get labels of a repository.

Get labels of a repository specified by the repo_name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
try {
    List<Label> result = apiInstance.repositoriesRepoNameLabelsGet(repoName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameLabelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository. |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameLabelsLabelIdDelete"></a>
# **repositoriesRepoNameLabelsLabelIdDelete**
> repositoriesRepoNameLabelsLabelIdDelete(repoName, labelId)

Delete label from the repository.

Delete the label from the repository specified by the repo_name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
Integer labelId = 56; // Integer | The ID of label.
try {
    apiInstance.repositoriesRepoNameLabelsLabelIdDelete(repoName, labelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameLabelsLabelIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository. |
 **labelId** | **Integer**| The ID of label. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameLabelsPost"></a>
# **repositoriesRepoNameLabelsPost**
> repositoriesRepoNameLabelsPost(repoName, label)

Add a label to the repository.

Add a label to the repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
Label label = new Label(); // Label | Only the ID property is required.
try {
    apiInstance.repositoriesRepoNameLabelsPost(repoName, label);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameLabelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository. |
 **label** | [**Label**](Label.md)| Only the ID property is required. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNamePut"></a>
# **repositoriesRepoNamePut**
> repositoriesRepoNamePut(repoName, description)

Update description of the repository.

This endpoint is used to update description of the repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository which will be deleted.
RepositoryDescription description = new RepositoryDescription(); // RepositoryDescription | The description of the repository.
try {
    apiInstance.repositoriesRepoNamePut(repoName, description);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository which will be deleted. |
 **description** | [**RepositoryDescription**](RepositoryDescription.md)| The description of the repository. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameSignaturesGet"></a>
# **repositoriesRepoNameSignaturesGet**
> List&lt;RepoSignature&gt; repositoriesRepoNameSignaturesGet(repoName)

Get signature information of a repository

This endpoint aims to retrieve signature information of a repository, the data is from the nested notary instance of Harbor. If the repository does not have any signature information in notary, this API will return an empty list with response code 200, instead of 404 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | repository name.
try {
    List<RepoSignature> result = apiInstance.repositoriesRepoNameSignaturesGet(repoName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameSignaturesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| repository name. |

### Return type

[**List&lt;RepoSignature&gt;**](RepoSignature.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsGet"></a>
# **repositoriesRepoNameTagsGet**
> List&lt;DetailedTag&gt; repositoriesRepoNameTagsGet(repoName, labelId, detail)

Get tags of a relevant repository.

This endpoint aims to retrieve tags from a relevant repository. If deployed with Notary, the signature property of response represents whether the image is singed or not. If the property is null, the image is unsigned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Relevant repository name.
String labelId = "labelId_example"; // String | A label ID.
Boolean detail = true; // Boolean | Bool value indicating whether return detailed information of the tag, such as vulnerability scan info, if set to false, only tag name is returned.
try {
    List<DetailedTag> result = apiInstance.repositoriesRepoNameTagsGet(repoName, labelId, detail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Relevant repository name. |
 **labelId** | **String**| A label ID. | [optional]
 **detail** | **Boolean**| Bool value indicating whether return detailed information of the tag, such as vulnerability scan info, if set to false, only tag name is returned. | [optional]

### Return type

[**List&lt;DetailedTag&gt;**](DetailedTag.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsPost"></a>
# **repositoriesRepoNameTagsPost**
> repositoriesRepoNameTagsPost(repoName, request)

Retag an image

This endpoint tags an existing image with another tag in this repo, source images can be in different repos or projects. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Relevant repository name.
RetagReq request = new RetagReq(); // RetagReq | Request to give source image and target tag.
try {
    apiInstance.repositoriesRepoNameTagsPost(repoName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Relevant repository name. |
 **request** | [**RetagReq**](RetagReq.md)| Request to give source image and target tag. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagDelete"></a>
# **repositoriesRepoNameTagsTagDelete**
> repositoriesRepoNameTagsTagDelete(repoName, tag)

Delete a tag in a repository.

This endpoint let user delete tags with repo name and tag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository which will be deleted.
String tag = "tag_example"; // String | Tag of a repository.
try {
    apiInstance.repositoriesRepoNameTagsTagDelete(repoName, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository which will be deleted. |
 **tag** | **String**| Tag of a repository. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagGet"></a>
# **repositoriesRepoNameTagsTagGet**
> DetailedTag repositoriesRepoNameTagsTagGet(repoName, tag)

Get the tag of the repository.

This endpoint aims to retrieve the tag of the repository. If deployed with Notary, the signature property of response represents whether the image is singed or not. If the property is null, the image is unsigned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Relevant repository name.
String tag = "tag_example"; // String | Tag of the repository.
try {
    DetailedTag result = apiInstance.repositoriesRepoNameTagsTagGet(repoName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Relevant repository name. |
 **tag** | **String**| Tag of the repository. |

### Return type

[**DetailedTag**](DetailedTag.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagLabelsGet"></a>
# **repositoriesRepoNameTagsTagLabelsGet**
> List&lt;Label&gt; repositoriesRepoNameTagsTagLabelsGet(repoName, tag)

Get labels of an image.

Get labels of an image specified by the repo_name and tag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
String tag = "tag_example"; // String | The tag of the image.
try {
    List<Label> result = apiInstance.repositoriesRepoNameTagsTagLabelsGet(repoName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagLabelsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository. |
 **tag** | **String**| The tag of the image. |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagLabelsLabelIdDelete"></a>
# **repositoriesRepoNameTagsTagLabelsLabelIdDelete**
> repositoriesRepoNameTagsTagLabelsLabelIdDelete(repoName, tag, labelId)

Delete label from the image.

Delete the label from the image specified by the repo_name and tag. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
String tag = "tag_example"; // String | The tag of the image.
Integer labelId = 56; // Integer | The ID of label.
try {
    apiInstance.repositoriesRepoNameTagsTagLabelsLabelIdDelete(repoName, tag, labelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagLabelsLabelIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository. |
 **tag** | **String**| The tag of the image. |
 **labelId** | **Integer**| The ID of label. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagLabelsPost"></a>
# **repositoriesRepoNameTagsTagLabelsPost**
> repositoriesRepoNameTagsTagLabelsPost(repoName, tag, label)

Add a label to image.

Add a label to the image. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | The name of repository.
String tag = "tag_example"; // String | The tag of the image.
Label label = new Label(); // Label | Only the ID property is required.
try {
    apiInstance.repositoriesRepoNameTagsTagLabelsPost(repoName, tag, label);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagLabelsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| The name of repository. |
 **tag** | **String**| The tag of the image. |
 **label** | [**Label**](Label.md)| Only the ID property is required. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="repositoriesRepoNameTagsTagManifestGet"></a>
# **repositoriesRepoNameTagsTagManifestGet**
> Manifest repositoriesRepoNameTagsTagManifestGet(repoName, tag, version)

Get manifests of a relevant repository.

This endpoint aims to retreive manifests from a relevant repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
String version = "version_example"; // String | The version of manifest, valid value are \"v1\" and \"v2\", default is \"v2\"
try {
    Manifest result = apiInstance.repositoriesRepoNameTagsTagManifestGet(repoName, tag, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagManifestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoName** | **String**| Repository name |
 **tag** | **String**| Tag name |
 **version** | **String**| The version of manifest, valid value are \&quot;v1\&quot; and \&quot;v2\&quot;, default is \&quot;v2\&quot; | [optional]

### Return type

[**Manifest**](Manifest.md)

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
try {
    apiInstance.repositoriesRepoNameTagsTagScanPost(repoName, tag);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagScanPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String repoName = "repoName_example"; // String | Repository name
String tag = "tag_example"; // String | Tag name
String uuid = "uuid_example"; // String | the scan unique identifier
try {
    String result = apiInstance.repositoriesRepoNameTagsTagScanUuidLogGet(repoName, tag, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesRepoNameTagsTagScanUuidLogGet");
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

<a name="repositoriesTopGet"></a>
# **repositoriesTopGet**
> List&lt;Repository&gt; repositoriesTopGet(count)

Get public repositories which are accessed most.

This endpoint aims to let users see the most popular public repositories 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer count = 56; // Integer | The number of the requested public repositories, default is 10 if not provided.
try {
    List<Repository> result = apiInstance.repositoriesTopGet(count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#repositoriesTopGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of the requested public repositories, default is 10 if not provided. | [optional]

### Return type

[**List&lt;Repository&gt;**](Repository.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
Long eid = 789L; // Long | Retention execution ID.
Action1 action = new Action1(); // Action1 | The action, only support \"stop\" now.
try {
    apiInstance.retentionsIdExecutionsEidPatch(id, eid, action);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdExecutionsEidPatch");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
Long eid = 789L; // Long | Retention execution ID.
try {
    List<RetentionExecutionTask> result = apiInstance.retentionsIdExecutionsEidTasksGet(id, eid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdExecutionsEidTasksGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
Long eid = 789L; // Long | Retention execution ID.
Long tid = 789L; // Long | Retention execution ID.
try {
    String result = apiInstance.retentionsIdExecutionsEidTasksTidGet(id, eid, tid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdExecutionsEidTasksTidGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
try {
    List<RetentionExecution> result = apiInstance.retentionsIdExecutionsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdExecutionsGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
Action action = new Action(); // Action | 
try {
    apiInstance.retentionsIdExecutionsPost(id, action);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdExecutionsPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
try {
    RetentionPolicy result = apiInstance.retentionsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdGet");
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

<a name="retentionsIdPut"></a>
# **retentionsIdPut**
> retentionsIdPut(id, policy)

Update Retention Policy

Update Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when retention policy has already binded to project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Retention ID.
RetentionPolicy policy = new RetentionPolicy(); // RetentionPolicy | 
try {
    apiInstance.retentionsIdPut(id, policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Retention ID. |
 **policy** | [**RetentionPolicy**](RetentionPolicy.md)|  |

### Return type

null (empty response body)

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    RetentionMetadata result = apiInstance.retentionsMetadatasGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsMetadatasGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
RetentionPolicy policy = new RetentionPolicy(); // RetentionPolicy | Create Retention Policy successfully.
try {
    apiInstance.retentionsPost(policy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retentionsPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<ScannerRegistration> result = apiInstance.scannersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#scannersGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
ScannerRegistrationSettings settings = new ScannerRegistrationSettings(); // ScannerRegistrationSettings | A scanner registration settings to be tested.
try {
    apiInstance.scannersPingPost(settings);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#scannersPingPost");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifer.
try {
    ScannerRegistration result = apiInstance.scannersRegistrationIdGet(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#scannersRegistrationIdGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String registrationId = "registrationId_example"; // String | The scanner registration identifier.
try {
    ScannerAdapterMetadata result = apiInstance.scannersRegistrationIdMetadataGet(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#scannersRegistrationIdMetadataGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    Stats result = apiInstance.scansAllMetricsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#scansAllMetricsGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    Stats result = apiInstance.scansScheduleMetricsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#scansScheduleMetricsGet");
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

<a name="searchGet"></a>
# **searchGet**
> List&lt;Search&gt; searchGet(q)

Search for projects, repositories and helm charts

The Search endpoint returns information about the projects ,repositories  and helm charts offered at public status or related to the current logged in user. The response includes the project, repository list and charts in a proper display order. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String q = "q_example"; // String | Search parameter for project and repository name.
try {
    List<Search> result = apiInstance.searchGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#searchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Search parameter for project and repository name. |

### Return type

[**List&lt;Search&gt;**](Search.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="statisticsGet"></a>
# **statisticsGet**
> StatisticMap statisticsGet()

Get projects number and repositories number relevant to the user

This endpoint is aimed to statistic all of the projects number and repositories number relevant to the logined user, also the public projects number and repositories number. If the user is admin, he can also get total projects number and total repositories number. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    StatisticMap result = apiInstance.statisticsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#statisticsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatisticMap**](StatisticMap.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    CVEWhitelist result = apiInstance.systemCVEWhitelistGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemCVEWhitelistGet");
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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
CVEWhitelist whitelist = new CVEWhitelist(); // CVEWhitelist | The whitelist with new content
try {
    apiInstance.systemCVEWhitelistPut(whitelist);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemCVEWhitelistPut");
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

<a name="systemGcGet"></a>
# **systemGcGet**
> List&lt;GCResult&gt; systemGcGet()

Get gc results.

This endpoint let user get latest ten gc results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<GCResult> result = apiInstance.systemGcGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GCResult&gt;**](GCResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemGcIdGet"></a>
# **systemGcIdGet**
> GCResult systemGcIdGet(id)

Get gc status.

This endpoint let user get gc status filtered by specific ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Relevant job ID
try {
    GCResult result = apiInstance.systemGcIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Relevant job ID |

### Return type

[**GCResult**](GCResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemGcIdLogGet"></a>
# **systemGcIdLogGet**
> String systemGcIdLogGet(id)

Get gc job log.

This endpoint let user get gc job logs filtered by specific ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | Relevant job ID
try {
    String result = apiInstance.systemGcIdLogGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcIdLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Relevant job ID |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemGcScheduleGet"></a>
# **systemGcScheduleGet**
> AdminJobSchedule systemGcScheduleGet()

Get gc&#39;s schedule.

This endpoint is for get schedule of gc job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    AdminJobSchedule result = apiInstance.systemGcScheduleGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcScheduleGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdminJobSchedule**](AdminJobSchedule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemGcSchedulePost"></a>
# **systemGcSchedulePost**
> systemGcSchedulePost(schedule)

Create a gc schedule.

This endpoint is for update gc schedule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
AdminJobSchedule schedule = new AdminJobSchedule(); // AdminJobSchedule | Updates of gc's schedule.
try {
    apiInstance.systemGcSchedulePost(schedule);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcSchedulePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | [**AdminJobSchedule**](AdminJobSchedule.md)| Updates of gc&#39;s schedule. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemGcSchedulePut"></a>
# **systemGcSchedulePut**
> systemGcSchedulePut(schedule)

Update gc&#39;s schedule.

This endpoint is for update gc schedule. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
AdminJobSchedule schedule = new AdminJobSchedule(); // AdminJobSchedule | Updates of gc's schedule.
try {
    apiInstance.systemGcSchedulePut(schedule);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemGcSchedulePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | [**AdminJobSchedule**](AdminJobSchedule.md)| Updates of gc&#39;s schedule. |

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
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Endpoint endpoint = new Endpoint(); // Endpoint | Request body for OIDC endpoint to be tested.
try {
    apiInstance.systemOidcPingPost(endpoint);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemOidcPingPost");
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

<a name="systemScanAllScheduleGet"></a>
# **systemScanAllScheduleGet**
> AdminJobSchedule systemScanAllScheduleGet()

Get scan_all&#39;s schedule.

This endpoint is for getting a schedule for the scan all job, which scans all of images in Harbor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    AdminJobSchedule result = apiInstance.systemScanAllScheduleGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemScanAllScheduleGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdminJobSchedule**](AdminJobSchedule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemScanAllSchedulePost"></a>
# **systemScanAllSchedulePost**
> systemScanAllSchedulePost(schedule)

Create a schedule or a manual trigger for the scan all job.

This endpoint is for creating a schedule or a manual trigger for the scan all job, which scans all of images in Harbor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
AdminJobSchedule schedule = new AdminJobSchedule(); // AdminJobSchedule | Create a schedule or a manual trigger for the scan all job.
try {
    apiInstance.systemScanAllSchedulePost(schedule);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemScanAllSchedulePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | [**AdminJobSchedule**](AdminJobSchedule.md)| Create a schedule or a manual trigger for the scan all job. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systemScanAllSchedulePut"></a>
# **systemScanAllSchedulePut**
> systemScanAllSchedulePut(schedule)

Update scan all&#39;s schedule.

This endpoint is for updating the schedule of scan all job, which scans all of images in Harbor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
AdminJobSchedule schedule = new AdminJobSchedule(); // AdminJobSchedule | Updates the schedule of scan all job, which scans all of images in Harbor.
try {
    apiInstance.systemScanAllSchedulePut(schedule);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systemScanAllSchedulePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | [**AdminJobSchedule**](AdminJobSchedule.md)| Updates the schedule of scan all job, which scans all of images in Harbor. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systeminfoGet"></a>
# **systeminfoGet**
> GeneralInfo systeminfoGet()

Get general system info

This API is for retrieving general system info, this can be called by anonymous request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    GeneralInfo result = apiInstance.systeminfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systeminfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GeneralInfo**](GeneralInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systeminfoGetcertGet"></a>
# **systeminfoGetcertGet**
> systeminfoGetcertGet()

Get default root certificate.

This endpoint is for downloading a default root certificate. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    apiInstance.systeminfoGetcertGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systeminfoGetcertGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="systeminfoVolumesGet"></a>
# **systeminfoVolumesGet**
> SystemInfo systeminfoVolumesGet()

Get system volume info (total/free size).

This endpoint is for retrieving system volume info that only provides for admin user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    SystemInfo result = apiInstance.systeminfoVolumesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#systeminfoVolumesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemInfo**](SystemInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usergroupsGet"></a>
# **usergroupsGet**
> List&lt;UserGroup&gt; usergroupsGet()

Get all user groups information

Get all user groups information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    List<UserGroup> result = apiInstance.usergroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usergroupsGroupIdDelete"></a>
# **usergroupsGroupIdDelete**
> usergroupsGroupIdDelete(groupId)

Delete user group

Delete user group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer groupId = 56; // Integer | 
try {
    apiInstance.usergroupsGroupIdDelete(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGroupIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usergroupsGroupIdGet"></a>
# **usergroupsGroupIdGet**
> UserGroup usergroupsGroupIdGet(groupId)

Get user group information

Get user group information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long groupId = 789L; // Long | Group ID
try {
    UserGroup result = apiInstance.usergroupsGroupIdGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usergroupsGroupIdPut"></a>
# **usergroupsGroupIdPut**
> usergroupsGroupIdPut(groupId, usergroup)

Update group information

Update user group information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Long groupId = 789L; // Long | Group ID
UserGroup usergroup = new UserGroup(); // UserGroup | 
try {
    apiInstance.usergroupsGroupIdPut(groupId, usergroup);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsGroupIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID |
 **usergroup** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usergroupsPost"></a>
# **usergroupsPost**
> usergroupsPost(usergroup)

Create user group

Create user group information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
UserGroup usergroup = new UserGroup(); // UserGroup | 
try {
    apiInstance.usergroupsPost(usergroup);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usergroupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroup** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersCurrentGet"></a>
# **usersCurrentGet**
> User usersCurrentGet()

Get current user info.

This endpoint is to get the current user information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
try {
    User result = apiInstance.usersCurrentGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersCurrentGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersCurrentPermissionsGet"></a>
# **usersCurrentPermissionsGet**
> List&lt;Permission&gt; usersCurrentPermissionsGet(scope, relative)

Get current user permissions.

This endpoint is to get the current user permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String scope = "scope_example"; // String | Get permissions of the scope
Boolean relative = true; // Boolean | If true, the resources in the response are relative to the scope, eg for resource '/project/1/repository' if relative is 'true' then the resource in response will be 'repository'. 
try {
    List<Permission> result = apiInstance.usersCurrentPermissionsGet(scope, relative);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersCurrentPermissionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Get permissions of the scope | [optional]
 **relative** | **Boolean**| If true, the resources in the response are relative to the scope, eg for resource &#39;/project/1/repository&#39; if relative is &#39;true&#39; then the resource in response will be &#39;repository&#39;.  | [optional]

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersGet"></a>
# **usersGet**
> List&lt;User&gt; usersGet(username, email, page, pageSize)

Get registered users of Harbor.

This endpoint is for user to search registered users, support for filtering results with username.Notice, by now this operation is only for administrator. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Username for filtering results.
String email = "email_example"; // String | Email for filtering results.
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<User> result = apiInstance.usersGet(username, email, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Username for filtering results. | [optional]
 **email** | **String**| Email for filtering results. | [optional]
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page. | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersPost"></a>
# **usersPost**
> usersPost(user)

Creates a new user account.

This endpoint is to create a user if the user does not already exist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
User user = new User(); // User | New created user.
try {
    apiInstance.usersPost(user);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| New created user. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersSearchGet"></a>
# **usersSearchGet**
> List&lt;UserSearch&gt; usersSearchGet(username, page, pageSize)

Search users by username

This endpoint is to search the users by username. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
String username = "username_example"; // String | Username for filtering results.
Integer page = 56; // Integer | The page number, default is 1.
Integer pageSize = 56; // Integer | The size of per page.
try {
    List<UserSearch> result = apiInstance.usersSearchGet(username, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Username for filtering results. |
 **page** | **Integer**| The page number, default is 1. | [optional]
 **pageSize** | **Integer**| The size of per page. | [optional]

### Return type

[**List&lt;UserSearch&gt;**](UserSearch.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersUserIdCliSecretPut"></a>
# **usersUserIdCliSecretPut**
> usersUserIdCliSecretPut(userId, inputSecret)

Set CLI secret for a user.

This endpoint let user generate a new CLI secret for himself.  This API only works when auth mode is set to &#39;OIDC&#39;. Once this API returns with successful status, the old secret will be invalid, as there will be only one CLI secret for a user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | User ID
InputSecret inputSecret = new InputSecret(); // InputSecret | JSON object that includes the new secret
try {
    apiInstance.usersUserIdCliSecretPut(userId, inputSecret);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdCliSecretPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| User ID |
 **inputSecret** | [**InputSecret**](InputSecret.md)| JSON object that includes the new secret |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersUserIdDelete"></a>
# **usersUserIdDelete**
> usersUserIdDelete(userId)

Mark a registered user as be removed.

This endpoint let administrator of Harbor mark a registered user as be removed.It actually won&#39;t be deleted from DB. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | User ID for marking as to be removed.
try {
    apiInstance.usersUserIdDelete(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| User ID for marking as to be removed. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersUserIdGet"></a>
# **usersUserIdGet**
> User usersUserIdGet(userId)

Get a user&#39;s profile.

Get user&#39;s profile with user id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | Registered user ID
try {
    User result = apiInstance.usersUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| Registered user ID |

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersUserIdPasswordPut"></a>
# **usersUserIdPasswordPut**
> usersUserIdPasswordPut(userId, password)

Change the password on a user that already exists.

This endpoint is for user to update password. Users with the admin role can change any user&#39;s password. Guest users can change only their own password. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | Registered user ID.
Password password = new Password(); // Password | Password to be updated, the attribute 'old_password' is optional when the API is called by the system administrator.
try {
    apiInstance.usersUserIdPasswordPut(userId, password);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdPasswordPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| Registered user ID. |
 **password** | [**Password**](Password.md)| Password to be updated, the attribute &#39;old_password&#39; is optional when the API is called by the system administrator. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersUserIdPut"></a>
# **usersUserIdPut**
> usersUserIdPut(userId, profile)

Update a registered user to change his profile.

This endpoint let a registered user change his profile. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | Registered user ID
UserProfile profile = new UserProfile(); // UserProfile | Only email, realname and comment can be modified.
try {
    apiInstance.usersUserIdPut(userId, profile);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| Registered user ID |
 **profile** | [**UserProfile**](UserProfile.md)| Only email, realname and comment can be modified. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="usersUserIdSysadminPut"></a>
# **usersUserIdSysadminPut**
> usersUserIdSysadminPut(userId, hasAdminRole)

Update a registered user to change to be an administrator of Harbor.

This endpoint let a registered user change to be an administrator of Harbor. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProductsApi apiInstance = new ProductsApi();
Integer userId = 56; // Integer | Registered user ID
HasAdminRole hasAdminRole = new HasAdminRole(); // HasAdminRole | Toggle a user to admin or not.
try {
    apiInstance.usersUserIdSysadminPut(userId, hasAdminRole);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#usersUserIdSysadminPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| Registered user ID |
 **hasAdminRole** | [**HasAdminRole**](HasAdminRole.md)| Toggle a user to admin or not. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

