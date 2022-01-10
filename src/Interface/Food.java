package Interface;

public interface Food {

    String taste();

    default void print(){

        System.out.println("Taste:"+taste());
    }
    default void looksLike(){
        System.out.println("Looks Like Good");
    }

}