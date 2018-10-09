package test.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeTwo extends Composite {
private VerticalPanel vPanel = new VerticalPanel();
	
	public LandscapeTwo() {
		initWidget(this.vPanel);
		
		Image landscape2 = new Image("/images/Landscape2.jpg");
		landscape2.setWidth("600px");
		
		this.vPanel.add(landscape2);
	}
}
