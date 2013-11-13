package net.nothinginteresting.vaadin.event.bus.example;

import net.nothinginteresting.vaadin.event.bus.ViewHandler;

import com.vaadin.server.ClientConnector.AttachEvent;
import com.vaadin.ui.Button;

public class ExampleController
{
	@ViewHandler
	private void init(AttachEvent event)
	{
		System.out.println("ExampleController:" + event);
	}

	@ViewHandler("button")
	private void buttonClicked(Button.ClickEvent event)
	{
		System.out.println("ExampleController:" + event);
	}
}
