package com.company;

import com.company.Enemies.Enemy;
import com.company.Personnage.Personnage;
import com.company.Plateau.Case;

public interface Fight {

    // SOIT mettre un enemy en parametre
    void interaction(Case cell);
}