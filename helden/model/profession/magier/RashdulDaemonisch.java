/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Rashdul;
import java.util.ArrayList;

public class RashdulDaemonisch
extends Rashdul {
    public RashdulDaemonisch() {
        super("Rashdul 2", 29);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00f8O0000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.o0\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00d3\u00f6000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d2\u00f8\u00f6000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f80000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00f5\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.returnfloat.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00d2o000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d3\u00f6\u00d3000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00f5\u00f5\u00d5000, "D\u00e4monologie"));
        arrayList.add(oooo_0.o00000(while.newinterfacesuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
                arrayList.add(this.getZauber(Zauber.newifnew));
                arrayList.add(this.getZauber(Zauber.\u00f5\u00d4\u00d3000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 4);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d5\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d6\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d2\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f4\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.ifnewnew), 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d5000));
        arrayList.add(new for(while.o\u00f5\u00d3000));
        arrayList.add(new for(while.\u00d2\u00f8\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        M m = (M)helden.framework.C.K.o00000(I.thisintsuper);
        m.\u00d2o0000();
        m.o00000("D\u00e4monen");
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newifnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.ifthisObject));
        arrayList.add(this.getZauber(Zauber.nullinterfacesuper));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f4\u00d4000));
    }

    @Override
    public String toString() {
        return "Pentagramm-Akademie zu Rashdul (d\u00e4monischer Zweig)";
    }
}

