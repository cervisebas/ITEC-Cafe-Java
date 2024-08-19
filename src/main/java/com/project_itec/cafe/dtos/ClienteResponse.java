
package com.project_itec.cafe.dtos;

import lombok.Data;

@Data
public class ClienteResponse {
    private String Nombre;
    private String Apellido;
    private String Correo;
    private int Telefono;
}
