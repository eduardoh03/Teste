public class Lampada {
    private boolean status;
    
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void ligar(){
        status = true;
    }
    public void desligar(){
        status = false;
    }
    public String observar(){
        if(status == true)
           return "ligada";
       else
        return "apagada";
    }
}