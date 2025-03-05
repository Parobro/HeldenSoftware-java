/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class Nachtwind
extends LehrmeisterBase {
    public Nachtwind() {
        super("Nachtwind", "Nachtwind", 14, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("magischer Gegenstand (1 pAsP)");
        arrayList.add("Abschrift eines alten Zauberbuches");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Astrale Regeneration"));
        arrayList.add(helden.framework.C.K.o00000("Astralmacht"));
        arrayList.add(helden.framework.C.K.o00000("Ausdauernder Zauberer"));
        arrayList.add(helden.framework.C.K.o00000("Feste Matrix"));
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(helden.framework.C.K.o00000("Hohe Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Schnelle Heilung"));
        arrayList.add(helden.framework.C.K.o00000("Eitelkeit"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Feste Gewohnheit"));
        arrayList.add(helden.framework.C.K.o00000("Festgef\u00fcgtes Denken"));
        arrayList.add(helden.framework.C.K.o00000("Thesisgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringwhileString));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schwerter"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Urtulamidya"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Urtulamidya"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Tulamidya"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(helden.framework.C.K.o00000("Guter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Veteran"));
        arrayList.add(helden.framework.C.K.o00000("Aberglaube"));
        arrayList.add(helden.framework.C.K.o00000("Animalische Magie"));
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Niedrige Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
        arrayList.add(helden.framework.C.K.o00000("Ungebildet"));
        arrayList.add(helden.framework.C.K.o00000("Unstet"));
        arrayList.add(helden.framework.C.K.o00000("Unvertr\u00e4glichkeit mit verarbeitetem Metall"));
        arrayList.add(helden.framework.C.K.o00000("Wilde Magie"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00f6\u00d6\u00d4000), for.o00000(helden.framework.d.oooo_0.o00000(while.returninterfacenew)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.returninterfacenew), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00f6\u00d6\u00d4000)).get(0)));
        arrayList.addAll(this.getAuswahl(new String[]{"Applicatus", "Axxeleratus", "Band und Fessel", "Bewegung st\u00f6ren", "Custodosigil", "D\u00e4monenbann", "Fulminictus", "Hellsicht tr\u00fcben", "Ignifaxius", "Motoricus", "Objekt entzaubern", "Paralysis", "Penetrizzel", "Psychostabilis"}, new Integer[]{7, 6, 6}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Ecliptifactus", "Gardianum", "Kulminatio", "Ver\u00e4nderung aufheben", "Verwandlung beenden", "Widerwille", "Zauberklinge"}, new Integer[]{6, 5, 5}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Caldofrigo", "Destructibo", "Transversalis", "Xenographus"}, new Integer[]{5}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Flim Flam", "Manifesto", "Odem"}, new Integer[]{4, 2}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Armatrutz", "Blitz dich find", "Illusion aufl\u00f6sen", "Menetekel", "Plumbumbarum", "Silentium", "Somnigravis"}, new Integer[]{4, 3, 3}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Applicatus", "Axxeleratus", "Balsam", "Bewegung st\u00f6ren", "Claudibus", "Custodosigil", "D\u00e4monenbann", "Dunkelheit", "Duplicatus", "Fulminictus", "Foramen", "Hellsicht tr\u00fcben", "Ignifaxius", "Motoricus", "Objekt entzaubern", "Paralysis", "Penetrizzel", "Psychostabilis"}, new Integer[]{3, 2}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Analys", "Auris Nasus", "Ecliptifactus", "Gardianum", "Kulminatio", "Magischer Raub", "Widerwille", "Zauberklinge"}, new Integer[]{2}, false));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Qabalya"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

