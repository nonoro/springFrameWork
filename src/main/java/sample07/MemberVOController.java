package sample07;

public class MemberVOController {
    private MemberVO memberVO;
    private MemberVO member;

    public MemberVOController() {
        System.out.println("MemberVOController() 생성자 호출됨");
    }

    public MemberVOController(MemberVO memberVO, MemberVO member) {
        this.memberVO = memberVO;
        this.member = member;
        System.out.println("MemberVOController(MemberVO memberVO, MemberVO member) 호출되었습니다");
        System.out.println("memberVO : " + memberVO + ", name = " + memberVO.getName());
        System.out.println("member : " + member + ", name = " + member.getName());
    }

    public void setMemberVO(MemberVO memberVO) {
        this.memberVO = memberVO;
        System.out.println("setMemberVO(MemberVO memberVO) 호출됨 memberVO = " + memberVO.getName());
    }

    public void setMember(MemberVO member) {
        this.member = member;
        System.out.println("setMember(MemberVO member) 호출됨  member = " + member.getName());
    }


}
