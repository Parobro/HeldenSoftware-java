/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.baloa.BaLoaVariante;
import java.util.Iterator;

public class BaLoa
extends BasisTraditionsaufsaetze {
    private P \u00d4\u00d8\u00d6O00;

    public BaLoa() {
    }

    public BaLoa(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBaLoa() {
        if (this.\u00d4\u00d8\u00d6O00 == null) {
            this.\u00d4\u00d8\u00d6O00 = new BaLoaVariante();
        }
        return this.\u00d4\u00d8\u00d6O00;
    }

    @Override
    public String getID() {
        return "P190";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("BaLoa");
        } else {
            stringBuffer.append("BaLoa");
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
        this.addAlleVarianten(this.getBaLoa());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBaLoa());
    }
}

