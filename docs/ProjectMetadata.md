
# ProjectMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_public** | **String** | The public status of the project. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**enableContentTrust** | **String** | Whether content trust is enabled or not. If it is enabled, user can&#39;t pull unsigned images from this project. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**preventVul** | **String** | Whether prevent the vulnerable images from running. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**severity** | **String** | If the vulnerability is high than severity defined here, the images can&#39;t be pulled. The valid values are \&quot;none\&quot;, \&quot;low\&quot;, \&quot;medium\&quot;, \&quot;high\&quot;, \&quot;critical\&quot;. |  [optional]
**autoScan** | **String** | Whether scan images automatically when pushing. The valid values are \&quot;true\&quot;, \&quot;false\&quot;. |  [optional]
**reuseSysCveWhitelist** | **String** | Whether this project reuse the system level CVE whitelist as the whitelist of its own.  The valid values are \&quot;true\&quot;, \&quot;false\&quot;. If it is set to \&quot;true\&quot; the actual whitelist associate with this project, if any, will be ignored. |  [optional]



