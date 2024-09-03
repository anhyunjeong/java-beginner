package himedia.java.Management;

public enum Enum_membershipCnt {
    PREMIUM(30),//멤버십 메뉴번호 ordinal+1 or *인원수
    BASIC(20),
    LITE(10);
//    FREEPASS(1000000);

    private int totalMemberCnt;

    Enum_membershipCnt(int totalMemberCnt) {
        this.totalMemberCnt=totalMemberCnt;
    }
    public int getTotalMemberCnt(){
        return totalMemberCnt;
    }
}
