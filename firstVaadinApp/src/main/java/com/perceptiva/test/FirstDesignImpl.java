package com.perceptiva.test;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

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
		btnWolverine.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				try {
					Desktop.getDesktop().browse(new URL("http://stackoverflow.com/questions/10967451/open-a-link-in-browser-with-java-button").toURI());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
			}
		});
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
