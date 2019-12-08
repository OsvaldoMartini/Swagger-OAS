# Ws2I45Api

All URIs are relative to *https://localhost:9443/rest/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wS2I45**](Ws2I45Api.md#wS2I45) | **POST** /WS2I45 | 


<a name="wS2I45"></a>
# **wS2I45**
> ResponseBody wS2I45(requestBody)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Ws2I45Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

Ws2I45Api apiInstance = new Ws2I45Api();
RequestBody requestBody = new RequestBody(); // RequestBody | 
try {
    ResponseBody result = apiInstance.wS2I45(requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ws2I45Api#wS2I45");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**RequestBody**](RequestBody.md)|  |

### Return type

[**ResponseBody**](ResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

