package com.example.decorator;

import com.example.decorator.decorators.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		DatasourceDecorator encoded = new CompressionDecorator(
				new EncryptionDecorator(
						new FileDataSource( "out/OutputDemo.txt")));
		encoded.writeData(salaryRecords);
		DataSource plain = new FileDataSource("out/OutputDemo.txt");

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}

}
