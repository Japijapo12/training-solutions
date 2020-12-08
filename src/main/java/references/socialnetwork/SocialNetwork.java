package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    //az összes tag listája
    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        Member member = new Member(name);
        members.add(new Member(name));
    }

    public void connect(String name, String othername) {
        Member memberOne = findByName(name);
        memberOne.connectMember(findByName(othername));
    }

    private Member findByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections() {
        List<String> connections = new ArrayList<>();
        for (Member member : members) {
            for (Member connectedMembers : member.getConnections()) {
                if (connectedMembers.getConnections().contains(member)) {

                    connections.add(member.getName() + " - " + connectedMembers.getName());
                }
            }
        }
        return connections;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}





