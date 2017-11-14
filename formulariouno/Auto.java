/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariouno;

/**
 *
 * @author alumno
 */
public class Auto {
    
    private  int Numero;
    private  Escuderia escuderia;
    private  String Modelo;
    private  Piloto ElPiloto;
    private int TiempoRecorrido;
    
    
    public void Auto(){
        
        this.ElPiloto=new Piloto();
        this.Modelo = Modelo;
        this.Numero = Numero;
        this.escuderia =  new Escuderia();
        this.TiempoRecorrido = TiempoRecorrido;
        
        
        
    }
    
    public void Mostrar(){
        System.out.println("numero"+this.Numero);
        System.out.println("Escuderia"+this.escuderia(1930,"Italia","Ferrari"));
        System.out.println("Modelo"+this.Modelo);
        System.out.println("Piloto"+this.ElPiloto.DameNombreCompletoMay());
        System.out.println("TiempoRecorrido"+this.TiempoRecorrido);
    }
    public int DameElTiempoRecorrido(){
        
        return this.TiempoRecorrido;
    }
    public void AgregarTiempoRecorrido(int tiempo){
        
        this.TiempoRecorrido = this.TiempoRecorrido+tiempo;
    }
    public Auto(int numero){
        
        this.ElPiloto = new Piloto();        
        this.Modelo = "Ford";
        this.Numero = numero;
        this.escuderia = new Escuderia();
        this.CargarPilotoRandom();
        
        
        
    }
    private void CargarPilotoRandom(){
       this.ApellidoRandom();
       this.NombreRandom();
        
    }
    private void ApellidoRandom(){
        int miRandom = (int) (Math.random()*10);
        switch(miRandom){
             case 0:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 1:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 2:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 3:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 4:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 5:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 6:
                this.ElPiloto.SetterApellido("rogelio"); 
                break;
            case 7:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 8:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 9:
                this.ElPiloto.SetterApellido("rogelio");
                break;
            case 10:
                this.ElPiloto.SetterApellido("rogelio");
                break;
        }
        
    }
    private void NombreRandom(){
        int miRandom = (int) (Math.random()*10);
        switch(miRandom){
            case 0:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 1:
                this.ElPiloto.SetterNombre("nicvola");
                break;
            case 2:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 3:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 4:
                this.ElPiloto.SetterNombre("ralvaa");
                break;
            case 5:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 6:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 7:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 8:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 9:
                this.ElPiloto.SetterNombre("rogelio");
                break;
            case 10:
                this.ElPiloto.SetterNombre("rogelio");
                break;
           
        }
        
        
        
    }

    private String escuderia(int i, String italia, String ferrari) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
