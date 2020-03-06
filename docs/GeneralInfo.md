
# GeneralInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withNotary** | **Boolean** | If the Harbor instance is deployed with nested notary. |  [optional]
**withClair** | **Boolean** | If the Harbor instance is deployed with nested clair. |  [optional]
**withAdmiral** | **Boolean** | If the Harbor instance is deployed with Admiral. |  [optional]
**admiralEndpoint** | **String** | The url of the endpoint of admiral instance. |  [optional]
**registryUrl** | **String** | The url of registry against which the docker command should be issued. |  [optional]
**externalUrl** | **String** | The external URL of Harbor, with protocol. |  [optional]
**authMode** | **String** | The auth mode of current Harbor instance. |  [optional]
**projectCreationRestriction** | **String** | Indicate who can create projects, it could be &#39;adminonly&#39; or &#39;everyone&#39;. |  [optional]
**selfRegistration** | **Boolean** | Indicate whether the Harbor instance enable user to register himself. |  [optional]
**hasCaRoot** | **Boolean** | Indicate whether there is a ca root cert file ready for download in the file system. |  [optional]
**harborVersion** | **String** | The build version of Harbor. |  [optional]
**nextScanAll** | **Integer** | The UTC time in milliseconds, after which user can call scanAll API to scan all images. |  [optional]
**clairVulnerabilityStatus** | [**GeneralInfoClairVulnerabilityStatus**](GeneralInfoClairVulnerabilityStatus.md) |  |  [optional]



