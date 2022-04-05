package proxy;

public class ExistGame implements  Games{
    private String name;

    public ExistGame(String name){
        this.name= name;
        loading(name);
    }
    @Override
    public void start(){
        System.out.println("Start a game"+name);
    }

    private void loading(String name){
        System.out.println("Loading"+ name);
    }
}
