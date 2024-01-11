package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "학생";
        memberInit1.age = 15;
        memberInit1.grade = 90;

        MemberInit memberInit2 = new MemberInit();
        memberInit2.name = "학생";
        memberInit2.age = 16;
        memberInit2.grade = 80;

        MemberInit[] memberInits = {memberInit1, memberInit2};
        for (MemberInit memberInit : memberInits) {
            System.out.println(memberInit.name + memberInit.age + memberInit.grade);
        }
    }
}
