package com.corenetworks.ProyectoCapas;

import com.corenetworks.ProyectoCapas.modelo.Pedido;
import com.corenetworks.ProyectoCapas.servicio.IPedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProyectoCapasApplication implements CommandLineRunner {
	@Autowired
	private IPedidoServicio servicio;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido p1 = new Pedido(0, LocalDate.now(),"EFEC",300);
		System.out.println(servicio.insertar(p1));

	}
}
