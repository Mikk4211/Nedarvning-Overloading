package Sprint2;

public class MountainBike extends Cykel {
    private String suspension;
    int startGear;
    int startSpeed;
    int startCadence;


    public MountainBike(
            int startCadence,
            int startSpeed,
            int startGear,
            String suspensionType){
        super(startCadence,
                startSpeed,
                startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }
    public String toString(){
        return this.getClass() + " er i " + super.startGear + ". gear og kører med " + super.startSpeed + " km i timen og har en cadens på " + super.startCadence + " og har " + this.suspension + " suspension.";
    }
}

