/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.hirte;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.hirte.VarianteHirte;

public class NivesischerKarenhirte
extends VarianteHirte {
    public NivesischerKarenhirte() {
        super("Nivesischer Karenhirte", 3);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Nivesische Karenhirte";
        }
        return "Nivesische Karenhirtin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d5\u00d4\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d3\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        return k_02;
    }
}

