public class Infocargo {

    private Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean overturn;
    private final String registrationNumber;
    private final boolean fragility;

    public Infocargo() {
        weight = 10;
        deliveryAddress = "London";
        overturn = false;
        registrationNumber = "40001bck";
        fragility = true;
    }

    public Infocargo(int weight,
                     String deliveryAddress,
                     Dimensions dimensions,
                     boolean overturn,
                     String registrationNumber,
                     boolean fragility) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.overturn = overturn;
        this.registrationNumber = registrationNumber;
        this.fragility = fragility;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Infocargo setWeight(int weight) {
        return new Infocargo(weight, deliveryAddress, dimensions, overturn, registrationNumber, fragility);
    }

    public Infocargo setOverturn(boolean overturn) {
        return new Infocargo(weight, deliveryAddress, dimensions, overturn, registrationNumber, fragility);
    }

    public Infocargo setRegistrationNumber(String registrationNumber) {
        return new Infocargo(weight, deliveryAddress, dimensions, overturn, registrationNumber, fragility);
    }

    public Infocargo setDeliveryAddress(String deliveryAddress) {
        return new Infocargo(weight, deliveryAddress, dimensions, overturn, registrationNumber, fragility);
    }

    public Infocargo setFragility(boolean fragility) {
        return new Infocargo(weight, deliveryAddress, dimensions, overturn, registrationNumber, fragility);
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddres() {
        return deliveryAddress;
    }

    public boolean isOverturn() {
        return overturn;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragility() {
        return fragility;
    }

    public String toString() {
        return "Адрес доставки - " + deliveryAddress + ";" + "\n" +
                "Габариты: " + dimensions + "; " + "\n" +
                "Масса груза - " + weight + "\n" +
                "Можно переворачивать - " + overturn + ";" + "\n" +
                "Номер регистрации - " + registrationNumber + ";" + "\n" +
                "Груз хрупкий - " + fragility;
    }
}