#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package org.web.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class WebApp implements EntryPoint{

	@Override
	public void onModuleLoad() {
		Window.alert("it works!");
	}

}
