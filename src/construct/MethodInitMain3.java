package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.initMember("학생", 15, 90);
        MemberInit memberInit2 = new MemberInit();
        memberInit2.initMember("학생", 16, 80);

        MemberInit[] memberInits = {memberInit1, memberInit2};
        for (MemberInit memberInit : memberInits) {
            System.out.println(memberInit.name + memberInit.age + memberInit.grade);
        }
    }
}
