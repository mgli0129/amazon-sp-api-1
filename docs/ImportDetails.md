# ImportDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**methodOfPayment** | [**MethodOfPaymentEnum**](#MethodOfPaymentEnum) | This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment. |  [optional]
**sealNumber** | **String** | The container&#x27;s seal number. |  [optional]
**route** | [**Route**](Route.md) |  |  [optional]
**importContainers** | **String** | Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if shipment has multiple containers. |  [optional]
**billableWeight** | [**Weight**](Weight.md) |  |  [optional]
**estimatedShipByDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the shipment is expected to be shipped. This value should not be in the past and not more than 60 days out in the future. |  [optional]

<a name="MethodOfPaymentEnum"></a>
## Enum: MethodOfPaymentEnum
Name | Value
---- | -----
PAIDBYBUYER | &quot;PaidByBuyer&quot;
COLLECTONDELIVERY | &quot;CollectOnDelivery&quot;
DEFINEDBYBUYERANDSELLER | &quot;DefinedByBuyerAndSeller&quot;
FOBPORTOFCALL | &quot;FOBPortOfCall&quot;
PREPAIDBYSELLER | &quot;PrepaidBySeller&quot;
PAIDBYSELLER | &quot;PaidBySeller&quot;
