package sample02;

public class MemberService {

    // 메타데이터인 xml파일에 이 memberDAO, member 두개를 주입시켜주면 따로 이렇게 선언하지 않아도 됨
    private MemberDAO memberDAO;
    private Member member;


    public MemberService() {
        System.out.println("MemberService 생성자 호출됨");
    }

    public void serviceInsert() {
        System.out.println("MemberService의 serviceInsert 호출됨.... ");
        memberDAO.insert(member);
    }

    // 생성자를 이용한 주입
    public MemberService(MemberDAO memberDAO, Member member) {
        System.out.println("MemberService 생성자 호출됨... memberDAO = " + memberDAO + " member = " + member);
        this.memberDAO = memberDAO;
        this.member = member;
    }
}
