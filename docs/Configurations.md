
# Configurations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMode** | **String** | The auth mode of current system, such as \&quot;db_auth\&quot;, \&quot;ldap_auth\&quot; |  [optional]
**countPerProject** | **String** | The default count quota for the new created projects. |  [optional]
**emailFrom** | **String** | The sender name for Email notification. |  [optional]
**emailHost** | **String** | The hostname of SMTP server that sends Email notification. |  [optional]
**emailPort** | **Integer** | The port of SMTP server. |  [optional]
**emailIdentity** | **String** | By default it&#39;s empty so the email_username is picked. |  [optional]
**emailUsername** | **String** | The username for authenticate against SMTP server. |  [optional]
**emailSsl** | **Boolean** | When it&#39;s set to true the system will access Email server via TLS by default.  If it&#39;s set to false, it still will handle \&quot;STARTTLS\&quot; from server side. |  [optional]
**emailInsecure** | **Boolean** | Whether or not the certificate will be verified when Harbor tries to access the email server. |  [optional]
**ldapUrl** | **String** | The URL of LDAP server. |  [optional]
**ldapBaseDn** | **String** | The Base DN for LDAP binding. |  [optional]
**ldapFilter** | **String** | The filter for LDAP binding. |  [optional]
**ldapScope** | **Integer** | 0-LDAP_SCOPE_BASE, 1-LDAP_SCOPE_ONELEVEL, 2-LDAP_SCOPE_SUBTREE |  [optional]
**ldapUid** | **String** | The attribute which is used as identity for the LDAP binding, such as \&quot;CN\&quot; or \&quot;SAMAccountname\&quot; |  [optional]
**ldapSearchDn** | **String** | The DN of the user to do the search. |  [optional]
**ldapTimeout** | **Integer** | timeout in seconds for connection to LDAP server. |  [optional]
**ldapGroupAttributeName** | **String** | The attribute which is used as identity of the LDAP group, default is cn. |  [optional]
**ldapGroupBaseDn** | **String** | The base DN to search LDAP group. |  [optional]
**ldapGroupSearchFilter** | **String** | The filter to search the ldap group. |  [optional]
**ldapGroupSearchScope** | **Integer** | The scope to search ldap. &#39;0-LDAP_SCOPE_BASE, 1-LDAP_SCOPE_ONELEVEL, 2-LDAP_SCOPE_SUBTREE&#39; |  [optional]
**ldapGroupAdminDn** | **String** | Specify the ldap group which have the same privilege with Harbor admin. |  [optional]
**oidcClientId** | **String** | The client id of the OIDC. |  [optional]
**oidcClientSecret** | **String** | The client secret of the OIDC. |  [optional]
**oidcEndpoint** | **String** | The URL of an OIDC-complaint server, must start with &#39;https://&#39;. |  [optional]
**oidcName** | **String** | The name of the OIDC provider. |  [optional]
**oidcScope** | **String** | The scope sent to OIDC server during authentication, should be separated by comma. It has to contain “openid”, and “offline_access”. If you are using google, please remove “offline_access” from this field. |  [optional]
**oidcVerifyCert** | **Boolean** | Whether verify your OIDC server certificate, disable it if your OIDC server is hosted via self-hosted certificate. |  [optional]
**projectCreationRestriction** | **String** | This attribute restricts what users have the permission to create project.  It can be \&quot;everyone\&quot; or \&quot;adminonly\&quot;. |  [optional]
**quotaPerProjectEnable** | **Boolean** | This attribute indicates whether quota per project enabled in harbor |  [optional]
**readOnly** | **Boolean** | &#39;docker push&#39; is prohibited by Harbor if you set it to true.    |  [optional]
**selfRegistration** | **Boolean** | Whether the Harbor instance supports self-registration.  If it&#39;s set to false, admin need to add user to the instance. |  [optional]
**storagePerProject** | **String** | The default storage quota for the new created projects. |  [optional]
**tokenExpiration** | **Integer** | The expiration time of the token for internal Registry, in minutes. |  [optional]
**verifyRemoteCert** | **Boolean** | Whether or not the certificate will be verified when Harbor tries to access a remote Harbor instance for replication. |  [optional]
**scanAllPolicy** | [**ConfigurationsScanAllPolicy**](ConfigurationsScanAllPolicy.md) |  |  [optional]



