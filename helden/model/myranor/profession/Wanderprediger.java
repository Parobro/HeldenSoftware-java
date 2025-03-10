/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.wanderprediger.WanderpredigerVariante;
import java.util.Iterator;

public class Wanderprediger
extends L {
    private P newforint;

    public Wanderprediger() {
    }

    public Wanderprediger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P185";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getWanderprediger() {
        if (this.newforint == null) {
            this.newforint = new WanderpredigerVariante();
        }
        return this.newforint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Wanderprediger");
        } else {
            stringBuffer.append("Wanderpredigerin");
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
        this.addAlleVarianten(this.getWanderprediger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWanderprediger());
    }
}

