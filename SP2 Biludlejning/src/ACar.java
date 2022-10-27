public abstract class ACar implements Car{

    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;



    public String getRegistrationNumber() {      //getters
        return registrationNumber;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }


   public  ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors ;
    }

    @Override                            //toString
    public String toString(){
        return
                ("Registration number = "+getRegistrationNumber() +
                ", make = " + getMake() +
                ", model = "+getModel()+
                ", doors = " + getNumberOfDoors());
    }

}
