package inheritencelab;

interface CelestialBody {
    void orbit();
}

class SolarSystem implements CelestialBody {
    public void orbit() {
        System.out.println("Orbiting the Sun");
    }
}

class Earth extends SolarSystem {
}

class Mars extends SolarSystem {
}

public class Moon extends Earth implements CelestialBody {
    public static void main(String args[]) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        Moon moon = new Moon();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
        System.out.println(moon instanceof Earth);
        System.out.println(moon instanceof SolarSystem);

        moon.orbit(); // Accessing method from the interface
    }

    @Override
    public void orbit() {
        System.out.println("Orbiting the Earth");
    }
}
