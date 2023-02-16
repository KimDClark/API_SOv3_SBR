Feature: Across Town Services using Dimensions of H, L & W (Cuboid) or W & L (Cylinder) for current POS Regression


#Postcode/suburb   &  - DPID













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
