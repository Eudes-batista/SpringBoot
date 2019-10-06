package br.com.aprendendo.demo.model;

import br.com.aprendendo.demo.model.base.EntityBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"referencia"})
@Entity
@Table(name = "produto")
public class Produto implements EntityBase<String>,Serializable {

    @Id
    @Column(name = "referencia", length = 60, nullable = false)
    private String referencia;

    @Column(name = "nome", length = 60, nullable = false)
    private String nome;

    @Column(name = "tipo", length = 20, nullable = false)
    private String tipo;

    @Column(name = "preco", precision = 10, scale = 2, nullable = false)
    private Double preco;
    
    @Column(name = "estoque_minimo", precision = 6, scale = 3, nullable = false)
    private Double estoqueMinimo;

    @JsonIgnore
    @Transient
    @Override
    public String getPrimary() {
        return this.referencia;
    }

}
