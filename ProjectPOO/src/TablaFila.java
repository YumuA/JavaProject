public class TablaFila {
    private String columna1;
    private String columna2;
    private boolean seleccionado;

    public TablaFila(String columna1, String columna2, boolean seleccionado) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        this.seleccionado = seleccionado;
    }

    public String getColumna1() {
        return columna1;
    }

    public void setColumna1(String columna1) {
        this.columna1 = columna1;
    }

    public String getColumna2() {
        return columna2;
    }

    public void setColumna2(String columna2) {
        this.columna2 = columna2;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
}
