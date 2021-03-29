package com.company.Potion;

public class PotionStandard extends Potion{

    //-------------------------ATTRIBUTS-------------------------------------//

  private String name = "Potion Standard";
   private int cure = 2;

    //-----------------------CONSTRUCTEURS---------------------------------//

    public PotionStandard() {
        super.setName("Potion Standard");
        super.setCure(3);
    }

    public PotionStandard(String name, int cure){
        this.name = name;
        this.cure = cure;
    }

    //---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "une " + name + " qui vous rends " + cure + " PV";
    }


}
