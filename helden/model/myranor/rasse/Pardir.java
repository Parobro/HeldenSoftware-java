/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.Wuerfel;
import helden.framework.d.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import java.util.ArrayList;

public class Pardir
extends o0oo_0 {
    private static final int o\u00f60O00 = 120;
    private static final int O\u00f60O00 = 170;
    private static final int \u00f8\u00f50O00 = 2;
    private static final int privatefloatreturn = 0;

    public Pardir() {
    }

    public Pardir(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(55);
        arrayList.add(60);
        arrayList.add(65);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarzbraun", 15, 20));
        arrayList.add(new oooo_1("dunkelbraun", 5, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Blutrausch"));
        arrayList.add(K.o00000("Leben im Jetzt"));
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 120;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz / sandgelb", 9, 20));
        arrayList.add(new oooo_1("schwarz / goldgelb", 7, 20));
        arrayList.add(new oooo_1("schwarz / ocker", 4, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R40";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(this.getGeschlecht()));
        arrayList.add(new StaedtischeKultur(this.getGeschlecht()));
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMaxGroesse() - 120;
    }

    @Override
    public int getMaxGroesse() {
        return 170 + Wuerfel.max(20, 2) + Wuerfel.max(6, 0);
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 120;
    }

    @Override
    public int getMinGroesse() {
        return 172;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d50000));
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.\u00d300000(K.o00000("D\u00e4mmerungssicht"));
        oo0O.\u00d300000(K.o00000("Gefahreninstinkt"));
        oo0O.\u00d300000(K.o00000("Herausragende Balance"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrliche Waffen", "Krallen (1W6+1 (A))", "Krallen (1W6+1)", "Biss (1W6+4)"));
        oo0O.\u00d300000(K.o00000("Nat\u00fcrlicher R\u00fcstungsschutz", 1));
        oo0O.\u00d300000(K.o00000("Springgelenke", new Object[]{"2"}));
        oo0O.\u00d300000(K.o00000(I.\u00d800000.toString(), new Object[]{"Balanceschwanz"}));
        oo0O.\u00d300000(K.o00000("Blutdurst", 6));
        oo0O.\u00d300000(K.o00000("J\u00e4hzorn", 6));
        oo0O.\u00d300000(K.o00000("Nahrungsrestriktion", "Fleischfresser"));
        oo0O.\u00d300000(K.o00000("Raubtiergeruch"));
        oo0O.\u00d300000(K.o00000("Unf\u00e4higkeit f\u00fcr [Talentgruppe]", new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper.toString()}));
        oo0O.\u00d300000(K.o00000("Unstet"));
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Pardo";
        }
        return "Parda";
    }

    @Override
    public int wurfeleAlter() {
        return 12 + Wuerfel.w3();
    }

    @Override
    protected int erwuerfleGroesse() {
        return 170 + Wuerfel.sum(20, 2) + Wuerfel.sum(6, 0);
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("MU"), 1);
        this.putModifikator(b_0.void("KL"), -2);
        this.putModifikator(b_0.void("IN"), 2);
        this.putModifikator(b_0.void("FF"), -2);
        this.putModifikator(b_0.void("GE"), 1);
        this.putModifikator(b_0.void("KO"), 2);
        this.putModifikator(b_0.void("LE"), 12);
        this.putModifikator(b_0.void("AU"), 12);
        this.putModifikator(b_0.void("MR"), -6);
    }
}

