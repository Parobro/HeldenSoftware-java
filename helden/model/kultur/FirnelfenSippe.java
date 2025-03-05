/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oOoO.T;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.Bewahrer;
import helden.model.profession.Former;
import helden.model.profession.Kaempfer;
import helden.model.profession.Legendensaenger;
import helden.model.profession.Wildnislaeufer;
import helden.model.profession.Zauberweber;
import java.util.ArrayList;
import java.util.Iterator;

public class FirnelfenSippe
extends OooO {
    public static final helden.framework.int.P \u00d5\u00f6\u00f8000 = new helden.framework.int.P("K\u00fcste und Inseln", 0, true);
    public static final helden.framework.int.P nullObjectreturn = new helden.framework.int.P("verweltlicht", 5, true);
    private P \u00d4\u00f6\u00f8000;
    private int \u00d8\u00f6\u00f8000 = 0;
    private int forObjectreturn = 0;
    private ArrayList<voidsuper> \u00d3\u00f6\u00f8000;

    public FirnelfenSippe() {
    }

    public FirnelfenSippe(Geschlecht geschlecht) {
        super(geschlecht);
        this.\u00d3\u00f6\u00f8000 = new ArrayList();
    }

    @Override
    public int anzahlAktivierbarerZauber() {
        return 10;
    }

    @Override
    public int anzahlWaehlbareHauszauber() {
        return 3;
    }

    @Override
    public int anzahlWahlbarerLeitzauber() {
        return 3;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(voidsuper.ifforObject, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 3);
        this.setTalentwert(voidsuper.thisvoidObject, 3);
        this.setTalentwert(voidsuper.newnewObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d8\u00d3\u00d8000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, -2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 3);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 4);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 5);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, -2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.thisclassObject, 3);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 4);
        this.setTalentwert(voidsuper.privateObjectObject, 2);
        this.setTalentwert(voidsuper.returnifObject, 3);
        if (this.istVariante(\u00d5\u00f6\u00f8000)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, -1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, -2);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<helden.framework.int.P> getAlleZusatzVarianten() {
        ArrayList<helden.framework.int.P> arrayList = new ArrayList<helden.framework.int.P>();
        arrayList.add(nullObjectreturn);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.O\u00f6O000);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.StringObject);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.whileStringsuper);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K17";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Firnelfen";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d5\u00f8\u00f4000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Elfische Namen");
        return arrayList;
    }

    @Override
    public T getNextLeittalentAuswahl() {
        ++this.forObjectreturn;
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.thisclassObject);
        if (this.istTalentGewaehlt(voidsuper.\u00f80\u00d8000)) {
            arrayList.add(voidsuper.\u00f80\u00d8000);
        }
        if (this.istTalentGewaehlt(voidsuper.Oo\u00d6000)) {
            arrayList.add(voidsuper.Oo\u00d6000);
        }
        arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
        arrayList.add(voidsuper.returnifObject);
        return new T(this, arrayList, 2);
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.ifinterfaceObject.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8\u00f6\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{4};
                ++this.\u00d8\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{3};
                ++this.\u00d8\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00f50\u00f5000);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                int[] nArray = new int[]{4};
                ++this.\u00d8\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00f80\u00d8000);
                arrayList.add(voidsuper.Oo\u00d6000);
                int[] nArray = new int[]{3};
                ++this.\u00d8\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Bewahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Former(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Kaempfer kaempfer = new Kaempfer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        kaempfer.clearMoeglicheVarianten();
        kaempfer.addMoeglicheVariante(kaempfer.getFirnelfischerKaempfer());
        arrayList.add(kaempfer);
        arrayList.add(new Legendensaenger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Wildnislaeufer wildnislaeufer = new Wildnislaeufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        wildnislaeufer.clearMoeglicheVarianten();
        wildnislaeufer.addMoeglicheVariante(wildnislaeufer.getSchneelaeufer());
        arrayList.add(wildnislaeufer);
        Zauberweber zauberweber = new Zauberweber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        zauberweber.clearMoeglicheVarianten();
        zauberweber.addMoeglicheVariante(zauberweber.getZauberweber());
        arrayList.add(zauberweber);
        return arrayList;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f4o0000;
    }

    @Override
    public G getSchrift() {
        return G.\u00d3\u00f4\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (!this.istVariante(\u00d5\u00f6\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
        } else if (this.\u00d4\u00f6\u00f8000 != null) {
            oOOo.o00000(this.\u00d4\u00f6\u00f8000);
        }
        if (!this.istVariante(nullObjectreturn)) {
            oOOo.o00000(oooo_0.o00000(while.StringthisString.toString()));
        }
        oOOo.o00000(oooo_0.o00000(while.fornullsuper.toString()));
        oOOo.o00000(oooo_0.o00000(while.privatenullObject.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00f5\u00d8000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.nullclass);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d3\u00f4O000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!this.istVariante(nullObjectreturn)) {
            arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        }
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        return arrayList;
    }

    @Override
    public int getVerrechnungspunkte() {
        return 100;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        if (!this.istVariante(nullObjectreturn)) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.newreturn));
        }
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Adel/Hierarchien", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "G\u00f6tter/Religion", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Geld/Besitz", 6));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f4\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringpublicnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.iffornew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oo\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.forfloatnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d4\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifnewnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullsupernew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d2\u00d5000, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public ArrayList<ArrayList<helden.framework.int.P>> getZusatzVarianten(helden.framework.int.P p2) {
        ArrayList<ArrayList<helden.framework.int.P>> arrayList = new ArrayList<ArrayList<helden.framework.int.P>>();
        arrayList.add(this.getAlleZusatzVarianten());
        return arrayList;
    }

    @Override
    public boolean hatMehrLeittalentAuswahl() {
        return this.forObjectreturn < 1;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.istVariante(\u00d5\u00f6\u00f8000) && this.\u00d4\u00f6\u00f8000 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d8\u00f6\u00f8000 < 4;
    }

    @Override
    public K repraesenationVerrechnungspunkte() {
        return K.\u00f4o0000;
    }

    @Override
    public void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
        arrayList.add(voidsuper.ifforObject);
        arrayList.add(voidsuper.\u00d4\u00d2\u00d8000);
        arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
        arrayList.add(voidsuper.privateObjectObject);
        arrayList.add(voidsuper.StringvoidObject);
        arrayList.add(voidsuper.returnforObject);
        arrayList.add(voidsuper.newnewObject);
        arrayList.add(voidsuper.o\u00d3\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
        arrayList.add(voidsuper.\u00d40\u00d8000);
        arrayList.add(G.\u00d5\u00f8\u00f4000);
        arrayList.add(G.\u00f50\u00f5000);
        arrayList.add(G.\u00d3\u00f4\u00f5000);
        arrayList.add(G.o0\u00f5000);
        if (this.istTalentGewaehlt(E.\u00d3\u00d6\u00d8000)) {
            arrayList.add(E.\u00d3\u00d6\u00d8000);
        }
        if (this.istTalentGewaehlt(E.\u00d3\u00d5\u00d8000)) {
            arrayList.add(E.\u00d3\u00d5\u00d8000);
        }
        arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00f8\u00d5000);
        arrayList.add(voidsuper.thisvoidObject);
        arrayList.add(voidsuper.\u00f80\u00d6000);
        arrayList.add(voidsuper.\u00d3\u00f4\u00d6000);
        arrayList.addAll(this.\u00d3\u00f6\u00f8000);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Firnelfische Sippe");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<helden.framework.int.P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleLeittalent(voidsuper voidsuper2) {
        this.\u00d3\u00f6\u00f8000.add(voidsuper2);
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00d4\u00f6\u00f8000 = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d5\u00f6\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 2);
        if (this.istVariante(nullObjectreturn)) {
            this.putModifikator(b_0.\u00f4\u00f5\u00d2000, -3);
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d5\u00f6\u00f8000);
    }
}

