public class Footballer extends Sports implements Player {
    public Footballer(String name) {
        super(name);
    }
    
    @Override
    public void play() {
        System.out.println("Playing football as " + getName());
    }
}