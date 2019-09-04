package com.wallmart.controller.services;

import com.walmart.domain.Producto;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportService {

    public void printReport(List<Producto> productos) {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try {
            String ruta = "..\\Reportes\\" + formato.format(fecha) + ".txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("------------------------------------------------ REPORTE -------------------------");
            bw.newLine();
            bw.newLine();
            for (Iterator<Producto> iterator = productos.iterator(); iterator.hasNext();) {
                Producto next = iterator.next();
                bw.write("*****************************************************************************");
                bw.newLine();
                bw.newLine();
                bw.write("ID: ------> " + next.getCodigo());
                bw.newLine();
                bw.write("NOMBRE:  ------> " + next.getNombre());
                bw.newLine();
                bw.write("CANTIDAD: ------> " + next.getCantidad());
                bw.newLine();
                bw.newLine();
                bw.write("*****************************************************************************");
                bw.newLine();
                bw.newLine();
            };
            bw.close();
            Desktop.getDesktop().open(new File("..\\Reportes\\"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
