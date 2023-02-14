package resources;
//enum is a special class in Java which has a collection of constants or methods
public enum APIResources {
    GetShippingOptions("shippingoptions-3-0/api/services");
    private final String resource;
    APIResources(String resource) {
        this.resource = resource;
    }
    public String getResource()
    {
        return resource;
    }

}
