/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import java.util.ArrayList;
import java.util.Vector;

public class Kor
extends I
implements private_0 {
    private int \u00d4\u00d5\u00f5O00 = 0;
    private Vector<voidsuper> \u00d5\u00d5\u00f5O00;

    public Kor() {
        super("Kor", 11);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.whilewhilesuper);
        vector.add(b_0.\u00f4\u00f4\u00d2000);
        vector.add(b_0.returnwhilesuper);
        vector.add(b_0.privatedosuper);
        return vector;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 14;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 14;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00f4\u00d5\u00d6000);
        vector.add(voidsuper.\u00d5\u00d5\u00d6000);
        vector.add(voidsuper.\u00f5\u00f5\u00d6000);
        vector.add(voidsuper.StringObjectObject);
        vector.add(voidsuper.o\u00f8\u00d5000);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(E.\u00d8\u00d5\u00d8000);
        vector.add(voidsuper.ifforObject);
        vector.add(voidsuper.\u00d4\u00d2\u00d8000);
        vector.add(voidsuper.\u00d5O\u00d6000);
        vector.add(voidsuper.\u00d4\u00f8\u00d5000);
        vector.add(voidsuper.o\u00d3\u00d6000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.nullvoidObject);
        vector.add(voidsuper.\u00d5o\u00d8000);
        return vector;
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 2);
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 1);
        k_02.o00000(b_0.\u00f5\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        ++this.\u00d4\u00d5\u00f5O00;
        ArrayList<voidsuper> arrayList = N.floatsuper().interface();
        return new s_1(this, arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3oo000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d4\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringnull.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2O\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d5\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d4\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00d8\u00d5\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 2);
        k_02.o00000(voidsuper.StringclassObject, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.nullvoidObject, 4);
        k_02.o00000(voidsuper3, 5);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00d2\u00d6000, 3);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00f5\u00d8o000);
        arrayList.add(helden.framework.C.I.\u00d5\u00d3O000);
        arrayList.add(helden.framework.C.I.forsupersuper);
        arrayList.add(helden.framework.C.I.Ooo000);
        arrayList.add(helden.framework.C.I.\u00d4OO000);
        arrayList.add(helden.framework.C.I.newfor);
        arrayList.add(helden.framework.C.I.\u00d3Oo000);
        arrayList.add(helden.framework.C.I.\u00d30\u00d2000);
        arrayList.add(helden.framework.C.I.\u00d5oo000);
        arrayList.add(helden.framework.C.I.\u00f5\u00d50000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d3O000);
        M m = (M)K.o00000(helden.framework.C.I.\u00d8\u00f8O000);
        m.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString());
        arrayList.add(m);
        arrayList.add(helden.framework.C.I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Kor"}));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d50000));
        return oo0O;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return this.\u00d4\u00d5\u00f5O00 < 1;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
        vector.addAll(this.\u00d5\u00d5\u00f5O00);
    }

    @Override
    public String toString() {
        return "Kor";
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
        this.\u00d5\u00d5\u00f5O00.add(voidsuper2);
    }
}

