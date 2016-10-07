package com.perceptiva.test;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification;

public class FirstDesignImpl extends firstDesign implements View {

	private static final long serialVersionUID = 1L;

	public FirstDesignImpl() {
		btnSalir.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				Notification.show("Vuelva pronto!!");
				body.setVisible(false);
			}
		});
		btnVer.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				Notification.show("Bienvenido!!");
				body.setVisible(true);
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
