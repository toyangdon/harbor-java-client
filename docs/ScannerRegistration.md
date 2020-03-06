
# ScannerRegistration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The unique identifier of this registration. |  [optional]
**name** | **String** | The name of this registration. |  [optional]
**description** | **String** | An optional description of this registration. |  [optional]
**url** | **String** | A base URL of the scanner adapter |  [optional]
**disabled** | **Boolean** | Indicate whether the registration is enabled or not |  [optional]
**isDefault** | **Boolean** | Indicate if the registration is set as the system default one |  [optional]
**health** | **String** | Indicate the healthy of the registration |  [optional]
**auth** | **String** | Specify what authentication approach is adopted for the HTTP communications. Supported types Basic\&quot;, \&quot;Bearer\&quot; and api key header \&quot;X-ScannerAdapter-API-Key\&quot;  |  [optional]
**accessCredential** | **String** | An optional value of the HTTP Authorization header sent with each request to the Scanner Adapter API.  |  [optional]
**skipCertVerify** | **Boolean** | Indicate if skip the certificate verification when sending HTTP requests |  [optional]
**useInternalAddr** | **Boolean** | Indicate whether use internal registry addr for the scanner to pull content or not |  [optional]
**adapter** | **String** | Optional property to describe the name of the scanner registration |  [optional]
**vendor** | **String** | Optional property to describe the vendor of the scanner registration |  [optional]
**version** | **String** | Optional property to describe the version of the scanner registration |  [optional]



