package pojo;

public class addons {

    private String description;
    private String addon_code;
    private String mandatory;
    private String price_excluding_gst;
    private String price_including_gst;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddon_code() {
        return addon_code;
    }

    public void setAddon_code(String addon_code) {
        this.addon_code = addon_code;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
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

}
