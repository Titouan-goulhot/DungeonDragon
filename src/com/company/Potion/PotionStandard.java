package com.company.Potion;

public class PotionStandard extends Potion{

    //-------------------------ATTRIBUTS-------------------------------------//



    //-----------------------CONSTRUCTEURS---------------------------------//

    public PotionStandard() {
        setName("Potion Standard");
        setCure(2);
    }

    public PotionStandard(String name, int cure){
        super(name, cure);
    }

    //---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "une " + getName() + " qui vous rends " + getCure() + " PV";
    }


}
