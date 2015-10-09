
package Dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fotos")


public class Foto implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CodFoto;
    private Integer CodAnuncio;
    private String Caminho;

    public Foto(Integer CodAnuncio, String Caminho) {
        this.CodAnuncio = CodAnuncio;
        this.Caminho = Caminho;
    }

    public Integer getCodFoto() {
        return CodFoto;
    }

    public void setCodFoto(Integer CodFoto) {
        this.CodFoto = CodFoto;
    }

    public Integer getCodAnuncio() {
        return CodAnuncio;
    }

    public void setCodAnuncio(Integer CodAnuncio) {
        this.CodAnuncio = CodAnuncio;
    }

    public String getCaminho() {
        return Caminho;
    }

    public void setCaminho(String Caminho) {
        this.Caminho = Caminho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.CodFoto);
        hash = 67 * hash + Objects.hashCode(this.CodAnuncio);
        hash = 67 * hash + Objects.hashCode(this.Caminho);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Foto other = (Foto) obj;
        if (!Objects.equals(this.CodFoto, other.CodFoto)) {
            return false;
        }
        if (!Objects.equals(this.CodAnuncio, other.CodAnuncio)) {
            return false;
        }
        if (!Objects.equals(this.Caminho, other.Caminho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Foto{" + "CodFoto=" + CodFoto + ", CodAnuncio=" + CodAnuncio + ", Caminho=" + Caminho + '}';
    }
    
    
    
}
