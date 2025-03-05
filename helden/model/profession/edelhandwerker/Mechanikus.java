/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.edelhandwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.edelhandwerker.Edelhandwerker;
import java.util.ArrayList;

public class Mechanikus
extends Edelhandwerker {
    public Mechanikus() {
        super("Mechanikus", 5);
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Mechanikus";
        }
        return "Mechanika";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(voidsuper.whileStringObject);
                arrayList.add(voidsuper.\u00d4\u00d3\u00d6000);
                arrayList.add(voidsuper.O\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.oo\u00d8000);
                arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                return new returnsuper(this.getProfession(), arrayList, 10, 2);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 7);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        return k_02;
    }
}

