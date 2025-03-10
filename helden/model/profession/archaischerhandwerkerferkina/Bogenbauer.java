/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkerferkina;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkerferkina.ArchaischerHandwerkerDerFerkinas;
import java.util.ArrayList;

public class Bogenbauer
extends ArchaischerHandwerkerDerFerkinas {
    public Bogenbauer() {
        super("Bogenbauer/Armbruster", 2);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        int n = 4;
        return n;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Bogenbauer/Armbruster";
        }
        return "Bogenbauerin/Armbrusterin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        if (n == 0) {
            return new objectsuper_0(this.getProfession(), oooo_0.o00000(voidsuper.forvoidObject), 1);
        }
        return null;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.forvoidObject, 6);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        return k_02;
    }
}

