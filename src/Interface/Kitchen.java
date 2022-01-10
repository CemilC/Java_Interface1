package Interface;

public class Kitchen {

    public static void main(String[] args) {

    Food adanaKebap=new AdanaKebap();
    Food borsh=new Borsh();
    Food lahmacun=new Lahmacun();
    Food palov=new Palov();

    Kitchen asci=new Kitchen();
    asci.cook(adanaKebap);
    asci.cook(borsh);
    asci.cook(lahmacun);
    asci.cook(palov);

    }
    public void cook(Food item){
        System.out.println("**********"+item.getClass().getSimpleName()+"**********");
        //System.out.println("Taste:"+item.taste());
        item.print();
        item.looksLike();

        if(item instanceof AdanaKebap){
            AdanaKebap adanaKebap=(AdanaKebap) item;
            System.out.println(adanaKebap.grill());
            System.out.println(adanaKebap.marinade());
        }
        else if(item instanceof Borsh){
            Borsh borsh=(Borsh) item;
            System.out.println(borsh.boil());
            System.out.println(borsh.eatTomorrow());
        }
        else if (item instanceof Lahmacun){
            Lahmacun lahmacun=(Lahmacun) item;
            System.out.println(lahmacun.dough());
            System.out.println(lahmacun.addMeat());
            System.out.println(lahmacun.bake());
        }
        else if(item instanceof Palov){
            Palov palov=(Palov) item;
            System.out.println(palov.boil());
            System.out.println(palov.fry());
        }
    }
}