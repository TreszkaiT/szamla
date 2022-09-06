package com.tresz.szamla.views.list;

import com.tresz.szamla.datas.pojos.BusinessPerson;
import com.tresz.szamla.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Számlák listája")
@PermitAll
public class ListView extends VerticalLayout {

    H1 title = new H1("Valami szöveg");

    public ListView() {

        //setSizeFull();

        //add(title);

        // Data model
        BusinessPerson person = new BusinessPerson();

        // Two editors: the actual editor and read-only display
        BusinessPersonForm editor1 = new BusinessPersonForm(false);
        BusinessPersonForm editor2 = new BusinessPersonForm(true);

        // The editor and buttons
        VerticalLayout layout1 = new VerticalLayout();
        HorizontalLayout buttons = new HorizontalLayout();
        Button saveButton = new Button("Save");
        saveButton.addClickListener(click -> {
            try {
                editor1.getBinder().writeBean(person);
                editor2.getBinder().readBean(person);
            } catch (ValidationException e) {}
        });
        Button resetButton = new Button("Reset");
        resetButton.addClickListener(click -> {
            editor1.getBinder().readBean(person);
        });
        buttons.add(saveButton, resetButton);
        layout1.add(editor1, buttons);

        VerticalLayout layout2 = new VerticalLayout();
        layout2.add(editor2);

        // Show the two editors side-by-side
        HorizontalLayout hlayout = new HorizontalLayout();
        hlayout.setDefaultVerticalComponentAlignment(
                FlexComponent.Alignment.START);
        hlayout.add(layout1, layout2);
        add(hlayout);
    }
}
