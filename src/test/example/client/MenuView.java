package test.example.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {
	private HorizontalPanel hPanel = new HorizontalPanel();
	private MainView main;
	
	public MenuView(MainView main) {
		initWidget(this.hPanel);
		this.main = main;
		
		Button landscape1Btn = new Button("Landscape 1");
		landscape1Btn.addClickHandler(new LS1ClickHandler());
		this.hPanel.add(landscape1Btn);
		
		Button landscape2Btn = new Button("Landscape 2");
		landscape2Btn.addClickHandler(new LS2ClickHandler());
		this.hPanel.add(landscape2Btn);
	}
	
	private class LS1ClickHandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			main.openLandscape1();
			
		}
	}
	
	private class LS2ClickHandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			main.openLandscape2();
			
		}
	}
}
