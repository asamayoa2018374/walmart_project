package com.wallmart.controller.services;

import com.walmart.controller.DAO.ProductoJpaController;
import com.walmart.domain.Producto;
import java.util.Iterator;
import java.util.Scanner;
import javax.persistence.Persistence;

public class ProductServices {

    ProductoJpaController productoJpa = new ProductoJpaController(Persistence.createEntityManagerFactory("WalmartConnection"));
    ReportService reporte = new ReportService();
    Scanner scanText = new Scanner(System.in);
    Scanner scanNumber = new Scanner(System.in);
    private Producto producto;
    private int codigoProducto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private int cantidad;
    private float precioUnitario;
    private float precioDocena;

    public void agregarProducto() {
        System.out.println("ingrese el nombre del producto");
        nombre = scanText.nextLine();
        System.out.println("ingrese una descripcion");
        descripcion = scanText.nextLine();
        System.out.println("ingrese la categoria");
        categoria = scanText.nextLine();
        System.out.println("ingrese en numeros la cantidad disponible");
        cantidad = scanNumber.nextInt();
        System.out.println("ingrese el precio unitario");
        precioUnitario = scanNumber.nextFloat();
        System.out.println("ingrese el precio por docena");
        precioDocena = scanNumber.nextFloat();

        producto = new Producto();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setCategoria(categoria);
        producto.setCantidad(cantidad);
        producto.setPrecioUnitario(precioUnitario);
        producto.setPrecioDocena(precioDocena);

        productoJpa.createProduct(producto);

        if (!productoJpa.createProduct(producto)) {
            System.out.println("producto ya existente");
        }

        producto = null;
    }

    public void listarProductos() {
        for (Iterator<Producto> iterator = productoJpa.listProduct().iterator(); iterator.hasNext();) {
            Producto next = iterator.next();
            System.out.println("*****************************************************************************");
            System.out.println("");
            System.out.println("ID: ------> " + next.getCodigo());
            System.out.println("NOMBRE:  ------> " + next.getNombre());
            System.out.println("CANTIDAD: ------> " + next.getCantidad());
            System.out.println("CATEGORIA:------> " + next.getCategoria());
            System.out.println("DESCRIPCION: ------> " + next.getDescripcion());
            System.out.println("PRECIO UNITARIO:  ------> " + next.getPrecioUnitario());
            System.out.println("PRECIO POR DOCENA: ------> " + next.getPrecioDocena());
            System.out.println("");
            System.out.println("*****************************************************************************");
            System.out.println("");
        };
    }

    public void editarProducto() {
        String nombreCambiado;
        String descripcionCambiado;
        String categoriaCambiado;
        listarProductos();
        System.out.println("ingrese el codigo del producto que desea modificar");
        codigoProducto = scanNumber.nextInt();
        producto = productoJpa.findProduct(codigoProducto);
        if (producto != null) {
            System.out.println("ingrese el nombre del producto (ENTER para no cambiarlo)");
            nombreCambiado = scanText.nextLine();
            if (!nombreCambiado.trim().equals("")) {
                producto.setNombre(nombreCambiado);
            }
            
            System.out.println("ingrese una descripcion (ENTER para no cambiarlo)");
            descripcionCambiado = scanText.nextLine();
            if (!descripcionCambiado.trim().equals("")) {
                producto.setDescripcion(descripcionCambiado);
            }
            
            System.out.println("ingrese la categoria (ENTER para no cambiarlo)");
            categoriaCambiado = scanText.nextLine();
            if (!categoriaCambiado.trim().equals("")) {
                producto.setCategoria(categoriaCambiado);
            }
            System.out.println("ingrese en numeros la cantidad disponible");
            cantidad = scanNumber.nextInt();
            producto.setCantidad(cantidad);
            System.out.println("ingrese el precio unitario ");
            precioUnitario = scanNumber.nextFloat();
            producto.setPrecioUnitario(precioUnitario);
            System.out.println("ingrese el precio por docena");
            precioDocena = scanNumber.nextFloat();
            producto.setPrecioDocena(precioDocena);
            try {
                productoJpa.editProduct(producto);
            } catch (Exception e) {
                e.printStackTrace();
            }
            producto = null;
        } else {
            System.out.println("producto no existente");
        }
    }
    
    public void buscarProducto(){
        System.out.println("ingrese el codigo del producto que desea buscar");
        codigoProducto = scanNumber.nextInt();
        producto = productoJpa.findProduct(codigoProducto);
        if (producto != null) {
            System.out.println("*****************************************************************************");
            System.out.println("");
            System.out.println("ID: ------> " + producto.getCodigo());
            System.out.println("NOMBRE:  ------> " + producto.getNombre());
            System.out.println("CANTIDAD: ------> " + producto.getCantidad());
            System.out.println("CATEGORIA:------> " + producto.getCategoria());
            System.out.println("DESCRIPCION: ------> " + producto.getDescripcion());
            System.out.println("PRECIO UNITARIO:  ------> " + producto.getPrecioUnitario());
            System.out.println("PRECIO POR DOCENA: ------> " + producto.getPrecioDocena());
            System.out.println("");
            System.out.println("*****************************************************************************");
            System.out.println("");
        }else{
            System.out.println("producto no existente");
        }
    }
    
    public void eliminarProducto(){
        System.out.println("ingrese el codigo del producto que desea buscar");
        codigoProducto = scanNumber.nextInt();
        producto = productoJpa.findProduct(codigoProducto);
        if (producto != null) {
            try {
                productoJpa.deleteProduct(codigoProducto);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Eliminado exitosamente");
        }else{
            System.out.println("producto no existente");
        }
    }
    
    public void reporte(){
        reporte.printReport(productoJpa.listProduct());
    }
}
