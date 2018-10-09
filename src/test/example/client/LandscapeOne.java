package test.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeOne extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	
	public LandscapeOne() {
		initWidget(this.vPanel);
		
		Image landscape1 = new Image("/images/Landscape1.jpg");
		landscape1.setWidth("600px");
		this.vPanel.add(landscape1);
	}
}
