/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.zaubertaenzer;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.zaubertaenzer.TulamidischeSharisad;
import java.util.ArrayList;

public class TulamidischeSharisadMagisch
extends TulamidischeSharisad {
    public TulamidischeSharisadMagisch() {
        super("Tulamidische Sharisad (magisch)", 2);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000) + 1;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 14;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.newvoidString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d6\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.o0\u00f8000.toString()));
        arrayList.add(oooo_0.o00000(while.forreturnObject.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5\u00f4\u00d5000, 4);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00d8o000));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Tulamidische Sharisad (magisch)";
    }
}

