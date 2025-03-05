/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.BasisProfessionTharun;
import helden.model.tharun.profession.brigantai.BrigantaiVariante;
import java.util.Iterator;

public class Brigantai
extends BasisProfessionTharun {
    private P \u00d8\u00f4\u00d6O00;

    public Brigantai() {
    }

    public Brigantai(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBrigantai() {
        if (this.\u00d8\u00f4\u00d6O00 == null) {
            this.\u00d8\u00f4\u00d6O00 = new BrigantaiVariante();
        }
        return this.\u00d8\u00f4\u00d6O00;
    }

    @Override
    public String getID() {
        return "P220";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Brigantai");
        } else {
            stringBuffer.append("Brigantai");
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
        this.addAlleVarianten(this.getBrigantai());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBrigantai());
    }
}

