
# ReplicationPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The policy ID. |  [optional]
**name** | **String** | The policy name. |  [optional]
**description** | **String** | The description of the policy. |  [optional]
**srcRegistry** | [**Registry**](Registry.md) | The source registry. |  [optional]
**destRegistry** | [**Registry**](Registry.md) | The destination registry. |  [optional]
**destNamespace** | **String** | The destination namespace. |  [optional]
**trigger** | [**ReplicationTrigger**](ReplicationTrigger.md) |  |  [optional]
**filters** | [**List&lt;ReplicationFilter&gt;**](ReplicationFilter.md) | The replication policy filter array. |  [optional]
**deletion** | **Boolean** | Whether to replicate the deletion operation. |  [optional]
**override** | **Boolean** | Whether to override the resources on the destination registry. |  [optional]
**enabled** | **Boolean** | Whether the policy is enabled or not. |  [optional]
**creationTime** | **String** | The create time of the policy. |  [optional]
**updateTime** | **String** | The update time of the policy. |  [optional]



