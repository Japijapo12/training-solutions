package immutable;

public class Satellite {

    private CelestialCoordinates celestialCoordinates;
    private String registerIdent;


    public Satellite(CelestialCoordinates celestialCoordinates, String registerIdent) {

      //"Az üres String paraméter vizsgálatára célszerű külön privát metódust írni." - ld. lejjebb
       if (isEmpty(registerIdent)) {
             throw new IllegalArgumentException("Register ident must not be empty!");
         }


        this.celestialCoordinates = celestialCoordinates;
        this.registerIdent = registerIdent;
    }

    //"Az úticél módosítása is koordinátákban kerül megadásra, mindig a már megadott célponthoz képest a különbség kerül átadásra."
    //feltételezzük, hogy a "diff" azonos x,y,z irányokban

    public void modifyDestination(CelestialCoordinates diff) {
        celestialCoordinates = new CelestialCoordinates(celestialCoordinates.getX() + diff.getX(),
                 celestialCoordinates.getY() + diff.getY(),
                celestialCoordinates.getZ() + diff.getZ());
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public CelestialCoordinates getCelestialCoordinates() {
        return celestialCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }


    public String toString() {
        return registerIdent + ": " + celestialCoordinates.toString();
    }
}
