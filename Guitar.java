public class Guitar {
    
    private String serialNumber, builder, model, type, backWood, topWood;
    private double price;
    
    public Guitar(String serialNumber, double price,
                  String builder, String model, String type,
                  String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public String getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    public String getBackWood() {
        return backWood;
    }
    public String getTopWood() {
        return topWood;
    }

    @Override
    public String toString() {
        return new StringBuilder().
        append("serial no : ").append(this.serialNumber).append("; ").
        append("price : ").append(Double.toString(this.price)).append("; ").
        append("builder : ").append(this.builder).append("; ").
        append("model : ").append(this.model).append("; ").
        append("type : ").append(this.type).append("; ").
        append("backwood : ").append(this.backWood).append("; ").
        append("topwood : ").append(topWood).append(";").toString();
    }
}