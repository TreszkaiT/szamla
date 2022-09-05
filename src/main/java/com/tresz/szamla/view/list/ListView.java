package com.tresz.szamla.view.list;

import com.tresz.szamla.view.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Számlák listája")
public class ListView extends VerticalLayout {

    H1 title = new H1("Valami szöveg");

    public ListView() {

        setSizeFull();

        add(title);
    }
}
