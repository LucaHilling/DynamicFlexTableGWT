package de.hilling.testproject.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hilling.testproject.client.service.ExampleServiceClientImpl;

public class MainGUI extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox txt1;
	private Label resulLbl;
	
	private ExampleServiceClientImpl serviceImpl;
	
	public MainGUI(ExampleServiceClientImpl serviceImpl) {
		initWidget(this.vPanel);
		this.serviceImpl = serviceImpl;
		
		this.txt1 = new TextBox();
		this.vPanel.add(txt1);
		
		Button btn1 = new Button("Say Hello");
		btn1.addClickHandler(new Btn1ClickHandler());
		this.vPanel.add(btn1);
		
		this.resulLbl = new Label("Result will be shown here ");
		
		
	}
	
	
	public void updateLabel(String greeting) {
		this.resulLbl.setText(greeting);
	}
	
	private class Btn1ClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			String name = txt1.getName();
			serviceImpl.sayHello(name);
			
		}
		
	}
	
}
