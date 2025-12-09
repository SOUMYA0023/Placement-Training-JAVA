public class Cricketer extends Sports implements Player {
    public Cricketer(String name) {
        super(name);
    }
    
    @Override
    public void play() {
        System.out.println("Playing cricket as " + getName());
    }
}