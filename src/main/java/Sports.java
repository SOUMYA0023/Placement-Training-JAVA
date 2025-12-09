public abstract class Sports {
    protected String name;
    
    public Sports(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void play();
}