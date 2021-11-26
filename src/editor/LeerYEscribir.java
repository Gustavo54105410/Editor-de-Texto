package editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class LeerYEscribir {
    public int guardarArchivo( String areaTexto, String nombreArchivo) throws IOException{
        int  prov = 0;
        
        if(!nombreArchivo.contains(".")){
            File file = new File("src/archivos/" + nombreArchivo + ".txt");
            if(!file.exists()){
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                  bw.write(areaTexto);
                  bw.close();
                  prov = 0;
                }
            }else{
                prov = 2;
            }
        }else{
            prov = 1;
        }
        
        return prov;
    }
    
    public String abrirArchivo(String archivo) throws IOException{
        String linea, textoCargado = "";
        try(BufferedReader br= new BufferedReader(new FileReader(archivo))){
            while((linea = br.readLine()) != null){

                textoCargado += (linea + "\n");
                
            }
        }
        
        return textoCargado;
    }
}
