# spapi

Selling Partner API for A+ Content Management
- API version: 2020-11-01
  - Build date: 2021-08-18T13:04:02.980344+08:00[Asia/Shanghai]

With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.

  For more information, please visit [https://sellercentral.amazon.com/gp/mws/contactus.html](https://sellercentral.amazon.com/gp/mws/contactus.html)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.amazon</groupId>
  <artifactId>spapi</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.amazon:spapi:1.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/spapi-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.amazon.spapi.client.*;
import com.amazon.spapi.auth.*;
import com.amazon.spapi.model.apluscontent.*;
import com.amazon.spapi.api.AplusContentApi;

import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    PostContentDocumentRequest body = new PostContentDocumentRequest(); // PostContentDocumentRequest | The content document request details.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    try {
      PostContentDocumentResponse result = apiInstance.createContentDocument(body, marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#createContentDocument");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    String contentReferenceKey = "contentReferenceKey_example"; // String | The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    List<String> includedDataSet = Arrays.asList("includedDataSet_example"); // List<String> | The set of A+ Content data types to include in the response.
    try {
      GetContentDocumentResponse result = apiInstance.getContentDocument(contentReferenceKey, marketplaceId, includedDataSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#getContentDocument");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    String contentReferenceKey = "contentReferenceKey_example"; // String | The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    List<String> includedDataSet = Arrays.asList("includedDataSet_example"); // List<String> | The set of A+ Content data types to include in the response. If you do not include this parameter, the operation returns the related ASINs without metadata.
    List<String> asinSet = Arrays.asList("asinSet_example"); // List<String> | The set of ASINs.
    String pageToken = "pageToken_example"; // String | A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations.
    try {
      ListContentDocumentAsinRelationsResponse result = apiInstance.listContentDocumentAsinRelations(contentReferenceKey, marketplaceId, includedDataSet, asinSet, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#listContentDocumentAsinRelations");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    String contentReferenceKey = "contentReferenceKey_example"; // String | The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    try {
      PostContentDocumentApprovalSubmissionResponse result = apiInstance.postContentDocumentApprovalSubmission(contentReferenceKey, marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#postContentDocumentApprovalSubmission");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    PostContentDocumentAsinRelationsRequest body = new PostContentDocumentAsinRelationsRequest(); // PostContentDocumentAsinRelationsRequest | The content document ASIN relations request details.
    String contentReferenceKey = "contentReferenceKey_example"; // String | The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    try {
      PostContentDocumentAsinRelationsResponse result = apiInstance.postContentDocumentAsinRelations(body, contentReferenceKey, marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#postContentDocumentAsinRelations");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    String contentReferenceKey = "contentReferenceKey_example"; // String | The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    try {
      PostContentDocumentSuspendSubmissionResponse result = apiInstance.postContentDocumentSuspendSubmission(contentReferenceKey, marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#postContentDocumentSuspendSubmission");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    String pageToken = "pageToken_example"; // String | A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations.
    try {
      SearchContentDocumentsResponse result = apiInstance.searchContentDocuments(marketplaceId, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#searchContentDocuments");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    String asin = "asin_example"; // String | The Amazon Standard Identification Number (ASIN).
    String pageToken = "pageToken_example"; // String | A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations.
    try {
      SearchContentPublishRecordsResponse result = apiInstance.searchContentPublishRecords(marketplaceId, asin, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#searchContentPublishRecords");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    PostContentDocumentRequest body = new PostContentDocumentRequest(); // PostContentDocumentRequest | The content document request details.
    String contentReferenceKey = "contentReferenceKey_example"; // String | The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    try {
      PostContentDocumentResponse result = apiInstance.updateContentDocument(body, contentReferenceKey, marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#updateContentDocument");
      e.printStackTrace();
    }
  }
}
import com.amazon.spapi.client.*;
        import com.amazon.spapi.client.auth.*;
        import com.amazon.spapi.model.apluscontent.*;
        import com.amazon.spapi.api.AplusContentApi;

        import java.io.File;
        import java.util.*;

public class AplusContentApiExample {

  public static void main(String[] args) {

    AplusContentApi apiInstance = new AplusContentApi();
    PostContentDocumentRequest body = new PostContentDocumentRequest(); // PostContentDocumentRequest | The content document request details.
    String marketplaceId = "marketplaceId_example"; // String | The identifier for the marketplace where the A+ Content is published.
    List<String> asinSet = Arrays.asList("asinSet_example"); // List<String> | The set of ASINs.
    try {
      ValidateContentDocumentAsinRelationsResponse result = apiInstance.validateContentDocumentAsinRelations(body, marketplaceId, asinSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AplusContentApi#validateContentDocumentAsinRelations");
      e.printStackTrace();
    }
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://sellingpartnerapi-na.amazon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AplusContentApi* | [**createContentDocument**](docs/AplusContentApi.md#createContentDocument) | **POST** /aplus/2020-11-01/contentDocuments | 
*AplusContentApi* | [**getContentDocument**](docs/AplusContentApi.md#getContentDocument) | **GET** /aplus/2020-11-01/contentDocuments/{contentReferenceKey} | 
*AplusContentApi* | [**listContentDocumentAsinRelations**](docs/AplusContentApi.md#listContentDocumentAsinRelations) | **GET** /aplus/2020-11-01/contentDocuments/{contentReferenceKey}/asins | 
*AplusContentApi* | [**postContentDocumentApprovalSubmission**](docs/AplusContentApi.md#postContentDocumentApprovalSubmission) | **POST** /aplus/2020-11-01/contentDocuments/{contentReferenceKey}/approvalSubmissions | 
*AplusContentApi* | [**postContentDocumentAsinRelations**](docs/AplusContentApi.md#postContentDocumentAsinRelations) | **POST** /aplus/2020-11-01/contentDocuments/{contentReferenceKey}/asins | 
*AplusContentApi* | [**postContentDocumentSuspendSubmission**](docs/AplusContentApi.md#postContentDocumentSuspendSubmission) | **POST** /aplus/2020-11-01/contentDocuments/{contentReferenceKey}/suspendSubmissions | 
*AplusContentApi* | [**searchContentDocuments**](docs/AplusContentApi.md#searchContentDocuments) | **GET** /aplus/2020-11-01/contentDocuments | 
*AplusContentApi* | [**searchContentPublishRecords**](docs/AplusContentApi.md#searchContentPublishRecords) | **GET** /aplus/2020-11-01/contentPublishRecords | 
*AplusContentApi* | [**updateContentDocument**](docs/AplusContentApi.md#updateContentDocument) | **POST** /aplus/2020-11-01/contentDocuments/{contentReferenceKey} | 
*AplusContentApi* | [**validateContentDocumentAsinRelations**](docs/AplusContentApi.md#validateContentDocumentAsinRelations) | **POST** /aplus/2020-11-01/contentAsinValidations | 

## Documentation for Models

 - [AplusPaginatedResponse](docs/AplusPaginatedResponse.md)
 - [AplusResponse](docs/AplusResponse.md)
 - [AsinBadge](docs/AsinBadge.md)
 - [AsinBadgeSet](docs/AsinBadgeSet.md)
 - [AsinMetadata](docs/AsinMetadata.md)
 - [AsinMetadataSet](docs/AsinMetadataSet.md)
 - [AsinSet](docs/AsinSet.md)
 - [ColorType](docs/ColorType.md)
 - [ContentBadge](docs/ContentBadge.md)
 - [ContentBadgeSet](docs/ContentBadgeSet.md)
 - [ContentDocument](docs/ContentDocument.md)
 - [ContentMetadata](docs/ContentMetadata.md)
 - [ContentMetadataRecord](docs/ContentMetadataRecord.md)
 - [ContentMetadataRecordList](docs/ContentMetadataRecordList.md)
 - [ContentModule](docs/ContentModule.md)
 - [ContentModuleList](docs/ContentModuleList.md)
 - [ContentModuleType](docs/ContentModuleType.md)
 - [ContentRecord](docs/ContentRecord.md)
 - [ContentRecordList](docs/ContentRecordList.md)
 - [ContentReferenceKeySet](docs/ContentReferenceKeySet.md)
 - [ContentStatus](docs/ContentStatus.md)
 - [ContentType](docs/ContentType.md)
 - [Decorator](docs/Decorator.md)
 - [DecoratorSet](docs/DecoratorSet.md)
 - [DecoratorType](docs/DecoratorType.md)
 - [Error](docs/Error.md)
 - [ErrorList](docs/ErrorList.md)
 - [GetContentDocumentIncludedDataType](docs/GetContentDocumentIncludedDataType.md)
 - [GetContentDocumentResponse](docs/GetContentDocumentResponse.md)
 - [ImageComponent](docs/ImageComponent.md)
 - [ImageCropSpecification](docs/ImageCropSpecification.md)
 - [ImageDimensions](docs/ImageDimensions.md)
 - [ImageOffsets](docs/ImageOffsets.md)
 - [IntegerWithUnits](docs/IntegerWithUnits.md)
 - [ListContentDocumentAsinRelationsIncludedDataType](docs/ListContentDocumentAsinRelationsIncludedDataType.md)
 - [ListContentDocumentAsinRelationsResponse](docs/ListContentDocumentAsinRelationsResponse.md)
 - [MessageSet](docs/MessageSet.md)
 - [ParagraphComponent](docs/ParagraphComponent.md)
 - [PlainTextItem](docs/PlainTextItem.md)
 - [PositionType](docs/PositionType.md)
 - [PostContentDocumentApprovalSubmissionResponse](docs/PostContentDocumentApprovalSubmissionResponse.md)
 - [PostContentDocumentAsinRelationsRequest](docs/PostContentDocumentAsinRelationsRequest.md)
 - [PostContentDocumentAsinRelationsResponse](docs/PostContentDocumentAsinRelationsResponse.md)
 - [PostContentDocumentRequest](docs/PostContentDocumentRequest.md)
 - [PostContentDocumentResponse](docs/PostContentDocumentResponse.md)
 - [PostContentDocumentSuspendSubmissionResponse](docs/PostContentDocumentSuspendSubmissionResponse.md)
 - [PublishRecord](docs/PublishRecord.md)
 - [PublishRecordList](docs/PublishRecordList.md)
 - [SearchContentDocumentsResponse](docs/SearchContentDocumentsResponse.md)
 - [SearchContentPublishRecordsResponse](docs/SearchContentPublishRecordsResponse.md)
 - [StandardCompanyLogoModule](docs/StandardCompanyLogoModule.md)
 - [StandardComparisonProductBlock](docs/StandardComparisonProductBlock.md)
 - [StandardComparisonTableModule](docs/StandardComparisonTableModule.md)
 - [StandardFourImageTextModule](docs/StandardFourImageTextModule.md)
 - [StandardFourImageTextQuadrantModule](docs/StandardFourImageTextQuadrantModule.md)
 - [StandardHeaderImageTextModule](docs/StandardHeaderImageTextModule.md)
 - [StandardHeaderTextListBlock](docs/StandardHeaderTextListBlock.md)
 - [StandardImageCaptionBlock](docs/StandardImageCaptionBlock.md)
 - [StandardImageSidebarModule](docs/StandardImageSidebarModule.md)
 - [StandardImageTextBlock](docs/StandardImageTextBlock.md)
 - [StandardImageTextCaptionBlock](docs/StandardImageTextCaptionBlock.md)
 - [StandardImageTextOverlayModule](docs/StandardImageTextOverlayModule.md)
 - [StandardMultipleImageTextModule](docs/StandardMultipleImageTextModule.md)
 - [StandardProductDescriptionModule](docs/StandardProductDescriptionModule.md)
 - [StandardSingleImageHighlightsModule](docs/StandardSingleImageHighlightsModule.md)
 - [StandardSingleImageSpecsDetailModule](docs/StandardSingleImageSpecsDetailModule.md)
 - [StandardSingleSideImageModule](docs/StandardSingleSideImageModule.md)
 - [StandardTechSpecsModule](docs/StandardTechSpecsModule.md)
 - [StandardTextBlock](docs/StandardTextBlock.md)
 - [StandardTextListBlock](docs/StandardTextListBlock.md)
 - [StandardTextModule](docs/StandardTextModule.md)
 - [StandardTextPairBlock](docs/StandardTextPairBlock.md)
 - [StandardThreeImageTextModule](docs/StandardThreeImageTextModule.md)
 - [TextComponent](docs/TextComponent.md)
 - [TextItem](docs/TextItem.md)
 - [ValidateContentDocumentAsinRelationsResponse](docs/ValidateContentDocumentAsinRelationsResponse.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


