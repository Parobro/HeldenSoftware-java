/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.kophta;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.kophta.BasisKophta;
import java.util.ArrayList;

public class ElBurum
extends BasisKophta {
    public ElBurum() {
        super("ElBurum", 24);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schule des Erhabenen Blicks zu El'Burum";
        }
        return "Schule des Erhabenen Blicks zu El'Burum";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.privateforObject.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 5);
        k_02.\u00d200000(voidsuper.StringclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 3);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 5);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.nullvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 5);
        k_02.\u00d200000(voidsuper.StringObjectObject, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.privatedoObject, 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d40\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f5\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d2\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.ifnewnew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 2);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00d2\u00d5000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f80\u00d5000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d6\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f8\u00d3000), 1);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00d5\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d4\u00d3000), 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d6\u00f5\u00d4000));
        arrayList.add(new for(while.\u00d8\u00f5\u00d8000));
        arrayList.add(new for(while.\u00d6\u00d5\u00d8000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d4000));
        arrayList.add(this.getZauber(Zauber.o\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8o\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

