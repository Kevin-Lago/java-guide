package data;

public class Engine {
    private float displacement;
    private int cylinderCount;
    private String type;
    private String torque;
    private int horsePower;

    public Engine(float displacement, int cylinderCount, String type, String torque, int horsePower) {
        this.displacement = displacement;
        this.cylinderCount = cylinderCount;
        this.type = type;
        this.torque = torque;
        this.horsePower = horsePower;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "displacement=" + displacement +
                ", cylinderCount=" + cylinderCount +
                ", type='" + type + '\'' +
                ", torque='" + torque + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
