import java.io.Serializable;

public class Bottle {
    private Integer totalCapacity;
    private Integer availableLiquid;
    private String status;
    
    public Bottle(Integer totalCapacity, Integer availableLiquid, String status) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.status = status;

    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public Integer getAvailableLiquid() {
        return availableLiquid;
    }

    public String getStatus() {
        return status;
    }
    
    public boolean statusCapacity(){
        if(totalCapacity < availableLiquid){
            return true;
        }else return false;
    }
    
    public int remainCapacity(){
        return availableLiquid;
    }
    
    public Object emptyCapacity(){
        int theEmptyCapacity;
        if(statusCapacity()){
            return "The bottle is full";
        }else
             theEmptyCapacity = totalCapacity - availableLiquid;
            return "The empty capacity is: " + theEmptyCapacity;
    }

    public String openBottle(){
        if(getStatus().equals("Close")){
            status = "Open";
        }
        return "Bottle is opened";
    }

    public String closeBottle(){
        if(getStatus().equals("Open")){
            status = "Close";
        }
        return "Bottle is closed";
    }

    public Object specigicAmount(int amountOfLiquid ){
        if(getStatus().equals("Open")) {
            int theRemainingAmount = availableLiquid - amountOfLiquid;
            if (theRemainingAmount < 0) {
                return "The bottle is empty";
            } else return "Your capacity is: " + theRemainingAmount;
        }else return "The bottle is closed";
    }

    public String toString() {
        return "Bottle{ " +
                "total capacity: '" + totalCapacity + '\'' +
                ", available liquid : '" + availableLiquid + '\'' +
                ", status: " + status +
                '}';
    }
}
