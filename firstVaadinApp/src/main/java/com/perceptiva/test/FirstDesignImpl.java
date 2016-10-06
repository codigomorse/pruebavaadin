package com.perceptiva.test;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;

public class FirstDesignImpl extends firstDesign implements View {

	private static final long serialVersionUID = 1L;
	
	public FirstDesignImpl() {
		btn1.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				hl.addComponent(new Label("Hola Omar"));
				
			}
		});
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
