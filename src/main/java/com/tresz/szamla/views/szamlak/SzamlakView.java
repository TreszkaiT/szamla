package com.tresz.szamla.views.szamlak;

import com.tresz.szamla.views.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "masodikmenu", layout = MainLayout.class)
public class SzamlakView extends VerticalLayout {

    public SzamlakView() {
        H1 h1 = new H1("fafa");

        add(h1);
    }
}
