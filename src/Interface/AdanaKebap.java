package Interface;

public class AdanaKebap implements Food{

    @Override
    public String taste() {
        return "tastes spice or normal";
    }

    public String marinade(){
        return "marinade";
    }
    public String grill(){
        return "grill";
    }
}