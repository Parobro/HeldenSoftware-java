/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkersued;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkersued.VarianteArchaischerHandwerkerDesSuedens;
import java.util.ArrayList;

public class Werkzeugmacher
extends VarianteArchaischerHandwerkerDesSuedens {
    public Werkzeugmacher() {
        super("Werkzeugmacher", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Werkzeugmacher";
        }
        return "Werkzeugmacherin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00d3\u00d8\u00d5000, "Holzwaffen"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.forvoidObject, 3);
        k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 6);
        return k_02;
    }
}

