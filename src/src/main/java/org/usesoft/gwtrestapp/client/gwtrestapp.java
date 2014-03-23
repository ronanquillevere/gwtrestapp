package org.usesoft.gwtrestapp.client;

import java.util.List;

import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
import org.usesoft.gwtrestapp.client.api.client.HelloClient;
import org.usesoft.gwtrestapp.shared.domain.Hello;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class gwtrestapp implements EntryPoint {
 
  public void onModuleLoad() {
    
	Defaults.setServiceRoot(GWT.getHostPageBaseURL());
	  
	HelloClient client = GWT.create(HelloClient.class);
	
	client.getHellos(new MethodCallback<List<Hello>>() {
		
		public void onSuccess(Method method, List<Hello> response) {
			VerticalPanel panel = new VerticalPanel();
			for (Hello hello : response) {
				Label label = new Label(hello.getName());
				panel.add(label);
			}
			RootLayoutPanel.get().add(panel);
		}
		
		public void onFailure(Method method, Throwable exception) {
			Label label = new Label("Error");
			RootLayoutPanel.get().add(label);
		}
	});
  }
}
