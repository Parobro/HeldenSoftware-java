/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gaukler;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.gaukler.VarianteGaukler;

public class Possenreisser
extends VarianteGaukler {
    public Possenreisser() {
        super("Possenrei\u00dfer", 5);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Possenrei\u00dfer";
        }
        return "Possenrei\u00dferin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.OO\u00d6000, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.\u00d200000(voidsuper.returnwhileObject, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.newnullObject, 1);
        return k_02;
    }
}

