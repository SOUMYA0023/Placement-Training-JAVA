interface Player {
    void play();
}

abstract class Sports {
    protected String name;
    
    public Sports(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void play();
}

class Cricketer extends Sports implements Player {
    public Cricketer(String name) {
        super(name);
    }
    
    @Override
    public void play() {
        System.out.println("Playing cricket as " + getName());
    }
}

class Footballer extends Sports implements Player {
    public Footballer(String name) {
        super(name);
    }
    
    @Override
    public void play() {
        System.out.println("Playing football as " + getName());
    }
}

public class SportsManagement {
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer("Soumya Kar");
        Footballer footballer = new Footballer("Lionel Messi");
        
        cricketer.play();
        footballer.play();
    }
}