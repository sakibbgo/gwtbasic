package test.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTTestProject implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		MainView mainView = new MainView();
		RootPanel.get().add(mainView);
	}
}
