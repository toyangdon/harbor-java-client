
# ScannerRegistrationReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this registration |  [optional]
**description** | **String** | An optional description of this registration. |  [optional]
**url** | **String** | A base URL of the scanner adapter. |  [optional]
**auth** | **String** | Specify what authentication approach is adopted for the HTTP communications. Supported types Basic\&quot;, \&quot;Bearer\&quot; and api key header \&quot;X-ScannerAdapter-API-Key\&quot;  |  [optional]
**accessCredential** | **String** | An optional value of the HTTP Authorization header sent with each request to the Scanner Adapter API.  |  [optional]
**skipCertVerify** | **Boolean** | Indicate if skip the certificate verification when sending HTTP requests |  [optional]
**useInternalAddr** | **Boolean** | Indicate whether use internal registry addr for the scanner to pull content or not |  [optional]
**disabled** | **Boolean** | Indicate whether the registration is enabled or not |  [optional]



