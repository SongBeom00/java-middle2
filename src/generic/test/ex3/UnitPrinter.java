package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter {


    static <T extends BioUnit> void printV1(Shuttle<T> t){
        t.showInfo();
    }

    static void printV2(Shuttle<? extends BioUnit> t){
        t.showInfo();
    }

}
