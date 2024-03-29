package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro;
    private boolean vip;

    public Cliente(Date fechaRegistro,boolean vip,
                   String nombre, char genero, int edad,
                   String direccion) {
        //no se encuentra el atributo idCliente ya que esta se
        //inicializara en la variable contadorCliente.
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString()).append('}');
       return sb.toString();
    }
}
