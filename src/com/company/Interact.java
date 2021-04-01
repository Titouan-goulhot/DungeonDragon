package com.company;

import com.company.Personnage.Personnage;


public interface  Interact {
      /**
       * pour utiliser la méthode Interact dans les classes enfants
       * @param personnage correspond a un "player" donné
       */
      void interaction(Personnage personnage);


}
