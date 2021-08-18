# ModelPackage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**packageIdentifier** | **String** | Package identifier for the package. The first package will be 001, the second 002, and so on. This number is used as a reference to refer to this package from the pallet level. | 
**trackingNumber** | **String** | This is required to be provided for every package in the small parcel shipments. |  [optional]
**manifestId** | **String** | Carrier manifest Id (Applicable for LTL shipments). |  [optional]
**manifestDate** | [**OffsetDateTime**](OffsetDateTime.md) | Carrier manifest Date (Applicable for LTL shipments). |  [optional]
**shipMethod** | **String** | Shipment method. |  [optional]
**weight** | [**Weight**](Weight.md) |  | 
**dimensions** | [**Dimensions**](Dimensions.md) |  |  [optional]
