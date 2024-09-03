package himedia.java.Management;
//[멤버 관리 프로그램]
//->Member.java(I)
//->ManagementImpl.java // 필드->private
//->Start.java

//반드시 Collections 중 하나를 적용할 것.
//[1] Lite:10명 [2] Basic:20명 [3] Premium:30명 [4]Freepass:무제한

//[1] 회원추가 [2] 회원조회(메일) [3] 회원조회(이름)
//[4] 전체조회 [5] 회원정보 수정 [6] 회원삭제
//[7] 요금제 변경 [8] 초기화 [9] 프로그램 종료

//10명 ...->꽉 차면 요금제를 변경하시오.
public class Management_start {
    public void main(String[] args){
        Member management=new ManagementImpl();



    }
}
