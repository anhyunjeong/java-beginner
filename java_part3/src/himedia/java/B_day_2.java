package himedia.java;

public enum B_day_2 {
    SUNDAY("Holiday"),
    MONDAY("Workday"),
    TUESDAY("Workday"),
    WEDNESDAY("Wokrday"),
    THURSDAY("Wokrday"),
    FRIDAY("Wokrday"),
    SATURDAY("Halfday");
    //필드
    private String description;

    B_day_2(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
