/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.leibwaechter.LeibwaechterVariante;
import java.util.Iterator;

public class Leibwaechter
extends L {
    private P nullfloatint;

    public Leibwaechter() {
    }

    public Leibwaechter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P167";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getLeibwaechter() {
        if (this.nullfloatint == null) {
            this.nullfloatint = new LeibwaechterVariante();
        }
        return this.nullfloatint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Leibw\u00e4chter");
        } else {
            stringBuffer.append("Leibw\u00e4chter");
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
        this.addAlleVarianten(this.getLeibwaechter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLeibwaechter());
    }
}

