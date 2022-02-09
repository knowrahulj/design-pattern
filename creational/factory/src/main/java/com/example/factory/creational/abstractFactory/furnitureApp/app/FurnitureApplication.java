package com.example.factory.creational.abstractFactory.furnitureApp.app;

import com.example.factory.creational.abstractFactory.furnitureApp.factory.FurnitureFactory;
import com.example.factory.creational.abstractFactory.furnitureApp.factory.ModernFurnitureFactory;
import com.example.factory.creational.abstractFactory.furnitureApp.factory.VintageFurnitureFactory;

public class FurnitureApplication {

    public FurnitureFactory getInstance(String instance) {
        switch (instance) {
            case "modern": return new ModernFurnitureFactory();
            default: return new VintageFurnitureFactory();
        }
    }
}
