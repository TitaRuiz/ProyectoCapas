package com.corenetworks.ProyectoCapas.servicio;

import com.corenetworks.ProyectoCapas.modelo.Pedido;

import java.util.List;

public interface IPedidoServicio {
    Pedido insertar(Pedido p);
    Pedido modificar(Pedido p);
    Pedido eliminar(int id);
    Pedido obtenerUno(int id);
    List<Pedido> obtenerTodos();
}
