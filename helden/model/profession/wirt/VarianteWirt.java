/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.wirt;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class VarianteWirt
extends N {
    public VarianteWirt() {
        super("Wirt", 1);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("kleiner Karren mit Zugtier");
        arrayList.add("ausgebildeter Haushund");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.O\u00f6o000);
        arrayList.add(I.privateclass);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f5o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Umgebung der Sch\u00e4nke"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4, 3, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList = new ArrayList();
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList = new ArrayList();
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.ififObject);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 3);
        k_02.o00000(voidsuper.O0\u00d6000, 3);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 5);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.nullObjectObject, 1);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.thisintObject, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper3, 3);
        k_02.o00000(voidsuper.\u00d5\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d8O\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d6000, 2);
        k_02.o00000(voidsuper.privatedoObject, 5);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.forObject);
        arrayList.add(I.newif);
        arrayList.add(I.thisclass);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00f4\u00f4o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00d8\u00f60000);
        j3.oO0000(25);
        oo0O.\u00d300000(j3);
        return oo0O;
    }
}

