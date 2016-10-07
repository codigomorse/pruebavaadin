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
		btnWolverine.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getPage().setLocation("https://www.youtube.com/watch?v=tCyHmxMZQIQ");

			}
		});
		btnSuperman.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getPage().setLocation("https://www.youtube.com/watch?v=f6YNeHakAAU");

			}
		});
		btnRobocosa.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getPage().setLocation("https://www.youtube.com/watch?v=H24Y1vycaWA");

			}
		});
		btnXMen.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getPage().setLocation("https://www.youtube.com/watch?v=dTHQmeuP6dM");

			}
		});

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
