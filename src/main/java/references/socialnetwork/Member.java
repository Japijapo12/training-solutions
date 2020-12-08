package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

// két lista van: az egyik a connection lista, a másik a connectedMember lista
public class Member {

    private String name;

    //egy tag ismerőseinek listája:

    private List<Member> connections = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectMember(Member member) {
        connections.add(member);
    }

    //azoknak a listája, akiket bejelölt a tag:
        private List<String> connectedMembers() {
        List<String> connectedMembers = new ArrayList<>();
        for (Member member : connections) {
            connectedMembers.add(member.getName());
        }
        return connectedMembers;
    }

    public List<Member> getConnections() {
        return connections;
    }

    @Override
    public String toString() {
        return name + " " + connectedMembers();
    }
}
