/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.Object;

import helden.gui.E.Object.D;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OoOO
extends JPanel {
    private JTextField \u00d500000 = null;
    private JPasswordField Object = null;
    private JList \u00d200000 = null;
    private JButton \u00d400000;
    private D o00000;

    public OoOO(D d2) {
        this.o00000 = d2;
        this.\u00d200000();
    }

    public JTextField \u00d400000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JTextField();
        }
        return this.\u00d500000;
    }

    public JButton class() {
        if (this.\u00d400000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d400000 = new JButton("Senden", imageIcon);
            this.\u00d400000.setName("Senden");
            this.\u00d400000.addActionListener(this.o00000);
        }
        return this.\u00d400000;
    }

    public JPasswordField \u00d300000() {
        if (this.Object == null) {
            this.Object = new JPasswordField();
        }
        return this.Object;
    }

    public JList super() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JList();
        }
        return this.\u00d200000;
    }

    private void \u00d200000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridy = 3;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridy = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridx = 1;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridy = 1;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridx = 1;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.gridy = 0;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridx = 1;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.anchor = 11;
        gridBagConstraints5.gridy = 2;
        JLabel jLabel = new JLabel();
        jLabel.setText("Server");
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.anchor = 11;
        gridBagConstraints6.gridy = 1;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Passwort");
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.fill = 2;
        gridBagConstraints7.anchor = 11;
        gridBagConstraints7.gridy = 0;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Login");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        jPanel.add((Component)jLabel3, gridBagConstraints7);
        jPanel.add((Component)jLabel2, gridBagConstraints6);
        jPanel.add((Component)jLabel, gridBagConstraints5);
        jPanel.add((Component)this.\u00d400000(), gridBagConstraints4);
        jPanel.add((Component)this.\u00d300000(), gridBagConstraints3);
        jPanel.add((Component)new JScrollPaneFast(this.super()), gridBagConstraints2);
        jPanel.add((Component)this.class(), gridBagConstraints);
        this.setSize(300, 292);
        this.setLayout(new BorderLayout());
        this.add((Component)jPanel, "Center");
    }
}

