#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class ${module} implements EntryPoint{

	@Override
	public void onModuleLoad() {
		Window.alert("${module} loaded");
	}

}
