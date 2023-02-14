Feature: Get Single Bag Range for Across Town option










  # Shipping Options for SBR Size (Envelope Size)
  # Envelope Sizes:  DLE; C4; C5; FS; LF; PPDLE; PPC4; PPC5; PPFS; PPLF; Zonal
  # Across Town
  Scenario Outline: Get the range of shipping options for SBR Size (Envelope Size)
    Given User has selected an "<EnvelopeSize>" as the envelope Size with "<PickupSuburb>" "<PickupPostcode>" "<DeliverySuburb>" "<DeliveryPostcode>" "<Weight>"
    When user calls SOv3 API
    Then the API returns Shipping Options
    And "success" in response body is "true"

    Examples:


    #  | EnvelopeSize | PickupSuburb   | PickupPostcode | DeliverySuburb | DeliveryPostcode | Weight |
    #  | DLE          | East Tamaki    | 2013           | Flat Bush      | 2019             | 2      |
    #  | C4           | Rototuna North | 3210           | Rukuhia        | 3282             | 1      |
    #  | C5           | Oamaru North  | 9400            | Awamoa          | 9495              | 1      |
    #  | FS           | Newtown       | 6021            | Wellington      | 6011              | 1      |
    #  | LF           | Bethlehem     | 3110            | Papamoa Beach   | 3175              | 1      |
     # | PPDLE        | Bell Block    | 4312            | Westown         | 4310              | 1      |
     # | PPC4         | Napier        | 4110            | Greenmeadows    | 4112              | 1      |
     # | PPC5         | Atawhai       | 7010            | Tahunanui       | 7011              | 1      |
     # | PPFS         | Belfast       | 8051            | Kennedys Bush   | 8025              | 1      |
     # | PPLF         | North East Valley| 9010         | Andersons Bay   | 9013              | 1      |
     # | Zonal        | Invercargill| 9810              | Clifton         | 9812              | 1      |

    |Type|EnvelopeSize|PickupSuburb|PickupPostcode|DeliverySuburb|DeliveryPostcode|Weight|GuarantDel|1_Carrier|1_Description|1_RatedWeight|1_PriceExGST|1_PriceInGST|1_TrackIncluded|1_SignIncluded|1_ProdCode|1_BillCode|1_ProdServiceCode|1_AO1_Description|1_AO1_AddonCode|1_AO1_Mandatory|1_AO1_PriceExGST|1_AO1_PriceInGST|1_AO2_Description|1_AO2_AddonCode|1_AO2_Mandatory|1_AO2_PriceExGST|1_AO2_PriceInGST|1_AO3_Description|1_AO3_AddonCode|1_AO3_Mandatory|1_AO3_PriceExGST|1_AO3_PriceInGST|1_SC1_ProdServiceCode|1_SC1_Description|1_SC2_ProdServiceCode|1_SC2_Description|1_SC3_ProdServiceCode|1_SC3_Description|1_SC4_ProdServiceCode|1_SC4_Description|2_Carrier|2_Description|2_RatedWeight|2_PriceExGST|2_PriceInGST|2_TrackIncluded|2_SignIncluded|2_ProdCode|2_BillCode|2_ProdServiceCode|2_AO1_Description|2_AO1_AddonCode|2_AO1_Mandatory|2_AO1_PriceExGST|2_AO1_PriceInGST|2_AO2_Description|2_AO2_AddonCode|2_AO2_Mandatory|2_AO2_PriceExGST|2_AO2_PriceInGST|2_AO3_Description|2_AO3_AddonCode|2_AO3_Mandatory|2_AO3_PriceExGST|2_AO3_PriceInGST|2_SC1_ProdServiceCode|2_SC1_Description|2_SC2_ProdServiceCode|2_SC2_Description|2_SC3_ProdServiceCode|2_SC3_Description|2_SC4_ProdServiceCode|2_SC4_Description|
    |XT DLE|DLE|East Tamaki|2013|Flat Bush|2019|3|true|ECONOMY PARCEL|ParcelPost Economy|3.0000|3.6500|4.2000|true|false|PRCSPTRKDL|PRCSPTRKDLE|PRCSPTRKDL||||||||||||||||PRCSPTRKDL|ParcelPost Economy|||||||COURIER|Courier Parcel|3.0000|5.3900|6.2000|true|false|PRCSPCOUDL|PRCSPCOURDLE|PRCSPCOUDL|Saturday Delivery|NCPTSD|false|5.0400|5.8000|Sig Req Addon|RTPWINWSR|false|2.6100|3.0000||||||NCPTSD|TKT Saturday Delivery|PRCSPCOUDL|Courier Parcel|RTPWINWSR|Sig Req Addon||
    |XT PPDLE|PPDLE|East Tamaki|2013|Flat Bush|2019|1|true|TRACKED PARCEL|ParcelPost Tracked|1.0000|0.8696|1.0000|true|false|PRCUPTRK|PRCUPTRKDLE|PRCUPTRK||||||||||||||||PRCUPTRK|ParcelPost Tracked|||||||COURIER|Courier Parcel|1.0000|1.7392|2.0000|true|false|PRCUPCOUR|PRCUPCOURDLE|PRCUPCOUR|SIG REQ SERVICE|PUPUPSR|false|2.6087|3.0000|SAT DEL TICKET|NCPTSD|false|5.0400|5.7960||||||PRCUPCOUR|Courier Parcel|PUPUPSR|Signature Required|NCPTSD|TKT Saturday Delivery||


















  # Cuboid Inout (W, L & H)
  # Enter Dimensions:  height, length and width
  # Across Town
  Scenario Outline: Get the range of shipping options for Cuboid Inout H, L & W)
    Given User has selected Cuboid dimensions of "<Height>", "<Length>" and "<Width>" with "<PickupSuburb>" "<PickupPostcode>" "<DeliverySuburb>" "<DeliveryPostcode>" "<Weight>"
    When user calls SOv3 API
    Then the API returns Shipping Options
    And "success" in response body is "true"

    Examples:
      | PickupSuburb | PickupPostcode | DeliverySuburb | DeliveryPostcode | Weight | Height | Length | Width |
      | East Tamaki  | 2013           | Flat bush      | 2019             | 2      | 235    | 165    | 70    |
    #  | Rototuna North| 3210            | Rukuhia         | 3282              | 1      | 235    | 165     | 70    |
    #  | Oamaru North  | 9400            | Awamoa          | 9495              | 1      | 235    | 165     | 70    |
    #  | Newtown       | 6021            | Wellington      | 6011              | 1      | 235    | 165     | 70    |
    #  | Bethlehem     | 3110            | Papamoa Beach   | 3175              | 1      | 235    | 165     | 70    |
    #  | Bell Block    | 4312            | Westown         | 4310              | 1      | 235    | 165     | 70    |
    #  | Napier        | 4110            | Greenmeadows    | 4112              | 1      | 235    | 165     | 70    |
    #  | Atawhai       | 7010            | Tahunanui       | 7011              | 1      | 235    | 165     | 70    |
    #  | Belfast       | 8051            | Kennedys Bush   | 8025              | 1      | 235    | 165     | 70    |
    #  | North East Valley| 9010         | Andersons Bay   | 9013              | 1      | 235    | 165     | 70    |
    #  | Invercargill| 9810              | Clifton         | 9812              | 1      | 235    | 165     | 70    |


  # Tube Inout (D & L)
  # Enter Dimensions: diameter & length
  # Across Town
  Scenario Outline: Get the range of shipping options for Tube Input (D & L)
    Given User has selected Tube dimensions of "<Diameter>" and "<Length>" with "<PickupSuburb>" "<PickupPostcode>" "<DeliverySuburb>" "<DeliveryPostcode>" "<Weight>"
    When user calls SOv3 API
    Then the API returns Shipping Options
    And "success" in response body is "true"

    Examples:
      | PickupSuburb | PickupPostcode | DeliverySuburb | DeliveryPostcode | Weight | Diameter | Length |
      | East Tamaki  | 2013           | Flat bush      | 2019             | 2      | 235      | 165    |
    #  | Rototuna North| 3210            | Rukuhia         | 3282              | 1      | 235      | 165     |
    #  | Oamaru North  | 9400            | Awamoa          | 9495              | 1      | 235      | 165     |
    #  | Newtown       | 6021            | Wellington      | 6011              | 1      | 235      | 165     |
    #  | Bethlehem     | 3110            | Papamoa Beach   | 3175              | 1      | 235      | 165     |
    #  | Bell Block    | 4312            | Westown         | 4310              | 1      | 235      | 165     |
    #  | Napier        | 4110            | Greenmeadows    | 4112              | 1      | 235      | 165     |
    #  | Atawhai       | 7010            | Tahunanui       | 7011              | 1      | 235      | 165     |
    #  | Belfast       | 8051            | Kennedys Bush   | 8025              | 1      | 235      | 165     |
    #  | North East Valley | 9010        | Andersons Bay   | 9013              | 1      | 235      | 165     |
    #  | Invercargill  | 9810            | Clifton         | 9812              | 1      | 235      | 165     |
