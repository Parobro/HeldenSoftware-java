/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.d.oooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.maggrundprof.HeilerVariante;
import java.util.ArrayList;

public class HeilerH
extends HeilerVariante {
    public HeilerH() {
        super("Heiler (H)", "Heilerin (H)", 2, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Instruktion", "Antimagie"));
                arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        return this.getAuswahlenFuerHZ();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f8O\u00d2000));
        return arrayList;
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

    @Override
    protected int getUmfangFormelPool() {
        return 200;
    }
}

