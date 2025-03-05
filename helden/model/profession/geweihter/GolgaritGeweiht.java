/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Golgarit;
import java.util.ArrayList;

public class GolgaritGeweiht
extends Golgarit {
    public GolgaritGeweiht() {
        super("Boron (Golgarit)", 17);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht == null || geschlecht.istMaennlich()) {
            return "Boron (Golgarit)";
        }
        return "Boron (Golgaritin)";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.addAll(oooo_0.\u00d200000());
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d5\u00d5000.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.thisnewsuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5o0000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00f5\u00d5000, 4);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 2);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 4);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 2);
        k_02.\u00d200000(G.\u00d40\u00f6000, 4);
        k_02.\u00d200000(voidsuper.StringObjectObject, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00f5\u00d5000, 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f6\u00f5\u00f5000));
        arrayList.add(new for(while.\u00d2\u00d6\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00f5O000));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getGeschlecht());
    }
}

