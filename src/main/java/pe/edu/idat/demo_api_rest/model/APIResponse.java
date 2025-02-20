package pe.edu.idat.demo_api_rest.model;

import lombok.Builder;
import lombok.Data;

/*@Builder
@Data*/
public class APIResponse<T> {

    private T data;
    private String error;
    private String mensaje;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
