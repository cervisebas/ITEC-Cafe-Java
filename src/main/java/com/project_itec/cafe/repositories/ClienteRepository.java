
package com.project_itec.cafe.repositories;

import com.project_itec.cafe.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
