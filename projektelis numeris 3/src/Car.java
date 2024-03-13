public class Car {

       private String make;
       private String model;
       private int mileage = 0;
       private int fuel = 0;
       private final static int FUEL_CAP = 100;
       private boolean engineOn;
        public Car(String make, String model) {
                this.make = make;
                this.model = model;
        }
    public static boolean invert(boolean engineOn) {
        return !engineOn;
    }

    public boolean invert() {
        engineOn = !engineOn;
        return engineOn;
    }
    public int drive(int km){
       if(!engineOn) return -1;
       if(km < 0) km = 0;
       if(km >= fuel) km = fuel;
       mileage += km;
       fuel -= km;
       return km;
    }
    public int fuel(int l) {
       if(engineOn) return -1;
       if(l<0) l = 0;
       if(fuel + l > FUEL_CAP) {
           fuel = FUEL_CAP;
           return fuel;
       }
       fuel += l;
       return fuel;
    }
    public String toFile(){
        return make + "___" + model + "___" + mileage + "___" + fuel + "___" + engineOn;
    }

    public Car(String data){
            String[] fields = data.split("___");

            this.make = fields[0];
            this.model = fields[1];
            this.mileage = Integer.parseInt(fields[2]);
            this.fuel = Integer.parseInt(fields[3]);
            this.engineOn = Boolean.parseBoolean(fields[4]);
    }
    public int getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "%s %s: %skm, %sl".formatted(make, model, mileage, fuel);
    }

}