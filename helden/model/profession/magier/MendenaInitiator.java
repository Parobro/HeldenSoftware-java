/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.magier.Mendena;
import java.util.ArrayList;

public class MendenaInitiator
extends Mendena {
    public MendenaInitiator() {
        super("Initiator", 29);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Armatrutz"), 5);
        k_02.\u00d200000(this.getZauber("Panik"), 4);
        k_02.\u00d200000(this.getZauber("Hartes schmelze!"), 4);
        k_02.\u00d200000(this.getZauber("Visibili"), 4);
        k_02.\u00d200000(this.getZauber("Adlerschwinge"), 3);
        k_02.\u00d200000(this.getZauber("Ignifaxius"), 3);
        k_02.\u00d200000(this.getZauber("Transversalis"), 3);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Armatrutz"));
        arrayList.add(this.getZauber("Panik"));
        arrayList.add(this.getZauber("Hartes schmelze!"));
        arrayList.add(this.getZauber("Visibili"));
    }
}

