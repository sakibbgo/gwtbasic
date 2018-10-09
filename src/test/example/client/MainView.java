package test.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private VerticalPanel contentPanel;
	
	public MainView(){
		initWidget(this.vPanel);
		this.vPanel.setBorderWidth(1);
		
		MenuView menu = new MenuView(this);
		this.vPanel.add(menu);
		
		this.contentPanel = new VerticalPanel();
		this.vPanel.add(contentPanel);
		
		Label textLbl1 = new Label("Press a button to see a nice landscape!");
		this.contentPanel.add(textLbl1);
	}
	
	public void openLandscape1() {
		this.contentPanel.clear();
		LandscapeOne page1 = new LandscapeOne();
		this.contentPanel.add(page1);
	}
	
	public void openLandscape2() {
		this.contentPanel.clear();
		LandscapeTwo page2 = new LandscapeTwo();
		this.contentPanel.add(page2);
	}
}
