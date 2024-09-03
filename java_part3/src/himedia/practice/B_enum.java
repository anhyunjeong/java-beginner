package himedia.practice;

public class B_enum {

    public static void exam1(){
        B_day today=B_day.TUESDAY;
        System.out.println(B_day.TUESDAY.ordinal());
        System.out.println(B_day.TUESDAY.name());
        switch(today){
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
        }
    }

    public static void main(String[] args) {

    }
}
