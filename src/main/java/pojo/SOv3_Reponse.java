package pojo;

import java.util.List;

public class SOv3_Reponse {

    private String success;
    private String guaranteed_delivery;
    private List<services> services;
    private String message_id;


    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getGuaranteed_delivery() {
        return guaranteed_delivery;
    }

    public void setGuaranteed_delivery(String guaranteed_delivery) {
        this.guaranteed_delivery = guaranteed_delivery;
    }

    public List<pojo.services> getServices() {
        return services;
    }

    public void setServices(List<pojo.services> services) {
        this.services = services;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }
}
