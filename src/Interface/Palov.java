package Interface;

public class Palov implements Food{
    @Override
    public String taste() {
        return "tastes good - pilav";
    }

    String fry(){

        return "first fry the pirinç";
    }

    String boil(){

        return "boil the prinç for pilav";
    }

}
