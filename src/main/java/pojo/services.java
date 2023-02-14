package pojo;

import java.util.List;

public class services {
    private String carrier;
    private String description;
    private String rated_weight;
    private String price_excluding_gst;
    private String price_including_gst;
    private String tracking_included;
    private String signature_included;
    private String product_code;
    private String billing_code;
    private String product_service_code;
    private List<addons> addons;
    private List<service_codes> service_codes;


    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRated_weight() {
        return rated_weight;
    }

    public void setRated_weight(String rated_weight) {
        this.rated_weight = rated_weight;
    }

    public String getPrice_excluding_gst() {
        return price_excluding_gst;
    }

    public void setPrice_excluding_gst(String price_excluding_gst) {
        this.price_excluding_gst = price_excluding_gst;
    }

    public String getPrice_including_gst() {
        return price_including_gst;
    }

    public void setPrice_including_gst(String price_including_gst) {
        this.price_including_gst = price_including_gst;
    }

    public String getTracking_included() {
        return tracking_included;
    }

    public void setTracking_included(String tracking_included) {
        this.tracking_included = tracking_included;
    }

    public String getSignature_included() {
        return signature_included;
    }

    public void setSignature_included(String signature_included) {
        this.signature_included = signature_included;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getBilling_code() {
        return billing_code;
    }

    public void setBilling_code(String billing_code) {
        this.billing_code = billing_code;
    }

    public String getProduct_service_code() {
        return product_service_code;
    }

    public void setProduct_service_code(String product_service_code) {
        this.product_service_code = product_service_code;
    }

    public List<pojo.addons> getAddons() {
        return addons;
    }

    public void setAddons(List<pojo.addons> addons) {
        this.addons = addons;
    }

    public List<pojo.service_codes> getService_codes() {
        return service_codes;
    }

    public void setService_codes(List<pojo.service_codes> service_codes) {
        this.service_codes = service_codes;
    }
}
