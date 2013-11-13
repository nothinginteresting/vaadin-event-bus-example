package net.nothinginteresting.vaadin.event.bus.example;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("vaadin_event_bus_example")
public class ExampleUI extends UI
{
	@Override
	protected void init(VaadinRequest request)
	{
		setContent(new ExampleComponent());
	}
}
