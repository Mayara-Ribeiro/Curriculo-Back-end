package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import org.acme.curriculo.TitularCurriculo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Cacheable
public class Curriculo extends PanacheEntity {

    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuario_Curriculo usuario_Curriculo


    @Deprecated
    public Curriculo(){}

    public Curriculo(Usuario_Curriculo usuario_Curriculo{
        this.usuario_Curriculo = titularCurriculo;
    }

    public Usuario_Curriculo getCurriculo() {
        return titularCurriculo;
    }

    public void setCurriculoUsuario_Curriculo usuario_Curriculo{
        this.usuario_Curriculo = usuario_Curriculo
    }


}
