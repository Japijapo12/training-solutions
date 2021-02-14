package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    List<Skill> skills = new ArrayList<>();   //programming (5)

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    //programming (5)
    public void addSkills(String... skillParts) {
        for (String skillPart : skillParts) {
            String name = skillPart.substring(0, skillPart.indexOf("(") - 1).trim();
            int level = Integer.parseInt(skillPart.substring(skillPart.indexOf("(") + 1, skillPart.indexOf(")")));
            Skill skill = new Skill(name, level);
            skills.add(skill);
        }
    }


    public int findSkillLevelByName(String name) {

        for (Skill skill : skills) {
            if (skill.getName().equals(name)) {
                return skill.getLevel();
            }
        }
        throw new SkillNotFoundException ("Skill not found: " + name);

    }

}
/*
Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név, valamint skillek (hogy mihez ért az illető).
A skill egy névvel és egy számmal (szint) rendelkezik, utóbbi 1 - 5 között.
Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.
A skillek megadása a nevével, valamint a szintjével történik, pl. programming (5).
A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét. */