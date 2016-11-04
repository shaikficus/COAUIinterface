package com.oracle.fuse.util;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.model.QueryDescriptor;
import oracle.adf.view.rich.model.QueryModel;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class UtilLibrary {
    /*public UtilLibrary() {
        super();
    }*/

    public void cancelButton(ActionEvent actionEvent) {
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());

       BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        System.out.println("Util Library: " + operationBinding + "\n");

    }

    public void saveAndClose(ActionEvent actionEvent) {


        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
        //refreshPage();
        System.out.println("Util Library save and close Binding: " +
                           operationBinding + "\n");
    }


    /* Delet */
    boolean reander = true;
    boolean rennder2 = true;

    public String clickButton() {
        setReander(false);
        return null;
    }

    public void setReander(boolean reander) {
        this.reander = reander;
    }

    public boolean isReander() {
        return reander;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void closePopup(ActionEvent actionEvent) {
        // Add event code here...
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());
    }

    public void saveClose(ActionEvent actionEvent) {
        // Add event code here...
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());
        System.out.println("Util Library save  close: " +
                           actionEvent.getComponent() + "\n");
        System.out.println("Inside Save Close"+ "\n");
        
    }
}
