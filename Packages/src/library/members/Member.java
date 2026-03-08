package library.members;
public class Member {
    String memberName;
    int memberId;
    public void registerMember(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        System.out.println("Member Registered:");
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}
