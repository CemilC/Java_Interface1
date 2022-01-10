package Interface;

public class Borsh implements Food{
    @Override
    public String taste() {
        return "I dont have an idea how it tastes";
    }

    String boil(){

        return  "boil";
    }

    String eatTomorrow(){
        return "will be better if you eat one day later";
    }
}