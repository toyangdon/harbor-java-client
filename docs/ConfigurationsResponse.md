
# ConfigurationsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMode** | [**StringConfigItem**](StringConfigItem.md) | The auth mode of current system, such as \&quot;db_auth\&quot;, \&quot;ldap_auth\&quot; |  [optional]
**countPerProject** | [**IntegerConfigItem**](IntegerConfigItem.md) | The default count quota for the new created projects. |  [optional]
**emailFrom** | [**StringConfigItem**](StringConfigItem.md) | The sender name for Email notification. |  [optional]
**emailHost** | [**StringConfigItem**](StringConfigItem.md) | The hostname of SMTP server that sends Email notification. |  [optional]
**emailPort** | [**IntegerConfigItem**](IntegerConfigItem.md) | The port of SMTP server. |  [optional]
**emailIdentity** | [**StringConfigItem**](StringConfigItem.md) | By default it&#39;s empty so the email_username is picked. |  [optional]
**emailUsername** | [**StringConfigItem**](StringConfigItem.md) | The username for authenticate against SMTP server. |  [optional]
**emailSsl** | [**BoolConfigItem**](BoolConfigItem.md) | When it&#39;s set to true the system will access Email server via TLS by default.  If it&#39;s set to false, it still will handle \&quot;STARTTLS\&quot; from server side. |  [optional]
**emailInsecure** | [**BoolConfigItem**](BoolConfigItem.md) | Whether or not the certificate will be verified when Harbor tries to access the email server. |  [optional]
**ldapUrl** | [**StringConfigItem**](StringConfigItem.md) | The URL of LDAP server. |  [optional]
**ldapBaseDn** | [**StringConfigItem**](StringConfigItem.md) | The Base DN for LDAP binding. |  [optional]
**ldapFilter** | [**StringConfigItem**](StringConfigItem.md) | The filter for LDAP binding. |  [optional]
**ldapScope** | **Integer** | 0-LDAP_SCOPE_BASE, 1-LDAP_SCOPE_ONELEVEL, 2-LDAP_SCOPE_SUBTREE |  [optional]
**ldapUid** | [**StringConfigItem**](StringConfigItem.md) | The attribute which is used as identity for the LDAP binding, such as \&quot;CN\&quot; or \&quot;SAMAccountname\&quot; |  [optional]
**ldapSearchDn** | **String** | The DN of the user to do the search. |  [optional]
**ldapTimeout** | [**IntegerConfigItem**](IntegerConfigItem.md) | timeout in seconds for connection to LDAP server. |  [optional]
**ldapGroupAttributeName** | [**StringConfigItem**](StringConfigItem.md) | The attribute which is used as identity of the LDAP group, default is cn. |  [optional]
**ldapGroupBaseDn** | [**StringConfigItem**](StringConfigItem.md) | The base DN to search LDAP group. |  [optional]
**ldapGroupSearchFilter** | [**StringConfigItem**](StringConfigItem.md) | The filter to search the ldap group. |  [optional]
**ldapGroupSearchScope** | [**IntegerConfigItem**](IntegerConfigItem.md) | The scope to search ldap. &#39;0-LDAP_SCOPE_BASE, 1-LDAP_SCOPE_ONELEVEL, 2-LDAP_SCOPE_SUBTREE&#39; |  [optional]
**ldapGroupAdminDn** | [**StringConfigItem**](StringConfigItem.md) | Specify the ldap group which have the same privilege with Harbor admin. |  [optional]
**oidcClientId** | [**StringConfigItem**](StringConfigItem.md) | The client id of the OIDC. |  [optional]
**oidcEndpoint** | [**StringConfigItem**](StringConfigItem.md) | The URL of an OIDC-complaint server, must start with &#39;https://&#39;. |  [optional]
**oidcName** | [**StringConfigItem**](StringConfigItem.md) | The name of the OIDC provider. |  [optional]
**oidcScope** | [**StringConfigItem**](StringConfigItem.md) | The scope sent to OIDC server during authentication, should be separated by comma. It has to contain “openid”, and “offline_access”. If you are using google, please remove “offline_access” from this field. |  [optional]
**oidcVerifyCert** | [**BoolConfigItem**](BoolConfigItem.md) | Whether verify your OIDC server certificate, disable it if your OIDC server is hosted via self-hosted certificate. |  [optional]
**projectCreationRestriction** | [**StringConfigItem**](StringConfigItem.md) | This attribute restricts what users have the permission to create project.  It can be \&quot;everyone\&quot; or \&quot;adminonly\&quot;. |  [optional]
**quotaPerProjectEnable** | [**BoolConfigItem**](BoolConfigItem.md) | This attribute indicates whether quota per project enabled in harbor |  [optional]
**readOnly** | [**BoolConfigItem**](BoolConfigItem.md) | &#39;docker push&#39; is prohibited by Harbor if you set it to true.    |  [optional]
**selfRegistration** | [**BoolConfigItem**](BoolConfigItem.md) | Whether the Harbor instance supports self-registration.  If it&#39;s set to false, admin need to add user to the instance. |  [optional]
**storagePerProject** | [**IntegerConfigItem**](IntegerConfigItem.md) | The default storage quota for the new created projects. |  [optional]
**tokenExpiration** | [**IntegerConfigItem**](IntegerConfigItem.md) | The expiration time of the token for internal Registry, in minutes. |  [optional]
**verifyRemoteCert** | [**BoolConfigItem**](BoolConfigItem.md) | Whether or not the certificate will be verified when Harbor tries to access a remote Harbor instance for replication. |  [optional]
**scanAllPolicy** | [**ConfigurationsScanAllPolicy**](ConfigurationsScanAllPolicy.md) |  |  [optional]



