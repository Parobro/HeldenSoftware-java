/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.scholar.ScholarVariante;
import java.util.Iterator;

public class Scholar
extends L {
    private P \u00d3\u00f8\u00d5O00;

    public Scholar() {
    }

    public Scholar(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P155";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getScholar() {
        if (this.\u00d3\u00f8\u00d5O00 == null) {
            this.\u00d3\u00f8\u00d5O00 = new ScholarVariante();
        }
        return this.\u00d3\u00f8\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Scholar");
        } else {
            stringBuffer.append("Scholar");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getScholar());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getScholar());
    }
}

