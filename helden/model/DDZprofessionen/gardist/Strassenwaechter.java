/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gardist;

import helden.framework.C.I;
import helden.framework.D.OoOO.D;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gardist.Gardist;
import java.util.ArrayList;

public class Strassenwaechter
extends Gardist {
    public Strassenwaechter() {
        super("Stra\u00dfenw\u00e4chter", 8);
    }

    public Strassenwaechter(String string, int n) {
        super(string, 8 + n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("H\u00e4uschen am Wegesrand");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Stra\u00dfenw\u00e4chter";
        }
        return "Stra\u00dfenw\u00e4chterin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.O\u00f8o000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.Ooo000);
        arrayList.add(I.\u00d4\u00d8O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Gambeson"));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Lederharnisch"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        D d2 = (D)oooo_0.o00000(while.\u00d30\u00d2000.toString());
        d2.\u00d500000("Kleinstadt/Stadtteil");
        arrayList.add(d2);
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00d8\u00d5\u00d8000, 5);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 5);
        k_02.\u00d200000(E.newnewString, 3);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 4);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.returninterfaceString));
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        arrayList.add(new for(while.\u00d5\u00d4\u00d4000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

