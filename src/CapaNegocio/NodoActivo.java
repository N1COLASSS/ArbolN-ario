package CapaNegocio;

public class NodoActivo {

    private short activoId;
    private String nombre;
    private short clienteId;
    private short operacionId;
    private short sitioId;
    private short procesoId;
    private String tipo;
    private String estado;
    private String monitor;
    private String docEstado;
    private short clienteIdClientes;
    private short operacionIdOperaciones;
    private short sitioIdSitios;

    public NodoActivo(short activoId, String nombre, short clienteId, short operacionId, short sitioId, short procesoId, String tipo, String estado, String monitor, String docEstado, short clienteIdClientes, short operacionIdOperaciones, short sitioIdSitios) {
        this.activoId = activoId;
        this.nombre = nombre;
        this.clienteId = clienteId;
        this.operacionId = operacionId;
        this.sitioId = sitioId;
        this.procesoId = procesoId;
        this.tipo = tipo;
        this.estado = estado;
        this.monitor = monitor;
        this.docEstado = docEstado;
        this.clienteIdClientes = clienteIdClientes;
        this.operacionIdOperaciones = operacionIdOperaciones;
        this.sitioIdSitios = sitioIdSitios;
    }

    // Getters and Setters

    public short getActivoId() {
        return activoId;
    }

    public void setActivoId(short activoId) {
        this.activoId = activoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getClienteId() {
        return clienteId;
    }

    public void setClienteId(short clienteId) {
        this.clienteId = clienteId;
    }

    public short getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(short operacionId) {
        this.operacionId = operacionId;
    }

    public short getSitioId() {
        return sitioId;
    }

    public void setSitioId(short sitioId) {
        this.sitioId = sitioId;
    }

    public short getProcesoId() {
        return procesoId;
    }

    public void setProcesoId(short procesoId) {
        this.procesoId = procesoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getDocEstado() {
        return docEstado;
    }

    public void setDocEstado(String docEstado) {
        this.docEstado = docEstado;
    }

    public short getClienteIdClientes() {
        return clienteIdClientes;
    }

    public void setClienteIdClientes(short clienteIdClientes) {
        this.clienteIdClientes = clienteIdClientes;
    }

    public short getOperacionIdOperaciones() {
        return operacionIdOperaciones;
    }

    public void setOperacionIdOperaciones(short operacionIdOperaciones) {
        this.operacionIdOperaciones = operacionIdOperaciones;
    }

    public short getSitioIdSitios() {
        return sitioIdSitios;
    }

    public void setSitioIdSitios(short sitioIdSitios) {
        this.sitioIdSitios = sitioIdSitios;
    }

    @Override
    public String toString() {
        return "NodoActivo{" +
                "activoId=" + activoId +
                ", nombre='" + nombre + '\'' +
                ", clienteId=" + clienteId +
                ", operacionId=" + operacionId +
                ", sitioId=" + sitioId +
                ", procesoId=" + procesoId +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", monitor='" + monitor + '\'' +
                ", docEstado='" + docEstado + '\'' +
                ", clienteIdClientes=" + clienteIdClientes +
                ", operacionIdOperaciones=" + operacionIdOperaciones +
                ", sitioIdSitios=" + sitioIdSitios +
                '}';
    }
}