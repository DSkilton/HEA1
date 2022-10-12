package Car;

import java.util.Objects;

public class Car {
    private String memberMake;
    private String memberModel;
    private int mileage;
    
    public Car(String make, String model, int mileage){
        this.memberMake = make;
        this.memberModel = model;
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public String getMake(){
        return memberMake;
    }
    
    public void setMake(String make){
        this.memberMake = make;
    }
    
    public String getModel(){
        return memberModel;
    }   

    public void setModel(String model) {
        this.memberModel = model;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        
        result = prime * result + ((memberMake == null) ? 0 : memberMake.hashCode());
        result = prime * result + ((memberModel == null) ? 0 : memberModel.hashCode());
        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        
        Car c = (Car)obj;
        System.out.format("Comparing %s %s with %s %s %n", this.memberMake, this.memberModel, c.memberMake, c.memberModel);
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.mileage != other.mileage) {
            return false;
        }
        if (!Objects.equals(this.memberMake, other.memberMake)) {
            return false;
        }
        return Objects.equals(this.memberModel, other.memberModel);
    }    

    @Override
    public String toString() {
        return "Car{" + "make=" + 
                memberMake + ", model=" + 
                memberModel + ", mileage=" + 
                mileage + '}';
    }
    
}