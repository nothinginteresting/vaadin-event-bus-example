package net.nothinginteresting.vaadin.event.bus.example;

import net.nothinginteresting.vaadin.event.bus.EventBus;
import net.nothinginteresting.vaadin.event.bus.EventBusOwner;
import net.nothinginteresting.vaadin.event.bus.EventBusUtils;
import net.nothinginteresting.vaadin.event.bus.ViewHandler;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

public class ExampleComponent extends CustomComponent implements EventBusOwner
{
	private final EventBus bus = new EventBus();
	private VerticalLayout layout;
	private Button button;
	private final ExampleController controller;

	public ExampleComponent()
	{
		createWidgets();
		setCompositionRoot(layout);
		EventBusUtils.initEventBusOwner(this, bus);
		controller = new ExampleController();
		bus.subscribe(controller);
	}

	@ViewHandler
	private void init(AttachEvent event)
	{
		System.out.println("ExampleComponent:" + event);
	}

	@ViewHandler("button")
	private void buttonClicked(Button.ClickEvent event)
	{
		System.out.println("ExampleComponent:" + event);
	}

	private void createWidgets()
	{
		layout = new VerticalLayout();
		button = new Button("Click Me");
		layout.addComponent(button);

	}

	@Override
	public EventBus getEventBus()
	{
		return bus;
	}
}
