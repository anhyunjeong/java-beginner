package himedia.practice;

public enum B_day2 {
    SUNDAY("Holiday"),
    MONDAY("Workday"),
    TUESDAY("Worday"),
    WEDNESDAY("Worday"),
    THURSDAY("Worday"),
    FIRDAY("Worday"),
    SATURDAY("Halfday");

    private String description;

    B_day2(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
