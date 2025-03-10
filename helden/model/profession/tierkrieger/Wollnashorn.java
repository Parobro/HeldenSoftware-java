/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.tierkrieger;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.tierkrieger.BasisDurroDun;
import java.util.ArrayList;
import java.util.Vector;

public class Wollnashorn
extends BasisDurroDun {
    public Wollnashorn() {
        super("Wollnashorn", 18);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00f4\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        arrayList.add(oooo_0.o00000(while.ifdoString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d6O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d20000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d5\u00d4\u00d8000, 4);
        k_02.\u00d200000(E.\u00f8\u00d5\u00d8000, 5);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000);
        k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.\u00f5\u00d3\u00d2000));
        arrayList.add(new for(while.\u00f8\u00d3\u00d2000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f4\u00d8O000));
        M m = (M)helden.framework.C.K.o00000(I.ifif);
        m.\u00d2o0000();
        m.o00000("Geh\u00f6r");
        oo0O.\u00d300000(m);
        M m2 = (M)helden.framework.C.K.o00000(I.O\u00d40000);
        m2.\u00d2o0000();
        m2.o00000("Sicht");
        oo0O.\u00d300000(m2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f8\u00d5o000));
        M<U> m3 = helden.framework.C.K.o00000();
        m3.\u00d2o0000();
        m3.o00000(b_0.O\u00f4\u00d2000);
        m3.o00000(E.\u00f4\u00d6\u00d8000);
        m3.o00000(voidsuper.ifforObject);
        m3.o00000(voidsuper.o\u00d5\u00d6000);
        oo0O.\u00d300000(m3);
        return oo0O;
    }

    @Override
    public String toString() {
        return "Wollnashorn";
    }

    @Override
    protected K getRepraesentation(Zauber zauber) {
        return K.\u00d400000;
    }

    @Override
    protected Vector<KonkreterZauber> getZauber(boolean bl) {
        Vector<KonkreterZauber> vector = new Vector<KonkreterZauber>(23);
        vector.add(this.getZauber(Zauber.\u00d8\u00d6\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d2000));
        vector.add(this.getZauber(Zauber.newfornew));
        vector.add(this.getZauber(Zauber.\u00d4\u00d6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f80\u00d4000));
        vector.add(this.getZauber(Zauber.thispublicnew));
        vector.add(this.getZauber(Zauber.\u00d8O\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f4\u00f4\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d8\u00f4\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f5\u00d4\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d3O\u00d5000));
        vector.add(this.getZauber(Zauber.iffornew));
        vector.add(this.getZauber(Zauber.Stringsupernew));
        vector.add(this.getZauber(Zauber.\u00d4o\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f8\u00d2\u00d4000));
        vector.add(this.getZauber(Zauber.O\u00d8\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.o\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f4\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f5\u00f8\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d3\u00d2\u00d5000));
        if (bl) {
            vector.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
            vector.add(this.getZauber(Zauber.\u00d3o\u00d3000));
            vector.add(this.getZauber(Zauber.\u00d5O\u00d4000));
            vector.add(this.getZauber(Zauber.\u00f50\u00d5000));
            vector.add(this.getZauber(Zauber.\u00d50\u00d3000));
        }
        return vector;
    }
}

