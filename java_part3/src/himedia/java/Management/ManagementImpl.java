package himedia.java.Management;

import java.util.*;

class A_person{
    String name;
    String email;
    String phone;
    int membership;

    //class A_person의 필드 membership은 Premium=1, Basic=2, Lite=3, Freepass=4

    public A_person(int membership, String name,String email,String phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.membership=membership;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getMembership() {
        return membership;
    }

    @Override
    public String toString() {
        return "["+membership+"]"+" [name]"+name+" [email]"+email+" [phone]"+phone;
    }
}


public class ManagementImpl implements Member{

   //각각 멤버쉽, 이름, 이메일, 연락처 리스트 생성
    Queue<Integer> membership=new LinkedList<>();


    Queue<String> name=new LinkedList<>();


    Queue<String> email=new LinkedList<>();


    Queue<String> phone=new LinkedList<>();

    // 우선순위 FreePass<Lite<Basic<Premium(***)
    Comparator<A_person> membershipComp=new Comparator<A_person>() {
        @Override
        public int compare(A_person o1, A_person o2) {
            return Integer.compare(o1.getMembership(),o2.getMembership());
        }
    };

//    private int LITE=10, BASIC=20, PREMIUM=30; enum
//    private String FREEPASS="무제한";//호출 시 Spring->Integer(parseInt 사용)

    @Override
    public int printPricePlan() {

        System.out.println("         <Membership menu>         ");
        System.out.println("[1] Premium [2] Basic [3] Lite [4] FreePass");
        System.out.println("멤버쉽을 선택해주세요");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public int printMenu() {
        System.out.println("        <Menu>        ");
        System.out.println("[1] 회원추가 [2] 회원조회(메일) [3] 회원조회(이름)");
        System.out.println("[4] 전체조회 [5] 회원정보 수정 [6] 회원삭제");
        System.out.println("[7] 요금제 변경 [8] 초기화 [9] 프로그램 종료");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public void addMember() {

    }

    @Override
    public boolean checkEmail() {
        return false;
    }

    @Override
    public void selectEmail() {

    }

    @Override
    public void selectName() {

    }

    @Override
    public void selectAll() {

    }

    @Override
    public void updateMember() {

    }

    @Override
    public void deleteMember() {

    }

}
