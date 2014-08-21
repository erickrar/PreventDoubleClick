package controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class ClickController implements Serializable {
	private static final long serialVersionUID = -2288101924751697966L;

	private String message;

	@PostConstruct
	public void init(){
		message = "Hello, World of Click!";
	}

	public String getMessage() {
		return message;
	}

	public void oneClick(ActionEvent event){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("One click only :)"));	
	}
}