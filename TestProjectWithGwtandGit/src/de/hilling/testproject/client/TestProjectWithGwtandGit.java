package de.hilling.testproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import de.hilling.testproject.client.service.ExampleServiceClientImpl;


/**
 * @author LucaH
 * Entry point class define <code>onModuleLoad() <code>.
 */
public class TestProjectWithGwtandGit implements EntryPoint {


	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ExampleServiceClientImpl clientImpl = new ExampleServiceClientImpl(GWT.getModuleBaseURL() + "exampleservice");
			RootPanel.get().add(clientImpl.getMainGUI());	
	}
	
}
