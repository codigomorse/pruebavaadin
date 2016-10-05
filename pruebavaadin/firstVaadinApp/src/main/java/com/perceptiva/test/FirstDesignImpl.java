package com.perceptiva.test;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;

public class FirstDesignImpl extends firstDesign {

	private static final long serialVersionUID = 1L;
	
	public FirstDesignImpl() {
		btn1.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				hl.addComponent(new Label("Hola Omar"));
				
			}
		});
	}
	
}
