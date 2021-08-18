# TransportationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carrierScac** | **String** | Code that identifies the carrier for the shipment. The Standard Carrier Alpha Code (SCAC) is a unique two to four letter code used to identify a carrier. Carrier SCAC codes are assigned and maintained by the NMFTA (National Motor Freight Association). This field is mandatory for US, CA, MX shipment confirmations. |  [optional]
**carrierShipmentReferenceNumber** | **String** | The field also known as PRO number is a unique number assigned by the carrier. It is used to identify and track the shipment that goes out for delivery. This field is mandatory for UA, CA, MX shipment confirmations. |  [optional]
**transportationMode** | [**TransportationModeEnum**](#TransportationModeEnum) | The mode of transportation for this shipment. |  [optional]
**billOfLadingNumber** | **String** | Bill Of Lading (BOL) number is the unique number assigned by the vendor. The BOL present in the Shipment Confirmation message ideally matches the paper BOL provided with the shipment, but that is no must. Instead of BOL, an alternative reference number (like Delivery Note Number) for the shipment can also be sent in this field. |  [optional]

<a name="TransportationModeEnum"></a>
## Enum: TransportationModeEnum
Name | Value
---- | -----
ROAD | &quot;Road&quot;
AIR | &quot;Air&quot;
OCEAN | &quot;Ocean&quot;
