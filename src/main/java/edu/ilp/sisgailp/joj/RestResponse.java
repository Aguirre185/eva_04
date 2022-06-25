package edu.ilp.sisgailp.joj;

public class RestResponse {
    private Integer code;
    private String mensaje;
    private Object data;

    public RestResponse(Integer code, String mensaje, Object data) {
        this.code = code;
        this.mensaje = mensaje;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
