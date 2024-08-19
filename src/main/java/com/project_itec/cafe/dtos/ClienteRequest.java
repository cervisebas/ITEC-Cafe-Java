
package com.project_itec.cafe.dtos;
import lombok.Data;
        
@Data
public class ClienteRequest {
    
    private String Nombre;
    private String Apellido;
    private String Correo;
    private int Telefono;
}
