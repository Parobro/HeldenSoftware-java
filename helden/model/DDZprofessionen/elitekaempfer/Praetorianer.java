/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.elitekaempfer;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.elitekaempfer.VarianteEliteKaempfer;
import java.util.ArrayList;

public class Praetorianer
extends VarianteEliteKaempfer {
    public Praetorianer() {
        super("Praetorianer", 22);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Praetorianer";
        }
        return "Praetorianerin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00f4O000));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000));
        arrayList.add(oooo_0.o00000(while.returninterfaceString));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000));
        arrayList.add(oooo_0.o00000(while.privatethissuper));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.thissuperString);
                arrayList.add(E.StringsuperString);
                int[] nArray = new int[]{7, 4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(E.\u00d3\u00d5\u00d8000, 6);
        k_02.\u00d200000(voidsuper.ifforObject, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.nullvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8O\u00f5000));
        arrayList.add(new for(while.\u00f6\u00f4\u00f6000));
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        arrayList.remove(new for(while.\u00d6\u00d3\u00d2000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

