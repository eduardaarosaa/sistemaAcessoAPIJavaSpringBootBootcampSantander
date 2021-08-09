package com.demo.model;
import lombok.*;
import java.util.objects;

@Getter
@Setter
@AllArgsConstructors
@NoAllArgsConstructors
@EqualsAndHashCode
@Builder
@Audited

public class jornadaTrabalho
{
    private long id;
    private String descricao;

//    public jornadaTrabalho(long id, String descricao) {
//        this.id = id;
//        this.descricao = descricao;
//    }
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//    @Override
//    public boolean equals(object o){
//        if(this == o) return true;
//        if (0 == null || getClass() != o.getClass()) return false;
//    }
}