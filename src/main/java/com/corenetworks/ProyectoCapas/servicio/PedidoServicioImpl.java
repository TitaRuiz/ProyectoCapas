package com.corenetworks.ProyectoCapas.servicio;

import com.corenetworks.ProyectoCapas.modelo.Pedido;
import com.corenetworks.ProyectoCapas.repositorio.IPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PedidoServicioImpl implements IPedidoServicio{
    @Autowired
    private IPedidoRepositorio repositorio;
    @Override
    public Pedido insertar(Pedido p) {
        return repositorio.save(p);
    }

    @Override
    public Pedido modificar(Pedido p) {
        return null;
    }

    @Override
    public Pedido eliminar(int id) {
        return null;
    }

    @Override
    public Pedido obtenerUno(int id) {
        return null;
    }

    @Override
    public List<Pedido> obtenerTodos() {
        return null;
    }
}
