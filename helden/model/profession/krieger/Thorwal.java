/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Thorwal
extends BasisKrieger {
    public Thorwal() {
        super("Thorwal", 25);
    }

    public Thorwal(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.thissuperString);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d3\u00d8000, 3);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.\u00d5\u00d4\u00d8000, 4);
        k_02.\u00d200000(E.\u00d3\u00d5\u00d8000, 4);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, -3);
        k_02.\u00d200000(voidsuper.returnprivateObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000);
        k_02.o00000(voidsuper.o\u00f4\u00d6000);
        k_02.\u00d200000(voidsuper.nullvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(G.\u00d8\u00d8\u00f5000);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f5000, 4);
        k_02.\u00d200000(G.whilewhileString, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.\u00d60\u00d5000));
        arrayList.add(new for(while.o\u00f4\u00d6000));
        arrayList.add(new for(while.\u00f5\u00d6O000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "K\u00e4mpferschule Ugdalfskronir in Thorwal";
    }
}

