package Interface;

public class Lahmacun implements Food{

    @Override
    public String taste() {
        return "spice and very thin";
    }
    String dough(){
        return "dough";
    }
    String addMeat(){
        return "addMeat";
    }
    String bake(){
        return "bake";
    }



}
