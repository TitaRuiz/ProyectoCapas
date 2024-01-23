package com.corenetworks.ProyectoCapas.repositorio;

import com.corenetworks.ProyectoCapas.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepositorio extends JpaRepository<Pedido,Integer> {
}
