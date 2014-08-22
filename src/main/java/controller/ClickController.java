package controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
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
			 new Runnable() {
				@Override
				public void run() {
					System.out.println("Just sleep, baby..");
					 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.run();
		  System.out.println("Hello click my old friend...");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("One click only :)"));	
	}
}