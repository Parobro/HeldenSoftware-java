/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.model.myranor.profession.maggrundprof.ArkanerHaendlerDiplomatVariante;

public class ArkanerHaendlerDiplomatH
extends ArkanerHaendlerDiplomatVariante {
    public ArkanerHaendlerDiplomatH() {
        super("Arkaner H\u00e4ndler/Diplomat (H)", "Arkane H\u00e4ndlerin/Diplomatin (H)", 6, false);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Halbzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

