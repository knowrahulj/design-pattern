package com.example.design.creational.abstractFactory.guiApp.factory;

import com.example.design.creational.abstractFactory.guiApp.domain.buttons.Button;
import com.example.design.creational.abstractFactory.guiApp.domain.buttons.WindowsButton;
import com.example.design.creational.abstractFactory.guiApp.domain.checkboxes.Checkbox;
import com.example.design.creational.abstractFactory.guiApp.domain.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
