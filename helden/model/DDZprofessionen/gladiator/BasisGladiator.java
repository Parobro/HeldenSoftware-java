/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gladiator;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class BasisGladiator
extends N {
    public BasisGladiator(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Prunkvoller K\u00fcrass");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.newif);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d3\u00f4\u00d2000, 1);
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d5\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 4);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(voidsuper.ifforObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.\u00d4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00d8O000));
        oo0O.\u00d300000(K.o00000(I.ifreturn));
        return oo0O;
    }
}

