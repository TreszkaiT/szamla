package com.tresz.szamla.view;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouterLink;

//@Route(value = "")
@PageTitle("szamlaadatok")
public class MainLayout extends AppLayout {

    public MainLayout() {

        CreateHeader();
        CreateDrawer();
    }

    private void CreateHeader() {

        H1 logo = new H1("Számla adatok bevitele app");

        Button logoutBtn = new Button("Kilépés");

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo, logoutBtn);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setWidth("100%");
        header.getElement().getThemeList().add("dark");

        addToNavbar(header);
    }

    private void CreateDrawer() {

        RouterLink listLink = new RouterLink("Számlák listája", ListView.class);
        listLink.setHighlightCondition(HighlightConditions.sameLocation());

        VerticalLayout menuBar = new VerticalLayout();
        menuBar.add(listLink);
        menuBar.setHeightFull();
        menuBar.getElement().getThemeList().add("dark");

        addToDrawer(menuBar);

    }
}
