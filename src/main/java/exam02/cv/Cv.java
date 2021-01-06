package exam02.cv;

import java.util.List;

public class Cv {

    private String name;
    List<Skill> skills;

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public  void findSkillLevelByName() {

    }

}
