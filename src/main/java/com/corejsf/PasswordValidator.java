package com.corejsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.corejsf.Password")
public class PasswordValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
	
		String pass = (String)value;
		if (pass.contains("@")){
			throw new ValidatorException(new FacesMessage("Password Cannot contain @"));
		}
	}
	

}
