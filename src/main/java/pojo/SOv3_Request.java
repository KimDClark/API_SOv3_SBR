package pojo;

public class SOv3_Request {


    private String request_source;      //^[a-zA-Z\s]+$
    private String pickup_dpid;         //^\d{1,8}$
    private String pickup_aid;          //^\d{1,8}$
    private String pickup_suburb;       //^[a-zA-Z\s]+$
    private String pickup_postcode;     //^\d{4}$
    private String delivery_dpid;       //^\d{1,8}$
    private String delivery_aid;        //^\d{1,8}$
    private String delivery_suburb;     //^[a-zA-Z\s]+$
    private String delivery_country;    //Pattern: ^[a-zA-Z]+$  Minimum characters: 2   Maximum characters: 2
    private String delivery_postcode;   //^\d{4}$
    private Float weight;               //Min value:0   Max value: 99999.9999       Kilograms
    private Integer height;             //Min value:0   Max value: 9999             Millimetres
    private Integer length;             //Min value:0   Max value: 9999             Millimetres
    private Integer width;              //Min value:0   Max value: 9999             Millimetres
    private String envelope_size;       //Enum values:  DLE; C4; C5; FS; LF; PPDLE; PPC4; PPC5; PPFS; PPLF; Zonal
    private String tpid;                //Pattern: ^\d{8}$      Minimum characters:8    Maximum characters: 8
    private Boolean contract_pricing;   //True if contract pricing is desired, False if not. API will default to False
    private Float parcel_value;         //Declared value of parcel (international only). NZD will be assumed as the value currency      Min value:0     Max value: 999999.99
    private String docs_or_merch;       //Enum values:documents; merchandise; all; ALL
    private String letter_size;         //Enum values:M; L; O; A

    public String getRequest_source() {
        return request_source;
    }

    public void setRequest_source(String request_source) {
        this.request_source = request_source;
    }

    public String getPickup_dpid() {
        return pickup_dpid;
    }

    public void setPickup_dpid(String pickup_dpid) {
        this.pickup_dpid = pickup_dpid;
    }

    public String getPickup_aid() {
        return pickup_aid;
    }

    public void setPickup_aid(String pickup_aid) {
        this.pickup_aid = pickup_aid;
    }

    public String getPickup_suburb() {
        return pickup_suburb;
    }

    public void setPickup_suburb(String pickup_suburb) {
        this.pickup_suburb = pickup_suburb;
    }

    public String getPickup_postcode() {
        return pickup_postcode;
    }

    public void setPickup_postcode(String pickup_postcode) {
        this.pickup_postcode = pickup_postcode;
    }

    public String getDelivery_dpid() {
        return delivery_dpid;
    }

    public void setDelivery_dpid(String delivery_dpid) {
        this.delivery_dpid = delivery_dpid;
    }

    public String getDelivery_aid() {
        return delivery_aid;
    }

    public void setDelivery_aid(String delivery_aid) {
        this.delivery_aid = delivery_aid;
    }

    public String getDelivery_suburb() {
        return delivery_suburb;
    }

    public void setDelivery_suburb(String delivery_suburb) {
        this.delivery_suburb = delivery_suburb;
    }

    public String getDelivery_country() {
        return delivery_country;
    }

    public void setDelivery_country(String delivery_country) {
        this.delivery_country = delivery_country;
    }

    public String getDelivery_postcode() {
        return delivery_postcode;
    }

    public void setDelivery_postcode(String delivery_postcode) {
        this.delivery_postcode = delivery_postcode;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getEnvelope_size() {
        return envelope_size;
    }

    public void setEnvelope_size(String envelope_size) {
        this.envelope_size = envelope_size;
    }

    public String getTpid() {
        return tpid;
    }

    public void setTpid(String tpid) {
        this.tpid = tpid;
    }

    public Boolean getContract_pricing() {
        return contract_pricing;
    }

    public void setContract_pricing(Boolean contract_pricing) {
        this.contract_pricing = contract_pricing;
    }

    public Float getParcel_value() {
        return parcel_value;
    }

    public void setParcel_value(Float parcel_value) {
        this.parcel_value = parcel_value;
    }

    public String getDocs_or_merch() {
        return docs_or_merch;
    }

    public void setDocs_or_merch(String docs_or_merch) {
        this.docs_or_merch = docs_or_merch;
    }

    public String getLetter_size() {
        return letter_size;
    }

    public void setLetter_size(String letter_size) {
        this.letter_size = letter_size;
    }


}
