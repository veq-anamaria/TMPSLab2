package proxy;

public class ProxyGame implements Games{

    private ExistGame existGame;
    private String name;

    public ProxyGame(String name){
        this.name=name;
    }

    @Override
    public void start(){
        if(existGame==null){
            existGame= new ExistGame(name);
        }
        existGame.start();
    }

}
