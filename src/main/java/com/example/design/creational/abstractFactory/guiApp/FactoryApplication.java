package com.example.design.creational.abstractFactory.guiApp;

import com.example.design.creational.abstractFactory.guiApp.app.Application;
import com.example.design.creational.abstractFactory.guiApp.factory.GuiFactory;
import com.example.design.creational.abstractFactory.guiApp.factory.MacOsFactory;
import com.example.design.creational.abstractFactory.guiApp.factory.WindowsFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	private static Application configureApplication() {
		Application app;
		GuiFactory factory;

		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOsFactory();
		} else {
			factory = new WindowsFactory();
		}

		app = new Application(factory);
		return app;
	}

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}

}
