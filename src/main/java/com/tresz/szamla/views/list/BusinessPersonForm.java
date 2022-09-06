package com.tresz.szamla.views.list;

import com.tresz.szamla.datas.pojos.BusinessPerson;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class BusinessPersonForm extends FormLayout {
    private Binder<BusinessPerson> binder;

    public BusinessPersonForm(boolean readOnly) {
        // For binding the form to the data model
        binder = new Binder<>(BusinessPerson.class);

        TextField nameField = new TextField();
        addFormItem(nameField, "Name");
        binder.bind(nameField, BusinessPerson::getName,
                BusinessPerson::setName);
        nameField.setReadOnly(readOnly);

        TextField titleField = new TextField();
        addFormItem(titleField, "Title");
        binder.forField(titleField)
                .bind(BusinessPerson::getTitle,
                        BusinessPerson::setTitle);
        titleField.setReadOnly(readOnly);
    }

    public Binder<BusinessPerson> getBinder() {return binder;}
}
