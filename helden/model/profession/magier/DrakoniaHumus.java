/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Drakonia;
import java.util.ArrayList;

public class DrakoniaHumus
extends Drakonia {
    public DrakoniaHumus() {
        super("Drakonia (Humus)");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d5\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d5\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.whilenewnew), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 2);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.thispublicnew, K.\u00f800000, ""), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f4\u00d3000), 4);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.\u00f5\u00f8\u00d4000, K.\u00f800000, ""), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00f4\u00d4000), 3);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.\u00f8\u00d3\u00d4000, K.\u00f800000, ""), 2);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.whilenewnew));
    }

    @Override
    public String toString() {
        return "Konzil der Elemente zu Drakonia - Humuselementarist";
    }
}

