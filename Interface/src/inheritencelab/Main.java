package inheritencelab;

Class One {
    void print_geek();
}

Class Two {
    void print_for();
}

Class Three extends One, Two {
    void print_geek();
}

class Child implements Three {
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for() {
        System.out.println("for");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}

