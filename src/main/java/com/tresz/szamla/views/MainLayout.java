package com.tresz.szamla.views;

import com.tresz.szamla.viewcontrollers.LoginSecurityController;
import com.tresz.szamla.viewcontrollers.ProductPropertyController;
import com.tresz.szamla.views.list.ListView;
import com.tresz.szamla.views.szamlak.SzamlakView;
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

    private final ProductPropertyController propertyController;
    private final LoginSecurityController securityController;
    public MainLayout(ProductPropertyController propertyController, LoginSecurityController securityController) {
        this.propertyController = propertyController;
        this.securityController = securityController;

        CreateHeader();
        CreateDrawer();
    }

    private void CreateHeader() {

        //Link
        H1 logo = new H1("Számla adatok bevitele app v."+propertyController.getProductVersion());

        Button logoutBtn = new Button("Kilépés", e -> securityController.Logout());

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
        menuBar.add(listLink,
                new RouterLink("Masik menü", SzamlakView.class));
        menuBar.setHeightFull();
        menuBar.getElement().getThemeList().add("dark");

        addToDrawer(menuBar);

    }
}
