/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.edelhandwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.edelhandwerker.Edelhandwerker;

public class Tresorbauer
extends Edelhandwerker {
    public Tresorbauer() {
        super("Tresorbauer", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Tresorbauer";
        }
        return "Tresorbauerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.whileStringObject, 2);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d5000, 6);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, 3);
        return k_02;
    }
}

